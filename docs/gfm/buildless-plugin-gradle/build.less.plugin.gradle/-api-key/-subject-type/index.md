//[buildless-plugin-gradle](../../../../index.md)/[build.less.plugin.gradle](../../index.md)/[ApiKey](../index.md)/[SubjectType](index.md)

# SubjectType

[JVM (Gradle)]\
enum [SubjectType](index.md) : [Enum](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-enum/index.html)&lt;[ApiKey.SubjectType](index.md)&gt; 

##  API Key: Subject Type

Enumerates the types of &quot;subjects&quot; (security principals) for which API keys are made available by the Buildless service.

## Entries

| | |
|---|---|
| [USER](-u-s-e-r/index.md) | [JVM (Gradle)]<br>[USER](-u-s-e-r/index.md)<br>Specifies an API key which is minted for a Buildless user, and which authorizes an agent as a Buildless user. User keys are not organization specific by nature. |
| [ORG](-o-r-g/index.md) | [JVM (Gradle)]<br>[ORG](-o-r-g/index.md)<br>Specifies an API key which is minted for a Buildless organization tenant, and which authorizes an agent for data access within that organization. Org keys are, by nature, not user specific. |

## Properties

| Name | Summary |
|---|---|
| [name](../../-cache-transport/-s-t-a-n-d-a-r-d/index.md#-372974862%2FProperties%2F73423754) | [JVM (Gradle)]<br>val [name](../../-cache-transport/-s-t-a-n-d-a-r-d/index.md#-372974862%2FProperties%2F73423754): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [ordinal](../../-cache-transport/-s-t-a-n-d-a-r-d/index.md#-739389684%2FProperties%2F73423754) | [JVM (Gradle)]<br>val [ordinal](../../-cache-transport/-s-t-a-n-d-a-r-d/index.md#-739389684%2FProperties%2F73423754): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |

## Functions

| Name | Summary |
|---|---|
| [valueOf](value-of.md) | [JVM (Gradle)]<br>fun [valueOf](value-of.md)(value: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [ApiKey.SubjectType](index.md)<br>Returns the enum constant of this type with the specified name. The string must match exactly an identifier used to declare an enum constant in this type. (Extraneous whitespace characters are not permitted.) |
| [values](values.md) | [JVM (Gradle)]<br>fun [values](values.md)(): [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)&lt;[ApiKey.SubjectType](index.md)&gt;<br>Returns an array containing the constants of this enum type, in the order they're declared. |
