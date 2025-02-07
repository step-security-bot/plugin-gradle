/*
 * Copyright (c) 2023 Elide Ventures, LLC.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under the License.
 */

package build.less.plugin.gradle

/**
 * # Buildless for Gradle: Cache Transport
 *
 * Enumerates the types of transport engines which are available for use when interacting with Buildless. By default,
 * the [STANDARD] transport is used, which leverages Gradle's built-in remote build caching over HTTP.
 */
public enum class CacheTransport {
  /**
   * Use the built-in cache transport mechanism from Gradle.
   */
  STANDARD
}
