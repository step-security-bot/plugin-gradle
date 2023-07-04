@file:Suppress("UnstableApiUsage")

pluginManagement {
  repositories {
    maven("https://gradle.pkg.st/")
  }
}

plugins {
  id("com.gradle.enterprise") version("3.13.4")
}

gradleEnterprise {
  buildScan {
    termsOfServiceUrl = "https://gradle.com/terms-of-service"
    termsOfServiceAgree = "yes"
  }
}

dependencyResolutionManagement {
  repositoriesMode.set(
    RepositoriesMode.PREFER_SETTINGS
  )
  repositories {
    maven("https://maven.pkg.st/")
  }
}

rootProject.name = "buildless-plugin-gradle"

val cacheUsername: String? by settings
val cachePassword: String? by settings
val cachePush: String? by settings
val remoteCache = System.getenv("GRADLE_CACHE_REMOTE")?.toBoolean() ?: false
val localCache = System.getenv("GRADLE_CACHE_LOCAL")?.toBoolean() ?: true

buildCache {
  local {
    isEnabled = localCache
  }

  if (remoteCache) {
    remote<HttpBuildCache> {
      isEnabled = true
      isUseExpectContinue = true
      isPush = System.getenv("GRADLE_CACHE_PUSH") == "true" || System.getenv("CI") == "true"

      url = uri(System.getenv("CACHE_ENDPOINT") ?: "https://gradle.less.build/cache/generic/")
      credentials {
        username = "apikey"
        password = System.getenv("BUILDLESS_APIKEY")
      }
    }
  }
}

enableFeaturePreview("STABLE_CONFIGURATION_CACHE")
enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")
enableFeaturePreview("GROOVY_COMPILATION_AVOIDANCE")
