//[buildless-plugin-gradle](../../../../index.md)/[build.less.plugin.gradle](../../index.md)/[BuildlessExtensionAPI](../index.md)/[MutableCacheSettings](index.md)/[enabled](enabled.md)

# enabled

[JVM (Gradle)]\
abstract override var [enabled](enabled.md): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)

Indicates whether a given cache sub-system should be enabled or disabled (either a local cache or remote cache). If a caching sub-system is &quot;disabled,&quot; it is not used *at all* for the current build.

Enabling a cache sub-system only enables *checks* for cached objects (i.e. fetches). Pushes to the cache (i.e. uploads) are governed by other properties (and are enabled by default).
