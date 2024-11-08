
# Compatibility Report

![semver PATCH](https://img.shields.io/badge/semver-PATCH-yellow?logo=semver "semver PATCH")

## Summary

> [!IMPORTANT]
>
> Compatible bug fixes found while checking backward compatibility of version `1.18.2-SNAPSHOT` with the previous version `1.18.1`.

<details markdown="1">
<summary>Expand to see options used.</summary>

- **Report only summary**: No
- **Report only changes**: No
- **Report only binary-incompatible changes**: No
- **Access modifier filter**: `PROTECTED`
- **Old archives**:
  - ![jsoup 1.18.1](https://img.shields.io/badge/jsoup-1.18.1-blue "jsoup 1.18.1")
- **New archives**:
  - ![jsoup 1.18.2-SNAPSHOT](https://img.shields.io/badge/jsoup-1.18.2_SNAPSHOT-blue "jsoup 1.18.2-SNAPSHOT")
- **Evaluate annotations**: Yes
- **Include synthetic classes and class members**: No
- **Include specific elements**: No
- **Exclude specific elements**: Yes
  - `@java.lang.Deprecated`
  - `org.jsoup.UncheckedIOException`
- **Ignore all missing classes**: No
- **Ignore specific missing classes**: No
- **Treat changes as errors**:
  - Any changes: No
  - Binary incompatible changes: No
  - Source incompatible changes: No
  - Incompatible changes caused by excluded classes: Yes
  - Semantically incompatible changes: No
  - Semantically incompatible changes, including development versions: No
- **Classpath mode**: `ONE_COMMON_CLASSPATH`
- **Old classpath**:
```

```
- **New classpath**:
```

```

</details>


## Results

| Status    | Type                                                      | Serialization       | Compatibility Changes |
|-----------|-----------------------------------------------------------|---------------------|-----------------------|
| Unchanged | [org.jsoup.Connection]                                    | ![Not serializable] | ![No changes]         |
| Unchanged | [org.jsoup.Connection$Base]                               | ![Not serializable] | ![No changes]         |
| Unchanged | [org.jsoup.Connection$KeyVal]                             | ![Not serializable] | ![No changes]         |
| Unchanged | [org.jsoup.Connection$Method]                             | ![Compatible]       | ![No changes]         |
| Unchanged | [org.jsoup.Connection$Request]                            | ![Not serializable] | ![No changes]         |
| Unchanged | [org.jsoup.Connection$Response]                           | ![Not serializable] | ![No changes]         |
| Unchanged | [org.jsoup.HttpStatusException]                           | ![Compatible]       | ![No changes]         |
| Unchanged | [org.jsoup.Jsoup]                                         | ![Not serializable] | ![No changes]         |
| Added     | [org.jsoup.ParserFuzzerTest]                              | ![Not serializable] | ![Method added to public class] |
| Unchanged | [org.jsoup.Progress]                                      | ![Not serializable] | ![No changes]         |
| Unchanged | [org.jsoup.SerializationException]                        | ![Compatible]       | ![No changes]         |
| Unchanged | [org.jsoup.UnsupportedMimeTypeException]                  | ![Compatible]       | ![No changes]         |
| Unchanged | [org.jsoup.helper.ChangeNotifyingArrayList]               | ![Compatible]       | ![No changes]         |
| Unchanged | [org.jsoup.helper.DataUtil]                               | ![Not serializable] | ![No changes]         |
| Unchanged | [org.jsoup.helper.HttpConnection]                         | ![Not serializable] | ![No changes]         |
| Unchanged | [org.jsoup.helper.HttpConnection$KeyVal]                  | ![Not serializable] | ![No changes]         |
| Unchanged | [org.jsoup.helper.HttpConnection$Request]                 | ![Not serializable] | ![No changes]         |
| Unchanged | [org.jsoup.helper.HttpConnection$Response]                | ![Not serializable] | ![No changes]         |
| Unchanged | [org.jsoup.helper.RequestAuthenticator]                   | ![Not serializable] | ![No changes]         |
| Unchanged | [org.jsoup.helper.RequestAuthenticator$Context]           | ![Not serializable] | ![No changes]         |
| Unchanged | [org.jsoup.helper.Validate]                               | ![Not serializable] | ![No changes]         |
| Unchanged | [org.jsoup.helper.ValidationException]                    | ![Compatible]       | ![No changes]         |
| Unchanged | [org.jsoup.helper.W3CDom]                                 | ![Not serializable] | ![No changes]         |
| Unchanged | [org.jsoup.helper.W3CDom$W3CBuilder]                      | ![Not serializable] | ![No changes]         |
| Modified  | [org.jsoup.internal.ControllableInputStream]              | ![Not serializable] | ![Method added to public class] |
| Unchanged | [org.jsoup.internal.Functions]                            | ![Not serializable] | ![No changes]         |
| Unchanged | [org.jsoup.internal.Normalizer]                           | ![Not serializable] | ![No changes]         |
| Modified  | [org.jsoup.internal.SharedConstants]                      | ![Not serializable] | ![No changes]         |
| Added     | [org.jsoup.internal.SoftPool]                             | ![Not serializable] | ![Method added to public class] |
| Unchanged | [org.jsoup.internal.StringUtil]                           | ![Not serializable] | ![No changes]         |
| Unchanged | [org.jsoup.internal.StringUtil$StringJoiner]              | ![Not serializable] | ![No changes]         |
| Unchanged | [org.jsoup.nodes.Attribute]                               | ![Not serializable] | ![No changes]         |
| Unchanged | [org.jsoup.nodes.Attributes]                              | ![Not serializable] | ![No changes]         |
| Unchanged | [org.jsoup.nodes.CDataNode]                               | ![Not serializable] | ![No changes]         |
| Modified  | [org.jsoup.nodes.Comment]                                 | ![Not serializable] | ![No changes]         |
| Modified  | [org.jsoup.nodes.DataNode]                                | ![Not serializable] | ![No changes]         |
| Unchanged | [org.jsoup.nodes.Document]                                | ![Not serializable] | ![No changes]         |
| Unchanged | [org.jsoup.nodes.Document$OutputSettings]                 | ![Not serializable] | ![No changes]         |
| Unchanged | [org.jsoup.nodes.Document$OutputSettings$Syntax]          | ![Compatible]       | ![No changes]         |
| Unchanged | [org.jsoup.nodes.Document$QuirksMode]                     | ![Compatible]       | ![No changes]         |
| Unchanged | [org.jsoup.nodes.DocumentType]                            | ![Not serializable] | ![No changes]         |
| Unchanged | [org.jsoup.nodes.Element]                                 | ![Not serializable] | ![No changes]         |
| Unchanged | [org.jsoup.nodes.Entities]                                | ![Not serializable] | ![No changes]         |
| Unchanged | [org.jsoup.nodes.Entities$EscapeMode]                     | ![Compatible]       | ![No changes]         |
| Unchanged | [org.jsoup.nodes.FormElement]                             | ![Not serializable] | ![No changes]         |
| Modified  | [org.jsoup.nodes.LeafNode]                                | ![Not serializable] | ![No changes]         |
| Unchanged | [org.jsoup.nodes.Node]                                    | ![Not serializable] | ![No changes]         |
| Unchanged | [org.jsoup.nodes.NodeIterator]                            | ![Not serializable] | ![No changes]         |
| Unchanged | [org.jsoup.nodes.PseudoTextElement]                       | ![Not serializable] | ![No changes]         |
| Unchanged | [org.jsoup.nodes.Range]                                   | ![Not serializable] | ![No changes]         |
| Unchanged | [org.jsoup.nodes.Range$AttributeRange]                    | ![Not serializable] | ![No changes]         |
| Unchanged | [org.jsoup.nodes.Range$Position]                          | ![Not serializable] | ![No changes]         |
| Unchanged | [org.jsoup.nodes.TextNode]                                | ![Not serializable] | ![No changes]         |
| Unchanged | [org.jsoup.nodes.XmlDeclaration]                          | ![Not serializable] | ![No changes]         |
| Unchanged | [org.jsoup.parser.CharacterReader]                        | ![Not serializable] | ![No changes]         |
| Unchanged | [org.jsoup.parser.HtmlTreeBuilder]                        | ![Not serializable] | ![No changes]         |
| Unchanged | [org.jsoup.parser.ParseError]                             | ![Not serializable] | ![No changes]         |
| Unchanged | [org.jsoup.parser.ParseErrorList]                         | ![Compatible]       | ![No changes]         |
| Unchanged | [org.jsoup.parser.ParseSettings]                          | ![Not serializable] | ![No changes]         |
| Unchanged | [org.jsoup.parser.Parser]                                 | ![Not serializable] | ![No changes]         |
| Unchanged | [org.jsoup.parser.StreamParser]                           | ![Not serializable] | ![No changes]         |
| Unchanged | [org.jsoup.parser.Tag]                                    | ![Not serializable] | ![No changes]         |
| Unchanged | [org.jsoup.parser.Token$TokenType]                        | ![Compatible]       | ![No changes]         |
| Unchanged | [org.jsoup.parser.TokenQueue]                             | ![Not serializable] | ![No changes]         |
| Unchanged | [org.jsoup.parser.XmlTreeBuilder]                         | ![Not serializable] | ![No changes]         |
| Unchanged | [org.jsoup.safety.Cleaner]                                | ![Not serializable] | ![No changes]         |
| Unchanged | [org.jsoup.safety.Safelist]                               | ![Not serializable] | ![No changes]         |
| Unchanged | [org.jsoup.select.Collector]                              | ![Not serializable] | ![No changes]         |
| Unchanged | [org.jsoup.select.CombiningEvaluator]                     | ![Not serializable] | ![No changes]         |
| Unchanged | [org.jsoup.select.CombiningEvaluator$And]                 | ![Not serializable] | ![No changes]         |
| Unchanged | [org.jsoup.select.CombiningEvaluator$Or]                  | ![Not serializable] | ![No changes]         |
| Unchanged | [org.jsoup.select.Elements]                               | ![Compatible]       | ![No changes]         |
| Unchanged | [org.jsoup.select.Evaluator]                              | ![Not serializable] | ![No changes]         |
| Unchanged | [org.jsoup.select.Evaluator$AllElements]                  | ![Not serializable] | ![No changes]         |
| Unchanged | [org.jsoup.select.Evaluator$Attribute]                    | ![Not serializable] | ![No changes]         |
| Unchanged | [org.jsoup.select.Evaluator$AttributeKeyPair]             | ![Not serializable] | ![No changes]         |
| Unchanged | [org.jsoup.select.Evaluator$AttributeStarting]            | ![Not serializable] | ![No changes]         |
| Unchanged | [org.jsoup.select.Evaluator$AttributeWithValue]           | ![Not serializable] | ![No changes]         |
| Unchanged | [org.jsoup.select.Evaluator$AttributeWithValueContaining] | ![Not serializable] | ![No changes]         |
| Unchanged | [org.jsoup.select.Evaluator$AttributeWithValueEnding]     | ![Not serializable] | ![No changes]         |
| Unchanged | [org.jsoup.select.Evaluator$AttributeWithValueMatching]   | ![Not serializable] | ![No changes]         |
| Unchanged | [org.jsoup.select.Evaluator$AttributeWithValueNot]        | ![Not serializable] | ![No changes]         |
| Unchanged | [org.jsoup.select.Evaluator$AttributeWithValueStarting]   | ![Not serializable] | ![No changes]         |
| Unchanged | [org.jsoup.select.Evaluator$Class]                        | ![Not serializable] | ![No changes]         |
| Unchanged | [org.jsoup.select.Evaluator$ContainsData]                 | ![Not serializable] | ![No changes]         |
| Unchanged | [org.jsoup.select.Evaluator$ContainsOwnText]              | ![Not serializable] | ![No changes]         |
| Unchanged | [org.jsoup.select.Evaluator$ContainsText]                 | ![Not serializable] | ![No changes]         |
| Unchanged | [org.jsoup.select.Evaluator$ContainsWholeOwnText]         | ![Not serializable] | ![No changes]         |
| Unchanged | [org.jsoup.select.Evaluator$ContainsWholeText]            | ![Not serializable] | ![No changes]         |
| Unchanged | [org.jsoup.select.Evaluator$CssNthEvaluator]              | ![Not serializable] | ![No changes]         |
| Unchanged | [org.jsoup.select.Evaluator$Id]                           | ![Not serializable] | ![No changes]         |
| Unchanged | [org.jsoup.select.Evaluator$IndexEquals]                  | ![Not serializable] | ![No changes]         |
| Unchanged | [org.jsoup.select.Evaluator$IndexEvaluator]               | ![Not serializable] | ![No changes]         |
| Unchanged | [org.jsoup.select.Evaluator$IndexGreaterThan]             | ![Not serializable] | ![No changes]         |
| Unchanged | [org.jsoup.select.Evaluator$IndexLessThan]                | ![Not serializable] | ![No changes]         |
| Unchanged | [org.jsoup.select.Evaluator$IsEmpty]                      | ![Not serializable] | ![No changes]         |
| Unchanged | [org.jsoup.select.Evaluator$IsFirstChild]                 | ![Not serializable] | ![No changes]         |
| Unchanged | [org.jsoup.select.Evaluator$IsFirstOfType]                | ![Not serializable] | ![No changes]         |
| Unchanged | [org.jsoup.select.Evaluator$IsLastChild]                  | ![Not serializable] | ![No changes]         |
| Unchanged | [org.jsoup.select.Evaluator$IsLastOfType]                 | ![Not serializable] | ![No changes]         |
| Unchanged | [org.jsoup.select.Evaluator$IsNthChild]                   | ![Not serializable] | ![No changes]         |
| Unchanged | [org.jsoup.select.Evaluator$IsNthLastChild]               | ![Not serializable] | ![No changes]         |
| Unchanged | [org.jsoup.select.Evaluator$IsNthLastOfType]              | ![Not serializable] | ![No changes]         |
| Unchanged | [org.jsoup.select.Evaluator$IsNthOfType]                  | ![Not serializable] | ![No changes]         |
| Unchanged | [org.jsoup.select.Evaluator$IsOnlyChild]                  | ![Not serializable] | ![No changes]         |
| Unchanged | [org.jsoup.select.Evaluator$IsOnlyOfType]                 | ![Not serializable] | ![No changes]         |
| Unchanged | [org.jsoup.select.Evaluator$IsRoot]                       | ![Not serializable] | ![No changes]         |
| Unchanged | [org.jsoup.select.Evaluator$MatchText]                    | ![Not serializable] | ![No changes]         |
| Unchanged | [org.jsoup.select.Evaluator$Matches]                      | ![Not serializable] | ![No changes]         |
| Unchanged | [org.jsoup.select.Evaluator$MatchesOwn]                   | ![Not serializable] | ![No changes]         |
| Unchanged | [org.jsoup.select.Evaluator$MatchesWholeOwnText]          | ![Not serializable] | ![No changes]         |
| Unchanged | [org.jsoup.select.Evaluator$MatchesWholeText]             | ![Not serializable] | ![No changes]         |
| Unchanged | [org.jsoup.select.Evaluator$Tag]                          | ![Not serializable] | ![No changes]         |
| Unchanged | [org.jsoup.select.Evaluator$TagEndsWith]                  | ![Not serializable] | ![No changes]         |
| Unchanged | [org.jsoup.select.Evaluator$TagStartsWith]                | ![Not serializable] | ![No changes]         |
| Unchanged | [org.jsoup.select.NodeFilter]                             | ![Not serializable] | ![No changes]         |
| Unchanged | [org.jsoup.select.NodeFilter$FilterResult]                | ![Compatible]       | ![No changes]         |
| Unchanged | [org.jsoup.select.NodeTraversor]                          | ![Not serializable] | ![No changes]         |
| Unchanged | [org.jsoup.select.NodeVisitor]                            | ![Not serializable] | ![No changes]         |
| Unchanged | [org.jsoup.select.QueryParser]                            | ![Not serializable] | ![No changes]         |
| Unchanged | [org.jsoup.select.Selector]                               | ![Not serializable] | ![No changes]         |
| Unchanged | [org.jsoup.select.Selector$SelectorParseException]        | ![Compatible]       | ![No changes]         |

<details markdown="1">
<summary>Expand for details.</summary>

___

<a id="user-content-org.jsoup.connection"></a>
### `org.jsoup.Connection`

- [X] Binary-compatible
- [X] Source-compatible
- [X] Serialization-compatible

| Status    | Modifiers           | Type      | Name         | Extends    | JDK   | Serialization       | Compatibility Changes |
|-----------|---------------------|-----------|--------------|------------|-------|---------------------|-----------------------|
| Unchanged | `public` `abstract` | Interface | `Connection` | [`Object`] | JDK 8 | ![Not serializable] | ![No changes]         |


#### Methods

| Status    | Modifiers           | Generics | Type            | Method                                                      | Annotations | Throws          | Compatibility Changes |
|-----------|---------------------|----------|-----------------|-------------------------------------------------------------|-------------|-----------------|-----------------------|
| Unchanged | `public`            |          | [`Connection`]  | `auth`([`RequestAuthenticator`])                            |             |                 | ![No changes]         |
| Unchanged | `public` `abstract` |          | [`Connection`]  | `cookie`([`String`], [`String`])                            |             |                 | ![No changes]         |
| Unchanged | `public` `abstract` |          | [`Connection`]  | `cookieStore`([`CookieStore`])                              |             |                 | ![No changes]         |
| Unchanged | `public` `abstract` |          | [`CookieStore`] | `cookieStore`()                                             |             |                 | ![No changes]         |
| Unchanged | `public` `abstract` |          | [`Connection`]  | `cookies`([`Map<String, String>`])                          |             |                 | ![No changes]         |
| Unchanged | `public` `abstract` |          | [`Connection`]  | `data`([`String`], [`String`])                              |             |                 | ![No changes]         |
| Unchanged | `public` `abstract` |          | [`Connection`]  | `data`([`String`], [`String`], [`InputStream`])             |             |                 | ![No changes]         |
| Unchanged | `public` `abstract` |          | [`Connection`]  | `data`([`String`], [`String`], [`InputStream`], [`String`]) |             |                 | ![No changes]         |
| Unchanged | `public` `abstract` |          | [`Connection`]  | `data`([`Collection<KeyVal>`])                              |             |                 | ![No changes]         |
| Unchanged | `public` `abstract` |          | [`Connection`]  | `data`([`Map<String, String>`])                             |             |                 | ![No changes]         |
| Unchanged | `public` `abstract` |          | [`Connection`]  | `data`([`String...`])                                       |             |                 | ![No changes]         |
| Unchanged | `public` `abstract` |          | [`KeyVal`]      | `data`([`String`])                                          |             |                 | ![No changes]         |
| Unchanged | `public` `abstract` |          | [`Response`]    | `execute`()                                                 |             | [`IOException`] | ![No changes]         |
| Unchanged | `public` `abstract` |          | [`Connection`]  | `followRedirects`(`boolean`)                                |             |                 | ![No changes]         |
| Unchanged | `public` `abstract` |          | [`Document`]    | `get`()                                                     |             | [`IOException`] | ![No changes]         |
| Unchanged | `public` `abstract` |          | [`Connection`]  | `header`([`String`], [`String`])                            |             |                 | ![No changes]         |
| Unchanged | `public` `abstract` |          | [`Connection`]  | `headers`([`Map<String, String>`])                          |             |                 | ![No changes]         |
| Unchanged | `public` `abstract` |          | [`Connection`]  | `ignoreContentType`(`boolean`)                              |             |                 | ![No changes]         |
| Unchanged | `public` `abstract` |          | [`Connection`]  | `ignoreHttpErrors`(`boolean`)                               |             |                 | ![No changes]         |
| Unchanged | `public` `abstract` |          | [`Connection`]  | `maxBodySize`(`int`)                                        |             |                 | ![No changes]         |
| Unchanged | `public` `abstract` |          | [`Connection`]  | `method`([`Method`])                                        |             |                 | ![No changes]         |
| Unchanged | `public` `abstract` |          | [`Connection`]  | `newRequest`()                                              |             |                 | ![No changes]         |
| Unchanged | `public`            |          | [`Connection`]  | `newRequest`([`String`])                                    |             |                 | ![No changes]         |
| Unchanged | `public`            |          | [`Connection`]  | `newRequest`([`URL`])                                       |             |                 | ![No changes]         |
| Unchanged | `public`            |          | [`Connection`]  | `onResponseProgress`([`Progress<Response>`])                |             |                 | ![No changes]         |
| Unchanged | `public` `abstract` |          | [`Connection`]  | `parser`([`Parser`])                                        |             |                 | ![No changes]         |
| Unchanged | `public` `abstract` |          | [`Document`]    | `post`()                                                    |             | [`IOException`] | ![No changes]         |
| Unchanged | `public` `abstract` |          | [`Connection`]  | `postDataCharset`([`String`])                               |             |                 | ![No changes]         |
| Unchanged | `public` `abstract` |          | [`Connection`]  | `proxy`([`Proxy`])                                          |             |                 | ![No changes]         |
| Unchanged | `public` `abstract` |          | [`Connection`]  | `proxy`([`String`], `int`)                                  |             |                 | ![No changes]         |
| Unchanged | `public` `abstract` |          | [`Connection`]  | `referrer`([`String`])                                      |             |                 | ![No changes]         |
| Unchanged | `public` `abstract` |          | [`Request`]     | `request`()                                                 |             |                 | ![No changes]         |
| Unchanged | `public` `abstract` |          | [`Connection`]  | `request`([`Request`])                                      |             |                 | ![No changes]         |
| Unchanged | `public` `abstract` |          | [`Connection`]  | `requestBody`([`String`])                                   |             |                 | ![No changes]         |
| Unchanged | `public` `abstract` |          | [`Response`]    | `response`()                                                |             |                 | ![No changes]         |
| Unchanged | `public` `abstract` |          | [`Connection`]  | `response`([`Response`])                                    |             |                 | ![No changes]         |
| Unchanged | `public` `abstract` |          | [`Connection`]  | `sslSocketFactory`([`SSLSocketFactory`])                    |             |                 | ![No changes]         |
| Unchanged | `public` `abstract` |          | [`Connection`]  | `timeout`(`int`)                                            |             |                 | ![No changes]         |
| Unchanged | `public` `abstract` |          | [`Connection`]  | `url`([`URL`])                                              |             |                 | ![No changes]         |
| Unchanged | `public` `abstract` |          | [`Connection`]  | `url`([`String`])                                           |             |                 | ![No changes]         |
| Unchanged | `public` `abstract` |          | [`Connection`]  | `userAgent`([`String`])                                     |             |                 | ![No changes]         |

___

<a id="user-content-org.jsoup.connection$base"></a>
### `org.jsoup.Connection$Base`

- [X] Binary-compatible
- [X] Source-compatible
- [X] Serialization-compatible

| Status    | Modifiers                    | Type      | Name   | Extends    | JDK   | Serialization       | Compatibility Changes |
|-----------|------------------------------|-----------|--------|------------|-------|---------------------|-----------------------|
| Unchanged | `static` `public` `abstract` | Interface | `Base` | [`Object`] | JDK 8 | ![Not serializable] | ![No changes]         |


#### Generics

| Status    | Name | Extends     | Compatibility Changes |
|-----------|------|-------------|-----------------------|
| Unchanged | `T`  | [`Base<T>`] | ![No changes]         |


#### Methods

| Status    | Modifiers           | Generics | Type                          | Method                                       | Annotations | Throws | Compatibility Changes |
|-----------|---------------------|----------|-------------------------------|----------------------------------------------|-------------|--------|-----------------------|
| Unchanged | `public` `abstract` |          | [`Base`]                      | `addHeader`([`String`], [`String`])          |             |        | ![No changes]         |
| Unchanged | `public` `abstract` |          | [`String`]                    | `cookie`([`String`])                         |             |        | ![No changes]         |
| Unchanged | `public` `abstract` |          | [`Base`]                      | `cookie`([`String`], [`String`])             |             |        | ![No changes]         |
| Unchanged | `public` `abstract` |          | [`Map<String, String>`]       | `cookies`()                                  |             |        | ![No changes]         |
| Unchanged | `public` `abstract` |          | `boolean`                     | `hasCookie`([`String`])                      |             |        | ![No changes]         |
| Unchanged | `public` `abstract` |          | `boolean`                     | `hasHeader`([`String`])                      |             |        | ![No changes]         |
| Unchanged | `public` `abstract` |          | `boolean`                     | `hasHeaderWithValue`([`String`], [`String`]) |             |        | ![No changes]         |
| Unchanged | `public` `abstract` |          | [`String`]                    | `header`([`String`])                         |             |        | ![No changes]         |
| Unchanged | `public` `abstract` |          | [`Base`]                      | `header`([`String`], [`String`])             |             |        | ![No changes]         |
| Unchanged | `public` `abstract` |          | [`List<String>`]              | `headers`([`String`])                        |             |        | ![No changes]         |
| Unchanged | `public` `abstract` |          | [`Map<String, String>`]       | `headers`()                                  |             |        | ![No changes]         |
| Unchanged | `public` `abstract` |          | [`Method`]                    | `method`()                                   |             |        | ![No changes]         |
| Unchanged | `public` `abstract` |          | [`Base`]                      | `method`([`Method`])                         |             |        | ![No changes]         |
| Unchanged | `public` `abstract` |          | [`Map<String, List<String>>`] | `multiHeaders`()                             |             |        | ![No changes]         |
| Unchanged | `public` `abstract` |          | [`Base`]                      | `removeCookie`([`String`])                   |             |        | ![No changes]         |
| Unchanged | `public` `abstract` |          | [`Base`]                      | `removeHeader`([`String`])                   |             |        | ![No changes]         |
| Unchanged | `public` `abstract` |          | [`URL`]                       | `url`()                                      |             |        | ![No changes]         |
| Unchanged | `public` `abstract` |          | [`Base`]                      | `url`([`URL`])                               |             |        | ![No changes]         |

___

<a id="user-content-org.jsoup.connection$keyval"></a>
### `org.jsoup.Connection$KeyVal`

- [X] Binary-compatible
- [X] Source-compatible
- [X] Serialization-compatible

| Status    | Modifiers                    | Type      | Name     | Extends    | JDK   | Serialization       | Compatibility Changes |
|-----------|------------------------------|-----------|----------|------------|-------|---------------------|-----------------------|
| Unchanged | `static` `public` `abstract` | Interface | `KeyVal` | [`Object`] | JDK 8 | ![Not serializable] | ![No changes]         |


#### Methods

| Status    | Modifiers           | Generics | Type            | Method                         | Annotations | Throws | Compatibility Changes |
|-----------|---------------------|----------|-----------------|--------------------------------|-------------|--------|-----------------------|
| Unchanged | `public` `abstract` |          | [`KeyVal`]      | `contentType`([`String`])      |             |        | ![No changes]         |
| Unchanged | `public` `abstract` |          | [`String`]      | `contentType`()                |             |        | ![No changes]         |
| Unchanged | `public` `abstract` |          | `boolean`       | `hasInputStream`()             |             |        | ![No changes]         |
| Unchanged | `public` `abstract` |          | [`KeyVal`]      | `inputStream`([`InputStream`]) |             |        | ![No changes]         |
| Unchanged | `public` `abstract` |          | [`InputStream`] | `inputStream`()                |             |        | ![No changes]         |
| Unchanged | `public` `abstract` |          | [`KeyVal`]      | `key`([`String`])              |             |        | ![No changes]         |
| Unchanged | `public` `abstract` |          | [`String`]      | `key`()                        |             |        | ![No changes]         |
| Unchanged | `public` `abstract` |          | [`KeyVal`]      | `value`([`String`])            |             |        | ![No changes]         |
| Unchanged | `public` `abstract` |          | [`String`]      | `value`()                      |             |        | ![No changes]         |

___

<a id="user-content-org.jsoup.connection$method"></a>
### `org.jsoup.Connection$Method`

- [X] Binary-compatible
- [X] Source-compatible
- [X] Serialization-compatible

| Status    | Modifiers                 | Type | Name     | Extends     | JDK   | Serialization | Compatibility Changes |
|-----------|---------------------------|------|----------|-------------|-------|---------------|-----------------------|
| Unchanged | `final` `static` `public` | Enum | `Method` | [`Enum<E>`] | JDK 8 | ![Compatible] | ![No changes]         |


#### Implemented Interfaces

| Status    | Interface         | Compatibility Changes |
|-----------|-------------------|-----------------------|
| Unchanged | [`Serializable`]  | ![No changes]         |
| Unchanged | [`Comparable<T>`] | ![No changes]         |
| Unchanged | [`Constable`]     | ![No changes]         |


#### Methods

| Status    | Modifiers         | Generics | Type            | Method                | Annotations | Throws | Compatibility Changes |
|-----------|-------------------|----------|-----------------|-----------------------|-------------|--------|-----------------------|
| Unchanged | `final` `public`  |          | `boolean`       | `hasBody`()           |             |        | ![No changes]         |
| Unchanged | `static` `public` |          | [`Method`]      | `valueOf`([`String`]) |             |        | ![No changes]         |
| Unchanged | `static` `public` |          | [`Method[]`][1] | `values`()            |             |        | ![No changes]         |


#### Fields

| Status    | Modifiers                 | Type       | Name      | Annotations | Compatibility Changes |
|-----------|---------------------------|------------|-----------|-------------|-----------------------|
| Unchanged | `public` `static` `final` | [`Method`] | `DELETE`  |             | ![No changes]         |
| Unchanged | `public` `static` `final` | [`Method`] | `GET`     |             | ![No changes]         |
| Unchanged | `public` `static` `final` | [`Method`] | `HEAD`    |             | ![No changes]         |
| Unchanged | `public` `static` `final` | [`Method`] | `OPTIONS` |             | ![No changes]         |
| Unchanged | `public` `static` `final` | [`Method`] | `PATCH`   |             | ![No changes]         |
| Unchanged | `public` `static` `final` | [`Method`] | `POST`    |             | ![No changes]         |
| Unchanged | `public` `static` `final` | [`Method`] | `PUT`     |             | ![No changes]         |
| Unchanged | `public` `static` `final` | [`Method`] | `TRACE`   |             | ![No changes]         |

___

<a id="user-content-org.jsoup.connection$request"></a>
### `org.jsoup.Connection$Request`

- [X] Binary-compatible
- [X] Source-compatible
- [X] Serialization-compatible

| Status    | Modifiers                    | Type      | Name      | Extends    | JDK   | Serialization       | Compatibility Changes |
|-----------|------------------------------|-----------|-----------|------------|-------|---------------------|-----------------------|
| Unchanged | `static` `public` `abstract` | Interface | `Request` | [`Object`] | JDK 8 | ![Not serializable] | ![No changes]         |


#### Implemented Interfaces

| Status    | Interface      | Compatibility Changes |
|-----------|----------------|-----------------------|
| Unchanged | [`Base<T>`][2] | ![No changes]         |


#### Methods

| Status    | Modifiers           | Generics | Type                     | Method                                   | Annotations | Throws | Compatibility Changes |
|-----------|---------------------|----------|--------------------------|------------------------------------------|-------------|--------|-----------------------|
| Unchanged | `public`            |          | [`Request`]              | `auth`([`RequestAuthenticator`])         |             |        | ![No changes]         |
| Unchanged | `public`            |          | [`RequestAuthenticator`] | `auth`()                                 |             |        | ![No changes]         |
| Unchanged | `public` `abstract` |          | [`Request`]              | `data`([`KeyVal`])                       |             |        | ![No changes]         |
| Unchanged | `public` `abstract` |          | [`Collection<KeyVal>`]   | `data`()                                 |             |        | ![No changes]         |
| Unchanged | `public` `abstract` |          | `boolean`                | `followRedirects`()                      |             |        | ![No changes]         |
| Unchanged | `public` `abstract` |          | [`Request`]              | `followRedirects`(`boolean`)             |             |        | ![No changes]         |
| Unchanged | `public` `abstract` |          | `boolean`                | `ignoreContentType`()                    |             |        | ![No changes]         |
| Unchanged | `public` `abstract` |          | [`Request`]              | `ignoreContentType`(`boolean`)           |             |        | ![No changes]         |
| Unchanged | `public` `abstract` |          | `boolean`                | `ignoreHttpErrors`()                     |             |        | ![No changes]         |
| Unchanged | `public` `abstract` |          | [`Request`]              | `ignoreHttpErrors`(`boolean`)            |             |        | ![No changes]         |
| Unchanged | `public` `abstract` |          | `int`                    | `maxBodySize`()                          |             |        | ![No changes]         |
| Unchanged | `public` `abstract` |          | [`Request`]              | `maxBodySize`(`int`)                     |             |        | ![No changes]         |
| Unchanged | `public` `abstract` |          | [`Request`]              | `parser`([`Parser`])                     |             |        | ![No changes]         |
| Unchanged | `public` `abstract` |          | [`Parser`]               | `parser`()                               |             |        | ![No changes]         |
| Unchanged | `public` `abstract` |          | [`Request`]              | `postDataCharset`([`String`])            |             |        | ![No changes]         |
| Unchanged | `public` `abstract` |          | [`String`]               | `postDataCharset`()                      |             |        | ![No changes]         |
| Unchanged | `public` `abstract` |          | [`Proxy`]                | `proxy`()                                |             |        | ![No changes]         |
| Unchanged | `public` `abstract` |          | [`Request`]              | `proxy`([`Proxy`])                       |             |        | ![No changes]         |
| Unchanged | `public` `abstract` |          | [`Request`]              | `proxy`([`String`], `int`)               |             |        | ![No changes]         |
| Unchanged | `public` `abstract` |          | [`Request`]              | `requestBody`([`String`])                |             |        | ![No changes]         |
| Unchanged | `public` `abstract` |          | [`String`]               | `requestBody`()                          |             |        | ![No changes]         |
| Unchanged | `public` `abstract` |          | [`SSLSocketFactory`]     | `sslSocketFactory`()                     |             |        | ![No changes]         |
| Unchanged | `public` `abstract` |          | `void`                   | `sslSocketFactory`([`SSLSocketFactory`]) |             |        | ![No changes]         |
| Unchanged | `public` `abstract` |          | `int`                    | `timeout`()                              |             |        | ![No changes]         |
| Unchanged | `public` `abstract` |          | [`Request`]              | `timeout`(`int`)                         |             |        | ![No changes]         |

___

<a id="user-content-org.jsoup.connection$response"></a>
### `org.jsoup.Connection$Response`

- [X] Binary-compatible
- [X] Source-compatible
- [X] Serialization-compatible

| Status    | Modifiers                    | Type      | Name       | Extends    | JDK   | Serialization       | Compatibility Changes |
|-----------|------------------------------|-----------|------------|------------|-------|---------------------|-----------------------|
| Unchanged | `static` `public` `abstract` | Interface | `Response` | [`Object`] | JDK 8 | ![Not serializable] | ![No changes]         |


#### Implemented Interfaces

| Status    | Interface      | Compatibility Changes |
|-----------|----------------|-----------------------|
| Unchanged | [`Base<T>`][2] | ![No changes]         |


#### Methods

| Status    | Modifiers           | Generics | Type                    | Method                | Annotations | Throws          | Compatibility Changes |
|-----------|---------------------|----------|-------------------------|-----------------------|-------------|-----------------|-----------------------|
| Unchanged | `public` `abstract` |          | [`String`]              | `body`()              |             |                 | ![No changes]         |
| Unchanged | `public` `abstract` |          | `byte[]`                | `bodyAsBytes`()       |             |                 | ![No changes]         |
| Unchanged | `public` `abstract` |          | [`BufferedInputStream`] | `bodyStream`()        |             |                 | ![No changes]         |
| Unchanged | `public` `abstract` |          | [`Response`]            | `bufferUp`()          |             |                 | ![No changes]         |
| Unchanged | `public` `abstract` |          | [`String`]              | `charset`()           |             |                 | ![No changes]         |
| Unchanged | `public` `abstract` |          | [`Response`]            | `charset`([`String`]) |             |                 | ![No changes]         |
| Unchanged | `public` `abstract` |          | [`String`]              | `contentType`()       |             |                 | ![No changes]         |
| Unchanged | `public` `abstract` |          | [`Document`]            | `parse`()             |             | [`IOException`] | ![No changes]         |
| Unchanged | `public` `abstract` |          | `int`                   | `statusCode`()        |             |                 | ![No changes]         |
| Unchanged | `public` `abstract` |          | [`String`]              | `statusMessage`()     |             |                 | ![No changes]         |
| Unchanged | `public`            |          | [`StreamParser`]        | `streamParser`()      |             | [`IOException`] | ![No changes]         |

___

<a id="user-content-org.jsoup.httpstatusexception"></a>
### `org.jsoup.HttpStatusException`

- [X] Binary-compatible
- [X] Source-compatible
- [X] Serialization-compatible

| Status    | Modifiers | Type  | Name                  | Extends         | JDK   | Serialization | Compatibility Changes |
|-----------|-----------|-------|-----------------------|-----------------|-------|---------------|-----------------------|
| Unchanged | `public`  | Class | `HttpStatusException` | [`IOException`] | JDK 8 | ![Compatible] | ![No changes]         |


#### Implemented Interfaces

| Status    | Interface        | Compatibility Changes |
|-----------|------------------|-----------------------|
| Unchanged | [`Serializable`] | ![No changes]         |


#### Constructors

| Status    | Modifiers | Generics | Constructor                                          | Annotations | Throws | Compatibility Changes |
|-----------|-----------|----------|------------------------------------------------------|-------------|--------|-----------------------|
| Unchanged | `public`  |          | `HttpStatusException`([`String`], `int`, [`String`]) |             |        | ![No changes]         |


#### Methods

| Status    | Modifiers | Generics | Type       | Method            | Annotations | Throws | Compatibility Changes |
|-----------|-----------|----------|------------|-------------------|-------------|--------|-----------------------|
| Unchanged | `public`  |          | `int`      | `getStatusCode`() |             |        | ![No changes]         |
| Unchanged | `public`  |          | [`String`] | `getUrl`()        |             |        | ![No changes]         |

___

<a id="user-content-org.jsoup.jsoup"></a>
### `org.jsoup.Jsoup`

- [X] Binary-compatible
- [X] Source-compatible
- [X] Serialization-compatible

| Status    | Modifiers | Type  | Name    | Extends    | JDK   | Serialization       | Compatibility Changes |
|-----------|-----------|-------|---------|------------|-------|---------------------|-----------------------|
| Unchanged | `public`  | Class | `Jsoup` | [`Object`] | JDK 8 | ![Not serializable] | ![No changes]         |


#### Methods

| Status    | Modifiers         | Generics | Type           | Method                                                       | Annotations | Throws          | Compatibility Changes |
|-----------|-------------------|----------|----------------|--------------------------------------------------------------|-------------|-----------------|-----------------------|
| Unchanged | `static` `public` |          | [`String`]     | `clean`([`String`], [`String`], [`Safelist`])                |             |                 | ![No changes]         |
| Unchanged | `static` `public` |          | [`String`]     | `clean`([`String`], [`Safelist`])                            |             |                 | ![No changes]         |
| Unchanged | `static` `public` |          | [`String`]     | `clean`([`String`], [`String`], [`Safelist`], [`OutputSettings`]) |        |                 | ![No changes]         |
| Unchanged | `static` `public` |          | [`Connection`] | `connect`([`String`])                                        |             |                 | ![No changes]         |
| Unchanged | `static` `public` |          | `boolean`      | `isValid`([`String`], [`Safelist`])                          |             |                 | ![No changes]         |
| Unchanged | `static` `public` |          | [`Connection`] | `newSession`()                                               |             |                 | ![No changes]         |
| Unchanged | `static` `public` |          | [`Document`]   | `parse`([`String`], [`String`])                              |             |                 | ![No changes]         |
| Unchanged | `static` `public` |          | [`Document`]   | `parse`([`String`], [`String`], [`Parser`])                  |             |                 | ![No changes]         |
| Unchanged | `static` `public` |          | [`Document`]   | `parse`([`String`], [`Parser`])                              |             |                 | ![No changes]         |
| Unchanged | `static` `public` |          | [`Document`]   | `parse`([`String`])                                          |             |                 | ![No changes]         |
| Unchanged | `static` `public` |          | [`Document`]   | `parse`([`File`], [`String`], [`String`])                    |             | [`IOException`] | ![No changes]         |
| Unchanged | `static` `public` |          | [`Document`]   | `parse`([`File`], [`String`])                                |             | [`IOException`] | ![No changes]         |
| Unchanged | `static` `public` |          | [`Document`]   | `parse`([`File`])                                            |             | [`IOException`] | ![No changes]         |
| Unchanged | `static` `public` |          | [`Document`]   | `parse`([`File`], [`String`], [`String`], [`Parser`])        |             | [`IOException`] | ![No changes]         |
| Unchanged | `static` `public` |          | [`Document`]   | `parse`([`Path`], [`String`], [`String`])                    |             | [`IOException`] | ![No changes]         |
| Unchanged | `static` `public` |          | [`Document`]   | `parse`([`Path`], [`String`])                                |             | [`IOException`] | ![No changes]         |
| Unchanged | `static` `public` |          | [`Document`]   | `parse`([`Path`])                                            |             | [`IOException`] | ![No changes]         |
| Unchanged | `static` `public` |          | [`Document`]   | `parse`([`Path`], [`String`], [`String`], [`Parser`])        |             | [`IOException`] | ![No changes]         |
| Unchanged | `static` `public` |          | [`Document`]   | `parse`([`InputStream`], [`String`], [`String`])             |             | [`IOException`] | ![No changes]         |
| Unchanged | `static` `public` |          | [`Document`]   | `parse`([`InputStream`], [`String`], [`String`], [`Parser`]) |             | [`IOException`] | ![No changes]         |
| Unchanged | `static` `public` |          | [`Document`]   | `parse`([`URL`], `int`)                                      |             | [`IOException`] | ![No changes]         |
| Unchanged | `static` `public` |          | [`Document`]   | `parseBodyFragment`([`String`], [`String`])                  |             |                 | ![No changes]         |
| Unchanged | `static` `public` |          | [`Document`]   | `parseBodyFragment`([`String`])                              |             |                 | ![No changes]         |

___

<a id="user-content-org.jsoup.parserfuzzertest"></a>
### `org.jsoup.ParserFuzzerTest`

- [X] Binary-compatible
- [X] Source-compatible
- [X] Serialization-compatible

| Status | Modifiers    | Type      | Name                   | Extends        | JDK       | Serialization       | Compatibility Changes |
|--------|--------------|-----------|------------------------|----------------|-----------|---------------------|-----------------------|
| Added  | **`public`** | **Class** | **`ParserFuzzerTest`** | **[`Object`]** | **JDK 8** | ![Not serializable] | ![No changes]         |


#### Constructors

| Status | Modifiers    | Generics | Constructor              | Annotations | Throws | Compatibility Changes |
|--------|--------------|----------|--------------------------|-------------|--------|-----------------------|
| Added  | **`public`** |          | **`ParserFuzzerTest`**() |             |        | ![No changes]         |


#### Methods

| Status | Modifiers                 | Generics | Type       | Method                                           | Annotations | Throws | Compatibility Changes |
|--------|---------------------------|----------|------------|--------------------------------------------------|-------------|--------|-----------------------|
| Added  | **`static`** **`public`** |          | **`void`** | **`fuzzerTestOneInput`**([`FuzzedDataProvider`]) |             |        | ![Method added to public class] |

___

<a id="user-content-org.jsoup.progress"></a>
### `org.jsoup.Progress`

- [X] Binary-compatible
- [X] Source-compatible
- [X] Serialization-compatible

| Status    | Modifiers           | Type      | Name       | Extends    | JDK   | Serialization       | Compatibility Changes |
|-----------|---------------------|-----------|------------|------------|-------|---------------------|-----------------------|
| Unchanged | `public` `abstract` | Interface | `Progress` | [`Object`] | JDK 8 | ![Not serializable] | ![No changes]         |


#### Generics

| Status    | Name              | Extends    | Compatibility Changes |
|-----------|-------------------|------------|-----------------------|
| Unchanged | `ProgressContext` | [`Object`] | ![No changes]         |


#### Annotations

| Status    | Annotation              | Compatibility Changes |
|-----------|-------------------------|-----------------------|
| Unchanged | [`FunctionalInterface`] | ![No changes]         |


#### Methods

| Status    | Modifiers           | Generics | Type   | Method                                                 | Annotations | Throws | Compatibility Changes |
|-----------|---------------------|----------|--------|--------------------------------------------------------|-------------|--------|-----------------------|
| Unchanged | `public` `abstract` |          | `void` | `onProgress`(`int`, `int`, `float`, `ProgressContext`) |             |        | ![No changes]         |

___

<a id="user-content-org.jsoup.serializationexception"></a>
### `org.jsoup.SerializationException`

- [X] Binary-compatible
- [X] Source-compatible
- [X] Serialization-compatible

| Status    | Modifiers        | Type  | Name                     | Extends              | JDK   | Serialization | Compatibility Changes |
|-----------|------------------|-------|--------------------------|----------------------|-------|---------------|-----------------------|
| Unchanged | `final` `public` | Class | `SerializationException` | [`RuntimeException`] | JDK 8 | ![Compatible] | ![No changes]         |


#### Implemented Interfaces

| Status    | Interface        | Compatibility Changes |
|-----------|------------------|-----------------------|
| Unchanged | [`Serializable`] | ![No changes]         |


#### Constructors

| Status    | Modifiers | Generics | Constructor                                         | Annotations | Throws | Compatibility Changes |
|-----------|-----------|----------|-----------------------------------------------------|-------------|--------|-----------------------|
| Unchanged | `public`  |          | `SerializationException`()                          |             |        | ![No changes]         |
| Unchanged | `public`  |          | `SerializationException`([`String`], [`Throwable`]) |             |        | ![No changes]         |
| Unchanged | `public`  |          | `SerializationException`([`String`])                |             |        | ![No changes]         |
| Unchanged | `public`  |          | `SerializationException`([`Throwable`])             |             |        | ![No changes]         |

___

<a id="user-content-org.jsoup.unsupportedmimetypeexception"></a>
### `org.jsoup.UnsupportedMimeTypeException`

- [X] Binary-compatible
- [X] Source-compatible
- [X] Serialization-compatible

| Status    | Modifiers | Type  | Name                           | Extends         | JDK   | Serialization | Compatibility Changes |
|-----------|-----------|-------|--------------------------------|-----------------|-------|---------------|-----------------------|
| Unchanged | `public`  | Class | `UnsupportedMimeTypeException` | [`IOException`] | JDK 8 | ![Compatible] | ![No changes]         |


#### Implemented Interfaces

| Status    | Interface        | Compatibility Changes |
|-----------|------------------|-----------------------|
| Unchanged | [`Serializable`] | ![No changes]         |


#### Constructors

| Status    | Modifiers | Generics | Constructor | Annotations | Throws | Compatibility Changes |
|-----------|-----------|----------|-------------|-------------|--------|-----------------------|
| Unchanged | `public`  |          | `UnsupportedMimeTypeException`([`String`], [`String`], [`String`]) |  |  | ![No changes] |


#### Methods

| Status    | Modifiers | Generics | Type       | Method          | Annotations | Throws | Compatibility Changes |
|-----------|-----------|----------|------------|-----------------|-------------|--------|-----------------------|
| Unchanged | `public`  |          | [`String`] | `getMimeType`() |             |        | ![No changes]         |
| Unchanged | `public`  |          | [`String`] | `getUrl`()      |             |        | ![No changes]         |
| Unchanged | `public`  |          | [`String`] | `toString`()    |             |        | ![No changes]         |

___

<a id="user-content-org.jsoup.helper.changenotifyingarraylist"></a>
### `org.jsoup.helper.ChangeNotifyingArrayList`

- [X] Binary-compatible
- [X] Source-compatible
- [X] Serialization-compatible

| Status    | Modifiers           | Type  | Name                       | Extends          | JDK   | Serialization | Compatibility Changes |
|-----------|---------------------|-------|----------------------------|------------------|-------|---------------|-----------------------|
| Unchanged | `public` `abstract` | Class | `ChangeNotifyingArrayList` | [`ArrayList<E>`] | JDK 8 | ![Compatible] | ![No changes]         |


#### Generics

| Status    | Name | Extends    | Compatibility Changes |
|-----------|------|------------|-----------------------|
| Unchanged | `E`  | [`Object`] | ![No changes]         |


#### Implemented Interfaces

| Status    | Interface                  | Compatibility Changes |
|-----------|----------------------------|-----------------------|
| Unchanged | [`Serializable`]           | ![No changes]         |
| Unchanged | [`Cloneable`]              | ![No changes]         |
| Unchanged | [`Iterable<T>`]            | ![No changes]         |
| Unchanged | [`Collection<E>`]          | ![No changes]         |
| Unchanged | [`List<E>`]                | ![No changes]         |
| Unchanged | [`RandomAccess`]           | ![No changes]         |
| Unchanged | [`SequencedCollection<E>`] | ![No changes]         |


#### Constructors

| Status    | Modifiers | Generics | Constructor                       | Annotations | Throws | Compatibility Changes |
|-----------|-----------|----------|-----------------------------------|-------------|--------|-----------------------|
| Unchanged | `public`  |          | `ChangeNotifyingArrayList`(`int`) |             |        | ![No changes]         |


#### Methods

| Status    | Modifiers           | Generics | Type       | Method                                       | Annotations | Throws | Compatibility Changes |
|-----------|---------------------|----------|------------|----------------------------------------------|-------------|--------|-----------------------|
| Unchanged | `public`            |          | `boolean`  | `add`(`E`)                                   |             |        | ![No changes]         |
| Unchanged | `public`            |          | `void`     | `add`(`int`, `E`)                            |             |        | ![No changes]         |
| Unchanged | `public`            |          | `boolean`  | `addAll`([`Collection<? extends E>`])        |             |        | ![No changes]         |
| Unchanged | `public`            |          | `boolean`  | `addAll`(`int`, [`Collection<? extends E>`]) |             |        | ![No changes]         |
| Unchanged | `public`            |          | `void`     | `clear`()                                    |             |        | ![No changes]         |
| Unchanged | `public` `abstract` |          | `void`     | `onContentsChanged`()                        |             |        | ![No changes]         |
| Unchanged | `public`            |          | [`Object`] | `remove`(`int`)                              |             |        | ![No changes]         |
| Unchanged | `public`            |          | `boolean`  | `remove`([`Object`])                         |             |        | ![No changes]         |
| Unchanged | `public`            |          | `boolean`  | `removeAll`([`Collection<?>`])               |             |        | ![No changes]         |
| Unchanged | `protected`         |          | `void`     | `removeRange`(`int`, `int`)                  |             |        | ![No changes]         |
| Unchanged | `public`            |          | `boolean`  | `retainAll`([`Collection<?>`])               |             |        | ![No changes]         |
| Unchanged | `public`            |          | [`Object`] | `set`(`int`, `E`)                            |             |        | ![No changes]         |

___

<a id="user-content-org.jsoup.helper.datautil"></a>
### `org.jsoup.helper.DataUtil`

- [X] Binary-compatible
- [X] Source-compatible
- [X] Serialization-compatible

| Status    | Modifiers        | Type  | Name       | Extends    | JDK   | Serialization       | Compatibility Changes |
|-----------|------------------|-------|------------|------------|-------|---------------------|-----------------------|
| Unchanged | `final` `public` | Class | `DataUtil` | [`Object`] | JDK 8 | ![Not serializable] | ![No changes]         |


#### Methods

| Status    | Modifiers         | Generics | Type             | Method                                                        | Annotations | Throws          | Compatibility Changes |
|-----------|-------------------|----------|------------------|---------------------------------------------------------------|-------------|-----------------|-----------------------|
| Unchanged | `static` `public` |          | [`Document`]     | `load`([`File`], [`String`], [`String`])                      |             | [`IOException`] | ![No changes]         |
| Unchanged | `static` `public` |          | [`Document`]     | `load`([`File`], [`String`], [`String`], [`Parser`])          |             | [`IOException`] | ![No changes]         |
| Unchanged | `static` `public` |          | [`Document`]     | `load`([`Path`], [`String`], [`String`])                      |             | [`IOException`] | ![No changes]         |
| Unchanged | `static` `public` |          | [`Document`]     | `load`([`Path`], [`String`], [`String`], [`Parser`])          |             | [`IOException`] | ![No changes]         |
| Unchanged | `static` `public` |          | [`Document`]     | `load`([`InputStream`], [`String`], [`String`])               |             | [`IOException`] | ![No changes]         |
| Unchanged | `static` `public` |          | [`Document`]     | `load`([`InputStream`], [`String`], [`String`], [`Parser`])   |             | [`IOException`] | ![No changes]         |
| Unchanged | `static` `public` |          | [`ByteBuffer`]   | `readToByteBuffer`([`InputStream`], `int`)                    |             | [`IOException`] | ![No changes]         |
| Unchanged | `static` `public` |          | [`StreamParser`] | `streamParser`([`Path`], [`Charset`], [`String`], [`Parser`]) |             | [`IOException`] | ![No changes]         |


#### Fields

| Status    | Modifiers                 | Type        | Name    | Annotations | Compatibility Changes |
|-----------|---------------------------|-------------|---------|-------------|-----------------------|
| Unchanged | `public` `static` `final` | [`Charset`] | `UTF_8` |             | ![No changes]         |

___

<a id="user-content-org.jsoup.helper.httpconnection"></a>
### `org.jsoup.helper.HttpConnection`

- [X] Binary-compatible
- [X] Source-compatible
- [X] Serialization-compatible

| Status    | Modifiers | Type  | Name             | Extends    | JDK   | Serialization       | Compatibility Changes |
|-----------|-----------|-------|------------------|------------|-------|---------------------|-----------------------|
| Unchanged | `public`  | Class | `HttpConnection` | [`Object`] | JDK 8 | ![Not serializable] | ![No changes]         |


#### Implemented Interfaces

| Status    | Interface      | Compatibility Changes |
|-----------|----------------|-----------------------|
| Unchanged | [`Connection`] | ![No changes]         |


#### Constructors

| Status    | Modifiers | Generics | Constructor        | Annotations | Throws | Compatibility Changes |
|-----------|-----------|----------|--------------------|-------------|--------|-----------------------|
| Unchanged | `public`  |          | `HttpConnection`() |             |        | ![No changes]         |


#### Methods

| Status    | Modifiers         | Generics | Type            | Method                                                      | Annotations | Throws          | Compatibility Changes |
|-----------|-------------------|----------|-----------------|-------------------------------------------------------------|-------------|-----------------|-----------------------|
| Unchanged | `public`          |          | [`Connection`]  | `auth`([`RequestAuthenticator`])                            |             |                 | ![No changes]         |
| Unchanged | `static` `public` |          | [`Connection`]  | `connect`([`String`])                                       |             |                 | ![No changes]         |
| Unchanged | `static` `public` |          | [`Connection`]  | `connect`([`URL`])                                          |             |                 | ![No changes]         |
| Unchanged | `public`          |          | [`Connection`]  | `cookie`([`String`], [`String`])                            |             |                 | ![No changes]         |
| Unchanged | `public`          |          | [`Connection`]  | `cookieStore`([`CookieStore`])                              |             |                 | ![No changes]         |
| Unchanged | `public`          |          | [`CookieStore`] | `cookieStore`()                                             |             |                 | ![No changes]         |
| Unchanged | `public`          |          | [`Connection`]  | `cookies`([`Map<String, String>`])                          |             |                 | ![No changes]         |
| Unchanged | `public`          |          | [`Connection`]  | `data`([`String`], [`String`])                              |             |                 | ![No changes]         |
| Unchanged | `public`          |          | [`Connection`]  | `data`([`String`], [`String`], [`InputStream`])             |             |                 | ![No changes]         |
| Unchanged | `public`          |          | [`Connection`]  | `data`([`String`], [`String`], [`InputStream`], [`String`]) |             |                 | ![No changes]         |
| Unchanged | `public`          |          | [`Connection`]  | `data`([`Map<String, String>`])                             |             |                 | ![No changes]         |
| Unchanged | `public`          |          | [`Connection`]  | `data`([`String...`])                                       |             |                 | ![No changes]         |
| Unchanged | `public`          |          | [`Connection`]  | `data`([`Collection<KeyVal>`])                              |             |                 | ![No changes]         |
| Unchanged | `public`          |          | [`KeyVal`]      | `data`([`String`])                                          |             |                 | ![No changes]         |
| Unchanged | `public`          |          | [`Response`]    | `execute`()                                                 |             | [`IOException`] | ![No changes]         |
| Unchanged | `public`          |          | [`Connection`]  | `followRedirects`(`boolean`)                                |             |                 | ![No changes]         |
| Unchanged | `public`          |          | [`Document`]    | `get`()                                                     |             | [`IOException`] | ![No changes]         |
| Unchanged | `public`          |          | [`Connection`]  | `header`([`String`], [`String`])                            |             |                 | ![No changes]         |
| Unchanged | `public`          |          | [`Connection`]  | `headers`([`Map<String, String>`])                          |             |                 | ![No changes]         |
| Unchanged | `public`          |          | [`Connection`]  | `ignoreContentType`(`boolean`)                              |             |                 | ![No changes]         |
| Unchanged | `public`          |          | [`Connection`]  | `ignoreHttpErrors`(`boolean`)                               |             |                 | ![No changes]         |
| Unchanged | `public`          |          | [`Connection`]  | `maxBodySize`(`int`)                                        |             |                 | ![No changes]         |
| Unchanged | `public`          |          | [`Connection`]  | `method`([`Method`])                                        |             |                 | ![No changes]         |
| Unchanged | `public`          |          | [`Connection`]  | `newRequest`()                                              |             |                 | ![No changes]         |
| Unchanged | `public`          |          | [`Connection`]  | `onResponseProgress`([`Progress<Response>`])                |             |                 | ![No changes]         |
| Unchanged | `public`          |          | [`Connection`]  | `parser`([`Parser`])                                        |             |                 | ![No changes]         |
| Unchanged | `public`          |          | [`Document`]    | `post`()                                                    |             | [`IOException`] | ![No changes]         |
| Unchanged | `public`          |          | [`Connection`]  | `postDataCharset`([`String`])                               |             |                 | ![No changes]         |
| Unchanged | `public`          |          | [`Connection`]  | `proxy`([`Proxy`])                                          |             |                 | ![No changes]         |
| Unchanged | `public`          |          | [`Connection`]  | `proxy`([`String`], `int`)                                  |             |                 | ![No changes]         |
| Unchanged | `public`          |          | [`Connection`]  | `referrer`([`String`])                                      |             |                 | ![No changes]         |
| Unchanged | `public`          |          | [`Request`]     | `request`()                                                 |             |                 | ![No changes]         |
| Unchanged | `public`          |          | [`Connection`]  | `request`([`Request`])                                      |             |                 | ![No changes]         |
| Unchanged | `public`          |          | [`Connection`]  | `requestBody`([`String`])                                   |             |                 | ![No changes]         |
| Unchanged | `public`          |          | [`Response`]    | `response`()                                                |             |                 | ![No changes]         |
| Unchanged | `public`          |          | [`Connection`]  | `response`([`Response`])                                    |             |                 | ![No changes]         |
| Unchanged | `public`          |          | [`Connection`]  | `sslSocketFactory`([`SSLSocketFactory`])                    |             |                 | ![No changes]         |
| Unchanged | `public`          |          | [`Connection`]  | `timeout`(`int`)                                            |             |                 | ![No changes]         |
| Unchanged | `public`          |          | [`Connection`]  | `url`([`URL`])                                              |             |                 | ![No changes]         |
| Unchanged | `public`          |          | [`Connection`]  | `url`([`String`])                                           |             |                 | ![No changes]         |
| Unchanged | `public`          |          | [`Connection`]  | `userAgent`([`String`])                                     |             |                 | ![No changes]         |


#### Fields

| Status    | Modifiers                 | Type       | Name                  | Annotations | Compatibility Changes |
|-----------|---------------------------|------------|-----------------------|-------------|-----------------------|
| Unchanged | `public` `static` `final` | [`String`] | `CONTENT_ENCODING`    |             | ![No changes]         |
| Unchanged | `public` `static` `final` | [`String`] | `CONTENT_TYPE`        |             | ![No changes]         |
| Unchanged | `public` `static` `final` | [`String`] | `DEFAULT_UA`          |             | ![No changes]         |
| Unchanged | `public` `static` `final` | [`String`] | `FORM_URL_ENCODED`    |             | ![No changes]         |
| Unchanged | `public` `static` `final` | [`String`] | `MULTIPART_FORM_DATA` |             | ![No changes]         |

___

<a id="user-content-org.jsoup.helper.httpconnection$keyval"></a>
### `org.jsoup.helper.HttpConnection$KeyVal`

- [X] Binary-compatible
- [X] Source-compatible
- [X] Serialization-compatible

| Status    | Modifiers         | Type  | Name     | Extends    | JDK   | Serialization       | Compatibility Changes |
|-----------|-------------------|-------|----------|------------|-------|---------------------|-----------------------|
| Unchanged | `static` `public` | Class | `KeyVal` | [`Object`] | JDK 8 | ![Not serializable] | ![No changes]         |


#### Implemented Interfaces

| Status    | Interface  | Compatibility Changes |
|-----------|------------|-----------------------|
| Unchanged | [`KeyVal`] | ![No changes]         |


#### Methods

| Status    | Modifiers         | Generics | Type            | Method                                            | Annotations | Throws | Compatibility Changes |
|-----------|-------------------|----------|-----------------|---------------------------------------------------|-------------|--------|-----------------------|
| Unchanged | `public`          |          | [`KeyVal`]      | `contentType`([`String`])                         |             |        | ![No changes]         |
| Unchanged | `public`          |          | [`String`]      | `contentType`()                                   |             |        | ![No changes]         |
| Unchanged | `static` `public` |          | [`KeyVal`][3]   | `create`([`String`], [`String`])                  |             |        | ![No changes]         |
| Unchanged | `static` `public` |          | [`KeyVal`][3]   | `create`([`String`], [`String`], [`InputStream`]) |             |        | ![No changes]         |
| Unchanged | `public`          |          | `boolean`       | `hasInputStream`()                                |             |        | ![No changes]         |
| Unchanged | `public`          |          | [`KeyVal`][3]   | `inputStream`([`InputStream`])                    |             |        | ![No changes]         |
| Unchanged | `public`          |          | [`InputStream`] | `inputStream`()                                   |             |        | ![No changes]         |
| Unchanged | `public`          |          | [`KeyVal`][3]   | `key`([`String`])                                 |             |        | ![No changes]         |
| Unchanged | `public`          |          | [`String`]      | `key`()                                           |             |        | ![No changes]         |
| Unchanged | `public`          |          | [`String`]      | `toString`()                                      |             |        | ![No changes]         |
| Unchanged | `public`          |          | [`KeyVal`][3]   | `value`([`String`])                               |             |        | ![No changes]         |
| Unchanged | `public`          |          | [`String`]      | `value`()                                         |             |        | ![No changes]         |

___

<a id="user-content-org.jsoup.helper.httpconnection$request"></a>
### `org.jsoup.helper.HttpConnection$Request`

- [X] Binary-compatible
- [X] Source-compatible
- [X] Serialization-compatible

| Status    | Modifiers         | Type  | Name      | Extends        | JDK   | Serialization       | Compatibility Changes |
|-----------|-------------------|-------|-----------|----------------|-------|---------------------|-----------------------|
| Unchanged | `static` `public` | Class | `Request` | [`Base<T>`][4] | JDK 8 | ![Not serializable] | ![No changes]         |


#### Implemented Interfaces

| Status    | Interface      | Compatibility Changes |
|-----------|----------------|-----------------------|
| Unchanged | [`Base<T>`][2] | ![No changes]         |
| Unchanged | [`Request`]    | ![No changes]         |


#### Methods

| Status    | Modifiers | Generics | Type                     | Method                                   | Annotations | Throws | Compatibility Changes |
|-----------|-----------|----------|--------------------------|------------------------------------------|-------------|--------|-----------------------|
| Unchanged | `public`  |          | [`Request`]              | `auth`([`RequestAuthenticator`])         |             |        | ![No changes]         |
| Unchanged | `public`  |          | [`RequestAuthenticator`] | `auth`()                                 |             |        | ![No changes]         |
| Unchanged | `public`  |          | [`Request`][5]           | `data`([`KeyVal`])                       |             |        | ![No changes]         |
| Unchanged | `public`  |          | [`Collection<KeyVal>`]   | `data`()                                 |             |        | ![No changes]         |
| Unchanged | `public`  |          | `boolean`                | `followRedirects`()                      |             |        | ![No changes]         |
| Unchanged | `public`  |          | [`Request`]              | `followRedirects`(`boolean`)             |             |        | ![No changes]         |
| Unchanged | `public`  |          | `boolean`                | `ignoreContentType`()                    |             |        | ![No changes]         |
| Unchanged | `public`  |          | [`Request`]              | `ignoreContentType`(`boolean`)           |             |        | ![No changes]         |
| Unchanged | `public`  |          | `boolean`                | `ignoreHttpErrors`()                     |             |        | ![No changes]         |
| Unchanged | `public`  |          | [`Request`]              | `ignoreHttpErrors`(`boolean`)            |             |        | ![No changes]         |
| Unchanged | `public`  |          | `int`                    | `maxBodySize`()                          |             |        | ![No changes]         |
| Unchanged | `public`  |          | [`Request`]              | `maxBodySize`(`int`)                     |             |        | ![No changes]         |
| Unchanged | `public`  |          | [`Request`][5]           | `parser`([`Parser`])                     |             |        | ![No changes]         |
| Unchanged | `public`  |          | [`Parser`]               | `parser`()                               |             |        | ![No changes]         |
| Unchanged | `public`  |          | [`Request`]              | `postDataCharset`([`String`])            |             |        | ![No changes]         |
| Unchanged | `public`  |          | [`String`]               | `postDataCharset`()                      |             |        | ![No changes]         |
| Unchanged | `public`  |          | [`Proxy`]                | `proxy`()                                |             |        | ![No changes]         |
| Unchanged | `public`  |          | [`Request`][5]           | `proxy`([`Proxy`])                       |             |        | ![No changes]         |
| Unchanged | `public`  |          | [`Request`][5]           | `proxy`([`String`], `int`)               |             |        | ![No changes]         |
| Unchanged | `public`  |          | [`Request`]              | `requestBody`([`String`])                |             |        | ![No changes]         |
| Unchanged | `public`  |          | [`String`]               | `requestBody`()                          |             |        | ![No changes]         |
| Unchanged | `public`  |          | [`SSLSocketFactory`]     | `sslSocketFactory`()                     |             |        | ![No changes]         |
| Unchanged | `public`  |          | `void`                   | `sslSocketFactory`([`SSLSocketFactory`]) |             |        | ![No changes]         |
| Unchanged | `public`  |          | `int`                    | `timeout`()                              |             |        | ![No changes]         |
| Unchanged | `public`  |          | [`Request`][5]           | `timeout`(`int`)                         |             |        | ![No changes]         |

___

<a id="user-content-org.jsoup.helper.httpconnection$response"></a>
### `org.jsoup.helper.HttpConnection$Response`

- [X] Binary-compatible
- [X] Source-compatible
- [X] Serialization-compatible

| Status    | Modifiers         | Type  | Name       | Extends        | JDK   | Serialization       | Compatibility Changes |
|-----------|-------------------|-------|------------|----------------|-------|---------------------|-----------------------|
| Unchanged | `static` `public` | Class | `Response` | [`Base<T>`][4] | JDK 8 | ![Not serializable] | ![No changes]         |


#### Implemented Interfaces

| Status    | Interface      | Compatibility Changes |
|-----------|----------------|-----------------------|
| Unchanged | [`Base<T>`][2] | ![No changes]         |
| Unchanged | [`Response`]   | ![No changes]         |


#### Methods

| Status    | Modifiers | Generics | Type                    | Method                | Annotations | Throws          | Compatibility Changes |
|-----------|-----------|----------|-------------------------|-----------------------|-------------|-----------------|-----------------------|
| Unchanged | `public`  |          | [`String`]              | `body`()              |             |                 | ![No changes]         |
| Unchanged | `public`  |          | `byte[]`                | `bodyAsBytes`()       |             |                 | ![No changes]         |
| Unchanged | `public`  |          | [`BufferedInputStream`] | `bodyStream`()        |             |                 | ![No changes]         |
| Unchanged | `public`  |          | [`Response`]            | `bufferUp`()          |             |                 | ![No changes]         |
| Unchanged | `public`  |          | [`String`]              | `charset`()           |             |                 | ![No changes]         |
| Unchanged | `public`  |          | [`Response`][6]         | `charset`([`String`]) |             |                 | ![No changes]         |
| Unchanged | `public`  |          | [`String`]              | `contentType`()       |             |                 | ![No changes]         |
| Unchanged | `public`  |          | [`Document`]            | `parse`()             |             | [`IOException`] | ![No changes]         |
| Unchanged | `public`  |          | `int`                   | `statusCode`()        |             |                 | ![No changes]         |
| Unchanged | `public`  |          | [`String`]              | `statusMessage`()     |             |                 | ![No changes]         |
| Unchanged | `public`  |          | [`StreamParser`]        | `streamParser`()      |             | [`IOException`] | ![No changes]         |

___

<a id="user-content-org.jsoup.helper.requestauthenticator"></a>
### `org.jsoup.helper.RequestAuthenticator`

- [X] Binary-compatible
- [X] Source-compatible
- [X] Serialization-compatible

| Status    | Modifiers           | Type      | Name                   | Extends    | JDK   | Serialization       | Compatibility Changes |
|-----------|---------------------|-----------|------------------------|------------|-------|---------------------|-----------------------|
| Unchanged | `public` `abstract` | Interface | `RequestAuthenticator` | [`Object`] | JDK 8 | ![Not serializable] | ![No changes]         |


#### Annotations

| Status    | Annotation              | Compatibility Changes |
|-----------|-------------------------|-----------------------|
| Unchanged | [`FunctionalInterface`] | ![No changes]         |


#### Methods

| Status    | Modifiers           | Generics | Type                       | Method                      | Annotations | Throws | Compatibility Changes |
|-----------|---------------------|----------|----------------------------|-----------------------------|-------------|--------|-----------------------|
| Unchanged | `public` `abstract` |          | [`PasswordAuthentication`] | `authenticate`([`Context`]) |             |        | ![No changes]         |

___

<a id="user-content-org.jsoup.helper.requestauthenticator$context"></a>
### `org.jsoup.helper.RequestAuthenticator$Context`

- [X] Binary-compatible
- [X] Source-compatible
- [X] Serialization-compatible

| Status    | Modifiers         | Type  | Name      | Extends    | JDK   | Serialization       | Compatibility Changes |
|-----------|-------------------|-------|-----------|------------|-------|---------------------|-----------------------|
| Unchanged | `static` `public` | Class | `Context` | [`Object`] | JDK 8 | ![Not serializable] | ![No changes]         |


#### Methods

| Status    | Modifiers | Generics | Type                       | Method                                | Annotations | Throws | Compatibility Changes |
|-----------|-----------|----------|----------------------------|---------------------------------------|-------------|--------|-----------------------|
| Unchanged | `public`  |          | [`PasswordAuthentication`] | `credentials`([`String`], [`String`]) |             |        | ![No changes]         |
| Unchanged | `public`  |          | `boolean`                  | `isProxy`()                           |             |        | ![No changes]         |
| Unchanged | `public`  |          | `boolean`                  | `isServer`()                          |             |        | ![No changes]         |
| Unchanged | `public`  |          | [`String`]                 | `realm`()                             |             |        | ![No changes]         |
| Unchanged | `public`  |          | [`RequestorType`]          | `type`()                              |             |        | ![No changes]         |
| Unchanged | `public`  |          | [`URL`]                    | `url`()                               |             |        | ![No changes]         |

___

<a id="user-content-org.jsoup.helper.validate"></a>
### `org.jsoup.helper.Validate`

- [X] Binary-compatible
- [X] Source-compatible
- [X] Serialization-compatible

| Status    | Modifiers        | Type  | Name       | Extends    | JDK   | Serialization       | Compatibility Changes |
|-----------|------------------|-------|------------|------------|-------|---------------------|-----------------------|
| Unchanged | `final` `public` | Class | `Validate` | [`Object`] | JDK 8 | ![Not serializable] | ![No changes]         |


#### Methods

| Status    | Modifiers         | Generics | Type       | Method                                                 | Annotations | Throws | Compatibility Changes |
|-----------|-------------------|----------|------------|--------------------------------------------------------|-------------|--------|-----------------------|
| Unchanged | `static` `public` |          | [`Object`] | `ensureNotNull`([`Object`])                            |             |        | ![No changes]         |
| Unchanged | `static` `public` |          | [`Object`] | `ensureNotNull`([`Object`], [`String`], [`Object...`]) |             |        | ![No changes]         |
| Unchanged | `static` `public` |          | `void`     | `fail`([`String`])                                     |             |        | ![No changes]         |
| Unchanged | `static` `public` |          | `void`     | `fail`([`String`], [`Object...`])                      |             |        | ![No changes]         |
| Unchanged | `static` `public` |          | `void`     | `isFalse`(`boolean`)                                   |             |        | ![No changes]         |
| Unchanged | `static` `public` |          | `void`     | `isFalse`(`boolean`, [`String`])                       |             |        | ![No changes]         |
| Unchanged | `static` `public` |          | `void`     | `isTrue`(`boolean`)                                    |             |        | ![No changes]         |
| Unchanged | `static` `public` |          | `void`     | `isTrue`(`boolean`, [`String`])                        |             |        | ![No changes]         |
| Unchanged | `static` `public` |          | `void`     | `noNullElements`([`Object[]`][7])                      |             |        | ![No changes]         |
| Unchanged | `static` `public` |          | `void`     | `noNullElements`([`Object[]`][7], [`String`])          |             |        | ![No changes]         |
| Unchanged | `static` `public` |          | `void`     | `notEmpty`([`String`])                                 |             |        | ![No changes]         |
| Unchanged | `static` `public` |          | `void`     | `notEmpty`([`String`], [`String`])                     |             |        | ![No changes]         |
| Unchanged | `static` `public` |          | `void`     | `notEmptyParam`([`String`], [`String`])                |             |        | ![No changes]         |
| Unchanged | `static` `public` |          | `void`     | `notNull`([`Object`])                                  |             |        | ![No changes]         |
| Unchanged | `static` `public` |          | `void`     | `notNull`([`Object`], [`String`])                      |             |        | ![No changes]         |
| Unchanged | `static` `public` |          | `void`     | `notNullParam`([`Object`], [`String`])                 |             |        | ![No changes]         |
| Unchanged | `static` `public` |          | `void`     | `wtf`([`String`])                                      |             |        | ![No changes]         |

___

<a id="user-content-org.jsoup.helper.validationexception"></a>
### `org.jsoup.helper.ValidationException`

- [X] Binary-compatible
- [X] Source-compatible
- [X] Serialization-compatible

| Status    | Modifiers | Type  | Name                  | Extends                      | JDK   | Serialization | Compatibility Changes |
|-----------|-----------|-------|-----------------------|------------------------------|-------|---------------|-----------------------|
| Unchanged | `public`  | Class | `ValidationException` | [`IllegalArgumentException`] | JDK 8 | ![Compatible] | ![No changes]         |


#### Implemented Interfaces

| Status    | Interface        | Compatibility Changes |
|-----------|------------------|-----------------------|
| Unchanged | [`Serializable`] | ![No changes]         |


#### Constructors

| Status    | Modifiers | Generics | Constructor                       | Annotations | Throws | Compatibility Changes |
|-----------|-----------|----------|-----------------------------------|-------------|--------|-----------------------|
| Unchanged | `public`  |          | `ValidationException`([`String`]) |             |        | ![No changes]         |


#### Methods

| Status    | Modifiers | Generics | Type          | Method               | Annotations | Throws | Compatibility Changes |
|-----------|-----------|----------|---------------|----------------------|-------------|--------|-----------------------|
| Unchanged | `public`  |          | [`Throwable`] | `fillInStackTrace`() |             |        | ![No changes]         |


#### Fields

| Status    | Modifiers                 | Type       | Name        | Annotations | Compatibility Changes |
|-----------|---------------------------|------------|-------------|-------------|-----------------------|
| Unchanged | `public` `static` `final` | [`String`] | `Validator` |             | ![No changes]         |

___

<a id="user-content-org.jsoup.helper.w3cdom"></a>
### `org.jsoup.helper.W3CDom`

- [X] Binary-compatible
- [X] Source-compatible
- [X] Serialization-compatible

| Status    | Modifiers | Type  | Name     | Extends    | JDK   | Serialization       | Compatibility Changes |
|-----------|-----------|-------|----------|------------|-------|---------------------|-----------------------|
| Unchanged | `public`  | Class | `W3CDom` | [`Object`] | JDK 8 | ![Not serializable] | ![No changes]         |


#### Constructors

| Status    | Modifiers | Generics | Constructor | Annotations | Throws | Compatibility Changes |
|-----------|-----------|----------|-------------|-------------|--------|-----------------------|
| Unchanged | `public`  |          | `W3CDom`()  |             |        | ![No changes]         |


#### Methods

| Status    | Modifiers         | Generics               | Type                        | Method                                               | Annotations | Throws | Compatibility Changes |
|-----------|-------------------|------------------------|-----------------------------|------------------------------------------------------|-------------|--------|-----------------------|
| Unchanged | `static` `public` |                        | [`HashMap<String, String>`] | `OutputHtml`()                                       |             |        | ![No changes]         |
| Unchanged | `static` `public` |                        | [`HashMap<String, String>`] | `OutputXml`()                                        |             |        | ![No changes]         |
| Unchanged | `static` `public` |                        | [`String`]                  | `asString`([`Document`][8], [`Map<String, String>`]) |             |        | ![No changes]         |
| Unchanged | `public`          |                        | [`String`]                  | `asString`([`Document`][8])                          |             |        | ![No changes]         |
| Unchanged | `public`          |                        | [`Node`]                    | `contextNode`([`Document`][8])                       |             |        | ![No changes]         |
| Unchanged | `static` `public` |                        | [`Document`][8]             | `convert`([`Document`])                              |             |        | ![No changes]         |
| Unchanged | `public`          |                        | `void`                      | `convert`([`Document`], [`Document`][8])             |             |        | ![No changes]         |
| Unchanged | `public`          |                        | `void`                      | `convert`([`Element`], [`Document`][8])              |             |        | ![No changes]         |
| Unchanged | `public`          |                        | [`Document`][8]             | `fromJsoup`([`Document`])                            |             |        | ![No changes]         |
| Unchanged | `public`          |                        | [`Document`][8]             | `fromJsoup`([`Element`])                             |             |        | ![No changes]         |
| Unchanged | `public`          |                        | `boolean`                   | `namespaceAware`()                                   |             |        | ![No changes]         |
| Unchanged | `public`          |                        | [`W3CDom`]                  | `namespaceAware`(`boolean`)                          |             |        | ![No changes]         |
| Unchanged | `public`          |                        | [`NodeList`]                | `selectXpath`([`String`], [`Document`][8])           |             |        | ![No changes]         |
| Unchanged | `public`          |                        | [`NodeList`]                | `selectXpath`([`String`], [`Node`])                  |             |        | ![No changes]         |
| Unchanged | `public`          | \<[`T extends Node`]\> | [`List<T>`]                 | `sourceNodes`([`NodeList`], [`Class<T>`])            |             |        | ![No changes]         |


#### Fields

| Status    | Modifiers                 | Type                       | Name                   | Annotations | Compatibility Changes |
|-----------|---------------------------|----------------------------|------------------------|-------------|-----------------------|
| Unchanged | `public` `static` `final` | [`String`]                 | `SourceProperty`       |             | ![No changes]         |
| Unchanged | `public` `static` `final` | [`String`]                 | `XPathFactoryProperty` |             | ![No changes]         |
| Unchanged | `protected`               | [`DocumentBuilderFactory`] | `factory`              |             | ![No changes]         |

___

<a id="user-content-org.jsoup.helper.w3cdom$w3cbuilder"></a>
### `org.jsoup.helper.W3CDom$W3CBuilder`

- [X] Binary-compatible
- [X] Source-compatible
- [X] Serialization-compatible

| Status    | Modifiers            | Type  | Name         | Extends    | JDK   | Serialization       | Compatibility Changes |
|-----------|----------------------|-------|--------------|------------|-------|---------------------|-----------------------|
| Unchanged | `static` `protected` | Class | `W3CBuilder` | [`Object`] | JDK 8 | ![Not serializable] | ![No changes]         |


#### Implemented Interfaces

| Status    | Interface       | Compatibility Changes |
|-----------|-----------------|-----------------------|
| Unchanged | [`NodeVisitor`] | ![No changes]         |


#### Constructors

| Status    | Modifiers | Generics | Constructor                   | Annotations | Throws | Compatibility Changes |
|-----------|-----------|----------|-------------------------------|-------------|--------|-----------------------|
| Unchanged | `public`  |          | `W3CBuilder`([`Document`][8]) |             |        | ![No changes]         |


#### Methods

| Status    | Modifiers | Generics | Type   | Method                     | Annotations | Throws | Compatibility Changes |
|-----------|-----------|----------|--------|----------------------------|-------------|--------|-----------------------|
| Unchanged | `public`  |          | `void` | `head`([`Node`][9], `int`) |             |        | ![No changes]         |
| Unchanged | `public`  |          | `void` | `tail`([`Node`][9], `int`) |             |        | ![No changes]         |

___

<a id="user-content-org.jsoup.internal.controllableinputstream"></a>
### `org.jsoup.internal.ControllableInputStream`

- [X] Binary-compatible
- [X] Source-compatible
- [X] Serialization-compatible

| Status   | Modifiers | Type  | Name                      | Extends               | JDK   | Serialization       | Compatibility Changes |
|----------|-----------|-------|---------------------------|-----------------------|-------|---------------------|-----------------------|
| Modified | `public`  | Class | `ControllableInputStream` | [`FilterInputStream`] | JDK 8 | ![Not serializable] | ![No changes]         |


#### Implemented Interfaces

| Status    | Interface         | Compatibility Changes |
|-----------|-------------------|-----------------------|
| Unchanged | [`Closeable`]     | ![No changes]         |
| Unchanged | [`AutoCloseable`] | ![No changes]         |


#### Methods

| Status    | Modifiers                 | Generics                               | Type                            | Method                                     | Annotations | Throws              | Compatibility Changes |
|-----------|---------------------------|----------------------------------------|---------------------------------|--------------------------------------------|-------------|---------------------|-----------------------|
| Added     | **`public`**              |                                        | **`void`**                      | **`allowClose`**(`boolean`)                |             |                     | ![Method added to public class] |
| Added     | **`public`**              |                                        | **`boolean`**                   | **`baseReadFully`**()                      |             |                     | ![Method added to public class] |
| Added     | **`public`**              |                                        | **`void`**                      | **`close`**()                              |             | **[`IOException`]** | ![Method added to public class] |
| Unchanged | `public`                  |                                        | [`BufferedInputStream`]         | `inputStream`()                            |             |                     | ![No changes]         |
| Unchanged | `public`                  |                                        | `void`                          | `mark`(`int`)                              |             |                     | ![No changes]         |
| Added     | **`public`**              |                                        | **`int`**                       | **`max`**()                                |             |                     | ![Method added to public class] |
| Added     | **`public`**              |                                        | **`void`**                      | **`max`**(`int`)                           |             |                     | ![Method added to public class] |
| Unchanged | `public`                  | \<[`ProgressContext extends Object`]\> | [`ControllableInputStream`]     | `onProgress`(`int`, [`Progress<ProgressContext>`], `ProgressContext`) |  |     | ![No changes]         |
| Unchanged | `public`                  |                                        | `int`                           | `read`(`byte[]`, `int`, `int`)             |             | [`IOException`]     | ![No changes]         |
| Unchanged | `static` `public`         |                                        | [`ByteBuffer`]                  | `readToByteBuffer`([`InputStream`], `int`) |             | [`IOException`]     | ![No changes]         |
| Unchanged | `public`                  |                                        | `void`                          | `reset`()                                  |             | [`IOException`]     | ![No changes]         |
| Unchanged | `public`                  |                                        | [`ControllableInputStream`]     | `timeout`(`long`, `long`)                  |             |                     | ![No changes]         |
| Unchanged | `static` `public`         |                                        | [`ControllableInputStream`]     | `wrap`([`InputStream`], `int`, `int`)      |             |                     | ![No changes]         |
| Added     | **`static`** **`public`** |                                        | **[`ControllableInputStream`]** | **`wrap`**([`InputStream`], `int`)         |             |                     | ![Method added to public class] |

___

<a id="user-content-org.jsoup.internal.functions"></a>
### `org.jsoup.internal.Functions`

- [X] Binary-compatible
- [X] Source-compatible
- [X] Serialization-compatible

| Status    | Modifiers        | Type  | Name        | Extends    | JDK   | Serialization       | Compatibility Changes |
|-----------|------------------|-------|-------------|------------|-------|---------------------|-----------------------|
| Unchanged | `final` `public` | Class | `Functions` | [`Object`] | JDK 8 | ![Not serializable] | ![No changes]         |


#### Methods

| Status    | Modifiers         | Generics                                       | Type                                   | Method                  | Annotations | Throws | Compatibility Changes |
|-----------|-------------------|------------------------------------------------|----------------------------------------|-------------------------|-------------|--------|-----------------------|
| Unchanged | `static` `public` | \<[`K extends Object`], [`T extends Object`], [`V extends Object`]\> | [`Function<T, IdentityHashMap<K, V>>`] | `identityMapFunction`() |  |  | ![No changes]    |
| Unchanged | `static` `public` | \<[`T extends Object`], [`U extends Object`]\> | [`Function<T, List<U>>`]               | `listFunction`()        |             |        | ![No changes]         |
| Unchanged | `static` `public` | \<[`K extends Object`], [`T extends Object`], [`V extends Object`]\> | [`Function<T, Map<K, V>>`] | `mapFunction`() |           |        | ![No changes]         |
| Unchanged | `static` `public` | \<[`T extends Object`], [`U extends Object`]\> | [`Function<T, Set<U>>`]                | `setFunction`()         |             |        | ![No changes]         |

___

<a id="user-content-org.jsoup.internal.normalizer"></a>
### `org.jsoup.internal.Normalizer`

- [X] Binary-compatible
- [X] Source-compatible
- [X] Serialization-compatible

| Status    | Modifiers        | Type  | Name         | Extends    | JDK   | Serialization       | Compatibility Changes |
|-----------|------------------|-------|--------------|------------|-------|---------------------|-----------------------|
| Unchanged | `final` `public` | Class | `Normalizer` | [`Object`] | JDK 8 | ![Not serializable] | ![No changes]         |


#### Constructors

| Status    | Modifiers | Generics | Constructor    | Annotations | Throws | Compatibility Changes |
|-----------|-----------|----------|----------------|-------------|--------|-----------------------|
| Unchanged | `public`  |          | `Normalizer`() |             |        | ![No changes]         |


#### Methods

| Status    | Modifiers         | Generics | Type       | Method                             | Annotations | Throws | Compatibility Changes |
|-----------|-------------------|----------|------------|------------------------------------|-------------|--------|-----------------------|
| Unchanged | `static` `public` |          | [`String`] | `lowerCase`([`String`])            |             |        | ![No changes]         |
| Unchanged | `static` `public` |          | [`String`] | `normalize`([`String`])            |             |        | ![No changes]         |
| Unchanged | `static` `public` |          | [`String`] | `normalize`([`String`], `boolean`) |             |        | ![No changes]         |

___

<a id="user-content-org.jsoup.internal.sharedconstants"></a>
### `org.jsoup.internal.SharedConstants`

- [X] Binary-compatible
- [X] Source-compatible
- [X] Serialization-compatible

| Status   | Modifiers        | Type  | Name              | Extends    | JDK   | Serialization       | Compatibility Changes |
|----------|------------------|-------|-------------------|------------|-------|---------------------|-----------------------|
| Modified | `final` `public` | Class | `SharedConstants` | [`Object`] | JDK 8 | ![Not serializable] | ![No changes]         |


#### Fields

| Status    | Modifiers                             | Type                 | Name                | Annotations | Compatibility Changes |
|-----------|---------------------------------------|----------------------|---------------------|-------------|-----------------------|
| Unchanged | `public` `static` `final`             | [`String`]           | `AttrRangeKey`      |             | ![No changes]         |
| Unchanged | `public` `static` `final`             | `int`                | `DefaultBufferSize` |             | ![No changes]         |
| Unchanged | `public` `static` `final`             | [`String`]           | `EndRangeKey`       |             | ![No changes]         |
| Added     | **`public`** **`static`** **`final`** | **[`String[]`][10]** | `FormSubmitTags`    |             | ![No changes]         |
| Unchanged | `public` `static` `final`             | [`String`]           | `RangeKey`          |             | ![No changes]         |
| Unchanged | `public` `static` `final`             | [`String`]           | `UserDataKey`       |             | ![No changes]         |

___

<a id="user-content-org.jsoup.internal.softpool"></a>
### `org.jsoup.internal.SoftPool`

- [X] Binary-compatible
- [X] Source-compatible
- [X] Serialization-compatible

| Status | Modifiers    | Type      | Name           | Extends        | JDK       | Serialization       | Compatibility Changes |
|--------|--------------|-----------|----------------|----------------|-----------|---------------------|-----------------------|
| Added  | **`public`** | **Class** | **`SoftPool`** | **[`Object`]** | **JDK 8** | ![Not serializable] | ![No changes]         |


#### Generics

| Status | Name    | Extends        | Compatibility Changes |
|--------|---------|----------------|-----------------------|
| Added  | **`T`** | **[`Object`]** | ![No changes]         |


#### Constructors

| Status | Modifiers    | Generics | Constructor                     | Annotations | Throws | Compatibility Changes |
|--------|--------------|----------|---------------------------------|-------------|--------|-----------------------|
| Added  | **`public`** |          | **`SoftPool`**([`Supplier<T>`]) |             |        | ![No changes]         |


#### Methods

| Status | Modifiers    | Generics | Type           | Method             | Annotations | Throws | Compatibility Changes |
|--------|--------------|----------|----------------|--------------------|-------------|--------|-----------------------|
| Added  | **`public`** |          | **[`Object`]** | **`borrow`**()     |             |        | ![Method added to public class] |
| Added  | **`public`** |          | **`void`**     | **`release`**(`T`) |             |        | ![Method added to public class] |

___

<a id="user-content-org.jsoup.internal.stringutil"></a>
### `org.jsoup.internal.StringUtil`

- [X] Binary-compatible
- [X] Source-compatible
- [X] Serialization-compatible

| Status    | Modifiers        | Type  | Name         | Extends    | JDK   | Serialization       | Compatibility Changes |
|-----------|------------------|-------|--------------|------------|-------|---------------------|-----------------------|
| Unchanged | `final` `public` | Class | `StringUtil` | [`Object`] | JDK 8 | ![Not serializable] | ![No changes]         |


#### Constructors

| Status    | Modifiers | Generics | Constructor    | Annotations | Throws | Compatibility Changes |
|-----------|-----------|----------|----------------|-------------|--------|-----------------------|
| Unchanged | `public`  |          | `StringUtil`() |             |        | ![No changes]         |


#### Methods

| Status    | Modifiers         | Generics | Type                                   | Method                                   | Annotations | Throws                    | Compatibility Changes |
|-----------|-------------------|----------|----------------------------------------|------------------------------------------|-------------|---------------------------|-----------------------|
| Unchanged | `static` `public` |          | `void`                                 | `appendNormalisedWhitespace`([`StringBuilder`], [`String`], `boolean`) |  |        | ![No changes]         |
| Unchanged | `static` `public` |          | [`StringBuilder`]                      | `borrowBuilder`()                        |             |                           | ![No changes]         |
| Unchanged | `static` `public` |          | `boolean`                              | `in`([`String`], [`String...`])          |             |                           | ![No changes]         |
| Unchanged | `static` `public` |          | `boolean`                              | `inSorted`([`String`], [`String[]`][10]) |             |                           | ![No changes]         |
| Unchanged | `static` `public` |          | `boolean`                              | `isActuallyWhitespace`(`int`)            |             |                           | ![No changes]         |
| Unchanged | `static` `public` |          | `boolean`                              | `isAscii`([`String`])                    |             |                           | ![No changes]         |
| Unchanged | `static` `public` |          | `boolean`                              | `isBlank`([`String`])                    |             |                           | ![No changes]         |
| Unchanged | `static` `public` |          | `boolean`                              | `isInvisibleChar`(`int`)                 |             |                           | ![No changes]         |
| Unchanged | `static` `public` |          | `boolean`                              | `isNumeric`([`String`])                  |             |                           | ![No changes]         |
| Unchanged | `static` `public` |          | `boolean`                              | `isWhitespace`(`int`)                    |             |                           | ![No changes]         |
| Unchanged | `static` `public` |          | [`String`]                             | `join`([`Collection<?>`], [`String`])    |             |                           | ![No changes]         |
| Unchanged | `static` `public` |          | [`String`]                             | `join`([`Iterator<?>`], [`String`])      |             |                           | ![No changes]         |
| Unchanged | `static` `public` |          | [`String`]                             | `join`([`String[]`][10], [`String`])     |             |                           | ![No changes]         |
| Unchanged | `static` `public` |          | [`Collector<CharSequence, ?, String>`] | `joining`([`String`])                    |             |                           | ![No changes]         |
| Unchanged | `static` `public` |          | [`String`]                             | `normaliseWhitespace`([`String`])        |             |                           | ![No changes]         |
| Unchanged | `static` `public` |          | [`String`]                             | `padding`(`int`)                         |             |                           | ![No changes]         |
| Unchanged | `static` `public` |          | [`String`]                             | `padding`(`int`, `int`)                  |             |                           | ![No changes]         |
| Unchanged | `static` `public` |          | [`String`]                             | `releaseBuilder`([`StringBuilder`])      |             |                           | ![No changes]         |
| Unchanged | `static` `public` |          | [`URL`]                                | `resolve`([`URL`], [`String`])           |             | [`MalformedURLException`] | ![No changes]         |
| Unchanged | `static` `public` |          | [`String`]                             | `resolve`([`String`], [`String`])        |             |                           | ![No changes]         |
| Unchanged | `static` `public` |          | `boolean`                              | `startsWithNewline`([`String`])          |             |                           | ![No changes]         |

___

<a id="user-content-org.jsoup.internal.stringutil$stringjoiner"></a>
### `org.jsoup.internal.StringUtil$StringJoiner`

- [X] Binary-compatible
- [X] Source-compatible
- [X] Serialization-compatible

| Status    | Modifiers         | Type  | Name           | Extends    | JDK   | Serialization       | Compatibility Changes |
|-----------|-------------------|-------|----------------|------------|-------|---------------------|-----------------------|
| Unchanged | `static` `public` | Class | `StringJoiner` | [`Object`] | JDK 8 | ![Not serializable] | ![No changes]         |


#### Constructors

| Status    | Modifiers | Generics | Constructor                | Annotations | Throws | Compatibility Changes |
|-----------|-----------|----------|----------------------------|-------------|--------|-----------------------|
| Unchanged | `public`  |          | `StringJoiner`([`String`]) |             |        | ![No changes]         |


#### Methods

| Status    | Modifiers | Generics | Type             | Method               | Annotations | Throws | Compatibility Changes |
|-----------|-----------|----------|------------------|----------------------|-------------|--------|-----------------------|
| Unchanged | `public`  |          | [`StringJoiner`] | `add`([`Object`])    |             |        | ![No changes]         |
| Unchanged | `public`  |          | [`StringJoiner`] | `append`([`Object`]) |             |        | ![No changes]         |
| Unchanged | `public`  |          | [`String`]       | `complete`()         |             |        | ![No changes]         |

___

<a id="user-content-org.jsoup.nodes.attribute"></a>
### `org.jsoup.nodes.Attribute`

- [X] Binary-compatible
- [X] Source-compatible
- [X] Serialization-compatible

| Status    | Modifiers | Type  | Name        | Extends    | JDK   | Serialization       | Compatibility Changes |
|-----------|-----------|-------|-------------|------------|-------|---------------------|-----------------------|
| Unchanged | `public`  | Class | `Attribute` | [`Object`] | JDK 8 | ![Not serializable] | ![No changes]         |


#### Implemented Interfaces

| Status    | Interface       | Compatibility Changes |
|-----------|-----------------|-----------------------|
| Unchanged | [`Cloneable`]   | ![No changes]         |
| Unchanged | [`Entry<K, V>`] | ![No changes]         |


#### Constructors

| Status    | Modifiers | Generics | Constructor                                         | Annotations | Throws | Compatibility Changes |
|-----------|-----------|----------|-----------------------------------------------------|-------------|--------|-----------------------|
| Unchanged | `public`  |          | `Attribute`([`String`], [`String`])                 |             |        | ![No changes]         |
| Unchanged | `public`  |          | `Attribute`([`String`], [`String`], [`Attributes`]) |             |        | ![No changes]         |


#### Methods

| Status    | Modifiers            | Generics | Type               | Method                                        | Annotations | Throws          | Compatibility Changes |
|-----------|----------------------|----------|--------------------|-----------------------------------------------|-------------|-----------------|-----------------------|
| Unchanged | `public`             |          | [`Attribute`]      | `clone`()                                     |             |                 | ![No changes]         |
| Unchanged | `static` `public`    |          | [`Attribute`]      | `createFromEncoded`([`String`], [`String`])   |             |                 | ![No changes]         |
| Unchanged | `public`             |          | `boolean`          | `equals`([`Object`])                          |             |                 | ![No changes]         |
| Unchanged | `public`             |          | [`String`]         | `getKey`()                                    |             |                 | ![No changes]         |
| Unchanged | `static` `public`    |          | [`String`]         | `getValidKey`([`String`], [`Syntax`])         |             |                 | ![No changes]         |
| Unchanged | `public`             |          | [`String`]         | `getValue`()                                  |             |                 | ![No changes]         |
| Unchanged | `public`             |          | `boolean`          | `hasDeclaredValue`()                          |             |                 | ![No changes]         |
| Unchanged | `public`             |          | `int`              | `hashCode`()                                  |             |                 | ![No changes]         |
| Unchanged | `public`             |          | [`String`]         | `html`()                                      |             |                 | ![No changes]         |
| Unchanged | `protected`          |          | `void`             | `html`([`Appendable`], [`OutputSettings`])    |             | [`IOException`] | ![No changes]         |
| Unchanged | `static` `protected` |          | `void`             | `html`([`String`], [`String`], [`Appendable`], [`OutputSettings`]) |  | [`IOException`] | ![No changes] |
| Unchanged | `static` `public`    |          | `boolean`          | `isBooleanAttribute`([`String`])              |             |                 | ![No changes]         |
| Unchanged | `protected`          |          | `boolean`          | `isDataAttribute`()                           |             |                 | ![No changes]         |
| Unchanged | `static` `protected` |          | `boolean`          | `isDataAttribute`([`String`])                 |             |                 | ![No changes]         |
| Unchanged | `public`             |          | `void`             | `setKey`([`String`])                          |             |                 | ![No changes]         |
| Unchanged | `public`             |          | [`String`]         | `setValue`([`String`])                        |             |                 | ![No changes]         |
| Unchanged | `final` `protected`  |          | `boolean`          | `shouldCollapseAttribute`([`OutputSettings`]) |             |                 | ![No changes]         |
| Unchanged | `static` `protected` |          | `boolean`          | `shouldCollapseAttribute`([`String`], [`String`], [`OutputSettings`]) |  |    | ![No changes]         |
| Unchanged | `public`             |          | [`AttributeRange`] | `sourceRange`()                               |             |                 | ![No changes]         |
| Unchanged | `public`             |          | [`String`]         | `toString`()                                  |             |                 | ![No changes]         |

___

<a id="user-content-org.jsoup.nodes.attributes"></a>
### `org.jsoup.nodes.Attributes`

- [X] Binary-compatible
- [X] Source-compatible
- [X] Serialization-compatible

| Status    | Modifiers | Type  | Name         | Extends    | JDK   | Serialization       | Compatibility Changes |
|-----------|-----------|-------|--------------|------------|-------|---------------------|-----------------------|
| Unchanged | `public`  | Class | `Attributes` | [`Object`] | JDK 8 | ![Not serializable] | ![No changes]         |


#### Implemented Interfaces

| Status    | Interface       | Compatibility Changes |
|-----------|-----------------|-----------------------|
| Unchanged | [`Cloneable`]   | ![No changes]         |
| Unchanged | [`Iterable<T>`] | ![No changes]         |


#### Constructors

| Status    | Modifiers | Generics | Constructor    | Annotations | Throws | Compatibility Changes |
|-----------|-----------|----------|----------------|-------------|--------|-----------------------|
| Unchanged | `public`  |          | `Attributes`() |             |        | ![No changes]         |


#### Methods

| Status    | Modifiers | Generics | Type                    | Method                                         | Annotations | Throws | Compatibility Changes |
|-----------|-----------|----------|-------------------------|------------------------------------------------|-------------|--------|-----------------------|
| Unchanged | `public`  |          | [`Attributes`]          | `add`([`String`], [`String`])                  |             |        | ![No changes]         |
| Unchanged | `public`  |          | `void`                  | `addAll`([`Attributes`])                       |             |        | ![No changes]         |
| Unchanged | `public`  |          | [`List<Attribute>`]     | `asList`()                                     |             |        | ![No changes]         |
| Unchanged | `public`  |          | [`Attribute`]           | `attribute`([`String`])                        |             |        | ![No changes]         |
| Unchanged | `public`  |          | [`Attributes`]          | `clone`()                                      |             |        | ![No changes]         |
| Unchanged | `public`  |          | [`Map<String, String>`] | `dataset`()                                    |             |        | ![No changes]         |
| Unchanged | `public`  |          | `int`                   | `deduplicate`([`ParseSettings`])               |             |        | ![No changes]         |
| Unchanged | `public`  |          | `boolean`               | `equals`([`Object`])                           |             |        | ![No changes]         |
| Unchanged | `public`  |          | [`String`]              | `get`([`String`])                              |             |        | ![No changes]         |
| Unchanged | `public`  |          | [`String`]              | `getIgnoreCase`([`String`])                    |             |        | ![No changes]         |
| Unchanged | `public`  |          | `boolean`               | `hasDeclaredValueForKey`([`String`])           |             |        | ![No changes]         |
| Unchanged | `public`  |          | `boolean`               | `hasDeclaredValueForKeyIgnoreCase`([`String`]) |             |        | ![No changes]         |
| Unchanged | `public`  |          | `boolean`               | `hasKey`([`String`])                           |             |        | ![No changes]         |
| Unchanged | `public`  |          | `boolean`               | `hasKeyIgnoreCase`([`String`])                 |             |        | ![No changes]         |
| Unchanged | `public`  |          | `int`                   | `hashCode`()                                   |             |        | ![No changes]         |
| Unchanged | `public`  |          | [`String`]              | `html`()                                       |             |        | ![No changes]         |
| Unchanged | `public`  |          | `boolean`               | `isEmpty`()                                    |             |        | ![No changes]         |
| Unchanged | `public`  |          | [`Iterator<Attribute>`] | `iterator`()                                   |             |        | ![No changes]         |
| Unchanged | `public`  |          | `void`                  | `normalize`()                                  |             |        | ![No changes]         |
| Unchanged | `public`  |          | [`Attributes`]          | `put`([`String`], [`String`])                  |             |        | ![No changes]         |
| Unchanged | `public`  |          | [`Attributes`]          | `put`([`String`], `boolean`)                   |             |        | ![No changes]         |
| Unchanged | `public`  |          | [`Attributes`]          | `put`([`Attribute`])                           |             |        | ![No changes]         |
| Unchanged | `public`  |          | `void`                  | `remove`([`String`])                           |             |        | ![No changes]         |
| Unchanged | `public`  |          | `void`                  | `removeIgnoreCase`([`String`])                 |             |        | ![No changes]         |
| Unchanged | `public`  |          | `int`                   | `size`()                                       |             |        | ![No changes]         |
| Unchanged | `public`  |          | [`AttributeRange`]      | `sourceRange`([`String`])                      |             |        | ![No changes]         |
| Unchanged | `public`  |          | [`String`]              | `toString`()                                   |             |        | ![No changes]         |
| Unchanged | `public`  |          | [`Object`]              | `userData`([`String`])                         |             |        | ![No changes]         |
| Unchanged | `public`  |          | [`Attributes`]          | `userData`([`String`], [`Object`])             |             |        | ![No changes]         |


#### Fields

| Status    | Modifiers                    | Type       | Name         | Annotations | Compatibility Changes |
|-----------|------------------------------|------------|--------------|-------------|-----------------------|
| Unchanged | `protected` `static` `final` | [`String`] | `dataPrefix` |             | ![No changes]         |

___

<a id="user-content-org.jsoup.nodes.cdatanode"></a>
### `org.jsoup.nodes.CDataNode`

- [X] Binary-compatible
- [X] Source-compatible
- [X] Serialization-compatible

| Status    | Modifiers | Type  | Name        | Extends      | JDK   | Serialization       | Compatibility Changes |
|-----------|-----------|-------|-------------|--------------|-------|---------------------|-----------------------|
| Unchanged | `public`  | Class | `CDataNode` | [`TextNode`] | JDK 8 | ![Not serializable] | ![No changes]         |


#### Implemented Interfaces

| Status    | Interface     | Compatibility Changes |
|-----------|---------------|-----------------------|
| Unchanged | [`Cloneable`] | ![No changes]         |


#### Constructors

| Status    | Modifiers | Generics | Constructor             | Annotations | Throws | Compatibility Changes |
|-----------|-----------|----------|-------------------------|-------------|--------|-----------------------|
| Unchanged | `public`  |          | `CDataNode`([`String`]) |             |        | ![No changes]         |


#### Methods

| Status    | Modifiers | Generics | Type          | Method       | Annotations | Throws | Compatibility Changes |
|-----------|-----------|----------|---------------|--------------|-------------|--------|-----------------------|
| Unchanged | `public`  |          | [`CDataNode`] | `clone`()    |             |        | ![No changes]         |
| Unchanged | `public`  |          | [`String`]    | `nodeName`() |             |        | ![No changes]         |
| Unchanged | `public`  |          | [`String`]    | `text`()     |             |        | ![No changes]         |

___

<a id="user-content-org.jsoup.nodes.comment"></a>
### `org.jsoup.nodes.Comment`

- [X] Binary-compatible
- [X] Source-compatible
- [X] Serialization-compatible

| Status   | Modifiers | Type  | Name      | Extends      | JDK   | Serialization       | Compatibility Changes |
|----------|-----------|-------|-----------|--------------|-------|---------------------|-----------------------|
| Modified | `public`  | Class | `Comment` | [`LeafNode`] | JDK 8 | ![Not serializable] | ![No changes]         |


#### Implemented Interfaces

| Status    | Interface     | Compatibility Changes |
|-----------|---------------|-----------------------|
| Unchanged | [`Cloneable`] | ![No changes]         |


#### Constructors

| Status    | Modifiers | Generics | Constructor           | Annotations | Throws | Compatibility Changes |
|-----------|-----------|----------|-----------------------|-------------|--------|-----------------------|
| Unchanged | `public`  |          | `Comment`([`String`]) |             |        | ![No changes]         |


#### Methods

| Status    | Modifiers    | Generics | Type               | Method                | Annotations | Throws | Compatibility Changes |
|-----------|--------------|----------|--------------------|-----------------------|-------------|--------|-----------------------|
| Unchanged | `public`     |          | [`XmlDeclaration`] | `asXmlDeclaration`()  |             |        | ![No changes]         |
| Unchanged | `public`     |          | [`Comment`]        | `clone`()             |             |        | ![No changes]         |
| Unchanged | `public`     |          | [`String`]         | `getData`()           |             |        | ![No changes]         |
| Unchanged | `public`     |          | `boolean`          | `isXmlDeclaration`()  |             |        | ![No changes]         |
| Unchanged | `public`     |          | [`String`]         | `nodeName`()          |             |        | ![No changes]         |
| Unchanged | `public`     |          | [`Comment`]        | `setData`([`String`]) |             |        | ![No changes]         |
| Removed   | ~~`public`~~ |          | ~~[`String`]~~     | ~~`toString`~~()      |             |        | ![No changes]         |

___

<a id="user-content-org.jsoup.nodes.datanode"></a>
### `org.jsoup.nodes.DataNode`

- [X] Binary-compatible
- [X] Source-compatible
- [X] Serialization-compatible

| Status   | Modifiers | Type  | Name       | Extends      | JDK   | Serialization       | Compatibility Changes |
|----------|-----------|-------|------------|--------------|-------|---------------------|-----------------------|
| Modified | `public`  | Class | `DataNode` | [`LeafNode`] | JDK 8 | ![Not serializable] | ![No changes]         |


#### Implemented Interfaces

| Status    | Interface     | Compatibility Changes |
|-----------|---------------|-----------------------|
| Unchanged | [`Cloneable`] | ![No changes]         |


#### Constructors

| Status    | Modifiers | Generics | Constructor            | Annotations | Throws | Compatibility Changes |
|-----------|-----------|----------|------------------------|-------------|--------|-----------------------|
| Unchanged | `public`  |          | `DataNode`([`String`]) |             |        | ![No changes]         |


#### Methods

| Status    | Modifiers    | Generics | Type           | Method                     | Annotations | Throws | Compatibility Changes |
|-----------|--------------|----------|----------------|----------------------------|-------------|--------|-----------------------|
| Unchanged | `public`     |          | [`DataNode`]   | `clone`()                  |             |        | ![No changes]         |
| Unchanged | `public`     |          | [`String`]     | `getWholeData`()           |             |        | ![No changes]         |
| Unchanged | `public`     |          | [`String`]     | `nodeName`()               |             |        | ![No changes]         |
| Unchanged | `public`     |          | [`DataNode`]   | `setWholeData`([`String`]) |             |        | ![No changes]         |
| Removed   | ~~`public`~~ |          | ~~[`String`]~~ | ~~`toString`~~()           |             |        | ![No changes]         |

___

<a id="user-content-org.jsoup.nodes.document"></a>
### `org.jsoup.nodes.Document`

- [X] Binary-compatible
- [X] Source-compatible
- [X] Serialization-compatible

| Status    | Modifiers | Type  | Name       | Extends     | JDK   | Serialization       | Compatibility Changes |
|-----------|-----------|-------|------------|-------------|-------|---------------------|-----------------------|
| Unchanged | `public`  | Class | `Document` | [`Element`] | JDK 8 | ![Not serializable] | ![No changes]         |


#### Implemented Interfaces

| Status    | Interface     | Compatibility Changes |
|-----------|---------------|-----------------------|
| Unchanged | [`Cloneable`] | ![No changes]         |


#### Constructors

| Status    | Modifiers | Generics | Constructor                        | Annotations | Throws | Compatibility Changes |
|-----------|-----------|----------|------------------------------------|-------------|--------|-----------------------|
| Unchanged | `public`  |          | `Document`([`String`])             |             |        | ![No changes]         |
| Unchanged | `public`  |          | `Document`([`String`], [`String`]) |             |        | ![No changes]         |


#### Methods

| Status    | Modifiers         | Generics | Type                  | Method                                | Annotations | Throws | Compatibility Changes |
|-----------|-------------------|----------|-----------------------|---------------------------------------|-------------|--------|-----------------------|
| Unchanged | `public`          |          | [`Element`]           | `body`()                              |             |        | ![No changes]         |
| Unchanged | `public`          |          | `void`                | `charset`([`Charset`])                |             |        | ![No changes]         |
| Unchanged | `public`          |          | [`Charset`]           | `charset`()                           |             |        | ![No changes]         |
| Unchanged | `public`          |          | [`Document`]          | `clone`()                             |             |        | ![No changes]         |
| Unchanged | `public`          |          | [`Connection`]        | `connection`()                        |             |        | ![No changes]         |
| Unchanged | `public`          |          | [`Document`]          | `connection`([`Connection`])          |             |        | ![No changes]         |
| Unchanged | `public`          |          | [`Element`]           | `createElement`([`String`])           |             |        | ![No changes]         |
| Unchanged | `static` `public` |          | [`Document`]          | `createShell`([`String`])             |             |        | ![No changes]         |
| Unchanged | `public`          |          | [`DocumentType`]      | `documentType`()                      |             |        | ![No changes]         |
| Unchanged | `public`          |          | [`FormElement`]       | `expectForm`([`String`])              |             |        | ![No changes]         |
| Unchanged | `public`          |          | [`List<FormElement>`] | `forms`()                             |             |        | ![No changes]         |
| Unchanged | `public`          |          | [`Element`]           | `head`()                              |             |        | ![No changes]         |
| Unchanged | `public`          |          | [`String`]            | `location`()                          |             |        | ![No changes]         |
| Unchanged | `public`          |          | [`String`]            | `nodeName`()                          |             |        | ![No changes]         |
| Unchanged | `public`          |          | [`String`]            | `outerHtml`()                         |             |        | ![No changes]         |
| Unchanged | `public`          |          | [`OutputSettings`]    | `outputSettings`()                    |             |        | ![No changes]         |
| Unchanged | `public`          |          | [`Document`]          | `outputSettings`([`OutputSettings`])  |             |        | ![No changes]         |
| Unchanged | `public`          |          | [`Parser`]            | `parser`()                            |             |        | ![No changes]         |
| Unchanged | `public`          |          | [`Document`]          | `parser`([`Parser`])                  |             |        | ![No changes]         |
| Unchanged | `public`          |          | [`QuirksMode`]        | `quirksMode`()                        |             |        | ![No changes]         |
| Unchanged | `public`          |          | [`Document`]          | `quirksMode`([`QuirksMode`])          |             |        | ![No changes]         |
| Unchanged | `public`          |          | [`Document`]          | `shallowClone`()                      |             |        | ![No changes]         |
| Unchanged | `public`          |          | [`Element`]           | `text`([`String`])                    |             |        | ![No changes]         |
| Unchanged | `public`          |          | [`String`]            | `title`()                             |             |        | ![No changes]         |
| Unchanged | `public`          |          | `void`                | `title`([`String`])                   |             |        | ![No changes]         |
| Unchanged | `public`          |          | `void`                | `updateMetaCharsetElement`(`boolean`) |             |        | ![No changes]         |
| Unchanged | `public`          |          | `boolean`             | `updateMetaCharsetElement`()          |             |        | ![No changes]         |

___

<a id="user-content-org.jsoup.nodes.document$outputsettings"></a>
### `org.jsoup.nodes.Document$OutputSettings`

- [X] Binary-compatible
- [X] Source-compatible
- [X] Serialization-compatible

| Status    | Modifiers         | Type  | Name             | Extends    | JDK   | Serialization       | Compatibility Changes |
|-----------|-------------------|-------|------------------|------------|-------|---------------------|-----------------------|
| Unchanged | `static` `public` | Class | `OutputSettings` | [`Object`] | JDK 8 | ![Not serializable] | ![No changes]         |


#### Implemented Interfaces

| Status    | Interface     | Compatibility Changes |
|-----------|---------------|-----------------------|
| Unchanged | [`Cloneable`] | ![No changes]         |


#### Constructors

| Status    | Modifiers | Generics | Constructor        | Annotations | Throws | Compatibility Changes |
|-----------|-----------|----------|--------------------|-------------|--------|-----------------------|
| Unchanged | `public`  |          | `OutputSettings`() |             |        | ![No changes]         |


#### Methods

| Status    | Modifiers | Generics | Type               | Method                       | Annotations | Throws | Compatibility Changes |
|-----------|-----------|----------|--------------------|------------------------------|-------------|--------|-----------------------|
| Unchanged | `public`  |          | [`Charset`]        | `charset`()                  |             |        | ![No changes]         |
| Unchanged | `public`  |          | [`OutputSettings`] | `charset`([`Charset`])       |             |        | ![No changes]         |
| Unchanged | `public`  |          | [`OutputSettings`] | `charset`([`String`])        |             |        | ![No changes]         |
| Unchanged | `public`  |          | [`OutputSettings`] | `clone`()                    |             |        | ![No changes]         |
| Unchanged | `public`  |          | [`EscapeMode`]     | `escapeMode`()               |             |        | ![No changes]         |
| Unchanged | `public`  |          | [`OutputSettings`] | `escapeMode`([`EscapeMode`]) |             |        | ![No changes]         |
| Unchanged | `public`  |          | `int`              | `indentAmount`()             |             |        | ![No changes]         |
| Unchanged | `public`  |          | [`OutputSettings`] | `indentAmount`(`int`)        |             |        | ![No changes]         |
| Unchanged | `public`  |          | `int`              | `maxPaddingWidth`()          |             |        | ![No changes]         |
| Unchanged | `public`  |          | [`OutputSettings`] | `maxPaddingWidth`(`int`)     |             |        | ![No changes]         |
| Unchanged | `public`  |          | `boolean`          | `outline`()                  |             |        | ![No changes]         |
| Unchanged | `public`  |          | [`OutputSettings`] | `outline`(`boolean`)         |             |        | ![No changes]         |
| Unchanged | `public`  |          | `boolean`          | `prettyPrint`()              |             |        | ![No changes]         |
| Unchanged | `public`  |          | [`OutputSettings`] | `prettyPrint`(`boolean`)     |             |        | ![No changes]         |
| Unchanged | `public`  |          | [`Syntax`]         | `syntax`()                   |             |        | ![No changes]         |
| Unchanged | `public`  |          | [`OutputSettings`] | `syntax`([`Syntax`])         |             |        | ![No changes]         |

___

<a id="user-content-org.jsoup.nodes.document$outputsettings$syntax"></a>
### `org.jsoup.nodes.Document$OutputSettings$Syntax`

- [X] Binary-compatible
- [X] Source-compatible
- [X] Serialization-compatible

| Status    | Modifiers                 | Type | Name     | Extends     | JDK   | Serialization | Compatibility Changes |
|-----------|---------------------------|------|----------|-------------|-------|---------------|-----------------------|
| Unchanged | `final` `static` `public` | Enum | `Syntax` | [`Enum<E>`] | JDK 8 | ![Compatible] | ![No changes]         |


#### Implemented Interfaces

| Status    | Interface         | Compatibility Changes |
|-----------|-------------------|-----------------------|
| Unchanged | [`Serializable`]  | ![No changes]         |
| Unchanged | [`Comparable<T>`] | ![No changes]         |
| Unchanged | [`Constable`]     | ![No changes]         |


#### Methods

| Status    | Modifiers         | Generics | Type             | Method                | Annotations | Throws | Compatibility Changes |
|-----------|-------------------|----------|------------------|-----------------------|-------------|--------|-----------------------|
| Unchanged | `static` `public` |          | [`Syntax`]       | `valueOf`([`String`]) |             |        | ![No changes]         |
| Unchanged | `static` `public` |          | [`Syntax[]`][11] | `values`()            |             |        | ![No changes]         |


#### Fields

| Status    | Modifiers                 | Type       | Name   | Annotations | Compatibility Changes |
|-----------|---------------------------|------------|--------|-------------|-----------------------|
| Unchanged | `public` `static` `final` | [`Syntax`] | `html` |             | ![No changes]         |
| Unchanged | `public` `static` `final` | [`Syntax`] | `xml`  |             | ![No changes]         |

___

<a id="user-content-org.jsoup.nodes.document$quirksmode"></a>
### `org.jsoup.nodes.Document$QuirksMode`

- [X] Binary-compatible
- [X] Source-compatible
- [X] Serialization-compatible

| Status    | Modifiers                 | Type | Name         | Extends     | JDK   | Serialization | Compatibility Changes |
|-----------|---------------------------|------|--------------|-------------|-------|---------------|-----------------------|
| Unchanged | `final` `static` `public` | Enum | `QuirksMode` | [`Enum<E>`] | JDK 8 | ![Compatible] | ![No changes]         |


#### Implemented Interfaces

| Status    | Interface         | Compatibility Changes |
|-----------|-------------------|-----------------------|
| Unchanged | [`Serializable`]  | ![No changes]         |
| Unchanged | [`Comparable<T>`] | ![No changes]         |
| Unchanged | [`Constable`]     | ![No changes]         |


#### Methods

| Status    | Modifiers         | Generics | Type                 | Method                | Annotations | Throws | Compatibility Changes |
|-----------|-------------------|----------|----------------------|-----------------------|-------------|--------|-----------------------|
| Unchanged | `static` `public` |          | [`QuirksMode`]       | `valueOf`([`String`]) |             |        | ![No changes]         |
| Unchanged | `static` `public` |          | [`QuirksMode[]`][12] | `values`()            |             |        | ![No changes]         |


#### Fields

| Status    | Modifiers                 | Type           | Name            | Annotations | Compatibility Changes |
|-----------|---------------------------|----------------|-----------------|-------------|-----------------------|
| Unchanged | `public` `static` `final` | [`QuirksMode`] | `limitedQuirks` |             | ![No changes]         |
| Unchanged | `public` `static` `final` | [`QuirksMode`] | `noQuirks`      |             | ![No changes]         |
| Unchanged | `public` `static` `final` | [`QuirksMode`] | `quirks`        |             | ![No changes]         |

___

<a id="user-content-org.jsoup.nodes.documenttype"></a>
### `org.jsoup.nodes.DocumentType`

- [X] Binary-compatible
- [X] Source-compatible
- [X] Serialization-compatible

| Status    | Modifiers | Type  | Name           | Extends      | JDK   | Serialization       | Compatibility Changes |
|-----------|-----------|-------|----------------|--------------|-------|---------------------|-----------------------|
| Unchanged | `public`  | Class | `DocumentType` | [`LeafNode`] | JDK 8 | ![Not serializable] | ![No changes]         |


#### Implemented Interfaces

| Status    | Interface     | Compatibility Changes |
|-----------|---------------|-----------------------|
| Unchanged | [`Cloneable`] | ![No changes]         |


#### Constructors

| Status    | Modifiers | Generics | Constructor                                        | Annotations | Throws | Compatibility Changes |
|-----------|-----------|----------|----------------------------------------------------|-------------|--------|-----------------------|
| Unchanged | `public`  |          | `DocumentType`([`String`], [`String`], [`String`]) |             |        | ![No changes]         |


#### Methods

| Status    | Modifiers | Generics | Type       | Method                     | Annotations | Throws | Compatibility Changes |
|-----------|-----------|----------|------------|----------------------------|-------------|--------|-----------------------|
| Unchanged | `public`  |          | [`String`] | `name`()                   |             |        | ![No changes]         |
| Unchanged | `public`  |          | [`String`] | `nodeName`()               |             |        | ![No changes]         |
| Unchanged | `public`  |          | [`String`] | `publicId`()               |             |        | ![No changes]         |
| Unchanged | `public`  |          | `void`     | `setPubSysKey`([`String`]) |             |        | ![No changes]         |
| Unchanged | `public`  |          | [`String`] | `systemId`()               |             |        | ![No changes]         |


#### Fields

| Status    | Modifiers                 | Type       | Name         | Annotations | Compatibility Changes |
|-----------|---------------------------|------------|--------------|-------------|-----------------------|
| Unchanged | `public` `static` `final` | [`String`] | `PUBLIC_KEY` |             | ![No changes]         |
| Unchanged | `public` `static` `final` | [`String`] | `SYSTEM_KEY` |             | ![No changes]         |

___

<a id="user-content-org.jsoup.nodes.element"></a>
### `org.jsoup.nodes.Element`

- [X] Binary-compatible
- [X] Source-compatible
- [X] Serialization-compatible

| Status    | Modifiers | Type  | Name      | Extends     | JDK   | Serialization       | Compatibility Changes |
|-----------|-----------|-------|-----------|-------------|-------|---------------------|-----------------------|
| Unchanged | `public`  | Class | `Element` | [`Node`][9] | JDK 8 | ![Not serializable] | ![No changes]         |


#### Implemented Interfaces

| Status    | Interface     | Compatibility Changes |
|-----------|---------------|-----------------------|
| Unchanged | [`Cloneable`] | ![No changes]         |


#### Constructors

| Status    | Modifiers | Generics | Constructor                                    | Annotations | Throws | Compatibility Changes |
|-----------|-----------|----------|------------------------------------------------|-------------|--------|-----------------------|
| Unchanged | `public`  |          | `Element`([`Tag`], [`String`], [`Attributes`]) |             |        | ![No changes]         |
| Unchanged | `public`  |          | `Element`([`Tag`], [`String`])                 |             |        | ![No changes]         |
| Unchanged | `public`  |          | `Element`([`String`], [`String`])              |             |        | ![No changes]         |
| Unchanged | `public`  |          | `Element`([`String`])                          |             |        | ![No changes]         |


#### Methods

| Status    | Modifiers        | Generics                     | Type                    | Method                                                          | Annotations | Throws | Compatibility Changes |
|-----------|------------------|------------------------------|-------------------------|-----------------------------------------------------------------|-------------|--------|-----------------------|
| Unchanged | `public`         |                              | [`Element`]             | `addClass`([`String`])                                          |             |        | ![No changes]         |
| Unchanged | `public`         |                              | [`Element`]             | `after`([`String`])                                             |             |        | ![No changes]         |
| Unchanged | `public`         |                              | [`Element`]             | `after`([`Node`][9])                                            |             |        | ![No changes]         |
| Unchanged | `public`         |                              | [`Element`]             | `append`([`String`])                                            |             |        | ![No changes]         |
| Unchanged | `public`         |                              | [`Element`]             | `appendChild`([`Node`][9])                                      |             |        | ![No changes]         |
| Unchanged | `public`         |                              | [`Element`]             | `appendChildren`([`Collection<? extends Node>`])                |             |        | ![No changes]         |
| Unchanged | `public`         |                              | [`Element`]             | `appendElement`([`String`])                                     |             |        | ![No changes]         |
| Unchanged | `public`         |                              | [`Element`]             | `appendElement`([`String`], [`String`])                         |             |        | ![No changes]         |
| Unchanged | `public`         |                              | [`Element`]             | `appendText`([`String`])                                        |             |        | ![No changes]         |
| Unchanged | `public`         |                              | [`Element`]             | `appendTo`([`Element`])                                         |             |        | ![No changes]         |
| Unchanged | `public`         |                              | [`Element`]             | `attr`([`String`], [`String`])                                  |             |        | ![No changes]         |
| Unchanged | `public`         |                              | [`Element`]             | `attr`([`String`], `boolean`)                                   |             |        | ![No changes]         |
| Unchanged | `public`         |                              | [`Attribute`]           | `attribute`([`String`])                                         |             |        | ![No changes]         |
| Unchanged | `public`         |                              | [`Attributes`]          | `attributes`()                                                  |             |        | ![No changes]         |
| Unchanged | `public`         |                              | [`String`]              | `baseUri`()                                                     |             |        | ![No changes]         |
| Unchanged | `public`         |                              | [`Element`]             | `before`([`String`])                                            |             |        | ![No changes]         |
| Unchanged | `public`         |                              | [`Element`]             | `before`([`Node`][9])                                           |             |        | ![No changes]         |
| Unchanged | `public`         |                              | [`Element`]             | `child`(`int`)                                                  |             |        | ![No changes]         |
| Unchanged | `public`         |                              | `int`                   | `childNodeSize`()                                               |             |        | ![No changes]         |
| Unchanged | `public`         |                              | [`Elements`]            | `children`()                                                    |             |        | ![No changes]         |
| Unchanged | `public`         |                              | `int`                   | `childrenSize`()                                                |             |        | ![No changes]         |
| Unchanged | `public`         |                              | [`String`]              | `className`()                                                   |             |        | ![No changes]         |
| Unchanged | `public`         |                              | [`Set<String>`]         | `classNames`()                                                  |             |        | ![No changes]         |
| Unchanged | `public`         |                              | [`Element`]             | `classNames`([`Set<String>`])                                   |             |        | ![No changes]         |
| Unchanged | `public`         |                              | [`Element`]             | `clearAttributes`()                                             |             |        | ![No changes]         |
| Unchanged | `public`         |                              | [`Element`]             | `clone`()                                                       |             |        | ![No changes]         |
| Unchanged | `public`         |                              | [`Element`]             | `closest`([`String`])                                           |             |        | ![No changes]         |
| Unchanged | `public`         |                              | [`Element`]             | `closest`([`Evaluator`])                                        |             |        | ![No changes]         |
| Unchanged | `public`         |                              | [`String`]              | `cssSelector`()                                                 |             |        | ![No changes]         |
| Unchanged | `public`         |                              | [`String`]              | `data`()                                                        |             |        | ![No changes]         |
| Unchanged | `public`         |                              | [`List<DataNode>`]      | `dataNodes`()                                                   |             |        | ![No changes]         |
| Unchanged | `public`         |                              | [`Map<String, String>`] | `dataset`()                                                     |             |        | ![No changes]         |
| Unchanged | `protected`      |                              | [`Element`]             | `doClone`([`Node`][9])                                          |             |        | ![No changes]         |
| Unchanged | `protected`      |                              | `void`                  | `doSetBaseUri`([`String`])                                      |             |        | ![No changes]         |
| Unchanged | `public`         |                              | `boolean`               | `elementIs`([`String`], [`String`])                             |             |        | ![No changes]         |
| Unchanged | `public`         |                              | `int`                   | `elementSiblingIndex`()                                         |             |        | ![No changes]         |
| Unchanged | `public`         |                              | [`Element`]             | `empty`()                                                       |             |        | ![No changes]         |
| Unchanged | `public`         |                              | [`Range`]               | `endSourceRange`()                                              |             |        | ![No changes]         |
| Unchanged | `protected`      |                              | [`List<Node>`]          | `ensureChildNodes`()                                            |             |        | ![No changes]         |
| Unchanged | `public`         |                              | [`Element`]             | `expectFirst`([`String`])                                       |             |        | ![No changes]         |
| Unchanged | `public`         |                              | [`Element`]             | `filter`([`NodeFilter`])                                        |             |        | ![No changes]         |
| Unchanged | `public`         |                              | [`Element`]             | `firstElementChild`()                                           |             |        | ![No changes]         |
| Unchanged | `public`         |                              | [`Element`]             | `firstElementSibling`()                                         |             |        | ![No changes]         |
| Unchanged | `public`         |                              | [`Element`]             | `forEachNode`([`Consumer<? super Node>`])                       |             |        | ![No changes]         |
| Unchanged | `public`         |                              | [`Elements`]            | `getAllElements`()                                              |             |        | ![No changes]         |
| Unchanged | `public`         |                              | [`Element`]             | `getElementById`([`String`])                                    |             |        | ![No changes]         |
| Unchanged | `public`         |                              | [`Elements`]            | `getElementsByAttribute`([`String`])                            |             |        | ![No changes]         |
| Unchanged | `public`         |                              | [`Elements`]            | `getElementsByAttributeStarting`([`String`])                    |             |        | ![No changes]         |
| Unchanged | `public`         |                              | [`Elements`]            | `getElementsByAttributeValue`([`String`], [`String`])           |             |        | ![No changes]         |
| Unchanged | `public`         |                              | [`Elements`]            | `getElementsByAttributeValueContaining`([`String`], [`String`]) |             |        | ![No changes]         |
| Unchanged | `public`         |                              | [`Elements`]            | `getElementsByAttributeValueEnding`([`String`], [`String`])     |             |        | ![No changes]         |
| Unchanged | `public`         |                              | [`Elements`]            | `getElementsByAttributeValueMatching`([`String`], [`Pattern`])  |             |        | ![No changes]         |
| Unchanged | `public`         |                              | [`Elements`]            | `getElementsByAttributeValueMatching`([`String`], [`String`])   |             |        | ![No changes]         |
| Unchanged | `public`         |                              | [`Elements`]            | `getElementsByAttributeValueNot`([`String`], [`String`])        |             |        | ![No changes]         |
| Unchanged | `public`         |                              | [`Elements`]            | `getElementsByAttributeValueStarting`([`String`], [`String`])   |             |        | ![No changes]         |
| Unchanged | `public`         |                              | [`Elements`]            | `getElementsByClass`([`String`])                                |             |        | ![No changes]         |
| Unchanged | `public`         |                              | [`Elements`]            | `getElementsByIndexEquals`(`int`)                               |             |        | ![No changes]         |
| Unchanged | `public`         |                              | [`Elements`]            | `getElementsByIndexGreaterThan`(`int`)                          |             |        | ![No changes]         |
| Unchanged | `public`         |                              | [`Elements`]            | `getElementsByIndexLessThan`(`int`)                             |             |        | ![No changes]         |
| Unchanged | `public`         |                              | [`Elements`]            | `getElementsByTag`([`String`])                                  |             |        | ![No changes]         |
| Unchanged | `public`         |                              | [`Elements`]            | `getElementsContainingOwnText`([`String`])                      |             |        | ![No changes]         |
| Unchanged | `public`         |                              | [`Elements`]            | `getElementsContainingText`([`String`])                         |             |        | ![No changes]         |
| Unchanged | `public`         |                              | [`Elements`]            | `getElementsMatchingOwnText`([`Pattern`])                       |             |        | ![No changes]         |
| Unchanged | `public`         |                              | [`Elements`]            | `getElementsMatchingOwnText`([`String`])                        |             |        | ![No changes]         |
| Unchanged | `public`         |                              | [`Elements`]            | `getElementsMatchingText`([`Pattern`])                          |             |        | ![No changes]         |
| Unchanged | `public`         |                              | [`Elements`]            | `getElementsMatchingText`([`String`])                           |             |        | ![No changes]         |
| Unchanged | `protected`      |                              | `boolean`               | `hasAttributes`()                                               |             |        | ![No changes]         |
| Unchanged | `protected`      |                              | `boolean`               | `hasChildNodes`()                                               |             |        | ![No changes]         |
| Unchanged | `public`         |                              | `boolean`               | `hasClass`([`String`])                                          |             |        | ![No changes]         |
| Unchanged | `public`         |                              | `boolean`               | `hasText`()                                                     |             |        | ![No changes]         |
| Unchanged | `public`         |                              | [`String`]              | `html`()                                                        |             |        | ![No changes]         |
| Unchanged | `public`         | \<[`T extends Appendable`]\> | [`Appendable`]          | `html`(`T`)                                                     |             |        | ![No changes]         |
| Unchanged | `public`         |                              | [`Element`]             | `html`([`String`])                                              |             |        | ![No changes]         |
| Unchanged | `public`         |                              | [`String`]              | `id`()                                                          |             |        | ![No changes]         |
| Unchanged | `public`         |                              | [`Element`]             | `id`([`String`])                                                |             |        | ![No changes]         |
| Unchanged | `public`         |                              | [`Element`]             | `insertChildren`(`int`, [`Collection<? extends Node>`])         |             |        | ![No changes]         |
| Unchanged | `public`         |                              | [`Element`]             | `insertChildren`(`int`, [`Node...`])                            |             |        | ![No changes]         |
| Unchanged | `public`         |                              | `boolean`               | `is`([`String`])                                                |             |        | ![No changes]         |
| Unchanged | `public`         |                              | `boolean`               | `is`([`Evaluator`])                                             |             |        | ![No changes]         |
| Unchanged | `public`         |                              | `boolean`               | `isBlock`()                                                     |             |        | ![No changes]         |
| Unchanged | `public`         |                              | [`Element`]             | `lastElementChild`()                                            |             |        | ![No changes]         |
| Unchanged | `public`         |                              | [`Element`]             | `lastElementSibling`()                                          |             |        | ![No changes]         |
| Unchanged | `public`         |                              | [`Element`]             | `nextElementSibling`()                                          |             |        | ![No changes]         |
| Unchanged | `public`         |                              | [`Elements`]            | `nextElementSiblings`()                                         |             |        | ![No changes]         |
| Unchanged | `public`         |                              | [`String`]              | `nodeName`()                                                    |             |        | ![No changes]         |
| Unchanged | `public`         |                              | [`String`]              | `normalName`()                                                  |             |        | ![No changes]         |
| Unchanged | `public`         |                              | [`String`]              | `ownText`()                                                     |             |        | ![No changes]         |
| Unchanged | `final` `public` |                              | [`Element`]             | `parent`()                                                      |             |        | ![No changes]         |
| Unchanged | `public`         |                              | [`Elements`]            | `parents`()                                                     |             |        | ![No changes]         |
| Unchanged | `public`         |                              | [`Element`]             | `prepend`([`String`])                                           |             |        | ![No changes]         |
| Unchanged | `public`         |                              | [`Element`]             | `prependChild`([`Node`][9])                                     |             |        | ![No changes]         |
| Unchanged | `public`         |                              | [`Element`]             | `prependChildren`([`Collection<? extends Node>`])               |             |        | ![No changes]         |
| Unchanged | `public`         |                              | [`Element`]             | `prependElement`([`String`])                                    |             |        | ![No changes]         |
| Unchanged | `public`         |                              | [`Element`]             | `prependElement`([`String`], [`String`])                        |             |        | ![No changes]         |
| Unchanged | `public`         |                              | [`Element`]             | `prependText`([`String`])                                       |             |        | ![No changes]         |
| Unchanged | `public`         |                              | [`Element`]             | `previousElementSibling`()                                      |             |        | ![No changes]         |
| Unchanged | `public`         |                              | [`Elements`]            | `previousElementSiblings`()                                     |             |        | ![No changes]         |
| Unchanged | `public`         |                              | [`Element`]             | `removeAttr`([`String`])                                        |             |        | ![No changes]         |
| Unchanged | `public`         |                              | [`Element`]             | `removeClass`([`String`])                                       |             |        | ![No changes]         |
| Unchanged | `public`         |                              | [`Element`]             | `root`()                                                        |             |        | ![No changes]         |
| Unchanged | `public`         |                              | [`Elements`]            | `select`([`String`])                                            |             |        | ![No changes]         |
| Unchanged | `public`         |                              | [`Elements`]            | `select`([`Evaluator`])                                         |             |        | ![No changes]         |
| Unchanged | `public`         |                              | [`Element`]             | `selectFirst`([`String`])                                       |             |        | ![No changes]         |
| Unchanged | `public`         |                              | [`Element`]             | `selectFirst`([`Evaluator`])                                    |             |        | ![No changes]         |
| Unchanged | `public`         |                              | [`Elements`]            | `selectXpath`([`String`])                                       |             |        | ![No changes]         |
| Unchanged | `public`         | \<[`T extends Node`]\>       | [`List<T>`]             | `selectXpath`([`String`], [`Class<T>`])                         |             |        | ![No changes]         |
| Unchanged | `public`         |                              | [`Element`]             | `shallowClone`()                                                |             |        | ![No changes]         |
| Unchanged | `public`         |                              | [`Elements`]            | `siblingElements`()                                             |             |        | ![No changes]         |
| Unchanged | `public`         |                              | [`Stream<Element>`]     | `stream`()                                                      |             |        | ![No changes]         |
| Unchanged | `public`         |                              | [`Tag`]                 | `tag`()                                                         |             |        | ![No changes]         |
| Unchanged | `public`         |                              | [`String`]              | `tagName`()                                                     |             |        | ![No changes]         |
| Unchanged | `public`         |                              | [`Element`]             | `tagName`([`String`])                                           |             |        | ![No changes]         |
| Unchanged | `public`         |                              | [`Element`]             | `tagName`([`String`], [`String`])                               |             |        | ![No changes]         |
| Unchanged | `public`         |                              | [`String`]              | `text`()                                                        |             |        | ![No changes]         |
| Unchanged | `public`         |                              | [`Element`]             | `text`([`String`])                                              |             |        | ![No changes]         |
| Unchanged | `public`         |                              | [`List<TextNode>`]      | `textNodes`()                                                   |             |        | ![No changes]         |
| Unchanged | `public`         |                              | [`Element`]             | `toggleClass`([`String`])                                       |             |        | ![No changes]         |
| Unchanged | `public`         |                              | [`Element`]             | `traverse`([`NodeVisitor`])                                     |             |        | ![No changes]         |
| Unchanged | `public`         |                              | [`String`]              | `val`()                                                         |             |        | ![No changes]         |
| Unchanged | `public`         |                              | [`Element`]             | `val`([`String`])                                               |             |        | ![No changes]         |
| Unchanged | `public`         |                              | [`String`]              | `wholeOwnText`()                                                |             |        | ![No changes]         |
| Unchanged | `public`         |                              | [`String`]              | `wholeText`()                                                   |             |        | ![No changes]         |
| Unchanged | `public`         |                              | [`Element`]             | `wrap`([`String`])                                              |             |        | ![No changes]         |

___

<a id="user-content-org.jsoup.nodes.entities"></a>
### `org.jsoup.nodes.Entities`

- [X] Binary-compatible
- [X] Source-compatible
- [X] Serialization-compatible

| Status    | Modifiers | Type  | Name       | Extends    | JDK   | Serialization       | Compatibility Changes |
|-----------|-----------|-------|------------|------------|-------|---------------------|-----------------------|
| Unchanged | `public`  | Class | `Entities` | [`Object`] | JDK 8 | ![Not serializable] | ![No changes]         |


#### Methods

| Status    | Modifiers         | Generics | Type       | Method                                   | Annotations | Throws | Compatibility Changes |
|-----------|-------------------|----------|------------|------------------------------------------|-------------|--------|-----------------------|
| Unchanged | `static` `public` |          | `int`      | `codepointsForName`([`String`], `int[]`) |             |        | ![No changes]         |
| Unchanged | `static` `public` |          | [`String`] | `escape`([`String`], [`OutputSettings`]) |             |        | ![No changes]         |
| Unchanged | `static` `public` |          | [`String`] | `escape`([`String`])                     |             |        | ![No changes]         |
| Unchanged | `static` `public` |          | [`String`] | `getByName`([`String`])                  |             |        | ![No changes]         |
| Unchanged | `static` `public` |          | `boolean`  | `isBaseNamedEntity`([`String`])          |             |        | ![No changes]         |
| Unchanged | `static` `public` |          | `boolean`  | `isNamedEntity`([`String`])              |             |        | ![No changes]         |
| Unchanged | `static` `public` |          | [`String`] | `unescape`([`String`])                   |             |        | ![No changes]         |

___

<a id="user-content-org.jsoup.nodes.entities$escapemode"></a>
### `org.jsoup.nodes.Entities$EscapeMode`

- [X] Binary-compatible
- [X] Source-compatible
- [X] Serialization-compatible

| Status    | Modifiers                 | Type | Name         | Extends     | JDK   | Serialization | Compatibility Changes |
|-----------|---------------------------|------|--------------|-------------|-------|---------------|-----------------------|
| Unchanged | `final` `static` `public` | Enum | `EscapeMode` | [`Enum<E>`] | JDK 8 | ![Compatible] | ![No changes]         |


#### Implemented Interfaces

| Status    | Interface         | Compatibility Changes |
|-----------|-------------------|-----------------------|
| Unchanged | [`Serializable`]  | ![No changes]         |
| Unchanged | [`Comparable<T>`] | ![No changes]         |
| Unchanged | [`Constable`]     | ![No changes]         |


#### Methods

| Status    | Modifiers         | Generics | Type                 | Method                | Annotations | Throws | Compatibility Changes |
|-----------|-------------------|----------|----------------------|-----------------------|-------------|--------|-----------------------|
| Unchanged | `static` `public` |          | [`EscapeMode`]       | `valueOf`([`String`]) |             |        | ![No changes]         |
| Unchanged | `static` `public` |          | [`EscapeMode[]`][13] | `values`()            |             |        | ![No changes]         |


#### Fields

| Status    | Modifiers                 | Type           | Name       | Annotations | Compatibility Changes |
|-----------|---------------------------|----------------|------------|-------------|-----------------------|
| Unchanged | `public` `static` `final` | [`EscapeMode`] | `base`     |             | ![No changes]         |
| Unchanged | `public` `static` `final` | [`EscapeMode`] | `extended` |             | ![No changes]         |
| Unchanged | `public` `static` `final` | [`EscapeMode`] | `xhtml`    |             | ![No changes]         |

___

<a id="user-content-org.jsoup.nodes.formelement"></a>
### `org.jsoup.nodes.FormElement`

- [X] Binary-compatible
- [X] Source-compatible
- [X] Serialization-compatible

| Status    | Modifiers | Type  | Name          | Extends     | JDK   | Serialization       | Compatibility Changes |
|-----------|-----------|-------|---------------|-------------|-------|---------------------|-----------------------|
| Unchanged | `public`  | Class | `FormElement` | [`Element`] | JDK 8 | ![Not serializable] | ![No changes]         |


#### Implemented Interfaces

| Status    | Interface     | Compatibility Changes |
|-----------|---------------|-----------------------|
| Unchanged | [`Cloneable`] | ![No changes]         |


#### Constructors

| Status    | Modifiers | Generics | Constructor                                        | Annotations | Throws | Compatibility Changes |
|-----------|-----------|----------|----------------------------------------------------|-------------|--------|-----------------------|
| Unchanged | `public`  |          | `FormElement`([`Tag`], [`String`], [`Attributes`]) |             |        | ![No changes]         |


#### Methods

| Status    | Modifiers   | Generics | Type             | Method                     | Annotations | Throws | Compatibility Changes |
|-----------|-------------|----------|------------------|----------------------------|-------------|--------|-----------------------|
| Unchanged | `public`    |          | [`FormElement`]  | `addElement`([`Element`])  |             |        | ![No changes]         |
| Unchanged | `public`    |          | [`FormElement`]  | `clone`()                  |             |        | ![No changes]         |
| Unchanged | `public`    |          | [`Elements`]     | `elements`()               |             |        | ![No changes]         |
| Unchanged | `public`    |          | [`List<KeyVal>`] | `formData`()               |             |        | ![No changes]         |
| Unchanged | `protected` |          | `void`           | `removeChild`([`Node`][9]) |             |        | ![No changes]         |
| Unchanged | `public`    |          | [`Connection`]   | `submit`()                 |             |        | ![No changes]         |

___

<a id="user-content-org.jsoup.nodes.leafnode"></a>
### `org.jsoup.nodes.LeafNode`

- [X] Binary-compatible
- [X] Source-compatible
- [X] Serialization-compatible

| Status   | Modifiers           | Type  | Name       | Extends     | JDK   | Serialization       | Compatibility Changes |
|----------|---------------------|-------|------------|-------------|-------|---------------------|-----------------------|
| Modified | `public` `abstract` | Class | `LeafNode` | [`Node`][9] | JDK 8 | ![Not serializable] | ![No changes]         |


#### Implemented Interfaces

| Status    | Interface     | Compatibility Changes |
|-----------|---------------|-----------------------|
| Unchanged | [`Cloneable`] | ![No changes]         |


#### Constructors

| Status    | Modifiers       | Generics | Constructor                | Annotations | Throws | Compatibility Changes |
|-----------|-----------------|----------|----------------------------|-------------|--------|-----------------------|
| Unchanged | `public`        |          | `LeafNode`()               |             |        | ![No changes]         |
| Added     | **`protected`** |          | **`LeafNode`**([`String`]) |             |        | ![No changes]         |


#### Methods

| Status    | Modifiers           | Generics | Type           | Method                         | Annotations | Throws | Compatibility Changes |
|-----------|---------------------|----------|----------------|--------------------------------|-------------|--------|-----------------------|
| Unchanged | `public`            |          | [`String`]     | `absUrl`([`String`])           |             |        | ![No changes]         |
| Unchanged | `public`            |          | [`String`]     | `attr`([`String`])             |             |        | ![No changes]         |
| Unchanged | `public`            |          | [`Node`][9]    | `attr`([`String`], [`String`]) |             |        | ![No changes]         |
| Unchanged | `final` `public`    |          | [`Attributes`] | `attributes`()                 |             |        | ![No changes]         |
| Unchanged | `public`            |          | [`String`]     | `baseUri`()                    |             |        | ![No changes]         |
| Unchanged | `public`            |          | `int`          | `childNodeSize`()              |             |        | ![No changes]         |
| Unchanged | `protected`         |          | [`LeafNode`]   | `doClone`([`Node`][9])         |             |        | ![No changes]         |
| Unchanged | `protected`         |          | `void`         | `doSetBaseUri`([`String`])     |             |        | ![No changes]         |
| Unchanged | `public`            |          | [`Node`][9]    | `empty`()                      |             |        | ![No changes]         |
| Unchanged | `protected`         |          | [`List<Node>`] | `ensureChildNodes`()           |             |        | ![No changes]         |
| Unchanged | `public`            |          | `boolean`      | `hasAttr`([`String`])          |             |        | ![No changes]         |
| Unchanged | `final` `protected` |          | `boolean`      | `hasAttributes`()              |             |        | ![No changes]         |
| Unchanged | `public`            |          | [`Node`][9]    | `removeAttr`([`String`])       |             |        | ![No changes]         |

___

<a id="user-content-org.jsoup.nodes.node"></a>
### `org.jsoup.nodes.Node`

- [X] Binary-compatible
- [X] Source-compatible
- [X] Serialization-compatible

| Status    | Modifiers           | Type  | Name   | Extends    | JDK   | Serialization       | Compatibility Changes |
|-----------|---------------------|-------|--------|------------|-------|---------------------|-----------------------|
| Unchanged | `public` `abstract` | Class | `Node` | [`Object`] | JDK 8 | ![Not serializable] | ![No changes]         |


#### Implemented Interfaces

| Status    | Interface     | Compatibility Changes |
|-----------|---------------|-----------------------|
| Unchanged | [`Cloneable`] | ![No changes]         |


#### Constructors

| Status    | Modifiers   | Generics | Constructor | Annotations | Throws | Compatibility Changes |
|-----------|-------------|----------|-------------|-------------|--------|-----------------------|
| Unchanged | `protected` |          | `Node`()    |             |        | ![No changes]         |


#### Methods

| Status    | Modifiers              | Generics                     | Type             | Method                                              | Annotations | Throws          | Compatibility Changes |
|-----------|------------------------|------------------------------|------------------|-----------------------------------------------------|-------------|-----------------|-----------------------|
| Unchanged | `public`               |                              | [`String`]       | `absUrl`([`String`])                                |             |                 | ![No changes]         |
| Unchanged | `protected`            |                              | `void`           | `addChildren`([`Node...`])                          |             |                 | ![No changes]         |
| Unchanged | `protected`            |                              | `void`           | `addChildren`(`int`, [`Node...`])                   |             |                 | ![No changes]         |
| Unchanged | `public`               |                              | [`Node`][9]      | `after`([`String`])                                 |             |                 | ![No changes]         |
| Unchanged | `public`               |                              | [`Node`][9]      | `after`([`Node`][9])                                |             |                 | ![No changes]         |
| Unchanged | `public`               |                              | [`String`]       | `attr`([`String`])                                  |             |                 | ![No changes]         |
| Unchanged | `public`               |                              | [`Node`][9]      | `attr`([`String`], [`String`])                      |             |                 | ![No changes]         |
| Unchanged | `public` `abstract`    |                              | [`Attributes`]   | `attributes`()                                      |             |                 | ![No changes]         |
| Unchanged | `public`               |                              | `int`            | `attributesSize`()                                  |             |                 | ![No changes]         |
| Unchanged | `public` `abstract`    |                              | [`String`]       | `baseUri`()                                         |             |                 | ![No changes]         |
| Unchanged | `public`               |                              | [`Node`][9]      | `before`([`String`])                                |             |                 | ![No changes]         |
| Unchanged | `public`               |                              | [`Node`][9]      | `before`([`Node`][9])                               |             |                 | ![No changes]         |
| Unchanged | `public`               |                              | [`Node`][9]      | `childNode`(`int`)                                  |             |                 | ![No changes]         |
| Unchanged | `public` `abstract`    |                              | `int`            | `childNodeSize`()                                   |             |                 | ![No changes]         |
| Unchanged | `public`               |                              | [`List<Node>`]   | `childNodes`()                                      |             |                 | ![No changes]         |
| Unchanged | `protected`            |                              | [`Node[]`][14]   | `childNodesAsArray`()                               |             |                 | ![No changes]         |
| Unchanged | `public`               |                              | [`List<Node>`]   | `childNodesCopy`()                                  |             |                 | ![No changes]         |
| Unchanged | `public`               |                              | [`Node`][9]      | `clearAttributes`()                                 |             |                 | ![No changes]         |
| Unchanged | `public`               |                              | [`Node`][9]      | `clone`()                                           |             |                 | ![No changes]         |
| Unchanged | `protected`            |                              | [`Node`][9]      | `doClone`([`Node`][9])                              |             |                 | ![No changes]         |
| Unchanged | `protected` `abstract` |                              | `void`           | `doSetBaseUri`([`String`])                          |             |                 | ![No changes]         |
| Unchanged | `public` `abstract`    |                              | [`Node`][9]      | `empty`()                                           |             |                 | ![No changes]         |
| Unchanged | `protected` `abstract` |                              | [`List<Node>`]   | `ensureChildNodes`()                                |             |                 | ![No changes]         |
| Unchanged | `public`               |                              | `boolean`        | `equals`([`Object`])                                |             |                 | ![No changes]         |
| Unchanged | `public`               |                              | [`Node`][9]      | `filter`([`NodeFilter`])                            |             |                 | ![No changes]         |
| Unchanged | `public`               |                              | [`Node`][9]      | `firstChild`()                                      |             |                 | ![No changes]         |
| Unchanged | `public`               |                              | [`Node`][9]      | `forEachNode`([`Consumer<? super Node>`])           |             |                 | ![No changes]         |
| Unchanged | `public`               |                              | `boolean`        | `hasAttr`([`String`])                               |             |                 | ![No changes]         |
| Unchanged | `protected` `abstract` |                              | `boolean`        | `hasAttributes`()                                   |             |                 | ![No changes]         |
| Unchanged | `public`               |                              | `boolean`        | `hasParent`()                                       |             |                 | ![No changes]         |
| Unchanged | `public`               |                              | `boolean`        | `hasSameValue`([`Object`])                          |             |                 | ![No changes]         |
| Unchanged | `public`               |                              | `int`            | `hashCode`()                                        |             |                 | ![No changes]         |
| Unchanged | `public`               | \<[`T extends Appendable`]\> | [`Appendable`]   | `html`(`T`)                                         |             |                 | ![No changes]         |
| Unchanged | `protected`            |                              | `void`           | `indent`([`Appendable`], `int`, [`OutputSettings`]) |             | [`IOException`] | ![No changes]         |
| Unchanged | `public`               |                              | [`Node`][9]      | `lastChild`()                                       |             |                 | ![No changes]         |
| Unchanged | `public`               |                              | `boolean`        | `nameIs`([`String`])                                |             |                 | ![No changes]         |
| Unchanged | `public`               |                              | [`Node`][9]      | `nextSibling`()                                     |             |                 | ![No changes]         |
| Unchanged | `public` `abstract`    |                              | [`String`]       | `nodeName`()                                        |             |                 | ![No changes]         |
| Unchanged | `public`               |                              | [`Stream<Node>`] | `nodeStream`()                                      |             |                 | ![No changes]         |
| Unchanged | `public`               | \<[`T extends Node`]\>       | [`Stream<T>`]    | `nodeStream`([`Class<T>`])                          |             |                 | ![No changes]         |
| Unchanged | `public`               |                              | [`String`]       | `normalName`()                                      |             |                 | ![No changes]         |
| Unchanged | `public`               |                              | [`String`]       | `outerHtml`()                                       |             |                 | ![No changes]         |
| Unchanged | `protected`            |                              | `void`           | `outerHtml`([`Appendable`])                         |             |                 | ![No changes]         |
| Unchanged | `public`               |                              | [`Document`]     | `ownerDocument`()                                   |             |                 | ![No changes]         |
| Unchanged | `public`               |                              | [`Node`][9]      | `parent`()                                          |             |                 | ![No changes]         |
| Unchanged | `public`               |                              | `boolean`        | `parentElementIs`([`String`], [`String`])           |             |                 | ![No changes]         |
| Unchanged | `public`               |                              | `boolean`        | `parentNameIs`([`String`])                          |             |                 | ![No changes]         |
| Unchanged | `final` `public`       |                              | [`Node`][9]      | `parentNode`()                                      |             |                 | ![No changes]         |
| Unchanged | `public`               |                              | [`Node`][9]      | `previousSibling`()                                 |             |                 | ![No changes]         |
| Unchanged | `public`               |                              | `void`           | `remove`()                                          |             |                 | ![No changes]         |
| Unchanged | `public`               |                              | [`Node`][9]      | `removeAttr`([`String`])                            |             |                 | ![No changes]         |
| Unchanged | `protected`            |                              | `void`           | `removeChild`([`Node`][9])                          |             |                 | ![No changes]         |
| Unchanged | `protected`            |                              | `void`           | `reparentChild`([`Node`][9])                        |             |                 | ![No changes]         |
| Unchanged | `protected`            |                              | `void`           | `replaceChild`([`Node`][9], [`Node`][9])            |             |                 | ![No changes]         |
| Unchanged | `public`               |                              | `void`           | `replaceWith`([`Node`][9])                          |             |                 | ![No changes]         |
| Unchanged | `public`               |                              | [`Node`][9]      | `root`()                                            |             |                 | ![No changes]         |
| Unchanged | `public`               |                              | `void`           | `setBaseUri`([`String`])                            |             |                 | ![No changes]         |
| Unchanged | `protected`            |                              | `void`           | `setParentNode`([`Node`][9])                        |             |                 | ![No changes]         |
| Unchanged | `protected`            |                              | `void`           | `setSiblingIndex`(`int`)                            |             |                 | ![No changes]         |
| Unchanged | `public`               |                              | [`Node`][9]      | `shallowClone`()                                    |             |                 | ![No changes]         |
| Unchanged | `public`               |                              | `int`            | `siblingIndex`()                                    |             |                 | ![No changes]         |
| Unchanged | `public`               |                              | [`List<Node>`]   | `siblingNodes`()                                    |             |                 | ![No changes]         |
| Unchanged | `public`               |                              | [`Range`]        | `sourceRange`()                                     |             |                 | ![No changes]         |
| Unchanged | `public`               |                              | [`String`]       | `toString`()                                        |             |                 | ![No changes]         |
| Unchanged | `public`               |                              | [`Node`][9]      | `traverse`([`NodeVisitor`])                         |             |                 | ![No changes]         |
| Unchanged | `public`               |                              | [`Node`][9]      | `unwrap`()                                          |             |                 | ![No changes]         |
| Unchanged | `public`               |                              | [`Node`][9]      | `wrap`([`String`])                                  |             |                 | ![No changes]         |

___

<a id="user-content-org.jsoup.nodes.nodeiterator"></a>
### `org.jsoup.nodes.NodeIterator`

- [X] Binary-compatible
- [X] Source-compatible
- [X] Serialization-compatible

| Status    | Modifiers | Type  | Name           | Extends    | JDK   | Serialization       | Compatibility Changes |
|-----------|-----------|-------|----------------|------------|-------|---------------------|-----------------------|
| Unchanged | `public`  | Class | `NodeIterator` | [`Object`] | JDK 8 | ![Not serializable] | ![No changes]         |


#### Generics

| Status    | Name | Extends     | Compatibility Changes |
|-----------|------|-------------|-----------------------|
| Unchanged | `T`  | [`Node`][9] | ![No changes]         |


#### Implemented Interfaces

| Status    | Interface       | Compatibility Changes |
|-----------|-----------------|-----------------------|
| Unchanged | [`Iterator<E>`] | ![No changes]         |


#### Constructors

| Status    | Modifiers | Generics | Constructor                               | Annotations | Throws | Compatibility Changes |
|-----------|-----------|----------|-------------------------------------------|-------------|--------|-----------------------|
| Unchanged | `public`  |          | `NodeIterator`([`Node`][9], [`Class<T>`]) |             |        | ![No changes]         |


#### Methods

| Status    | Modifiers         | Generics | Type                   | Method                 | Annotations | Throws | Compatibility Changes |
|-----------|-------------------|----------|------------------------|------------------------|-------------|--------|-----------------------|
| Unchanged | `static` `public` |          | [`NodeIterator<Node>`] | `from`([`Node`][9])    |             |        | ![No changes]         |
| Unchanged | `public`          |          | `boolean`              | `hasNext`()            |             |        | ![No changes]         |
| Unchanged | `public`          |          | [`Node`][9]            | `next`()               |             |        | ![No changes]         |
| Unchanged | `public`          |          | `void`                 | `remove`()             |             |        | ![No changes]         |
| Unchanged | `public`          |          | `void`                 | `restart`([`Node`][9]) |             |        | ![No changes]         |

___

<a id="user-content-org.jsoup.nodes.pseudotextelement"></a>
### `org.jsoup.nodes.PseudoTextElement`

- [X] Binary-compatible
- [X] Source-compatible
- [X] Serialization-compatible

| Status    | Modifiers | Type  | Name                | Extends     | JDK   | Serialization       | Compatibility Changes |
|-----------|-----------|-------|---------------------|-------------|-------|---------------------|-----------------------|
| Unchanged | `public`  | Class | `PseudoTextElement` | [`Element`] | JDK 8 | ![Not serializable] | ![No changes]         |


#### Implemented Interfaces

| Status    | Interface     | Compatibility Changes |
|-----------|---------------|-----------------------|
| Unchanged | [`Cloneable`] | ![No changes]         |


#### Constructors

| Status    | Modifiers | Generics | Constructor                                              | Annotations | Throws | Compatibility Changes |
|-----------|-----------|----------|----------------------------------------------------------|-------------|--------|-----------------------|
| Unchanged | `public`  |          | `PseudoTextElement`([`Tag`], [`String`], [`Attributes`]) |             |        | ![No changes]         |

___

<a id="user-content-org.jsoup.nodes.range"></a>
### `org.jsoup.nodes.Range`

- [X] Binary-compatible
- [X] Source-compatible
- [X] Serialization-compatible

| Status    | Modifiers | Type  | Name    | Extends    | JDK   | Serialization       | Compatibility Changes |
|-----------|-----------|-------|---------|------------|-------|---------------------|-----------------------|
| Unchanged | `public`  | Class | `Range` | [`Object`] | JDK 8 | ![Not serializable] | ![No changes]         |


#### Constructors

| Status    | Modifiers | Generics | Constructor                         | Annotations | Throws | Compatibility Changes |
|-----------|-----------|----------|-------------------------------------|-------------|--------|-----------------------|
| Unchanged | `public`  |          | `Range`([`Position`], [`Position`]) |             |        | ![No changes]         |


#### Methods

| Status    | Modifiers | Generics | Type         | Method               | Annotations | Throws | Compatibility Changes |
|-----------|-----------|----------|--------------|----------------------|-------------|--------|-----------------------|
| Unchanged | `public`  |          | [`Position`] | `end`()              |             |        | ![No changes]         |
| Unchanged | `public`  |          | `int`        | `endPos`()           |             |        | ![No changes]         |
| Unchanged | `public`  |          | `boolean`    | `equals`([`Object`]) |             |        | ![No changes]         |
| Unchanged | `public`  |          | `int`        | `hashCode`()         |             |        | ![No changes]         |
| Unchanged | `public`  |          | `boolean`    | `isImplicit`()       |             |        | ![No changes]         |
| Unchanged | `public`  |          | `boolean`    | `isTracked`()        |             |        | ![No changes]         |
| Unchanged | `public`  |          | [`Position`] | `start`()            |             |        | ![No changes]         |
| Unchanged | `public`  |          | `int`        | `startPos`()         |             |        | ![No changes]         |
| Unchanged | `public`  |          | [`String`]   | `toString`()         |             |        | ![No changes]         |

___

<a id="user-content-org.jsoup.nodes.range$attributerange"></a>
### `org.jsoup.nodes.Range$AttributeRange`

- [X] Binary-compatible
- [X] Source-compatible
- [X] Serialization-compatible

| Status    | Modifiers         | Type  | Name             | Extends    | JDK   | Serialization       | Compatibility Changes |
|-----------|-------------------|-------|------------------|------------|-------|---------------------|-----------------------|
| Unchanged | `static` `public` | Class | `AttributeRange` | [`Object`] | JDK 8 | ![Not serializable] | ![No changes]         |


#### Constructors

| Status    | Modifiers | Generics | Constructor                            | Annotations | Throws | Compatibility Changes |
|-----------|-----------|----------|----------------------------------------|-------------|--------|-----------------------|
| Unchanged | `public`  |          | `AttributeRange`([`Range`], [`Range`]) |             |        | ![No changes]         |


#### Methods

| Status    | Modifiers | Generics | Type       | Method               | Annotations | Throws | Compatibility Changes |
|-----------|-----------|----------|------------|----------------------|-------------|--------|-----------------------|
| Unchanged | `public`  |          | `boolean`  | `equals`([`Object`]) |             |        | ![No changes]         |
| Unchanged | `public`  |          | `int`      | `hashCode`()         |             |        | ![No changes]         |
| Unchanged | `public`  |          | [`Range`]  | `nameRange`()        |             |        | ![No changes]         |
| Unchanged | `public`  |          | [`String`] | `toString`()         |             |        | ![No changes]         |
| Unchanged | `public`  |          | [`Range`]  | `valueRange`()       |             |        | ![No changes]         |

___

<a id="user-content-org.jsoup.nodes.range$position"></a>
### `org.jsoup.nodes.Range$Position`

- [X] Binary-compatible
- [X] Source-compatible
- [X] Serialization-compatible

| Status    | Modifiers         | Type  | Name       | Extends    | JDK   | Serialization       | Compatibility Changes |
|-----------|-------------------|-------|------------|------------|-------|---------------------|-----------------------|
| Unchanged | `static` `public` | Class | `Position` | [`Object`] | JDK 8 | ![Not serializable] | ![No changes]         |


#### Constructors

| Status    | Modifiers | Generics | Constructor                     | Annotations | Throws | Compatibility Changes |
|-----------|-----------|----------|---------------------------------|-------------|--------|-----------------------|
| Unchanged | `public`  |          | `Position`(`int`, `int`, `int`) |             |        | ![No changes]         |


#### Methods

| Status    | Modifiers | Generics | Type       | Method               | Annotations | Throws | Compatibility Changes |
|-----------|-----------|----------|------------|----------------------|-------------|--------|-----------------------|
| Unchanged | `public`  |          | `int`      | `columnNumber`()     |             |        | ![No changes]         |
| Unchanged | `public`  |          | `boolean`  | `equals`([`Object`]) |             |        | ![No changes]         |
| Unchanged | `public`  |          | `int`      | `hashCode`()         |             |        | ![No changes]         |
| Unchanged | `public`  |          | `boolean`  | `isTracked`()        |             |        | ![No changes]         |
| Unchanged | `public`  |          | `int`      | `lineNumber`()       |             |        | ![No changes]         |
| Unchanged | `public`  |          | `int`      | `pos`()              |             |        | ![No changes]         |
| Unchanged | `public`  |          | [`String`] | `toString`()         |             |        | ![No changes]         |

___

<a id="user-content-org.jsoup.nodes.textnode"></a>
### `org.jsoup.nodes.TextNode`

- [X] Binary-compatible
- [X] Source-compatible
- [X] Serialization-compatible

| Status    | Modifiers | Type  | Name       | Extends      | JDK   | Serialization       | Compatibility Changes |
|-----------|-----------|-------|------------|--------------|-------|---------------------|-----------------------|
| Unchanged | `public`  | Class | `TextNode` | [`LeafNode`] | JDK 8 | ![Not serializable] | ![No changes]         |


#### Implemented Interfaces

| Status    | Interface     | Compatibility Changes |
|-----------|---------------|-----------------------|
| Unchanged | [`Cloneable`] | ![No changes]         |


#### Constructors

| Status    | Modifiers | Generics | Constructor            | Annotations | Throws | Compatibility Changes |
|-----------|-----------|----------|------------------------|-------------|--------|-----------------------|
| Unchanged | `public`  |          | `TextNode`([`String`]) |             |        | ![No changes]         |


#### Methods

| Status    | Modifiers         | Generics | Type         | Method                          | Annotations | Throws | Compatibility Changes |
|-----------|-------------------|----------|--------------|---------------------------------|-------------|--------|-----------------------|
| Unchanged | `public`          |          | [`TextNode`] | `clone`()                       |             |        | ![No changes]         |
| Unchanged | `static` `public` |          | [`TextNode`] | `createFromEncoded`([`String`]) |             |        | ![No changes]         |
| Unchanged | `public`          |          | [`String`]   | `getWholeText`()                |             |        | ![No changes]         |
| Unchanged | `public`          |          | `boolean`    | `isBlank`()                     |             |        | ![No changes]         |
| Unchanged | `public`          |          | [`String`]   | `nodeName`()                    |             |        | ![No changes]         |
| Unchanged | `public`          |          | [`TextNode`] | `splitText`(`int`)              |             |        | ![No changes]         |
| Unchanged | `public`          |          | [`String`]   | `text`()                        |             |        | ![No changes]         |
| Unchanged | `public`          |          | [`TextNode`] | `text`([`String`])              |             |        | ![No changes]         |
| Unchanged | `public`          |          | [`String`]   | `toString`()                    |             |        | ![No changes]         |

___

<a id="user-content-org.jsoup.nodes.xmldeclaration"></a>
### `org.jsoup.nodes.XmlDeclaration`

- [X] Binary-compatible
- [X] Source-compatible
- [X] Serialization-compatible

| Status    | Modifiers | Type  | Name             | Extends      | JDK   | Serialization       | Compatibility Changes |
|-----------|-----------|-------|------------------|--------------|-------|---------------------|-----------------------|
| Unchanged | `public`  | Class | `XmlDeclaration` | [`LeafNode`] | JDK 8 | ![Not serializable] | ![No changes]         |


#### Implemented Interfaces

| Status    | Interface     | Compatibility Changes |
|-----------|---------------|-----------------------|
| Unchanged | [`Cloneable`] | ![No changes]         |


#### Constructors

| Status    | Modifiers | Generics | Constructor                             | Annotations | Throws | Compatibility Changes |
|-----------|-----------|----------|-----------------------------------------|-------------|--------|-----------------------|
| Unchanged | `public`  |          | `XmlDeclaration`([`String`], `boolean`) |             |        | ![No changes]         |


#### Methods

| Status    | Modifiers | Generics | Type               | Method                  | Annotations | Throws | Compatibility Changes |
|-----------|-----------|----------|--------------------|-------------------------|-------------|--------|-----------------------|
| Unchanged | `public`  |          | [`XmlDeclaration`] | `clone`()               |             |        | ![No changes]         |
| Unchanged | `public`  |          | [`String`]         | `getWholeDeclaration`() |             |        | ![No changes]         |
| Unchanged | `public`  |          | [`String`]         | `name`()                |             |        | ![No changes]         |
| Unchanged | `public`  |          | [`String`]         | `nodeName`()            |             |        | ![No changes]         |
| Unchanged | `public`  |          | [`String`]         | `toString`()            |             |        | ![No changes]         |

___

<a id="user-content-org.jsoup.parser.characterreader"></a>
### `org.jsoup.parser.CharacterReader`

- [X] Binary-compatible
- [X] Source-compatible
- [X] Serialization-compatible

| Status    | Modifiers        | Type  | Name              | Extends    | JDK   | Serialization       | Compatibility Changes |
|-----------|------------------|-------|-------------------|------------|-------|---------------------|-----------------------|
| Unchanged | `final` `public` | Class | `CharacterReader` | [`Object`] | JDK 8 | ![Not serializable] | ![No changes]         |


#### Constructors

| Status    | Modifiers | Generics | Constructor                          | Annotations | Throws | Compatibility Changes |
|-----------|-----------|----------|--------------------------------------|-------------|--------|-----------------------|
| Unchanged | `public`  |          | `CharacterReader`([`Reader`], `int`) |             |        | ![No changes]         |
| Unchanged | `public`  |          | `CharacterReader`([`String`])        |             |        | ![No changes]         |
| Unchanged | `public`  |          | `CharacterReader`([`Reader`])        |             |        | ![No changes]         |


#### Methods

| Status    | Modifiers | Generics | Type       | Method                     | Annotations | Throws | Compatibility Changes |
|-----------|-----------|----------|------------|----------------------------|-------------|--------|-----------------------|
| Unchanged | `public`  |          | `void`     | `advance`()                |             |        | ![No changes]         |
| Unchanged | `public`  |          | `void`     | `close`()                  |             |        | ![No changes]         |
| Unchanged | `public`  |          | `int`      | `columnNumber`()           |             |        | ![No changes]         |
| Unchanged | `public`  |          | [`String`] | `consumeTo`(`char`)        |             |        | ![No changes]         |
| Unchanged | `public`  |          | [`String`] | `consumeToAny`(`char...`)  |             |        | ![No changes]         |
| Unchanged | `public`  |          | `char`     | `current`()                |             |        | ![No changes]         |
| Unchanged | `public`  |          | `boolean`  | `isEmpty`()                |             |        | ![No changes]         |
| Unchanged | `public`  |          | `boolean`  | `isTrackNewlines`()        |             |        | ![No changes]         |
| Unchanged | `public`  |          | `int`      | `lineNumber`()             |             |        | ![No changes]         |
| Unchanged | `public`  |          | `int`      | `pos`()                    |             |        | ![No changes]         |
| Unchanged | `public`  |          | [`String`] | `toString`()               |             |        | ![No changes]         |
| Unchanged | `public`  |          | `void`     | `trackNewlines`(`boolean`) |             |        | ![No changes]         |

___

<a id="user-content-org.jsoup.parser.htmltreebuilder"></a>
### `org.jsoup.parser.HtmlTreeBuilder`

- [X] Binary-compatible
- [X] Source-compatible
- [X] Serialization-compatible

| Status    | Modifiers | Type  | Name              | Extends         | JDK   | Serialization       | Compatibility Changes |
|-----------|-----------|-------|-------------------|-----------------|-------|---------------------|-----------------------|
| Unchanged | `public`  | Class | `HtmlTreeBuilder` | [`TreeBuilder`] | JDK 8 | ![Not serializable] | ![No changes]         |


#### Constructors

| Status    | Modifiers | Generics | Constructor         | Annotations | Throws | Compatibility Changes |
|-----------|-----------|----------|---------------------|-------------|--------|-----------------------|
| Unchanged | `public`  |          | `HtmlTreeBuilder`() |             |        | ![No changes]         |


#### Methods

| Status    | Modifiers   | Generics | Type       | Method                                                | Annotations | Throws | Compatibility Changes |
|-----------|-------------|----------|------------|-------------------------------------------------------|-------------|--------|-----------------------|
| Unchanged | `protected` |          | `void`     | `initialiseParse`([`Reader`], [`String`], [`Parser`]) |             |        | ![No changes]         |
| Unchanged | `protected` |          | `boolean`  | `isContentForTagData`([`String`])                     |             |        | ![No changes]         |
| Unchanged | `protected` |          | `boolean`  | `process`([`Token`])                                  |             |        | ![No changes]         |
| Unchanged | `public`    |          | [`String`] | `toString`()                                          |             |        | ![No changes]         |


#### Fields

| Status    | Modifiers                 | Type  | Name                  | Annotations | Compatibility Changes |
|-----------|---------------------------|-------|-----------------------|-------------|-----------------------|
| Unchanged | `public` `static` `final` | `int` | `MaxScopeSearchDepth` |             | ![No changes]         |

___

<a id="user-content-org.jsoup.parser.parseerror"></a>
### `org.jsoup.parser.ParseError`

- [X] Binary-compatible
- [X] Source-compatible
- [X] Serialization-compatible

| Status    | Modifiers | Type  | Name         | Extends    | JDK   | Serialization       | Compatibility Changes |
|-----------|-----------|-------|--------------|------------|-------|---------------------|-----------------------|
| Unchanged | `public`  | Class | `ParseError` | [`Object`] | JDK 8 | ![Not serializable] | ![No changes]         |


#### Methods

| Status    | Modifiers | Generics | Type       | Method              | Annotations | Throws | Compatibility Changes |
|-----------|-----------|----------|------------|---------------------|-------------|--------|-----------------------|
| Unchanged | `public`  |          | [`String`] | `getCursorPos`()    |             |        | ![No changes]         |
| Unchanged | `public`  |          | [`String`] | `getErrorMessage`() |             |        | ![No changes]         |
| Unchanged | `public`  |          | `int`      | `getPosition`()     |             |        | ![No changes]         |
| Unchanged | `public`  |          | [`String`] | `toString`()        |             |        | ![No changes]         |

___

<a id="user-content-org.jsoup.parser.parseerrorlist"></a>
### `org.jsoup.parser.ParseErrorList`

- [X] Binary-compatible
- [X] Source-compatible
- [X] Serialization-compatible

| Status    | Modifiers | Type  | Name             | Extends          | JDK   | Serialization | Compatibility Changes |
|-----------|-----------|-------|------------------|------------------|-------|---------------|-----------------------|
| Unchanged | `public`  | Class | `ParseErrorList` | [`ArrayList<E>`] | JDK 8 | ![Compatible] | ![No changes]         |


#### Implemented Interfaces

| Status    | Interface                  | Compatibility Changes |
|-----------|----------------------------|-----------------------|
| Unchanged | [`Serializable`]           | ![No changes]         |
| Unchanged | [`Cloneable`]              | ![No changes]         |
| Unchanged | [`Iterable<T>`]            | ![No changes]         |
| Unchanged | [`Collection<E>`]          | ![No changes]         |
| Unchanged | [`List<E>`]                | ![No changes]         |
| Unchanged | [`RandomAccess`]           | ![No changes]         |
| Unchanged | [`SequencedCollection<E>`] | ![No changes]         |


#### Methods

| Status    | Modifiers         | Generics | Type               | Method            | Annotations | Throws | Compatibility Changes |
|-----------|-------------------|----------|--------------------|-------------------|-------------|--------|-----------------------|
| Unchanged | `public`          |          | [`Object`]         | `clone`()         |             |        | ![No changes]         |
| Unchanged | `static` `public` |          | [`ParseErrorList`] | `noTracking`()    |             |        | ![No changes]         |
| Unchanged | `static` `public` |          | [`ParseErrorList`] | `tracking`(`int`) |             |        | ![No changes]         |

___

<a id="user-content-org.jsoup.parser.parsesettings"></a>
### `org.jsoup.parser.ParseSettings`

- [X] Binary-compatible
- [X] Source-compatible
- [X] Serialization-compatible

| Status    | Modifiers | Type  | Name            | Extends    | JDK   | Serialization       | Compatibility Changes |
|-----------|-----------|-------|-----------------|------------|-------|---------------------|-----------------------|
| Unchanged | `public`  | Class | `ParseSettings` | [`Object`] | JDK 8 | ![Not serializable] | ![No changes]         |


#### Constructors

| Status    | Modifiers | Generics | Constructor                           | Annotations | Throws | Compatibility Changes |
|-----------|-----------|----------|---------------------------------------|-------------|--------|-----------------------|
| Unchanged | `public`  |          | `ParseSettings`(`boolean`, `boolean`) |             |        | ![No changes]         |


#### Methods

| Status    | Modifiers | Generics | Type       | Method                           | Annotations | Throws | Compatibility Changes |
|-----------|-----------|----------|------------|----------------------------------|-------------|--------|-----------------------|
| Unchanged | `public`  |          | [`String`] | `normalizeAttribute`([`String`]) |             |        | ![No changes]         |
| Unchanged | `public`  |          | [`String`] | `normalizeTag`([`String`])       |             |        | ![No changes]         |
| Unchanged | `public`  |          | `boolean`  | `preserveAttributeCase`()        |             |        | ![No changes]         |
| Unchanged | `public`  |          | `boolean`  | `preserveTagCase`()              |             |        | ![No changes]         |


#### Fields

| Status    | Modifiers                 | Type              | Name           | Annotations | Compatibility Changes |
|-----------|---------------------------|-------------------|----------------|-------------|-----------------------|
| Unchanged | `public` `static` `final` | [`ParseSettings`] | `htmlDefault`  |             | ![No changes]         |
| Unchanged | `public` `static` `final` | [`ParseSettings`] | `preserveCase` |             | ![No changes]         |

___

<a id="user-content-org.jsoup.parser.parser"></a>
### `org.jsoup.parser.Parser`

- [X] Binary-compatible
- [X] Source-compatible
- [X] Serialization-compatible

| Status    | Modifiers | Type  | Name     | Extends    | JDK   | Serialization       | Compatibility Changes |
|-----------|-----------|-------|----------|------------|-------|---------------------|-----------------------|
| Unchanged | `public`  | Class | `Parser` | [`Object`] | JDK 8 | ![Not serializable] | ![No changes]         |


#### Constructors

| Status    | Modifiers | Generics | Constructor               | Annotations | Throws | Compatibility Changes |
|-----------|-----------|----------|---------------------------|-------------|--------|-----------------------|
| Unchanged | `public`  |          | `Parser`([`TreeBuilder`]) |             |        | ![No changes]         |


#### Methods

| Status    | Modifiers         | Generics | Type               | Method                                                    | Annotations | Throws | Compatibility Changes |
|-----------|-------------------|----------|--------------------|-----------------------------------------------------------|-------------|--------|-----------------------|
| Unchanged | `public`          |          | [`String`]         | `defaultNamespace`()                                      |             |        | ![No changes]         |
| Unchanged | `public`          |          | [`ParseErrorList`] | `getErrors`()                                             |             |        | ![No changes]         |
| Unchanged | `public`          |          | [`TreeBuilder`]    | `getTreeBuilder`()                                        |             |        | ![No changes]         |
| Unchanged | `static` `public` |          | [`Parser`]         | `htmlParser`()                                            |             |        | ![No changes]         |
| Unchanged | `public`          |          | `boolean`          | `isContentForTagData`([`String`])                         |             |        | ![No changes]         |
| Unchanged | `public`          |          | `boolean`          | `isTrackErrors`()                                         |             |        | ![No changes]         |
| Unchanged | `public`          |          | `boolean`          | `isTrackPosition`()                                       |             |        | ![No changes]         |
| Unchanged | `public`          |          | [`Parser`]         | `newInstance`()                                           |             |        | ![No changes]         |
| Unchanged | `static` `public` |          | [`Document`]       | `parse`([`String`], [`String`])                           |             |        | ![No changes]         |
| Unchanged | `static` `public` |          | [`Document`]       | `parseBodyFragment`([`String`], [`String`])               |             |        | ![No changes]         |
| Unchanged | `static` `public` |          | [`List<Node>`]     | `parseFragment`([`String`], [`Element`], [`String`])      |             |        | ![No changes]         |
| Unchanged | `static` `public` |          | [`List<Node>`]     | `parseFragment`([`String`], [`Element`], [`String`], [`ParseErrorList`]) |  |    | ![No changes]         |
| Unchanged | `public`          |          | [`List<Node>`]     | `parseFragmentInput`([`String`], [`Element`], [`String`]) |             |        | ![No changes]         |
| Unchanged | `public`          |          | [`Document`]       | `parseInput`([`String`], [`String`])                      |             |        | ![No changes]         |
| Unchanged | `public`          |          | [`Document`]       | `parseInput`([`Reader`], [`String`])                      |             |        | ![No changes]         |
| Unchanged | `static` `public` |          | [`List<Node>`]     | `parseXmlFragment`([`String`], [`String`])                |             |        | ![No changes]         |
| Unchanged | `public`          |          | [`Parser`]         | `setTrackErrors`(`int`)                                   |             |        | ![No changes]         |
| Unchanged | `public`          |          | [`Parser`]         | `setTrackPosition`(`boolean`)                             |             |        | ![No changes]         |
| Unchanged | `public`          |          | [`Parser`]         | `setTreeBuilder`([`TreeBuilder`])                         |             |        | ![No changes]         |
| Unchanged | `public`          |          | [`Parser`]         | `settings`([`ParseSettings`])                             |             |        | ![No changes]         |
| Unchanged | `public`          |          | [`ParseSettings`]  | `settings`()                                              |             |        | ![No changes]         |
| Unchanged | `static` `public` |          | [`String`]         | `unescapeEntities`([`String`], `boolean`)                 |             |        | ![No changes]         |
| Unchanged | `static` `public` |          | [`Parser`]         | `xmlParser`()                                             |             |        | ![No changes]         |


#### Fields

| Status    | Modifiers                 | Type       | Name              | Annotations | Compatibility Changes |
|-----------|---------------------------|------------|-------------------|-------------|-----------------------|
| Unchanged | `public` `static` `final` | [`String`] | `NamespaceHtml`   |             | ![No changes]         |
| Unchanged | `public` `static` `final` | [`String`] | `NamespaceMathml` |             | ![No changes]         |
| Unchanged | `public` `static` `final` | [`String`] | `NamespaceSvg`    |             | ![No changes]         |
| Unchanged | `public` `static` `final` | [`String`] | `NamespaceXml`    |             | ![No changes]         |

___

<a id="user-content-org.jsoup.parser.streamparser"></a>
### `org.jsoup.parser.StreamParser`

- [X] Binary-compatible
- [X] Source-compatible
- [X] Serialization-compatible

| Status    | Modifiers | Type  | Name           | Extends    | JDK   | Serialization       | Compatibility Changes |
|-----------|-----------|-------|----------------|------------|-------|---------------------|-----------------------|
| Unchanged | `public`  | Class | `StreamParser` | [`Object`] | JDK 8 | ![Not serializable] | ![No changes]         |


#### Implemented Interfaces

| Status    | Interface         | Compatibility Changes |
|-----------|-------------------|-----------------------|
| Unchanged | [`Closeable`]     | ![No changes]         |
| Unchanged | [`AutoCloseable`] | ![No changes]         |


#### Constructors

| Status    | Modifiers | Generics | Constructor                | Annotations | Throws | Compatibility Changes |
|-----------|-----------|----------|----------------------------|-------------|--------|-----------------------|
| Unchanged | `public`  |          | `StreamParser`([`Parser`]) |             |        | ![No changes]         |


#### Methods

| Status    | Modifiers | Generics | Type                  | Method                                               | Annotations | Throws          | Compatibility Changes |
|-----------|-----------|----------|-----------------------|------------------------------------------------------|-------------|-----------------|-----------------------|
| Unchanged | `public`  |          | `void`                | `close`()                                            |             |                 | ![No changes]         |
| Unchanged | `public`  |          | [`Document`]          | `complete`()                                         |             | [`IOException`] | ![No changes]         |
| Unchanged | `public`  |          | [`List<Node>`]        | `completeFragment`()                                 |             | [`IOException`] | ![No changes]         |
| Unchanged | `public`  |          | [`Document`]          | `document`()                                         |             |                 | ![No changes]         |
| Unchanged | `public`  |          | [`Element`]           | `expectFirst`([`String`])                            |             | [`IOException`] | ![No changes]         |
| Unchanged | `public`  |          | [`Element`]           | `expectNext`([`String`])                             |             | [`IOException`] | ![No changes]         |
| Unchanged | `public`  |          | [`Iterator<Element>`] | `iterator`()                                         |             |                 | ![No changes]         |
| Unchanged | `public`  |          | [`StreamParser`]      | `parse`([`Reader`], [`String`])                      |             |                 | ![No changes]         |
| Unchanged | `public`  |          | [`StreamParser`]      | `parse`([`String`], [`String`])                      |             |                 | ![No changes]         |
| Unchanged | `public`  |          | [`StreamParser`]      | `parseFragment`([`Reader`], [`Element`], [`String`]) |             |                 | ![No changes]         |
| Unchanged | `public`  |          | [`StreamParser`]      | `parseFragment`([`String`], [`Element`], [`String`]) |             |                 | ![No changes]         |
| Unchanged | `public`  |          | [`Element`]           | `selectFirst`([`String`])                            |             | [`IOException`] | ![No changes]         |
| Unchanged | `public`  |          | [`Element`]           | `selectFirst`([`Evaluator`])                         |             | [`IOException`] | ![No changes]         |
| Unchanged | `public`  |          | [`Element`]           | `selectNext`([`String`])                             |             | [`IOException`] | ![No changes]         |
| Unchanged | `public`  |          | [`Element`]           | `selectNext`([`Evaluator`])                          |             | [`IOException`] | ![No changes]         |
| Unchanged | `public`  |          | [`StreamParser`]      | `stop`()                                             |             |                 | ![No changes]         |
| Unchanged | `public`  |          | [`Stream<Element>`]   | `stream`()                                           |             |                 | ![No changes]         |

___

<a id="user-content-org.jsoup.parser.tag"></a>
### `org.jsoup.parser.Tag`

- [X] Binary-compatible
- [X] Source-compatible
- [X] Serialization-compatible

| Status    | Modifiers | Type  | Name  | Extends    | JDK   | Serialization       | Compatibility Changes |
|-----------|-----------|-------|-------|------------|-------|---------------------|-----------------------|
| Unchanged | `public`  | Class | `Tag` | [`Object`] | JDK 8 | ![Not serializable] | ![No changes]         |


#### Implemented Interfaces

| Status    | Interface     | Compatibility Changes |
|-----------|---------------|-----------------------|
| Unchanged | [`Cloneable`] | ![No changes]         |


#### Methods

| Status    | Modifiers         | Generics | Type       | Method                                               | Annotations | Throws | Compatibility Changes |
|-----------|-------------------|----------|------------|------------------------------------------------------|-------------|--------|-----------------------|
| Unchanged | `protected`       |          | [`Tag`]    | `clone`()                                            |             |        | ![No changes]         |
| Unchanged | `public`          |          | `boolean`  | `equals`([`Object`])                                 |             |        | ![No changes]         |
| Unchanged | `public`          |          | `boolean`  | `formatAsBlock`()                                    |             |        | ![No changes]         |
| Unchanged | `public`          |          | [`String`] | `getName`()                                          |             |        | ![No changes]         |
| Unchanged | `public`          |          | `int`      | `hashCode`()                                         |             |        | ![No changes]         |
| Unchanged | `public`          |          | `boolean`  | `isBlock`()                                          |             |        | ![No changes]         |
| Unchanged | `public`          |          | `boolean`  | `isEmpty`()                                          |             |        | ![No changes]         |
| Unchanged | `public`          |          | `boolean`  | `isFormListed`()                                     |             |        | ![No changes]         |
| Unchanged | `public`          |          | `boolean`  | `isFormSubmittable`()                                |             |        | ![No changes]         |
| Unchanged | `public`          |          | `boolean`  | `isInline`()                                         |             |        | ![No changes]         |
| Unchanged | `public`          |          | `boolean`  | `isKnownTag`()                                       |             |        | ![No changes]         |
| Unchanged | `static` `public` |          | `boolean`  | `isKnownTag`([`String`])                             |             |        | ![No changes]         |
| Unchanged | `public`          |          | `boolean`  | `isSelfClosing`()                                    |             |        | ![No changes]         |
| Unchanged | `public`          |          | [`String`] | `namespace`()                                        |             |        | ![No changes]         |
| Unchanged | `public`          |          | [`String`] | `normalName`()                                       |             |        | ![No changes]         |
| Unchanged | `public`          |          | `boolean`  | `preserveWhitespace`()                               |             |        | ![No changes]         |
| Unchanged | `public`          |          | [`String`] | `toString`()                                         |             |        | ![No changes]         |
| Unchanged | `static` `public` |          | [`Tag`]    | `valueOf`([`String`], [`String`], [`ParseSettings`]) |             |        | ![No changes]         |
| Unchanged | `static` `public` |          | [`Tag`]    | `valueOf`([`String`])                                |             |        | ![No changes]         |
| Unchanged | `static` `public` |          | [`Tag`]    | `valueOf`([`String`], [`ParseSettings`])             |             |        | ![No changes]         |

___

<a id="user-content-org.jsoup.parser.token$tokentype"></a>
### `org.jsoup.parser.Token$TokenType`

- [X] Binary-compatible
- [X] Source-compatible
- [X] Serialization-compatible

| Status    | Modifiers                 | Type | Name        | Extends     | JDK   | Serialization | Compatibility Changes |
|-----------|---------------------------|------|-------------|-------------|-------|---------------|-----------------------|
| Unchanged | `final` `static` `public` | Enum | `TokenType` | [`Enum<E>`] | JDK 8 | ![Compatible] | ![No changes]         |


#### Implemented Interfaces

| Status    | Interface         | Compatibility Changes |
|-----------|-------------------|-----------------------|
| Unchanged | [`Serializable`]  | ![No changes]         |
| Unchanged | [`Comparable<T>`] | ![No changes]         |
| Unchanged | [`Constable`]     | ![No changes]         |


#### Methods

| Status    | Modifiers         | Generics | Type                | Method                | Annotations | Throws | Compatibility Changes |
|-----------|-------------------|----------|---------------------|-----------------------|-------------|--------|-----------------------|
| Unchanged | `static` `public` |          | [`TokenType`]       | `valueOf`([`String`]) |             |        | ![No changes]         |
| Unchanged | `static` `public` |          | [`TokenType[]`][15] | `values`()            |             |        | ![No changes]         |


#### Fields

| Status    | Modifiers                 | Type          | Name        | Annotations | Compatibility Changes |
|-----------|---------------------------|---------------|-------------|-------------|-----------------------|
| Unchanged | `public` `static` `final` | [`TokenType`] | `Character` |             | ![No changes]         |
| Unchanged | `public` `static` `final` | [`TokenType`] | `Comment`   |             | ![No changes]         |
| Unchanged | `public` `static` `final` | [`TokenType`] | `Doctype`   |             | ![No changes]         |
| Unchanged | `public` `static` `final` | [`TokenType`] | `EOF`       |             | ![No changes]         |
| Unchanged | `public` `static` `final` | [`TokenType`] | `EndTag`    |             | ![No changes]         |
| Unchanged | `public` `static` `final` | [`TokenType`] | `StartTag`  |             | ![No changes]         |

___

<a id="user-content-org.jsoup.parser.tokenqueue"></a>
### `org.jsoup.parser.TokenQueue`

- [X] Binary-compatible
- [X] Source-compatible
- [X] Serialization-compatible

| Status    | Modifiers | Type  | Name         | Extends    | JDK   | Serialization       | Compatibility Changes |
|-----------|-----------|-------|--------------|------------|-------|---------------------|-----------------------|
| Unchanged | `public`  | Class | `TokenQueue` | [`Object`] | JDK 8 | ![Not serializable] | ![No changes]         |


#### Constructors

| Status    | Modifiers | Generics | Constructor              | Annotations | Throws | Compatibility Changes |
|-----------|-----------|----------|--------------------------|-------------|--------|-----------------------|
| Unchanged | `public`  |          | `TokenQueue`([`String`]) |             |        | ![No changes]         |


#### Methods

| Status    | Modifiers         | Generics | Type       | Method                            | Annotations | Throws | Compatibility Changes |
|-----------|-------------------|----------|------------|-----------------------------------|-------------|--------|-----------------------|
| Unchanged | `public`          |          | `void`     | `addFirst`([`String`])            |             |        | ![No changes]         |
| Unchanged | `public`          |          | `void`     | `advance`()                       |             |        | ![No changes]         |
| Unchanged | `public`          |          | [`String`] | `chompBalanced`(`char`, `char`)   |             |        | ![No changes]         |
| Unchanged | `public`          |          | [`String`] | `chompTo`([`String`])             |             |        | ![No changes]         |
| Unchanged | `public`          |          | [`String`] | `chompToIgnoreCase`([`String`])   |             |        | ![No changes]         |
| Unchanged | `public`          |          | `char`     | `consume`()                       |             |        | ![No changes]         |
| Unchanged | `public`          |          | `void`     | `consume`([`String`])             |             |        | ![No changes]         |
| Unchanged | `public`          |          | [`String`] | `consumeCssIdentifier`()          |             |        | ![No changes]         |
| Unchanged | `public`          |          | [`String`] | `consumeElementSelector`()        |             |        | ![No changes]         |
| Unchanged | `public`          |          | [`String`] | `consumeTo`([`String`])           |             |        | ![No changes]         |
| Unchanged | `public`          |          | [`String`] | `consumeToAny`([`String...`])     |             |        | ![No changes]         |
| Unchanged | `public`          |          | [`String`] | `consumeToIgnoreCase`([`String`]) |             |        | ![No changes]         |
| Unchanged | `public`          |          | `boolean`  | `consumeWhitespace`()             |             |        | ![No changes]         |
| Unchanged | `public`          |          | [`String`] | `consumeWord`()                   |             |        | ![No changes]         |
| Unchanged | `static` `public` |          | [`String`] | `escapeCssIdentifier`([`String`]) |             |        | ![No changes]         |
| Unchanged | `public`          |          | `boolean`  | `isEmpty`()                       |             |        | ![No changes]         |
| Unchanged | `public`          |          | `boolean`  | `matchChomp`([`String`])          |             |        | ![No changes]         |
| Unchanged | `public`          |          | `boolean`  | `matches`([`String`])             |             |        | ![No changes]         |
| Unchanged | `public`          |          | `boolean`  | `matchesAny`([`String...`])       |             |        | ![No changes]         |
| Unchanged | `public`          |          | `boolean`  | `matchesAny`(`char...`)           |             |        | ![No changes]         |
| Unchanged | `public`          |          | `boolean`  | `matchesWhitespace`()             |             |        | ![No changes]         |
| Unchanged | `public`          |          | `boolean`  | `matchesWord`()                   |             |        | ![No changes]         |
| Unchanged | `public`          |          | [`String`] | `remainder`()                     |             |        | ![No changes]         |
| Unchanged | `public`          |          | [`String`] | `toString`()                      |             |        | ![No changes]         |
| Unchanged | `static` `public` |          | [`String`] | `unescape`([`String`])            |             |        | ![No changes]         |

___

<a id="user-content-org.jsoup.parser.xmltreebuilder"></a>
### `org.jsoup.parser.XmlTreeBuilder`

- [X] Binary-compatible
- [X] Source-compatible
- [X] Serialization-compatible

| Status    | Modifiers | Type  | Name             | Extends         | JDK   | Serialization       | Compatibility Changes |
|-----------|-----------|-------|------------------|-----------------|-------|---------------------|-----------------------|
| Unchanged | `public`  | Class | `XmlTreeBuilder` | [`TreeBuilder`] | JDK 8 | ![Not serializable] | ![No changes]         |


#### Constructors

| Status    | Modifiers | Generics | Constructor        | Annotations | Throws | Compatibility Changes |
|-----------|-----------|----------|--------------------|-------------|--------|-----------------------|
| Unchanged | `public`  |          | `XmlTreeBuilder`() |             |        | ![No changes]         |


#### Methods

| Status    | Modifiers   | Generics | Type       | Method                                                | Annotations | Throws | Compatibility Changes |
|-----------|-------------|----------|------------|-------------------------------------------------------|-------------|--------|-----------------------|
| Unchanged | `public`    |          | [`String`] | `defaultNamespace`()                                  |             |        | ![No changes]         |
| Unchanged | `protected` |          | `void`     | `initialiseParse`([`Reader`], [`String`], [`Parser`]) |             |        | ![No changes]         |
| Unchanged | `protected` |          | `void`     | `popStackToClose`([`EndTag`])                         |             |        | ![No changes]         |
| Unchanged | `protected` |          | `boolean`  | `process`([`Token`])                                  |             |        | ![No changes]         |

___

<a id="user-content-org.jsoup.safety.cleaner"></a>
### `org.jsoup.safety.Cleaner`

- [X] Binary-compatible
- [X] Source-compatible
- [X] Serialization-compatible

| Status    | Modifiers | Type  | Name      | Extends    | JDK   | Serialization       | Compatibility Changes |
|-----------|-----------|-------|-----------|------------|-------|---------------------|-----------------------|
| Unchanged | `public`  | Class | `Cleaner` | [`Object`] | JDK 8 | ![Not serializable] | ![No changes]         |


#### Constructors

| Status    | Modifiers | Generics | Constructor             | Annotations | Throws | Compatibility Changes |
|-----------|-----------|----------|-------------------------|-------------|--------|-----------------------|
| Unchanged | `public`  |          | `Cleaner`([`Safelist`]) |             |        | ![No changes]         |


#### Methods

| Status    | Modifiers | Generics | Type         | Method                        | Annotations | Throws | Compatibility Changes |
|-----------|-----------|----------|--------------|-------------------------------|-------------|--------|-----------------------|
| Unchanged | `public`  |          | [`Document`] | `clean`([`Document`])         |             |        | ![No changes]         |
| Unchanged | `public`  |          | `boolean`    | `isValid`([`Document`])       |             |        | ![No changes]         |
| Unchanged | `public`  |          | `boolean`    | `isValidBodyHtml`([`String`]) |             |        | ![No changes]         |

___

<a id="user-content-org.jsoup.safety.safelist"></a>
### `org.jsoup.safety.Safelist`

- [X] Binary-compatible
- [X] Source-compatible
- [X] Serialization-compatible

| Status    | Modifiers | Type  | Name       | Extends    | JDK   | Serialization       | Compatibility Changes |
|-----------|-----------|-------|------------|------------|-------|---------------------|-----------------------|
| Unchanged | `public`  | Class | `Safelist` | [`Object`] | JDK 8 | ![Not serializable] | ![No changes]         |


#### Constructors

| Status    | Modifiers | Generics | Constructor              | Annotations | Throws | Compatibility Changes |
|-----------|-----------|----------|--------------------------|-------------|--------|-----------------------|
| Unchanged | `public`  |          | `Safelist`()             |             |        | ![No changes]         |
| Unchanged | `public`  |          | `Safelist`([`Safelist`]) |             |        | ![No changes]         |


#### Methods

| Status    | Modifiers         | Generics | Type           | Method                                                     | Annotations | Throws | Compatibility Changes |
|-----------|-------------------|----------|----------------|------------------------------------------------------------|-------------|--------|-----------------------|
| Unchanged | `public`          |          | [`Safelist`]   | `addAttributes`([`String`], [`String...`])                 |             |        | ![No changes]         |
| Unchanged | `public`          |          | [`Safelist`]   | `addEnforcedAttribute`([`String`], [`String`], [`String`]) |             |        | ![No changes]         |
| Unchanged | `public`          |          | [`Safelist`]   | `addProtocols`([`String`], [`String`], [`String...`])      |             |        | ![No changes]         |
| Unchanged | `public`          |          | [`Safelist`]   | `addTags`([`String...`])                                   |             |        | ![No changes]         |
| Unchanged | `static` `public` |          | [`Safelist`]   | `basic`()                                                  |             |        | ![No changes]         |
| Unchanged | `static` `public` |          | [`Safelist`]   | `basicWithImages`()                                        |             |        | ![No changes]         |
| Unchanged | `public`          |          | [`Attributes`] | `getEnforcedAttributes`([`String`])                        |             |        | ![No changes]         |
| Unchanged | `public`          |          | `boolean`      | `isSafeAttribute`([`String`], [`Element`], [`Attribute`])  |             |        | ![No changes]         |
| Unchanged | `public`          |          | `boolean`      | `isSafeTag`([`String`])                                    |             |        | ![No changes]         |
| Unchanged | `static` `public` |          | [`Safelist`]   | `none`()                                                   |             |        | ![No changes]         |
| Unchanged | `public`          |          | [`Safelist`]   | `preserveRelativeLinks`(`boolean`)                         |             |        | ![No changes]         |
| Unchanged | `static` `public` |          | [`Safelist`]   | `relaxed`()                                                |             |        | ![No changes]         |
| Unchanged | `public`          |          | [`Safelist`]   | `removeAttributes`([`String`], [`String...`])              |             |        | ![No changes]         |
| Unchanged | `public`          |          | [`Safelist`]   | `removeEnforcedAttribute`([`String`], [`String`])          |             |        | ![No changes]         |
| Unchanged | `public`          |          | [`Safelist`]   | `removeProtocols`([`String`], [`String`], [`String...`])   |             |        | ![No changes]         |
| Unchanged | `public`          |          | [`Safelist`]   | `removeTags`([`String...`])                                |             |        | ![No changes]         |
| Unchanged | `static` `public` |          | [`Safelist`]   | `simpleText`()                                             |             |        | ![No changes]         |

___

<a id="user-content-org.jsoup.select.collector"></a>
### `org.jsoup.select.Collector`

- [X] Binary-compatible
- [X] Source-compatible
- [X] Serialization-compatible

| Status    | Modifiers | Type  | Name        | Extends    | JDK   | Serialization       | Compatibility Changes |
|-----------|-----------|-------|-------------|------------|-------|---------------------|-----------------------|
| Unchanged | `public`  | Class | `Collector` | [`Object`] | JDK 8 | ![Not serializable] | ![No changes]         |


#### Methods

| Status    | Modifiers         | Generics | Type         | Method                                  | Annotations | Throws | Compatibility Changes |
|-----------|-------------------|----------|--------------|-----------------------------------------|-------------|--------|-----------------------|
| Unchanged | `static` `public` |          | [`Elements`] | `collect`([`Evaluator`], [`Element`])   |             |        | ![No changes]         |
| Unchanged | `static` `public` |          | [`Element`]  | `findFirst`([`Evaluator`], [`Element`]) |             |        | ![No changes]         |

___

<a id="user-content-org.jsoup.select.combiningevaluator"></a>
### `org.jsoup.select.CombiningEvaluator`

- [X] Binary-compatible
- [X] Source-compatible
- [X] Serialization-compatible

| Status    | Modifiers           | Type  | Name                 | Extends       | JDK   | Serialization       | Compatibility Changes |
|-----------|---------------------|-------|----------------------|---------------|-------|---------------------|-----------------------|
| Unchanged | `public` `abstract` | Class | `CombiningEvaluator` | [`Evaluator`] | JDK 8 | ![Not serializable] | ![No changes]         |


#### Methods

| Status    | Modifiers   | Generics | Type   | Method    | Annotations | Throws | Compatibility Changes |
|-----------|-------------|----------|--------|-----------|-------------|--------|-----------------------|
| Unchanged | `protected` |          | `int`  | `cost`()  |             |        | ![No changes]         |
| Unchanged | `protected` |          | `void` | `reset`() |             |        | ![No changes]         |

___

<a id="user-content-org.jsoup.select.combiningevaluator$and"></a>
### `org.jsoup.select.CombiningEvaluator$And`

- [X] Binary-compatible
- [X] Source-compatible
- [X] Serialization-compatible

| Status    | Modifiers                 | Type  | Name  | Extends                | JDK   | Serialization       | Compatibility Changes |
|-----------|---------------------------|-------|-------|------------------------|-------|---------------------|-----------------------|
| Unchanged | `final` `static` `public` | Class | `And` | [`CombiningEvaluator`] | JDK 8 | ![Not serializable] | ![No changes]         |


#### Methods

| Status    | Modifiers | Generics | Type       | Method                              | Annotations | Throws | Compatibility Changes |
|-----------|-----------|----------|------------|-------------------------------------|-------------|--------|-----------------------|
| Unchanged | `public`  |          | `boolean`  | `matches`([`Element`], [`Element`]) |             |        | ![No changes]         |
| Unchanged | `public`  |          | [`String`] | `toString`()                        |             |        | ![No changes]         |

___

<a id="user-content-org.jsoup.select.combiningevaluator$or"></a>
### `org.jsoup.select.CombiningEvaluator$Or`

- [X] Binary-compatible
- [X] Source-compatible
- [X] Serialization-compatible

| Status    | Modifiers                 | Type  | Name | Extends                | JDK   | Serialization       | Compatibility Changes |
|-----------|---------------------------|-------|------|------------------------|-------|---------------------|-----------------------|
| Unchanged | `final` `static` `public` | Class | `Or` | [`CombiningEvaluator`] | JDK 8 | ![Not serializable] | ![No changes]         |


#### Methods

| Status    | Modifiers | Generics | Type       | Method                              | Annotations | Throws | Compatibility Changes |
|-----------|-----------|----------|------------|-------------------------------------|-------------|--------|-----------------------|
| Unchanged | `public`  |          | `void`     | `add`([`Evaluator`])                |             |        | ![No changes]         |
| Unchanged | `public`  |          | `boolean`  | `matches`([`Element`], [`Element`]) |             |        | ![No changes]         |
| Unchanged | `public`  |          | [`String`] | `toString`()                        |             |        | ![No changes]         |

___

<a id="user-content-org.jsoup.select.elements"></a>
### `org.jsoup.select.Elements`

- [X] Binary-compatible
- [X] Source-compatible
- [X] Serialization-compatible

| Status    | Modifiers | Type  | Name       | Extends          | JDK   | Serialization | Compatibility Changes |
|-----------|-----------|-------|------------|------------------|-------|---------------|-----------------------|
| Unchanged | `public`  | Class | `Elements` | [`ArrayList<E>`] | JDK 8 | ![Compatible] | ![No changes]         |


#### Implemented Interfaces

| Status    | Interface                  | Compatibility Changes |
|-----------|----------------------------|-----------------------|
| Unchanged | [`Serializable`]           | ![No changes]         |
| Unchanged | [`Cloneable`]              | ![No changes]         |
| Unchanged | [`Iterable<T>`]            | ![No changes]         |
| Unchanged | [`Collection<E>`]          | ![No changes]         |
| Unchanged | [`List<E>`]                | ![No changes]         |
| Unchanged | [`RandomAccess`]           | ![No changes]         |
| Unchanged | [`SequencedCollection<E>`] | ![No changes]         |


#### Constructors

| Status    | Modifiers | Generics | Constructor                         | Annotations | Throws | Compatibility Changes |
|-----------|-----------|----------|-------------------------------------|-------------|--------|-----------------------|
| Unchanged | `public`  |          | `Elements`()                        |             |        | ![No changes]         |
| Unchanged | `public`  |          | `Elements`([`List<Element>`])       |             |        | ![No changes]         |
| Unchanged | `public`  |          | `Elements`(`int`)                   |             |        | ![No changes]         |
| Unchanged | `public`  |          | `Elements`([`Collection<Element>`]) |             |        | ![No changes]         |
| Unchanged | `public`  |          | `Elements`([`Element...`])          |             |        | ![No changes]         |


#### Methods

| Status    | Modifiers | Generics | Type                  | Method                                     | Annotations | Throws | Compatibility Changes |
|-----------|-----------|----------|-----------------------|--------------------------------------------|-------------|--------|-----------------------|
| Unchanged | `public`  |          | [`Elements`]          | `addClass`([`String`])                     |             |        | ![No changes]         |
| Unchanged | `public`  |          | [`Elements`]          | `after`([`String`])                        |             |        | ![No changes]         |
| Unchanged | `public`  |          | [`Elements`]          | `append`([`String`])                       |             |        | ![No changes]         |
| Unchanged | `public`  |          | [`String`]            | `attr`([`String`])                         |             |        | ![No changes]         |
| Unchanged | `public`  |          | [`Elements`]          | `attr`([`String`], [`String`])             |             |        | ![No changes]         |
| Unchanged | `public`  |          | [`Elements`]          | `before`([`String`])                       |             |        | ![No changes]         |
| Unchanged | `public`  |          | `void`                | `clear`()                                  |             |        | ![No changes]         |
| Unchanged | `public`  |          | [`Elements`]          | `clone`()                                  |             |        | ![No changes]         |
| Unchanged | `public`  |          | [`List<Comment>`]     | `comments`()                               |             |        | ![No changes]         |
| Unchanged | `public`  |          | [`List<DataNode>`]    | `dataNodes`()                              |             |        | ![No changes]         |
| Unchanged | `public`  |          | [`List<String>`]      | `eachAttr`([`String`])                     |             |        | ![No changes]         |
| Unchanged | `public`  |          | [`List<String>`]      | `eachText`()                               |             |        | ![No changes]         |
| Unchanged | `public`  |          | [`Elements`]          | `empty`()                                  |             |        | ![No changes]         |
| Unchanged | `public`  |          | [`Elements`]          | `eq`(`int`)                                |             |        | ![No changes]         |
| Unchanged | `public`  |          | [`Elements`]          | `filter`([`NodeFilter`])                   |             |        | ![No changes]         |
| Unchanged | `public`  |          | [`Element`]           | `first`()                                  |             |        | ![No changes]         |
| Unchanged | `public`  |          | [`List<FormElement>`] | `forms`()                                  |             |        | ![No changes]         |
| Unchanged | `public`  |          | `boolean`             | `hasAttr`([`String`])                      |             |        | ![No changes]         |
| Unchanged | `public`  |          | `boolean`             | `hasClass`([`String`])                     |             |        | ![No changes]         |
| Unchanged | `public`  |          | `boolean`             | `hasText`()                                |             |        | ![No changes]         |
| Unchanged | `public`  |          | [`String`]            | `html`()                                   |             |        | ![No changes]         |
| Unchanged | `public`  |          | [`Elements`]          | `html`([`String`])                         |             |        | ![No changes]         |
| Unchanged | `public`  |          | `boolean`             | `is`([`String`])                           |             |        | ![No changes]         |
| Unchanged | `public`  |          | [`Element`]           | `last`()                                   |             |        | ![No changes]         |
| Unchanged | `public`  |          | [`Elements`]          | `next`()                                   |             |        | ![No changes]         |
| Unchanged | `public`  |          | [`Elements`]          | `next`([`String`])                         |             |        | ![No changes]         |
| Unchanged | `public`  |          | [`Elements`]          | `nextAll`()                                |             |        | ![No changes]         |
| Unchanged | `public`  |          | [`Elements`]          | `nextAll`([`String`])                      |             |        | ![No changes]         |
| Unchanged | `public`  |          | [`Elements`]          | `not`([`String`])                          |             |        | ![No changes]         |
| Unchanged | `public`  |          | [`String`]            | `outerHtml`()                              |             |        | ![No changes]         |
| Unchanged | `public`  |          | [`Elements`]          | `parents`()                                |             |        | ![No changes]         |
| Unchanged | `public`  |          | [`Elements`]          | `prepend`([`String`])                      |             |        | ![No changes]         |
| Unchanged | `public`  |          | [`Elements`]          | `prev`()                                   |             |        | ![No changes]         |
| Unchanged | `public`  |          | [`Elements`]          | `prev`([`String`])                         |             |        | ![No changes]         |
| Unchanged | `public`  |          | [`Elements`]          | `prevAll`()                                |             |        | ![No changes]         |
| Unchanged | `public`  |          | [`Elements`]          | `prevAll`([`String`])                      |             |        | ![No changes]         |
| Unchanged | `public`  |          | [`Elements`]          | `remove`()                                 |             |        | ![No changes]         |
| Unchanged | `public`  |          | [`Element`]           | `remove`(`int`)                            |             |        | ![No changes]         |
| Unchanged | `public`  |          | `boolean`             | `remove`([`Object`])                       |             |        | ![No changes]         |
| Unchanged | `public`  |          | `boolean`             | `removeAll`([`Collection<?>`])             |             |        | ![No changes]         |
| Unchanged | `public`  |          | [`Elements`]          | `removeAttr`([`String`])                   |             |        | ![No changes]         |
| Unchanged | `public`  |          | [`Elements`]          | `removeClass`([`String`])                  |             |        | ![No changes]         |
| Unchanged | `public`  |          | `boolean`             | `removeIf`([`Predicate<? super Element>`]) |             |        | ![No changes]         |
| Unchanged | `public`  |          | `void`                | `replaceAll`([`UnaryOperator<Element>`])   |             |        | ![No changes]         |
| Unchanged | `public`  |          | `boolean`             | `retainAll`([`Collection<?>`])             |             |        | ![No changes]         |
| Unchanged | `public`  |          | [`Elements`]          | `select`([`String`])                       |             |        | ![No changes]         |
| Unchanged | `public`  |          | [`Element`]           | `set`(`int`, [`Element`])                  |             |        | ![No changes]         |
| Unchanged | `public`  |          | [`Elements`]          | `tagName`([`String`])                      |             |        | ![No changes]         |
| Unchanged | `public`  |          | [`String`]            | `text`()                                   |             |        | ![No changes]         |
| Unchanged | `public`  |          | [`List<TextNode>`]    | `textNodes`()                              |             |        | ![No changes]         |
| Unchanged | `public`  |          | [`String`]            | `toString`()                               |             |        | ![No changes]         |
| Unchanged | `public`  |          | [`Elements`]          | `toggleClass`([`String`])                  |             |        | ![No changes]         |
| Unchanged | `public`  |          | [`Elements`]          | `traverse`([`NodeVisitor`])                |             |        | ![No changes]         |
| Unchanged | `public`  |          | [`Elements`]          | `unwrap`()                                 |             |        | ![No changes]         |
| Unchanged | `public`  |          | [`String`]            | `val`()                                    |             |        | ![No changes]         |
| Unchanged | `public`  |          | [`Elements`]          | `val`([`String`])                          |             |        | ![No changes]         |
| Unchanged | `public`  |          | [`Elements`]          | `wrap`([`String`])                         |             |        | ![No changes]         |

___

<a id="user-content-org.jsoup.select.evaluator"></a>
### `org.jsoup.select.Evaluator`

- [X] Binary-compatible
- [X] Source-compatible
- [X] Serialization-compatible

| Status    | Modifiers           | Type  | Name        | Extends    | JDK   | Serialization       | Compatibility Changes |
|-----------|---------------------|-------|-------------|------------|-------|---------------------|-----------------------|
| Unchanged | `public` `abstract` | Class | `Evaluator` | [`Object`] | JDK 8 | ![Not serializable] | ![No changes]         |


#### Constructors

| Status    | Modifiers   | Generics | Constructor   | Annotations | Throws | Compatibility Changes |
|-----------|-------------|----------|---------------|-------------|--------|-----------------------|
| Unchanged | `protected` |          | `Evaluator`() |             |        | ![No changes]         |


#### Methods

| Status    | Modifiers           | Generics | Type                   | Method                              | Annotations | Throws | Compatibility Changes |
|-----------|---------------------|----------|------------------------|-------------------------------------|-------------|--------|-----------------------|
| Unchanged | `public`            |          | [`Predicate<Element>`] | `asPredicate`([`Element`])          |             |        | ![No changes]         |
| Unchanged | `protected`         |          | `int`                  | `cost`()                            |             |        | ![No changes]         |
| Unchanged | `public` `abstract` |          | `boolean`              | `matches`([`Element`], [`Element`]) |             |        | ![No changes]         |
| Unchanged | `protected`         |          | `void`                 | `reset`()                           |             |        | ![No changes]         |

___

<a id="user-content-org.jsoup.select.evaluator$allelements"></a>
### `org.jsoup.select.Evaluator$AllElements`

- [X] Binary-compatible
- [X] Source-compatible
- [X] Serialization-compatible

| Status    | Modifiers                 | Type  | Name          | Extends       | JDK   | Serialization       | Compatibility Changes |
|-----------|---------------------------|-------|---------------|---------------|-------|---------------------|-----------------------|
| Unchanged | `final` `static` `public` | Class | `AllElements` | [`Evaluator`] | JDK 8 | ![Not serializable] | ![No changes]         |


#### Constructors

| Status    | Modifiers | Generics | Constructor     | Annotations | Throws | Compatibility Changes |
|-----------|-----------|----------|-----------------|-------------|--------|-----------------------|
| Unchanged | `public`  |          | `AllElements`() |             |        | ![No changes]         |


#### Methods

| Status    | Modifiers   | Generics | Type       | Method                              | Annotations | Throws | Compatibility Changes |
|-----------|-------------|----------|------------|-------------------------------------|-------------|--------|-----------------------|
| Unchanged | `protected` |          | `int`      | `cost`()                            |             |        | ![No changes]         |
| Unchanged | `public`    |          | `boolean`  | `matches`([`Element`], [`Element`]) |             |        | ![No changes]         |
| Unchanged | `public`    |          | [`String`] | `toString`()                        |             |        | ![No changes]         |

___

<a id="user-content-org.jsoup.select.evaluator$attribute"></a>
### `org.jsoup.select.Evaluator$Attribute`

- [X] Binary-compatible
- [X] Source-compatible
- [X] Serialization-compatible

| Status    | Modifiers                 | Type  | Name        | Extends       | JDK   | Serialization       | Compatibility Changes |
|-----------|---------------------------|-------|-------------|---------------|-------|---------------------|-----------------------|
| Unchanged | `final` `static` `public` | Class | `Attribute` | [`Evaluator`] | JDK 8 | ![Not serializable] | ![No changes]         |


#### Constructors

| Status    | Modifiers | Generics | Constructor             | Annotations | Throws | Compatibility Changes |
|-----------|-----------|----------|-------------------------|-------------|--------|-----------------------|
| Unchanged | `public`  |          | `Attribute`([`String`]) |             |        | ![No changes]         |


#### Methods

| Status    | Modifiers   | Generics | Type       | Method                              | Annotations | Throws | Compatibility Changes |
|-----------|-------------|----------|------------|-------------------------------------|-------------|--------|-----------------------|
| Unchanged | `protected` |          | `int`      | `cost`()                            |             |        | ![No changes]         |
| Unchanged | `public`    |          | `boolean`  | `matches`([`Element`], [`Element`]) |             |        | ![No changes]         |
| Unchanged | `public`    |          | [`String`] | `toString`()                        |             |        | ![No changes]         |

___

<a id="user-content-org.jsoup.select.evaluator$attributekeypair"></a>
### `org.jsoup.select.Evaluator$AttributeKeyPair`

- [X] Binary-compatible
- [X] Source-compatible
- [X] Serialization-compatible

| Status    | Modifiers                    | Type  | Name               | Extends       | JDK   | Serialization       | Compatibility Changes |
|-----------|------------------------------|-------|--------------------|---------------|-------|---------------------|-----------------------|
| Unchanged | `static` `public` `abstract` | Class | `AttributeKeyPair` | [`Evaluator`] | JDK 8 | ![Not serializable] | ![No changes]         |


#### Constructors

| Status    | Modifiers | Generics | Constructor                                           | Annotations | Throws | Compatibility Changes |
|-----------|-----------|----------|-------------------------------------------------------|-------------|--------|-----------------------|
| Unchanged | `public`  |          | `AttributeKeyPair`([`String`], [`String`])            |             |        | ![No changes]         |
| Unchanged | `public`  |          | `AttributeKeyPair`([`String`], [`String`], `boolean`) |             |        | ![No changes]         |

___

<a id="user-content-org.jsoup.select.evaluator$attributestarting"></a>
### `org.jsoup.select.Evaluator$AttributeStarting`

- [X] Binary-compatible
- [X] Source-compatible
- [X] Serialization-compatible

| Status    | Modifiers                 | Type  | Name                | Extends       | JDK   | Serialization       | Compatibility Changes |
|-----------|---------------------------|-------|---------------------|---------------|-------|---------------------|-----------------------|
| Unchanged | `final` `static` `public` | Class | `AttributeStarting` | [`Evaluator`] | JDK 8 | ![Not serializable] | ![No changes]         |


#### Constructors

| Status    | Modifiers | Generics | Constructor                     | Annotations | Throws | Compatibility Changes |
|-----------|-----------|----------|---------------------------------|-------------|--------|-----------------------|
| Unchanged | `public`  |          | `AttributeStarting`([`String`]) |             |        | ![No changes]         |


#### Methods

| Status    | Modifiers   | Generics | Type       | Method                              | Annotations | Throws | Compatibility Changes |
|-----------|-------------|----------|------------|-------------------------------------|-------------|--------|-----------------------|
| Unchanged | `protected` |          | `int`      | `cost`()                            |             |        | ![No changes]         |
| Unchanged | `public`    |          | `boolean`  | `matches`([`Element`], [`Element`]) |             |        | ![No changes]         |
| Unchanged | `public`    |          | [`String`] | `toString`()                        |             |        | ![No changes]         |

___

<a id="user-content-org.jsoup.select.evaluator$attributewithvalue"></a>
### `org.jsoup.select.Evaluator$AttributeWithValue`

- [X] Binary-compatible
- [X] Source-compatible
- [X] Serialization-compatible

| Status    | Modifiers                 | Type  | Name                 | Extends              | JDK   | Serialization       | Compatibility Changes |
|-----------|---------------------------|-------|----------------------|----------------------|-------|---------------------|-----------------------|
| Unchanged | `final` `static` `public` | Class | `AttributeWithValue` | [`AttributeKeyPair`] | JDK 8 | ![Not serializable] | ![No changes]         |


#### Constructors

| Status    | Modifiers | Generics | Constructor                                  | Annotations | Throws | Compatibility Changes |
|-----------|-----------|----------|----------------------------------------------|-------------|--------|-----------------------|
| Unchanged | `public`  |          | `AttributeWithValue`([`String`], [`String`]) |             |        | ![No changes]         |


#### Methods

| Status    | Modifiers   | Generics | Type       | Method                              | Annotations | Throws | Compatibility Changes |
|-----------|-------------|----------|------------|-------------------------------------|-------------|--------|-----------------------|
| Unchanged | `protected` |          | `int`      | `cost`()                            |             |        | ![No changes]         |
| Unchanged | `public`    |          | `boolean`  | `matches`([`Element`], [`Element`]) |             |        | ![No changes]         |
| Unchanged | `public`    |          | [`String`] | `toString`()                        |             |        | ![No changes]         |

___

<a id="user-content-org.jsoup.select.evaluator$attributewithvaluecontaining"></a>
### `org.jsoup.select.Evaluator$AttributeWithValueContaining`

- [X] Binary-compatible
- [X] Source-compatible
- [X] Serialization-compatible

| Status    | Modifiers                 | Type  | Name                           | Extends              | JDK   | Serialization       | Compatibility Changes |
|-----------|---------------------------|-------|--------------------------------|----------------------|-------|---------------------|-----------------------|
| Unchanged | `final` `static` `public` | Class | `AttributeWithValueContaining` | [`AttributeKeyPair`] | JDK 8 | ![Not serializable] | ![No changes]         |


#### Constructors

| Status    | Modifiers | Generics | Constructor                                            | Annotations | Throws | Compatibility Changes |
|-----------|-----------|----------|--------------------------------------------------------|-------------|--------|-----------------------|
| Unchanged | `public`  |          | `AttributeWithValueContaining`([`String`], [`String`]) |             |        | ![No changes]         |


#### Methods

| Status    | Modifiers   | Generics | Type       | Method                              | Annotations | Throws | Compatibility Changes |
|-----------|-------------|----------|------------|-------------------------------------|-------------|--------|-----------------------|
| Unchanged | `protected` |          | `int`      | `cost`()                            |             |        | ![No changes]         |
| Unchanged | `public`    |          | `boolean`  | `matches`([`Element`], [`Element`]) |             |        | ![No changes]         |
| Unchanged | `public`    |          | [`String`] | `toString`()                        |             |        | ![No changes]         |

___

<a id="user-content-org.jsoup.select.evaluator$attributewithvalueending"></a>
### `org.jsoup.select.Evaluator$AttributeWithValueEnding`

- [X] Binary-compatible
- [X] Source-compatible
- [X] Serialization-compatible

| Status    | Modifiers                 | Type  | Name                       | Extends              | JDK   | Serialization       | Compatibility Changes |
|-----------|---------------------------|-------|----------------------------|----------------------|-------|---------------------|-----------------------|
| Unchanged | `final` `static` `public` | Class | `AttributeWithValueEnding` | [`AttributeKeyPair`] | JDK 8 | ![Not serializable] | ![No changes]         |


#### Constructors

| Status    | Modifiers | Generics | Constructor                                        | Annotations | Throws | Compatibility Changes |
|-----------|-----------|----------|----------------------------------------------------|-------------|--------|-----------------------|
| Unchanged | `public`  |          | `AttributeWithValueEnding`([`String`], [`String`]) |             |        | ![No changes]         |


#### Methods

| Status    | Modifiers   | Generics | Type       | Method                              | Annotations | Throws | Compatibility Changes |
|-----------|-------------|----------|------------|-------------------------------------|-------------|--------|-----------------------|
| Unchanged | `protected` |          | `int`      | `cost`()                            |             |        | ![No changes]         |
| Unchanged | `public`    |          | `boolean`  | `matches`([`Element`], [`Element`]) |             |        | ![No changes]         |
| Unchanged | `public`    |          | [`String`] | `toString`()                        |             |        | ![No changes]         |

___

<a id="user-content-org.jsoup.select.evaluator$attributewithvaluematching"></a>
### `org.jsoup.select.Evaluator$AttributeWithValueMatching`

- [X] Binary-compatible
- [X] Source-compatible
- [X] Serialization-compatible

| Status    | Modifiers                 | Type  | Name                         | Extends       | JDK   | Serialization       | Compatibility Changes |
|-----------|---------------------------|-------|------------------------------|---------------|-------|---------------------|-----------------------|
| Unchanged | `final` `static` `public` | Class | `AttributeWithValueMatching` | [`Evaluator`] | JDK 8 | ![Not serializable] | ![No changes]         |


#### Constructors

| Status    | Modifiers | Generics | Constructor                                           | Annotations | Throws | Compatibility Changes |
|-----------|-----------|----------|-------------------------------------------------------|-------------|--------|-----------------------|
| Unchanged | `public`  |          | `AttributeWithValueMatching`([`String`], [`Pattern`]) |             |        | ![No changes]         |


#### Methods

| Status    | Modifiers   | Generics | Type       | Method                              | Annotations | Throws | Compatibility Changes |
|-----------|-------------|----------|------------|-------------------------------------|-------------|--------|-----------------------|
| Unchanged | `protected` |          | `int`      | `cost`()                            |             |        | ![No changes]         |
| Unchanged | `public`    |          | `boolean`  | `matches`([`Element`], [`Element`]) |             |        | ![No changes]         |
| Unchanged | `public`    |          | [`String`] | `toString`()                        |             |        | ![No changes]         |

___

<a id="user-content-org.jsoup.select.evaluator$attributewithvaluenot"></a>
### `org.jsoup.select.Evaluator$AttributeWithValueNot`

- [X] Binary-compatible
- [X] Source-compatible
- [X] Serialization-compatible

| Status    | Modifiers                 | Type  | Name                    | Extends              | JDK   | Serialization       | Compatibility Changes |
|-----------|---------------------------|-------|-------------------------|----------------------|-------|---------------------|-----------------------|
| Unchanged | `final` `static` `public` | Class | `AttributeWithValueNot` | [`AttributeKeyPair`] | JDK 8 | ![Not serializable] | ![No changes]         |


#### Constructors

| Status    | Modifiers | Generics | Constructor                                     | Annotations | Throws | Compatibility Changes |
|-----------|-----------|----------|-------------------------------------------------|-------------|--------|-----------------------|
| Unchanged | `public`  |          | `AttributeWithValueNot`([`String`], [`String`]) |             |        | ![No changes]         |


#### Methods

| Status    | Modifiers   | Generics | Type       | Method                              | Annotations | Throws | Compatibility Changes |
|-----------|-------------|----------|------------|-------------------------------------|-------------|--------|-----------------------|
| Unchanged | `protected` |          | `int`      | `cost`()                            |             |        | ![No changes]         |
| Unchanged | `public`    |          | `boolean`  | `matches`([`Element`], [`Element`]) |             |        | ![No changes]         |
| Unchanged | `public`    |          | [`String`] | `toString`()                        |             |        | ![No changes]         |

___

<a id="user-content-org.jsoup.select.evaluator$attributewithvaluestarting"></a>
### `org.jsoup.select.Evaluator$AttributeWithValueStarting`

- [X] Binary-compatible
- [X] Source-compatible
- [X] Serialization-compatible

| Status    | Modifiers                 | Type  | Name                         | Extends              | JDK   | Serialization       | Compatibility Changes |
|-----------|---------------------------|-------|------------------------------|----------------------|-------|---------------------|-----------------------|
| Unchanged | `final` `static` `public` | Class | `AttributeWithValueStarting` | [`AttributeKeyPair`] | JDK 8 | ![Not serializable] | ![No changes]         |


#### Constructors

| Status    | Modifiers | Generics | Constructor                                          | Annotations | Throws | Compatibility Changes |
|-----------|-----------|----------|------------------------------------------------------|-------------|--------|-----------------------|
| Unchanged | `public`  |          | `AttributeWithValueStarting`([`String`], [`String`]) |             |        | ![No changes]         |


#### Methods

| Status    | Modifiers   | Generics | Type       | Method                              | Annotations | Throws | Compatibility Changes |
|-----------|-------------|----------|------------|-------------------------------------|-------------|--------|-----------------------|
| Unchanged | `protected` |          | `int`      | `cost`()                            |             |        | ![No changes]         |
| Unchanged | `public`    |          | `boolean`  | `matches`([`Element`], [`Element`]) |             |        | ![No changes]         |
| Unchanged | `public`    |          | [`String`] | `toString`()                        |             |        | ![No changes]         |

___

<a id="user-content-org.jsoup.select.evaluator$class"></a>
### `org.jsoup.select.Evaluator$Class`

- [X] Binary-compatible
- [X] Source-compatible
- [X] Serialization-compatible

| Status    | Modifiers                 | Type  | Name    | Extends       | JDK   | Serialization       | Compatibility Changes |
|-----------|---------------------------|-------|---------|---------------|-------|---------------------|-----------------------|
| Unchanged | `final` `static` `public` | Class | `Class` | [`Evaluator`] | JDK 8 | ![Not serializable] | ![No changes]         |


#### Constructors

| Status    | Modifiers | Generics | Constructor         | Annotations | Throws | Compatibility Changes |
|-----------|-----------|----------|---------------------|-------------|--------|-----------------------|
| Unchanged | `public`  |          | `Class`([`String`]) |             |        | ![No changes]         |


#### Methods

| Status    | Modifiers   | Generics | Type       | Method                              | Annotations | Throws | Compatibility Changes |
|-----------|-------------|----------|------------|-------------------------------------|-------------|--------|-----------------------|
| Unchanged | `protected` |          | `int`      | `cost`()                            |             |        | ![No changes]         |
| Unchanged | `public`    |          | `boolean`  | `matches`([`Element`], [`Element`]) |             |        | ![No changes]         |
| Unchanged | `public`    |          | [`String`] | `toString`()                        |             |        | ![No changes]         |

___

<a id="user-content-org.jsoup.select.evaluator$containsdata"></a>
### `org.jsoup.select.Evaluator$ContainsData`

- [X] Binary-compatible
- [X] Source-compatible
- [X] Serialization-compatible

| Status    | Modifiers                 | Type  | Name           | Extends       | JDK   | Serialization       | Compatibility Changes |
|-----------|---------------------------|-------|----------------|---------------|-------|---------------------|-----------------------|
| Unchanged | `final` `static` `public` | Class | `ContainsData` | [`Evaluator`] | JDK 8 | ![Not serializable] | ![No changes]         |


#### Constructors

| Status    | Modifiers | Generics | Constructor                | Annotations | Throws | Compatibility Changes |
|-----------|-----------|----------|----------------------------|-------------|--------|-----------------------|
| Unchanged | `public`  |          | `ContainsData`([`String`]) |             |        | ![No changes]         |


#### Methods

| Status    | Modifiers | Generics | Type       | Method                              | Annotations | Throws | Compatibility Changes |
|-----------|-----------|----------|------------|-------------------------------------|-------------|--------|-----------------------|
| Unchanged | `public`  |          | `boolean`  | `matches`([`Element`], [`Element`]) |             |        | ![No changes]         |
| Unchanged | `public`  |          | [`String`] | `toString`()                        |             |        | ![No changes]         |

___

<a id="user-content-org.jsoup.select.evaluator$containsowntext"></a>
### `org.jsoup.select.Evaluator$ContainsOwnText`

- [X] Binary-compatible
- [X] Source-compatible
- [X] Serialization-compatible

| Status    | Modifiers                 | Type  | Name              | Extends       | JDK   | Serialization       | Compatibility Changes |
|-----------|---------------------------|-------|-------------------|---------------|-------|---------------------|-----------------------|
| Unchanged | `final` `static` `public` | Class | `ContainsOwnText` | [`Evaluator`] | JDK 8 | ![Not serializable] | ![No changes]         |


#### Constructors

| Status    | Modifiers | Generics | Constructor                   | Annotations | Throws | Compatibility Changes |
|-----------|-----------|----------|-------------------------------|-------------|--------|-----------------------|
| Unchanged | `public`  |          | `ContainsOwnText`([`String`]) |             |        | ![No changes]         |


#### Methods

| Status    | Modifiers | Generics | Type       | Method                              | Annotations | Throws | Compatibility Changes |
|-----------|-----------|----------|------------|-------------------------------------|-------------|--------|-----------------------|
| Unchanged | `public`  |          | `boolean`  | `matches`([`Element`], [`Element`]) |             |        | ![No changes]         |
| Unchanged | `public`  |          | [`String`] | `toString`()                        |             |        | ![No changes]         |

___

<a id="user-content-org.jsoup.select.evaluator$containstext"></a>
### `org.jsoup.select.Evaluator$ContainsText`

- [X] Binary-compatible
- [X] Source-compatible
- [X] Serialization-compatible

| Status    | Modifiers                 | Type  | Name           | Extends       | JDK   | Serialization       | Compatibility Changes |
|-----------|---------------------------|-------|----------------|---------------|-------|---------------------|-----------------------|
| Unchanged | `final` `static` `public` | Class | `ContainsText` | [`Evaluator`] | JDK 8 | ![Not serializable] | ![No changes]         |


#### Constructors

| Status    | Modifiers | Generics | Constructor                | Annotations | Throws | Compatibility Changes |
|-----------|-----------|----------|----------------------------|-------------|--------|-----------------------|
| Unchanged | `public`  |          | `ContainsText`([`String`]) |             |        | ![No changes]         |


#### Methods

| Status    | Modifiers   | Generics | Type       | Method                              | Annotations | Throws | Compatibility Changes |
|-----------|-------------|----------|------------|-------------------------------------|-------------|--------|-----------------------|
| Unchanged | `protected` |          | `int`      | `cost`()                            |             |        | ![No changes]         |
| Unchanged | `public`    |          | `boolean`  | `matches`([`Element`], [`Element`]) |             |        | ![No changes]         |
| Unchanged | `public`    |          | [`String`] | `toString`()                        |             |        | ![No changes]         |

___

<a id="user-content-org.jsoup.select.evaluator$containswholeowntext"></a>
### `org.jsoup.select.Evaluator$ContainsWholeOwnText`

- [X] Binary-compatible
- [X] Source-compatible
- [X] Serialization-compatible

| Status    | Modifiers                 | Type  | Name                   | Extends       | JDK   | Serialization       | Compatibility Changes |
|-----------|---------------------------|-------|------------------------|---------------|-------|---------------------|-----------------------|
| Unchanged | `final` `static` `public` | Class | `ContainsWholeOwnText` | [`Evaluator`] | JDK 8 | ![Not serializable] | ![No changes]         |


#### Constructors

| Status    | Modifiers | Generics | Constructor                        | Annotations | Throws | Compatibility Changes |
|-----------|-----------|----------|------------------------------------|-------------|--------|-----------------------|
| Unchanged | `public`  |          | `ContainsWholeOwnText`([`String`]) |             |        | ![No changes]         |


#### Methods

| Status    | Modifiers | Generics | Type       | Method                              | Annotations | Throws | Compatibility Changes |
|-----------|-----------|----------|------------|-------------------------------------|-------------|--------|-----------------------|
| Unchanged | `public`  |          | `boolean`  | `matches`([`Element`], [`Element`]) |             |        | ![No changes]         |
| Unchanged | `public`  |          | [`String`] | `toString`()                        |             |        | ![No changes]         |

___

<a id="user-content-org.jsoup.select.evaluator$containswholetext"></a>
### `org.jsoup.select.Evaluator$ContainsWholeText`

- [X] Binary-compatible
- [X] Source-compatible
- [X] Serialization-compatible

| Status    | Modifiers                 | Type  | Name                | Extends       | JDK   | Serialization       | Compatibility Changes |
|-----------|---------------------------|-------|---------------------|---------------|-------|---------------------|-----------------------|
| Unchanged | `final` `static` `public` | Class | `ContainsWholeText` | [`Evaluator`] | JDK 8 | ![Not serializable] | ![No changes]         |


#### Constructors

| Status    | Modifiers | Generics | Constructor                     | Annotations | Throws | Compatibility Changes |
|-----------|-----------|----------|---------------------------------|-------------|--------|-----------------------|
| Unchanged | `public`  |          | `ContainsWholeText`([`String`]) |             |        | ![No changes]         |


#### Methods

| Status    | Modifiers   | Generics | Type       | Method                              | Annotations | Throws | Compatibility Changes |
|-----------|-------------|----------|------------|-------------------------------------|-------------|--------|-----------------------|
| Unchanged | `protected` |          | `int`      | `cost`()                            |             |        | ![No changes]         |
| Unchanged | `public`    |          | `boolean`  | `matches`([`Element`], [`Element`]) |             |        | ![No changes]         |
| Unchanged | `public`    |          | [`String`] | `toString`()                        |             |        | ![No changes]         |

___

<a id="user-content-org.jsoup.select.evaluator$cssnthevaluator"></a>
### `org.jsoup.select.Evaluator$CssNthEvaluator`

- [X] Binary-compatible
- [X] Source-compatible
- [X] Serialization-compatible

| Status    | Modifiers                    | Type  | Name              | Extends       | JDK   | Serialization       | Compatibility Changes |
|-----------|------------------------------|-------|-------------------|---------------|-------|---------------------|-----------------------|
| Unchanged | `static` `public` `abstract` | Class | `CssNthEvaluator` | [`Evaluator`] | JDK 8 | ![Not serializable] | ![No changes]         |


#### Constructors

| Status    | Modifiers | Generics | Constructor                     | Annotations | Throws | Compatibility Changes |
|-----------|-----------|----------|---------------------------------|-------------|--------|-----------------------|
| Unchanged | `public`  |          | `CssNthEvaluator`(`int`)        |             |        | ![No changes]         |
| Unchanged | `public`  |          | `CssNthEvaluator`(`int`, `int`) |             |        | ![No changes]         |


#### Methods

| Status    | Modifiers              | Generics | Type       | Method                                        | Annotations | Throws | Compatibility Changes |
|-----------|------------------------|----------|------------|-----------------------------------------------|-------------|--------|-----------------------|
| Unchanged | `protected` `abstract` |          | `int`      | `calculatePosition`([`Element`], [`Element`]) |             |        | ![No changes]         |
| Unchanged | `protected` `abstract` |          | [`String`] | `getPseudoClass`()                            |             |        | ![No changes]         |
| Unchanged | `public`               |          | `boolean`  | `matches`([`Element`], [`Element`])           |             |        | ![No changes]         |
| Unchanged | `public`               |          | [`String`] | `toString`()                                  |             |        | ![No changes]         |


#### Fields

| Status    | Modifiers           | Type  | Name | Annotations | Compatibility Changes |
|-----------|---------------------|-------|------|-------------|-----------------------|
| Unchanged | `protected` `final` | `int` | `a`  |             | ![No changes]         |
| Unchanged | `protected` `final` | `int` | `b`  |             | ![No changes]         |

___

<a id="user-content-org.jsoup.select.evaluator$id"></a>
### `org.jsoup.select.Evaluator$Id`

- [X] Binary-compatible
- [X] Source-compatible
- [X] Serialization-compatible

| Status    | Modifiers                 | Type  | Name | Extends       | JDK   | Serialization       | Compatibility Changes |
|-----------|---------------------------|-------|------|---------------|-------|---------------------|-----------------------|
| Unchanged | `final` `static` `public` | Class | `Id` | [`Evaluator`] | JDK 8 | ![Not serializable] | ![No changes]         |


#### Constructors

| Status    | Modifiers | Generics | Constructor      | Annotations | Throws | Compatibility Changes |
|-----------|-----------|----------|------------------|-------------|--------|-----------------------|
| Unchanged | `public`  |          | `Id`([`String`]) |             |        | ![No changes]         |


#### Methods

| Status    | Modifiers   | Generics | Type       | Method                              | Annotations | Throws | Compatibility Changes |
|-----------|-------------|----------|------------|-------------------------------------|-------------|--------|-----------------------|
| Unchanged | `protected` |          | `int`      | `cost`()                            |             |        | ![No changes]         |
| Unchanged | `public`    |          | `boolean`  | `matches`([`Element`], [`Element`]) |             |        | ![No changes]         |
| Unchanged | `public`    |          | [`String`] | `toString`()                        |             |        | ![No changes]         |

___

<a id="user-content-org.jsoup.select.evaluator$indexequals"></a>
### `org.jsoup.select.Evaluator$IndexEquals`

- [X] Binary-compatible
- [X] Source-compatible
- [X] Serialization-compatible

| Status    | Modifiers                 | Type  | Name          | Extends            | JDK   | Serialization       | Compatibility Changes |
|-----------|---------------------------|-------|---------------|--------------------|-------|---------------------|-----------------------|
| Unchanged | `final` `static` `public` | Class | `IndexEquals` | [`IndexEvaluator`] | JDK 8 | ![Not serializable] | ![No changes]         |


#### Constructors

| Status    | Modifiers | Generics | Constructor          | Annotations | Throws | Compatibility Changes |
|-----------|-----------|----------|----------------------|-------------|--------|-----------------------|
| Unchanged | `public`  |          | `IndexEquals`(`int`) |             |        | ![No changes]         |


#### Methods

| Status    | Modifiers | Generics | Type       | Method                              | Annotations | Throws | Compatibility Changes |
|-----------|-----------|----------|------------|-------------------------------------|-------------|--------|-----------------------|
| Unchanged | `public`  |          | `boolean`  | `matches`([`Element`], [`Element`]) |             |        | ![No changes]         |
| Unchanged | `public`  |          | [`String`] | `toString`()                        |             |        | ![No changes]         |

___

<a id="user-content-org.jsoup.select.evaluator$indexevaluator"></a>
### `org.jsoup.select.Evaluator$IndexEvaluator`

- [X] Binary-compatible
- [X] Source-compatible
- [X] Serialization-compatible

| Status    | Modifiers                    | Type  | Name             | Extends       | JDK   | Serialization       | Compatibility Changes |
|-----------|------------------------------|-------|------------------|---------------|-------|---------------------|-----------------------|
| Unchanged | `static` `public` `abstract` | Class | `IndexEvaluator` | [`Evaluator`] | JDK 8 | ![Not serializable] | ![No changes]         |


#### Constructors

| Status    | Modifiers | Generics | Constructor             | Annotations | Throws | Compatibility Changes |
|-----------|-----------|----------|-------------------------|-------------|--------|-----------------------|
| Unchanged | `public`  |          | `IndexEvaluator`(`int`) |             |        | ![No changes]         |

___

<a id="user-content-org.jsoup.select.evaluator$indexgreaterthan"></a>
### `org.jsoup.select.Evaluator$IndexGreaterThan`

- [X] Binary-compatible
- [X] Source-compatible
- [X] Serialization-compatible

| Status    | Modifiers                 | Type  | Name               | Extends            | JDK   | Serialization       | Compatibility Changes |
|-----------|---------------------------|-------|--------------------|--------------------|-------|---------------------|-----------------------|
| Unchanged | `final` `static` `public` | Class | `IndexGreaterThan` | [`IndexEvaluator`] | JDK 8 | ![Not serializable] | ![No changes]         |


#### Constructors

| Status    | Modifiers | Generics | Constructor               | Annotations | Throws | Compatibility Changes |
|-----------|-----------|----------|---------------------------|-------------|--------|-----------------------|
| Unchanged | `public`  |          | `IndexGreaterThan`(`int`) |             |        | ![No changes]         |


#### Methods

| Status    | Modifiers | Generics | Type       | Method                              | Annotations | Throws | Compatibility Changes |
|-----------|-----------|----------|------------|-------------------------------------|-------------|--------|-----------------------|
| Unchanged | `public`  |          | `boolean`  | `matches`([`Element`], [`Element`]) |             |        | ![No changes]         |
| Unchanged | `public`  |          | [`String`] | `toString`()                        |             |        | ![No changes]         |

___

<a id="user-content-org.jsoup.select.evaluator$indexlessthan"></a>
### `org.jsoup.select.Evaluator$IndexLessThan`

- [X] Binary-compatible
- [X] Source-compatible
- [X] Serialization-compatible

| Status    | Modifiers                 | Type  | Name            | Extends            | JDK   | Serialization       | Compatibility Changes |
|-----------|---------------------------|-------|-----------------|--------------------|-------|---------------------|-----------------------|
| Unchanged | `final` `static` `public` | Class | `IndexLessThan` | [`IndexEvaluator`] | JDK 8 | ![Not serializable] | ![No changes]         |


#### Constructors

| Status    | Modifiers | Generics | Constructor            | Annotations | Throws | Compatibility Changes |
|-----------|-----------|----------|------------------------|-------------|--------|-----------------------|
| Unchanged | `public`  |          | `IndexLessThan`(`int`) |             |        | ![No changes]         |


#### Methods

| Status    | Modifiers | Generics | Type       | Method                              | Annotations | Throws | Compatibility Changes |
|-----------|-----------|----------|------------|-------------------------------------|-------------|--------|-----------------------|
| Unchanged | `public`  |          | `boolean`  | `matches`([`Element`], [`Element`]) |             |        | ![No changes]         |
| Unchanged | `public`  |          | [`String`] | `toString`()                        |             |        | ![No changes]         |

___

<a id="user-content-org.jsoup.select.evaluator$isempty"></a>
### `org.jsoup.select.Evaluator$IsEmpty`

- [X] Binary-compatible
- [X] Source-compatible
- [X] Serialization-compatible

| Status    | Modifiers                 | Type  | Name      | Extends       | JDK   | Serialization       | Compatibility Changes |
|-----------|---------------------------|-------|-----------|---------------|-------|---------------------|-----------------------|
| Unchanged | `final` `static` `public` | Class | `IsEmpty` | [`Evaluator`] | JDK 8 | ![Not serializable] | ![No changes]         |


#### Constructors

| Status    | Modifiers | Generics | Constructor | Annotations | Throws | Compatibility Changes |
|-----------|-----------|----------|-------------|-------------|--------|-----------------------|
| Unchanged | `public`  |          | `IsEmpty`() |             |        | ![No changes]         |


#### Methods

| Status    | Modifiers | Generics | Type       | Method                              | Annotations | Throws | Compatibility Changes |
|-----------|-----------|----------|------------|-------------------------------------|-------------|--------|-----------------------|
| Unchanged | `public`  |          | `boolean`  | `matches`([`Element`], [`Element`]) |             |        | ![No changes]         |
| Unchanged | `public`  |          | [`String`] | `toString`()                        |             |        | ![No changes]         |

___

<a id="user-content-org.jsoup.select.evaluator$isfirstchild"></a>
### `org.jsoup.select.Evaluator$IsFirstChild`

- [X] Binary-compatible
- [X] Source-compatible
- [X] Serialization-compatible

| Status    | Modifiers                 | Type  | Name           | Extends       | JDK   | Serialization       | Compatibility Changes |
|-----------|---------------------------|-------|----------------|---------------|-------|---------------------|-----------------------|
| Unchanged | `final` `static` `public` | Class | `IsFirstChild` | [`Evaluator`] | JDK 8 | ![Not serializable] | ![No changes]         |


#### Constructors

| Status    | Modifiers | Generics | Constructor      | Annotations | Throws | Compatibility Changes |
|-----------|-----------|----------|------------------|-------------|--------|-----------------------|
| Unchanged | `public`  |          | `IsFirstChild`() |             |        | ![No changes]         |


#### Methods

| Status    | Modifiers | Generics | Type       | Method                              | Annotations | Throws | Compatibility Changes |
|-----------|-----------|----------|------------|-------------------------------------|-------------|--------|-----------------------|
| Unchanged | `public`  |          | `boolean`  | `matches`([`Element`], [`Element`]) |             |        | ![No changes]         |
| Unchanged | `public`  |          | [`String`] | `toString`()                        |             |        | ![No changes]         |

___

<a id="user-content-org.jsoup.select.evaluator$isfirstoftype"></a>
### `org.jsoup.select.Evaluator$IsFirstOfType`

- [X] Binary-compatible
- [X] Source-compatible
- [X] Serialization-compatible

| Status    | Modifiers                 | Type  | Name            | Extends         | JDK   | Serialization       | Compatibility Changes |
|-----------|---------------------------|-------|-----------------|-----------------|-------|---------------------|-----------------------|
| Unchanged | `final` `static` `public` | Class | `IsFirstOfType` | [`IsNthOfType`] | JDK 8 | ![Not serializable] | ![No changes]         |


#### Constructors

| Status    | Modifiers | Generics | Constructor       | Annotations | Throws | Compatibility Changes |
|-----------|-----------|----------|-------------------|-------------|--------|-----------------------|
| Unchanged | `public`  |          | `IsFirstOfType`() |             |        | ![No changes]         |


#### Methods

| Status    | Modifiers | Generics | Type       | Method       | Annotations | Throws | Compatibility Changes |
|-----------|-----------|----------|------------|--------------|-------------|--------|-----------------------|
| Unchanged | `public`  |          | [`String`] | `toString`() |             |        | ![No changes]         |

___

<a id="user-content-org.jsoup.select.evaluator$islastchild"></a>
### `org.jsoup.select.Evaluator$IsLastChild`

- [X] Binary-compatible
- [X] Source-compatible
- [X] Serialization-compatible

| Status    | Modifiers                 | Type  | Name          | Extends       | JDK   | Serialization       | Compatibility Changes |
|-----------|---------------------------|-------|---------------|---------------|-------|---------------------|-----------------------|
| Unchanged | `final` `static` `public` | Class | `IsLastChild` | [`Evaluator`] | JDK 8 | ![Not serializable] | ![No changes]         |


#### Constructors

| Status    | Modifiers | Generics | Constructor     | Annotations | Throws | Compatibility Changes |
|-----------|-----------|----------|-----------------|-------------|--------|-----------------------|
| Unchanged | `public`  |          | `IsLastChild`() |             |        | ![No changes]         |


#### Methods

| Status    | Modifiers | Generics | Type       | Method                              | Annotations | Throws | Compatibility Changes |
|-----------|-----------|----------|------------|-------------------------------------|-------------|--------|-----------------------|
| Unchanged | `public`  |          | `boolean`  | `matches`([`Element`], [`Element`]) |             |        | ![No changes]         |
| Unchanged | `public`  |          | [`String`] | `toString`()                        |             |        | ![No changes]         |

___

<a id="user-content-org.jsoup.select.evaluator$islastoftype"></a>
### `org.jsoup.select.Evaluator$IsLastOfType`

- [X] Binary-compatible
- [X] Source-compatible
- [X] Serialization-compatible

| Status    | Modifiers                 | Type  | Name           | Extends             | JDK   | Serialization       | Compatibility Changes |
|-----------|---------------------------|-------|----------------|---------------------|-------|---------------------|-----------------------|
| Unchanged | `final` `static` `public` | Class | `IsLastOfType` | [`IsNthLastOfType`] | JDK 8 | ![Not serializable] | ![No changes]         |


#### Constructors

| Status    | Modifiers | Generics | Constructor      | Annotations | Throws | Compatibility Changes |
|-----------|-----------|----------|------------------|-------------|--------|-----------------------|
| Unchanged | `public`  |          | `IsLastOfType`() |             |        | ![No changes]         |


#### Methods

| Status    | Modifiers | Generics | Type       | Method       | Annotations | Throws | Compatibility Changes |
|-----------|-----------|----------|------------|--------------|-------------|--------|-----------------------|
| Unchanged | `public`  |          | [`String`] | `toString`() |             |        | ![No changes]         |

___

<a id="user-content-org.jsoup.select.evaluator$isnthchild"></a>
### `org.jsoup.select.Evaluator$IsNthChild`

- [X] Binary-compatible
- [X] Source-compatible
- [X] Serialization-compatible

| Status    | Modifiers                 | Type  | Name         | Extends             | JDK   | Serialization       | Compatibility Changes |
|-----------|---------------------------|-------|--------------|---------------------|-------|---------------------|-----------------------|
| Unchanged | `final` `static` `public` | Class | `IsNthChild` | [`CssNthEvaluator`] | JDK 8 | ![Not serializable] | ![No changes]         |


#### Constructors

| Status    | Modifiers | Generics | Constructor                | Annotations | Throws | Compatibility Changes |
|-----------|-----------|----------|----------------------------|-------------|--------|-----------------------|
| Unchanged | `public`  |          | `IsNthChild`(`int`, `int`) |             |        | ![No changes]         |


#### Methods

| Status    | Modifiers   | Generics | Type       | Method                                        | Annotations | Throws | Compatibility Changes |
|-----------|-------------|----------|------------|-----------------------------------------------|-------------|--------|-----------------------|
| Unchanged | `protected` |          | `int`      | `calculatePosition`([`Element`], [`Element`]) |             |        | ![No changes]         |
| Unchanged | `protected` |          | [`String`] | `getPseudoClass`()                            |             |        | ![No changes]         |

___

<a id="user-content-org.jsoup.select.evaluator$isnthlastchild"></a>
### `org.jsoup.select.Evaluator$IsNthLastChild`

- [X] Binary-compatible
- [X] Source-compatible
- [X] Serialization-compatible

| Status    | Modifiers                 | Type  | Name             | Extends             | JDK   | Serialization       | Compatibility Changes |
|-----------|---------------------------|-------|------------------|---------------------|-------|---------------------|-----------------------|
| Unchanged | `final` `static` `public` | Class | `IsNthLastChild` | [`CssNthEvaluator`] | JDK 8 | ![Not serializable] | ![No changes]         |


#### Constructors

| Status    | Modifiers | Generics | Constructor                    | Annotations | Throws | Compatibility Changes |
|-----------|-----------|----------|--------------------------------|-------------|--------|-----------------------|
| Unchanged | `public`  |          | `IsNthLastChild`(`int`, `int`) |             |        | ![No changes]         |


#### Methods

| Status    | Modifiers   | Generics | Type       | Method                                        | Annotations | Throws | Compatibility Changes |
|-----------|-------------|----------|------------|-----------------------------------------------|-------------|--------|-----------------------|
| Unchanged | `protected` |          | `int`      | `calculatePosition`([`Element`], [`Element`]) |             |        | ![No changes]         |
| Unchanged | `protected` |          | [`String`] | `getPseudoClass`()                            |             |        | ![No changes]         |

___

<a id="user-content-org.jsoup.select.evaluator$isnthlastoftype"></a>
### `org.jsoup.select.Evaluator$IsNthLastOfType`

- [X] Binary-compatible
- [X] Source-compatible
- [X] Serialization-compatible

| Status    | Modifiers         | Type  | Name              | Extends             | JDK   | Serialization       | Compatibility Changes |
|-----------|-------------------|-------|-------------------|---------------------|-------|---------------------|-----------------------|
| Unchanged | `static` `public` | Class | `IsNthLastOfType` | [`CssNthEvaluator`] | JDK 8 | ![Not serializable] | ![No changes]         |


#### Constructors

| Status    | Modifiers | Generics | Constructor                     | Annotations | Throws | Compatibility Changes |
|-----------|-----------|----------|---------------------------------|-------------|--------|-----------------------|
| Unchanged | `public`  |          | `IsNthLastOfType`(`int`, `int`) |             |        | ![No changes]         |


#### Methods

| Status    | Modifiers   | Generics | Type       | Method                                        | Annotations | Throws | Compatibility Changes |
|-----------|-------------|----------|------------|-----------------------------------------------|-------------|--------|-----------------------|
| Unchanged | `protected` |          | `int`      | `calculatePosition`([`Element`], [`Element`]) |             |        | ![No changes]         |
| Unchanged | `protected` |          | [`String`] | `getPseudoClass`()                            |             |        | ![No changes]         |

___

<a id="user-content-org.jsoup.select.evaluator$isnthoftype"></a>
### `org.jsoup.select.Evaluator$IsNthOfType`

- [X] Binary-compatible
- [X] Source-compatible
- [X] Serialization-compatible

| Status    | Modifiers         | Type  | Name          | Extends             | JDK   | Serialization       | Compatibility Changes |
|-----------|-------------------|-------|---------------|---------------------|-------|---------------------|-----------------------|
| Unchanged | `static` `public` | Class | `IsNthOfType` | [`CssNthEvaluator`] | JDK 8 | ![Not serializable] | ![No changes]         |


#### Constructors

| Status    | Modifiers | Generics | Constructor                 | Annotations | Throws | Compatibility Changes |
|-----------|-----------|----------|-----------------------------|-------------|--------|-----------------------|
| Unchanged | `public`  |          | `IsNthOfType`(`int`, `int`) |             |        | ![No changes]         |


#### Methods

| Status    | Modifiers   | Generics | Type       | Method                                        | Annotations | Throws | Compatibility Changes |
|-----------|-------------|----------|------------|-----------------------------------------------|-------------|--------|-----------------------|
| Unchanged | `protected` |          | `int`      | `calculatePosition`([`Element`], [`Element`]) |             |        | ![No changes]         |
| Unchanged | `protected` |          | [`String`] | `getPseudoClass`()                            |             |        | ![No changes]         |

___

<a id="user-content-org.jsoup.select.evaluator$isonlychild"></a>
### `org.jsoup.select.Evaluator$IsOnlyChild`

- [X] Binary-compatible
- [X] Source-compatible
- [X] Serialization-compatible

| Status    | Modifiers                 | Type  | Name          | Extends       | JDK   | Serialization       | Compatibility Changes |
|-----------|---------------------------|-------|---------------|---------------|-------|---------------------|-----------------------|
| Unchanged | `final` `static` `public` | Class | `IsOnlyChild` | [`Evaluator`] | JDK 8 | ![Not serializable] | ![No changes]         |


#### Constructors

| Status    | Modifiers | Generics | Constructor     | Annotations | Throws | Compatibility Changes |
|-----------|-----------|----------|-----------------|-------------|--------|-----------------------|
| Unchanged | `public`  |          | `IsOnlyChild`() |             |        | ![No changes]         |


#### Methods

| Status    | Modifiers | Generics | Type       | Method                              | Annotations | Throws | Compatibility Changes |
|-----------|-----------|----------|------------|-------------------------------------|-------------|--------|-----------------------|
| Unchanged | `public`  |          | `boolean`  | `matches`([`Element`], [`Element`]) |             |        | ![No changes]         |
| Unchanged | `public`  |          | [`String`] | `toString`()                        |             |        | ![No changes]         |

___

<a id="user-content-org.jsoup.select.evaluator$isonlyoftype"></a>
### `org.jsoup.select.Evaluator$IsOnlyOfType`

- [X] Binary-compatible
- [X] Source-compatible
- [X] Serialization-compatible

| Status    | Modifiers                 | Type  | Name           | Extends       | JDK   | Serialization       | Compatibility Changes |
|-----------|---------------------------|-------|----------------|---------------|-------|---------------------|-----------------------|
| Unchanged | `final` `static` `public` | Class | `IsOnlyOfType` | [`Evaluator`] | JDK 8 | ![Not serializable] | ![No changes]         |


#### Constructors

| Status    | Modifiers | Generics | Constructor      | Annotations | Throws | Compatibility Changes |
|-----------|-----------|----------|------------------|-------------|--------|-----------------------|
| Unchanged | `public`  |          | `IsOnlyOfType`() |             |        | ![No changes]         |


#### Methods

| Status    | Modifiers | Generics | Type       | Method                              | Annotations | Throws | Compatibility Changes |
|-----------|-----------|----------|------------|-------------------------------------|-------------|--------|-----------------------|
| Unchanged | `public`  |          | `boolean`  | `matches`([`Element`], [`Element`]) |             |        | ![No changes]         |
| Unchanged | `public`  |          | [`String`] | `toString`()                        |             |        | ![No changes]         |

___

<a id="user-content-org.jsoup.select.evaluator$isroot"></a>
### `org.jsoup.select.Evaluator$IsRoot`

- [X] Binary-compatible
- [X] Source-compatible
- [X] Serialization-compatible

| Status    | Modifiers                 | Type  | Name     | Extends       | JDK   | Serialization       | Compatibility Changes |
|-----------|---------------------------|-------|----------|---------------|-------|---------------------|-----------------------|
| Unchanged | `final` `static` `public` | Class | `IsRoot` | [`Evaluator`] | JDK 8 | ![Not serializable] | ![No changes]         |


#### Constructors

| Status    | Modifiers | Generics | Constructor | Annotations | Throws | Compatibility Changes |
|-----------|-----------|----------|-------------|-------------|--------|-----------------------|
| Unchanged | `public`  |          | `IsRoot`()  |             |        | ![No changes]         |


#### Methods

| Status    | Modifiers   | Generics | Type       | Method                              | Annotations | Throws | Compatibility Changes |
|-----------|-------------|----------|------------|-------------------------------------|-------------|--------|-----------------------|
| Unchanged | `protected` |          | `int`      | `cost`()                            |             |        | ![No changes]         |
| Unchanged | `public`    |          | `boolean`  | `matches`([`Element`], [`Element`]) |             |        | ![No changes]         |
| Unchanged | `public`    |          | [`String`] | `toString`()                        |             |        | ![No changes]         |

___

<a id="user-content-org.jsoup.select.evaluator$matchtext"></a>
### `org.jsoup.select.Evaluator$MatchText`

- [X] Binary-compatible
- [X] Source-compatible
- [X] Serialization-compatible

| Status    | Modifiers                 | Type  | Name        | Extends       | JDK   | Serialization       | Compatibility Changes |
|-----------|---------------------------|-------|-------------|---------------|-------|---------------------|-----------------------|
| Unchanged | `final` `static` `public` | Class | `MatchText` | [`Evaluator`] | JDK 8 | ![Not serializable] | ![No changes]         |


#### Constructors

| Status    | Modifiers | Generics | Constructor   | Annotations | Throws | Compatibility Changes |
|-----------|-----------|----------|---------------|-------------|--------|-----------------------|
| Unchanged | `public`  |          | `MatchText`() |             |        | ![No changes]         |


#### Methods

| Status    | Modifiers   | Generics | Type       | Method                              | Annotations | Throws | Compatibility Changes |
|-----------|-------------|----------|------------|-------------------------------------|-------------|--------|-----------------------|
| Unchanged | `protected` |          | `int`      | `cost`()                            |             |        | ![No changes]         |
| Unchanged | `public`    |          | `boolean`  | `matches`([`Element`], [`Element`]) |             |        | ![No changes]         |
| Unchanged | `public`    |          | [`String`] | `toString`()                        |             |        | ![No changes]         |

___

<a id="user-content-org.jsoup.select.evaluator$matches"></a>
### `org.jsoup.select.Evaluator$Matches`

- [X] Binary-compatible
- [X] Source-compatible
- [X] Serialization-compatible

| Status    | Modifiers                 | Type  | Name      | Extends       | JDK   | Serialization       | Compatibility Changes |
|-----------|---------------------------|-------|-----------|---------------|-------|---------------------|-----------------------|
| Unchanged | `final` `static` `public` | Class | `Matches` | [`Evaluator`] | JDK 8 | ![Not serializable] | ![No changes]         |


#### Constructors

| Status    | Modifiers | Generics | Constructor            | Annotations | Throws | Compatibility Changes |
|-----------|-----------|----------|------------------------|-------------|--------|-----------------------|
| Unchanged | `public`  |          | `Matches`([`Pattern`]) |             |        | ![No changes]         |


#### Methods

| Status    | Modifiers   | Generics | Type       | Method                              | Annotations | Throws | Compatibility Changes |
|-----------|-------------|----------|------------|-------------------------------------|-------------|--------|-----------------------|
| Unchanged | `protected` |          | `int`      | `cost`()                            |             |        | ![No changes]         |
| Unchanged | `public`    |          | `boolean`  | `matches`([`Element`], [`Element`]) |             |        | ![No changes]         |
| Unchanged | `public`    |          | [`String`] | `toString`()                        |             |        | ![No changes]         |

___

<a id="user-content-org.jsoup.select.evaluator$matchesown"></a>
### `org.jsoup.select.Evaluator$MatchesOwn`

- [X] Binary-compatible
- [X] Source-compatible
- [X] Serialization-compatible

| Status    | Modifiers                 | Type  | Name         | Extends       | JDK   | Serialization       | Compatibility Changes |
|-----------|---------------------------|-------|--------------|---------------|-------|---------------------|-----------------------|
| Unchanged | `final` `static` `public` | Class | `MatchesOwn` | [`Evaluator`] | JDK 8 | ![Not serializable] | ![No changes]         |


#### Constructors

| Status    | Modifiers | Generics | Constructor               | Annotations | Throws | Compatibility Changes |
|-----------|-----------|----------|---------------------------|-------------|--------|-----------------------|
| Unchanged | `public`  |          | `MatchesOwn`([`Pattern`]) |             |        | ![No changes]         |


#### Methods

| Status    | Modifiers   | Generics | Type       | Method                              | Annotations | Throws | Compatibility Changes |
|-----------|-------------|----------|------------|-------------------------------------|-------------|--------|-----------------------|
| Unchanged | `protected` |          | `int`      | `cost`()                            |             |        | ![No changes]         |
| Unchanged | `public`    |          | `boolean`  | `matches`([`Element`], [`Element`]) |             |        | ![No changes]         |
| Unchanged | `public`    |          | [`String`] | `toString`()                        |             |        | ![No changes]         |

___

<a id="user-content-org.jsoup.select.evaluator$matcheswholeowntext"></a>
### `org.jsoup.select.Evaluator$MatchesWholeOwnText`

- [X] Binary-compatible
- [X] Source-compatible
- [X] Serialization-compatible

| Status    | Modifiers                 | Type  | Name                  | Extends       | JDK   | Serialization       | Compatibility Changes |
|-----------|---------------------------|-------|-----------------------|---------------|-------|---------------------|-----------------------|
| Unchanged | `final` `static` `public` | Class | `MatchesWholeOwnText` | [`Evaluator`] | JDK 8 | ![Not serializable] | ![No changes]         |


#### Constructors

| Status    | Modifiers | Generics | Constructor                        | Annotations | Throws | Compatibility Changes |
|-----------|-----------|----------|------------------------------------|-------------|--------|-----------------------|
| Unchanged | `public`  |          | `MatchesWholeOwnText`([`Pattern`]) |             |        | ![No changes]         |


#### Methods

| Status    | Modifiers   | Generics | Type       | Method                              | Annotations | Throws | Compatibility Changes |
|-----------|-------------|----------|------------|-------------------------------------|-------------|--------|-----------------------|
| Unchanged | `protected` |          | `int`      | `cost`()                            |             |        | ![No changes]         |
| Unchanged | `public`    |          | `boolean`  | `matches`([`Element`], [`Element`]) |             |        | ![No changes]         |
| Unchanged | `public`    |          | [`String`] | `toString`()                        |             |        | ![No changes]         |

___

<a id="user-content-org.jsoup.select.evaluator$matcheswholetext"></a>
### `org.jsoup.select.Evaluator$MatchesWholeText`

- [X] Binary-compatible
- [X] Source-compatible
- [X] Serialization-compatible

| Status    | Modifiers                 | Type  | Name               | Extends       | JDK   | Serialization       | Compatibility Changes |
|-----------|---------------------------|-------|--------------------|---------------|-------|---------------------|-----------------------|
| Unchanged | `final` `static` `public` | Class | `MatchesWholeText` | [`Evaluator`] | JDK 8 | ![Not serializable] | ![No changes]         |


#### Constructors

| Status    | Modifiers | Generics | Constructor                     | Annotations | Throws | Compatibility Changes |
|-----------|-----------|----------|---------------------------------|-------------|--------|-----------------------|
| Unchanged | `public`  |          | `MatchesWholeText`([`Pattern`]) |             |        | ![No changes]         |


#### Methods

| Status    | Modifiers   | Generics | Type       | Method                              | Annotations | Throws | Compatibility Changes |
|-----------|-------------|----------|------------|-------------------------------------|-------------|--------|-----------------------|
| Unchanged | `protected` |          | `int`      | `cost`()                            |             |        | ![No changes]         |
| Unchanged | `public`    |          | `boolean`  | `matches`([`Element`], [`Element`]) |             |        | ![No changes]         |
| Unchanged | `public`    |          | [`String`] | `toString`()                        |             |        | ![No changes]         |

___

<a id="user-content-org.jsoup.select.evaluator$tag"></a>
### `org.jsoup.select.Evaluator$Tag`

- [X] Binary-compatible
- [X] Source-compatible
- [X] Serialization-compatible

| Status    | Modifiers                 | Type  | Name  | Extends       | JDK   | Serialization       | Compatibility Changes |
|-----------|---------------------------|-------|-------|---------------|-------|---------------------|-----------------------|
| Unchanged | `final` `static` `public` | Class | `Tag` | [`Evaluator`] | JDK 8 | ![Not serializable] | ![No changes]         |


#### Constructors

| Status    | Modifiers | Generics | Constructor       | Annotations | Throws | Compatibility Changes |
|-----------|-----------|----------|-------------------|-------------|--------|-----------------------|
| Unchanged | `public`  |          | `Tag`([`String`]) |             |        | ![No changes]         |


#### Methods

| Status    | Modifiers   | Generics | Type       | Method                              | Annotations | Throws | Compatibility Changes |
|-----------|-------------|----------|------------|-------------------------------------|-------------|--------|-----------------------|
| Unchanged | `protected` |          | `int`      | `cost`()                            |             |        | ![No changes]         |
| Unchanged | `public`    |          | `boolean`  | `matches`([`Element`], [`Element`]) |             |        | ![No changes]         |
| Unchanged | `public`    |          | [`String`] | `toString`()                        |             |        | ![No changes]         |

___

<a id="user-content-org.jsoup.select.evaluator$tagendswith"></a>
### `org.jsoup.select.Evaluator$TagEndsWith`

- [X] Binary-compatible
- [X] Source-compatible
- [X] Serialization-compatible

| Status    | Modifiers                 | Type  | Name          | Extends       | JDK   | Serialization       | Compatibility Changes |
|-----------|---------------------------|-------|---------------|---------------|-------|---------------------|-----------------------|
| Unchanged | `final` `static` `public` | Class | `TagEndsWith` | [`Evaluator`] | JDK 8 | ![Not serializable] | ![No changes]         |


#### Constructors

| Status    | Modifiers | Generics | Constructor               | Annotations | Throws | Compatibility Changes |
|-----------|-----------|----------|---------------------------|-------------|--------|-----------------------|
| Unchanged | `public`  |          | `TagEndsWith`([`String`]) |             |        | ![No changes]         |


#### Methods

| Status    | Modifiers | Generics | Type       | Method                              | Annotations | Throws | Compatibility Changes |
|-----------|-----------|----------|------------|-------------------------------------|-------------|--------|-----------------------|
| Unchanged | `public`  |          | `boolean`  | `matches`([`Element`], [`Element`]) |             |        | ![No changes]         |
| Unchanged | `public`  |          | [`String`] | `toString`()                        |             |        | ![No changes]         |

___

<a id="user-content-org.jsoup.select.evaluator$tagstartswith"></a>
### `org.jsoup.select.Evaluator$TagStartsWith`

- [X] Binary-compatible
- [X] Source-compatible
- [X] Serialization-compatible

| Status    | Modifiers                 | Type  | Name            | Extends       | JDK   | Serialization       | Compatibility Changes |
|-----------|---------------------------|-------|-----------------|---------------|-------|---------------------|-----------------------|
| Unchanged | `final` `static` `public` | Class | `TagStartsWith` | [`Evaluator`] | JDK 8 | ![Not serializable] | ![No changes]         |


#### Constructors

| Status    | Modifiers | Generics | Constructor                 | Annotations | Throws | Compatibility Changes |
|-----------|-----------|----------|-----------------------------|-------------|--------|-----------------------|
| Unchanged | `public`  |          | `TagStartsWith`([`String`]) |             |        | ![No changes]         |


#### Methods

| Status    | Modifiers | Generics | Type       | Method                              | Annotations | Throws | Compatibility Changes |
|-----------|-----------|----------|------------|-------------------------------------|-------------|--------|-----------------------|
| Unchanged | `public`  |          | `boolean`  | `matches`([`Element`], [`Element`]) |             |        | ![No changes]         |
| Unchanged | `public`  |          | [`String`] | `toString`()                        |             |        | ![No changes]         |

___

<a id="user-content-org.jsoup.select.nodefilter"></a>
### `org.jsoup.select.NodeFilter`

- [X] Binary-compatible
- [X] Source-compatible
- [X] Serialization-compatible

| Status    | Modifiers           | Type      | Name         | Extends    | JDK   | Serialization       | Compatibility Changes |
|-----------|---------------------|-----------|--------------|------------|-------|---------------------|-----------------------|
| Unchanged | `public` `abstract` | Interface | `NodeFilter` | [`Object`] | JDK 8 | ![Not serializable] | ![No changes]         |


#### Methods

| Status    | Modifiers           | Generics | Type             | Method                     | Annotations | Throws | Compatibility Changes |
|-----------|---------------------|----------|------------------|----------------------------|-------------|--------|-----------------------|
| Unchanged | `public` `abstract` |          | [`FilterResult`] | `head`([`Node`][9], `int`) |             |        | ![No changes]         |
| Unchanged | `public`            |          | [`FilterResult`] | `tail`([`Node`][9], `int`) |             |        | ![No changes]         |

___

<a id="user-content-org.jsoup.select.nodefilter$filterresult"></a>
### `org.jsoup.select.NodeFilter$FilterResult`

- [X] Binary-compatible
- [X] Source-compatible
- [X] Serialization-compatible

| Status    | Modifiers                 | Type | Name           | Extends     | JDK   | Serialization | Compatibility Changes |
|-----------|---------------------------|------|----------------|-------------|-------|---------------|-----------------------|
| Unchanged | `final` `static` `public` | Enum | `FilterResult` | [`Enum<E>`] | JDK 8 | ![Compatible] | ![No changes]         |


#### Implemented Interfaces

| Status    | Interface         | Compatibility Changes |
|-----------|-------------------|-----------------------|
| Unchanged | [`Serializable`]  | ![No changes]         |
| Unchanged | [`Comparable<T>`] | ![No changes]         |
| Unchanged | [`Constable`]     | ![No changes]         |


#### Methods

| Status    | Modifiers         | Generics | Type                   | Method                | Annotations | Throws | Compatibility Changes |
|-----------|-------------------|----------|------------------------|-----------------------|-------------|--------|-----------------------|
| Unchanged | `static` `public` |          | [`FilterResult`]       | `valueOf`([`String`]) |             |        | ![No changes]         |
| Unchanged | `static` `public` |          | [`FilterResult[]`][16] | `values`()            |             |        | ![No changes]         |


#### Fields

| Status    | Modifiers                 | Type             | Name            | Annotations | Compatibility Changes |
|-----------|---------------------------|------------------|-----------------|-------------|-----------------------|
| Unchanged | `public` `static` `final` | [`FilterResult`] | `CONTINUE`      |             | ![No changes]         |
| Unchanged | `public` `static` `final` | [`FilterResult`] | `REMOVE`        |             | ![No changes]         |
| Unchanged | `public` `static` `final` | [`FilterResult`] | `SKIP_CHILDREN` |             | ![No changes]         |
| Unchanged | `public` `static` `final` | [`FilterResult`] | `SKIP_ENTIRELY` |             | ![No changes]         |
| Unchanged | `public` `static` `final` | [`FilterResult`] | `STOP`          |             | ![No changes]         |

___

<a id="user-content-org.jsoup.select.nodetraversor"></a>
### `org.jsoup.select.NodeTraversor`

- [X] Binary-compatible
- [X] Source-compatible
- [X] Serialization-compatible

| Status    | Modifiers | Type  | Name            | Extends    | JDK   | Serialization       | Compatibility Changes |
|-----------|-----------|-------|-----------------|------------|-------|---------------------|-----------------------|
| Unchanged | `public`  | Class | `NodeTraversor` | [`Object`] | JDK 8 | ![Not serializable] | ![No changes]         |


#### Constructors

| Status    | Modifiers | Generics | Constructor       | Annotations | Throws | Compatibility Changes |
|-----------|-----------|----------|-------------------|-------------|--------|-----------------------|
| Unchanged | `public`  |          | `NodeTraversor`() |             |        | ![No changes]         |


#### Methods

| Status    | Modifiers         | Generics | Type             | Method                                    | Annotations | Throws | Compatibility Changes |
|-----------|-------------------|----------|------------------|-------------------------------------------|-------------|--------|-----------------------|
| Unchanged | `static` `public` |          | [`FilterResult`] | `filter`([`NodeFilter`], [`Node`][9])     |             |        | ![No changes]         |
| Unchanged | `static` `public` |          | `void`           | `filter`([`NodeFilter`], [`Elements`])    |             |        | ![No changes]         |
| Unchanged | `static` `public` |          | `void`           | `traverse`([`NodeVisitor`], [`Node`][9])  |             |        | ![No changes]         |
| Unchanged | `static` `public` |          | `void`           | `traverse`([`NodeVisitor`], [`Elements`]) |             |        | ![No changes]         |

___

<a id="user-content-org.jsoup.select.nodevisitor"></a>
### `org.jsoup.select.NodeVisitor`

- [X] Binary-compatible
- [X] Source-compatible
- [X] Serialization-compatible

| Status    | Modifiers           | Type      | Name          | Extends    | JDK   | Serialization       | Compatibility Changes |
|-----------|---------------------|-----------|---------------|------------|-------|---------------------|-----------------------|
| Unchanged | `public` `abstract` | Interface | `NodeVisitor` | [`Object`] | JDK 8 | ![Not serializable] | ![No changes]         |


#### Annotations

| Status    | Annotation              | Compatibility Changes |
|-----------|-------------------------|-----------------------|
| Unchanged | [`FunctionalInterface`] | ![No changes]         |


#### Methods

| Status    | Modifiers           | Generics | Type   | Method                     | Annotations | Throws | Compatibility Changes |
|-----------|---------------------|----------|--------|----------------------------|-------------|--------|-----------------------|
| Unchanged | `public` `abstract` |          | `void` | `head`([`Node`][9], `int`) |             |        | ![No changes]         |
| Unchanged | `public`            |          | `void` | `tail`([`Node`][9], `int`) |             |        | ![No changes]         |

___

<a id="user-content-org.jsoup.select.queryparser"></a>
### `org.jsoup.select.QueryParser`

- [X] Binary-compatible
- [X] Source-compatible
- [X] Serialization-compatible

| Status    | Modifiers | Type  | Name          | Extends    | JDK   | Serialization       | Compatibility Changes |
|-----------|-----------|-------|---------------|------------|-------|---------------------|-----------------------|
| Unchanged | `public`  | Class | `QueryParser` | [`Object`] | JDK 8 | ![Not serializable] | ![No changes]         |


#### Methods

| Status    | Modifiers         | Generics | Type          | Method              | Annotations | Throws | Compatibility Changes |
|-----------|-------------------|----------|---------------|---------------------|-------------|--------|-----------------------|
| Unchanged | `static` `public` |          | [`Evaluator`] | `parse`([`String`]) |             |        | ![No changes]         |
| Unchanged | `public`          |          | [`String`]    | `toString`()        |             |        | ![No changes]         |

___

<a id="user-content-org.jsoup.select.selector"></a>
### `org.jsoup.select.Selector`

- [X] Binary-compatible
- [X] Source-compatible
- [X] Serialization-compatible

| Status    | Modifiers | Type  | Name       | Extends    | JDK   | Serialization       | Compatibility Changes |
|-----------|-----------|-------|------------|------------|-------|---------------------|-----------------------|
| Unchanged | `public`  | Class | `Selector` | [`Object`] | JDK 8 | ![Not serializable] | ![No changes]         |


#### Methods

| Status    | Modifiers         | Generics | Type         | Method                                      | Annotations | Throws | Compatibility Changes |
|-----------|-------------------|----------|--------------|---------------------------------------------|-------------|--------|-----------------------|
| Unchanged | `static` `public` |          | [`Elements`] | `select`([`String`], [`Element`])           |             |        | ![No changes]         |
| Unchanged | `static` `public` |          | [`Elements`] | `select`([`Evaluator`], [`Element`])        |             |        | ![No changes]         |
| Unchanged | `static` `public` |          | [`Elements`] | `select`([`String`], [`Iterable<Element>`]) |             |        | ![No changes]         |
| Unchanged | `static` `public` |          | [`Element`]  | `selectFirst`([`String`], [`Element`])      |             |        | ![No changes]         |

___

<a id="user-content-org.jsoup.select.selector$selectorparseexception"></a>
### `org.jsoup.select.Selector$SelectorParseException`

- [X] Binary-compatible
- [X] Source-compatible
- [X] Serialization-compatible

| Status    | Modifiers         | Type  | Name                     | Extends                   | JDK   | Serialization | Compatibility Changes |
|-----------|-------------------|-------|--------------------------|---------------------------|-------|---------------|-----------------------|
| Unchanged | `static` `public` | Class | `SelectorParseException` | [`IllegalStateException`] | JDK 8 | ![Compatible] | ![No changes]         |


#### Implemented Interfaces

| Status    | Interface        | Compatibility Changes |
|-----------|------------------|-----------------------|
| Unchanged | [`Serializable`] | ![No changes]         |


#### Constructors

| Status    | Modifiers | Generics | Constructor                                         | Annotations | Throws | Compatibility Changes |
|-----------|-----------|----------|-----------------------------------------------------|-------------|--------|-----------------------|
| Unchanged | `public`  |          | `SelectorParseException`([`Throwable`], [`String`], [`Object...`]) |  |    | ![No changes]         |
| Unchanged | `public`  |          | `SelectorParseException`([`String`])                |             |        | ![No changes]         |
| Unchanged | `public`  |          | `SelectorParseException`([`String`], [`Object...`]) |             |        | ![No changes]         |


</details>


___

*Generated on: 2024-11-08 11:30:25.985+0300*.

[1]: # "org.jsoup.Connection$Method[]"
[2]: # "org.jsoup.Connection$Base<T extends org.jsoup.Connection$Base<T>>"
[3]: # "org.jsoup.helper.HttpConnection$KeyVal"
[4]: # "org.jsoup.helper.HttpConnection$Base<T extends org.jsoup.Connection$Base<T>>"
[5]: # "org.jsoup.helper.HttpConnection$Request"
[6]: # "org.jsoup.helper.HttpConnection$Response"
[7]: # "java.lang.Object[]"
[8]: # "org.w3c.dom.Document"
[9]: # "org.jsoup.nodes.Node"
[10]: # "java.lang.String[]"
[11]: # "org.jsoup.nodes.Document$OutputSettings$Syntax[]"
[12]: # "org.jsoup.nodes.Document$QuirksMode[]"
[13]: # "org.jsoup.nodes.Entities$EscapeMode[]"
[14]: # "org.jsoup.nodes.Node[]"
[15]: # "org.jsoup.parser.Token$TokenType[]"
[16]: # "org.jsoup.select.NodeFilter$FilterResult[]"
[Compatible]: https://img.shields.io/badge/Compatible-green "Compatible"
[Method added to public class]: https://img.shields.io/badge/Method_added_to_public_class-yellow "Method added to public class"
[No changes]: https://img.shields.io/badge/No_changes-green "No changes"
[Not serializable]: https://img.shields.io/badge/Not_serializable-green "Not serializable"
[`Appendable`]: # "java.lang.Appendable"
[`ArrayList<E>`]: # "java.util.ArrayList<E extends java.lang.Object>"
[`AttributeKeyPair`]: # "org.jsoup.select.Evaluator$AttributeKeyPair"
[`AttributeRange`]: # "org.jsoup.nodes.Range$AttributeRange"
[`Attribute`]: # "org.jsoup.nodes.Attribute"
[`Attributes`]: # "org.jsoup.nodes.Attributes"
[`AutoCloseable`]: # "java.lang.AutoCloseable"
[`Base<T>`]: # "org.jsoup.Connection$Base<T>"
[`Base`]: # "org.jsoup.Connection$Base"
[`BufferedInputStream`]: # "java.io.BufferedInputStream"
[`ByteBuffer`]: # "java.nio.ByteBuffer"
[`CDataNode`]: # "org.jsoup.nodes.CDataNode"
[`Charset`]: # "java.nio.charset.Charset"
[`Class<T>`]: # "java.lang.Class<T>"
[`Cloneable`]: # "java.lang.Cloneable"
[`Closeable`]: # "java.io.Closeable"
[`Collection<? extends E>`]: # "java.util.Collection<? extends E>"
[`Collection<? extends Node>`]: # "java.util.Collection<? extends org.jsoup.nodes.Node>"
[`Collection<?>`]: # "java.util.Collection<?>"
[`Collection<E>`]: # "java.util.Collection<E extends java.lang.Object>"
[`Collection<Element>`]: # "java.util.Collection<org.jsoup.nodes.Element>"
[`Collection<KeyVal>`]: # "java.util.Collection<org.jsoup.Connection$KeyVal>"
[`Collector<CharSequence, ?, String>`]: # "java.util.stream.Collector<java.lang.CharSequence, ?, java.lang.String>"
[`CombiningEvaluator`]: # "org.jsoup.select.CombiningEvaluator"
[`Comment`]: # "org.jsoup.nodes.Comment"
[`Comparable<T>`]: # "java.lang.Comparable<T extends java.lang.Object>"
[`Connection`]: # "org.jsoup.Connection"
[`Constable`]: # "java.lang.constant.Constable"
[`Consumer<? super Node>`]: # "java.util.function.Consumer<? super org.jsoup.nodes.Node>"
[`Context`]: # "org.jsoup.helper.RequestAuthenticator$Context"
[`ControllableInputStream`]: # "org.jsoup.internal.ControllableInputStream"
[`CookieStore`]: # "java.net.CookieStore"
[`CssNthEvaluator`]: # "org.jsoup.select.Evaluator$CssNthEvaluator"
[`DataNode`]: # "org.jsoup.nodes.DataNode"
[`DocumentBuilderFactory`]: # "javax.xml.parsers.DocumentBuilderFactory"
[`DocumentType`]: # "org.jsoup.nodes.DocumentType"
[`Document`]: # "org.jsoup.nodes.Document"
[`Element...`]: # "org.jsoup.nodes.Element..."
[`Element`]: # "org.jsoup.nodes.Element"
[`Elements`]: # "org.jsoup.select.Elements"
[`EndTag`]: # "org.jsoup.parser.Token$EndTag"
[`Entry<K, V>`]: # "java.util.Map$Entry<K extends java.lang.Object, V extends java.lang.Object>"
[`Enum<E>`]: # "java.lang.Enum<E extends java.lang.Enum<E>>"
[`EscapeMode`]: # "org.jsoup.nodes.Entities$EscapeMode"
[`Evaluator`]: # "org.jsoup.select.Evaluator"
[`File`]: # "java.io.File"
[`FilterInputStream`]: # "java.io.FilterInputStream"
[`FilterResult`]: # "org.jsoup.select.NodeFilter$FilterResult"
[`FormElement`]: # "org.jsoup.nodes.FormElement"
[`Function<T, IdentityHashMap<K, V>>`]: # "java.util.function.Function<T, java.util.IdentityHashMap<K, V>>"
[`Function<T, List<U>>`]: # "java.util.function.Function<T, java.util.List<U>>"
[`Function<T, Map<K, V>>`]: # "java.util.function.Function<T, java.util.Map<K, V>>"
[`Function<T, Set<U>>`]: # "java.util.function.Function<T, java.util.Set<U>>"
[`FunctionalInterface`]: # "java.lang.FunctionalInterface"
[`FuzzedDataProvider`]: # "com.code_intelligence.jazzer.api.FuzzedDataProvider"
[`HashMap<String, String>`]: # "java.util.HashMap<java.lang.String, java.lang.String>"
[`IOException`]: # "java.io.IOException"
[`IllegalArgumentException`]: # "java.lang.IllegalArgumentException"
[`IllegalStateException`]: # "java.lang.IllegalStateException"
[`IndexEvaluator`]: # "org.jsoup.select.Evaluator$IndexEvaluator"
[`InputStream`]: # "java.io.InputStream"
[`IsNthLastOfType`]: # "org.jsoup.select.Evaluator$IsNthLastOfType"
[`IsNthOfType`]: # "org.jsoup.select.Evaluator$IsNthOfType"
[`Iterable<Element>`]: # "java.lang.Iterable<org.jsoup.nodes.Element>"
[`Iterable<T>`]: # "java.lang.Iterable<T extends java.lang.Object>"
[`Iterator<?>`]: # "java.util.Iterator<?>"
[`Iterator<Attribute>`]: # "java.util.Iterator<org.jsoup.nodes.Attribute>"
[`Iterator<E>`]: # "java.util.Iterator<E extends java.lang.Object>"
[`Iterator<Element>`]: # "java.util.Iterator<org.jsoup.nodes.Element>"
[`K extends Object`]: # "K extends java.lang.Object"
[`KeyVal`]: # "org.jsoup.Connection$KeyVal"
[`LeafNode`]: # "org.jsoup.nodes.LeafNode"
[`List<Attribute>`]: # "java.util.List<org.jsoup.nodes.Attribute>"
[`List<Comment>`]: # "java.util.List<org.jsoup.nodes.Comment>"
[`List<DataNode>`]: # "java.util.List<org.jsoup.nodes.DataNode>"
[`List<E>`]: # "java.util.List<E extends java.lang.Object>"
[`List<Element>`]: # "java.util.List<org.jsoup.nodes.Element>"
[`List<FormElement>`]: # "java.util.List<org.jsoup.nodes.FormElement>"
[`List<KeyVal>`]: # "java.util.List<org.jsoup.Connection$KeyVal>"
[`List<Node>`]: # "java.util.List<org.jsoup.nodes.Node>"
[`List<String>`]: # "java.util.List<java.lang.String>"
[`List<T>`]: # "java.util.List<T>"
[`List<TextNode>`]: # "java.util.List<org.jsoup.nodes.TextNode>"
[`MalformedURLException`]: # "java.net.MalformedURLException"
[`Map<String, List<String>>`]: # "java.util.Map<java.lang.String, java.util.List<java.lang.String>>"
[`Map<String, String>`]: # "java.util.Map<java.lang.String, java.lang.String>"
[`Method`]: # "org.jsoup.Connection$Method"
[`Node...`]: # "org.jsoup.nodes.Node..."
[`NodeFilter`]: # "org.jsoup.select.NodeFilter"
[`NodeIterator<Node>`]: # "org.jsoup.nodes.NodeIterator<org.jsoup.nodes.Node>"
[`NodeList`]: # "org.w3c.dom.NodeList"
[`NodeVisitor`]: # "org.jsoup.select.NodeVisitor"
[`Node`]: # "org.w3c.dom.Node"
[`Object...`]: # "java.lang.Object..."
[`Object`]: # "java.lang.Object"
[`OutputSettings`]: # "org.jsoup.nodes.Document$OutputSettings"
[`ParseErrorList`]: # "org.jsoup.parser.ParseErrorList"
[`ParseSettings`]: # "org.jsoup.parser.ParseSettings"
[`Parser`]: # "org.jsoup.parser.Parser"
[`PasswordAuthentication`]: # "java.net.PasswordAuthentication"
[`Path`]: # "java.nio.file.Path"
[`Pattern`]: # "java.util.regex.Pattern"
[`Position`]: # "org.jsoup.nodes.Range$Position"
[`Predicate<? super Element>`]: # "java.util.function.Predicate<? super org.jsoup.nodes.Element>"
[`Predicate<Element>`]: # "java.util.function.Predicate<org.jsoup.nodes.Element>"
[`Progress<ProgressContext>`]: # "org.jsoup.Progress<ProgressContext>"
[`Progress<Response>`]: # "org.jsoup.Progress<org.jsoup.Connection$Response>"
[`ProgressContext extends Object`]: # "ProgressContext extends java.lang.Object"
[`Proxy`]: # "java.net.Proxy"
[`QuirksMode`]: # "org.jsoup.nodes.Document$QuirksMode"
[`RandomAccess`]: # "java.util.RandomAccess"
[`Range`]: # "org.jsoup.nodes.Range"
[`Reader`]: # "java.io.Reader"
[`RequestAuthenticator`]: # "org.jsoup.helper.RequestAuthenticator"
[`Request`]: # "org.jsoup.Connection$Request"
[`RequestorType`]: # "java.net.Authenticator$RequestorType"
[`Response`]: # "org.jsoup.Connection$Response"
[`RuntimeException`]: # "java.lang.RuntimeException"
[`SSLSocketFactory`]: # "javax.net.ssl.SSLSocketFactory"
[`Safelist`]: # "org.jsoup.safety.Safelist"
[`SequencedCollection<E>`]: # "java.util.SequencedCollection<E extends java.lang.Object>"
[`Serializable`]: # "java.io.Serializable"
[`Set<String>`]: # "java.util.Set<java.lang.String>"
[`Stream<Element>`]: # "java.util.stream.Stream<org.jsoup.nodes.Element>"
[`Stream<Node>`]: # "java.util.stream.Stream<org.jsoup.nodes.Node>"
[`Stream<T>`]: # "java.util.stream.Stream<T>"
[`StreamParser`]: # "org.jsoup.parser.StreamParser"
[`String...`]: # "java.lang.String..."
[`StringBuilder`]: # "java.lang.StringBuilder"
[`StringJoiner`]: # "org.jsoup.internal.StringUtil$StringJoiner"
[`String`]: # "java.lang.String"
[`Supplier<T>`]: # "java.util.function.Supplier<T>"
[`Syntax`]: # "org.jsoup.nodes.Document$OutputSettings$Syntax"
[`T extends Appendable`]: # "T extends java.lang.Appendable"
[`T extends Node`]: # "T extends org.jsoup.nodes.Node"
[`T extends Object`]: # "T extends java.lang.Object"
[`Tag`]: # "org.jsoup.parser.Tag"
[`TextNode`]: # "org.jsoup.nodes.TextNode"
[`Throwable`]: # "java.lang.Throwable"
[`TokenType`]: # "org.jsoup.parser.Token$TokenType"
[`Token`]: # "org.jsoup.parser.Token"
[`TreeBuilder`]: # "org.jsoup.parser.TreeBuilder"
[`U extends Object`]: # "U extends java.lang.Object"
[`URL`]: # "java.net.URL"
[`UnaryOperator<Element>`]: # "java.util.function.UnaryOperator<org.jsoup.nodes.Element>"
[`V extends Object`]: # "V extends java.lang.Object"
[`W3CDom`]: # "org.jsoup.helper.W3CDom"
[`XmlDeclaration`]: # "org.jsoup.nodes.XmlDeclaration"
[org.jsoup.Connection]: #user-content-org.jsoup.connection
[org.jsoup.Connection$Base]: #user-content-org.jsoup.connection$base
[org.jsoup.Connection$KeyVal]: #user-content-org.jsoup.connection$keyval
[org.jsoup.Connection$Method]: #user-content-org.jsoup.connection$method
[org.jsoup.Connection$Request]: #user-content-org.jsoup.connection$request
[org.jsoup.Connection$Response]: #user-content-org.jsoup.connection$response
[org.jsoup.HttpStatusException]: #user-content-org.jsoup.httpstatusexception
[org.jsoup.Jsoup]: #user-content-org.jsoup.jsoup
[org.jsoup.ParserFuzzerTest]: #user-content-org.jsoup.parserfuzzertest
[org.jsoup.Progress]: #user-content-org.jsoup.progress
[org.jsoup.SerializationException]: #user-content-org.jsoup.serializationexception
[org.jsoup.UnsupportedMimeTypeException]: #user-content-org.jsoup.unsupportedmimetypeexception
[org.jsoup.helper.ChangeNotifyingArrayList]: #user-content-org.jsoup.helper.changenotifyingarraylist
[org.jsoup.helper.DataUtil]: #user-content-org.jsoup.helper.datautil
[org.jsoup.helper.HttpConnection]: #user-content-org.jsoup.helper.httpconnection
[org.jsoup.helper.HttpConnection$KeyVal]: #user-content-org.jsoup.helper.httpconnection$keyval
[org.jsoup.helper.HttpConnection$Request]: #user-content-org.jsoup.helper.httpconnection$request
[org.jsoup.helper.HttpConnection$Response]: #user-content-org.jsoup.helper.httpconnection$response
[org.jsoup.helper.RequestAuthenticator]: #user-content-org.jsoup.helper.requestauthenticator
[org.jsoup.helper.RequestAuthenticator$Context]: #user-content-org.jsoup.helper.requestauthenticator$context
[org.jsoup.helper.Validate]: #user-content-org.jsoup.helper.validate
[org.jsoup.helper.ValidationException]: #user-content-org.jsoup.helper.validationexception
[org.jsoup.helper.W3CDom]: #user-content-org.jsoup.helper.w3cdom
[org.jsoup.helper.W3CDom$W3CBuilder]: #user-content-org.jsoup.helper.w3cdom$w3cbuilder
[org.jsoup.internal.ControllableInputStream]: #user-content-org.jsoup.internal.controllableinputstream
[org.jsoup.internal.Functions]: #user-content-org.jsoup.internal.functions
[org.jsoup.internal.Normalizer]: #user-content-org.jsoup.internal.normalizer
[org.jsoup.internal.SharedConstants]: #user-content-org.jsoup.internal.sharedconstants
[org.jsoup.internal.SoftPool]: #user-content-org.jsoup.internal.softpool
[org.jsoup.internal.StringUtil]: #user-content-org.jsoup.internal.stringutil
[org.jsoup.internal.StringUtil$StringJoiner]: #user-content-org.jsoup.internal.stringutil$stringjoiner
[org.jsoup.nodes.Attribute]: #user-content-org.jsoup.nodes.attribute
[org.jsoup.nodes.Attributes]: #user-content-org.jsoup.nodes.attributes
[org.jsoup.nodes.CDataNode]: #user-content-org.jsoup.nodes.cdatanode
[org.jsoup.nodes.Comment]: #user-content-org.jsoup.nodes.comment
[org.jsoup.nodes.DataNode]: #user-content-org.jsoup.nodes.datanode
[org.jsoup.nodes.Document]: #user-content-org.jsoup.nodes.document
[org.jsoup.nodes.Document$OutputSettings]: #user-content-org.jsoup.nodes.document$outputsettings
[org.jsoup.nodes.Document$OutputSettings$Syntax]: #user-content-org.jsoup.nodes.document$outputsettings$syntax
[org.jsoup.nodes.Document$QuirksMode]: #user-content-org.jsoup.nodes.document$quirksmode
[org.jsoup.nodes.DocumentType]: #user-content-org.jsoup.nodes.documenttype
[org.jsoup.nodes.Element]: #user-content-org.jsoup.nodes.element
[org.jsoup.nodes.Entities]: #user-content-org.jsoup.nodes.entities
[org.jsoup.nodes.Entities$EscapeMode]: #user-content-org.jsoup.nodes.entities$escapemode
[org.jsoup.nodes.FormElement]: #user-content-org.jsoup.nodes.formelement
[org.jsoup.nodes.LeafNode]: #user-content-org.jsoup.nodes.leafnode
[org.jsoup.nodes.Node]: #user-content-org.jsoup.nodes.node
[org.jsoup.nodes.NodeIterator]: #user-content-org.jsoup.nodes.nodeiterator
[org.jsoup.nodes.PseudoTextElement]: #user-content-org.jsoup.nodes.pseudotextelement
[org.jsoup.nodes.Range]: #user-content-org.jsoup.nodes.range
[org.jsoup.nodes.Range$AttributeRange]: #user-content-org.jsoup.nodes.range$attributerange
[org.jsoup.nodes.Range$Position]: #user-content-org.jsoup.nodes.range$position
[org.jsoup.nodes.TextNode]: #user-content-org.jsoup.nodes.textnode
[org.jsoup.nodes.XmlDeclaration]: #user-content-org.jsoup.nodes.xmldeclaration
[org.jsoup.parser.CharacterReader]: #user-content-org.jsoup.parser.characterreader
[org.jsoup.parser.HtmlTreeBuilder]: #user-content-org.jsoup.parser.htmltreebuilder
[org.jsoup.parser.ParseError]: #user-content-org.jsoup.parser.parseerror
[org.jsoup.parser.ParseErrorList]: #user-content-org.jsoup.parser.parseerrorlist
[org.jsoup.parser.ParseSettings]: #user-content-org.jsoup.parser.parsesettings
[org.jsoup.parser.Parser]: #user-content-org.jsoup.parser.parser
[org.jsoup.parser.StreamParser]: #user-content-org.jsoup.parser.streamparser
[org.jsoup.parser.Tag]: #user-content-org.jsoup.parser.tag
[org.jsoup.parser.Token$TokenType]: #user-content-org.jsoup.parser.token$tokentype
[org.jsoup.parser.TokenQueue]: #user-content-org.jsoup.parser.tokenqueue
[org.jsoup.parser.XmlTreeBuilder]: #user-content-org.jsoup.parser.xmltreebuilder
[org.jsoup.safety.Cleaner]: #user-content-org.jsoup.safety.cleaner
[org.jsoup.safety.Safelist]: #user-content-org.jsoup.safety.safelist
[org.jsoup.select.Collector]: #user-content-org.jsoup.select.collector
[org.jsoup.select.CombiningEvaluator]: #user-content-org.jsoup.select.combiningevaluator
[org.jsoup.select.CombiningEvaluator$And]: #user-content-org.jsoup.select.combiningevaluator$and
[org.jsoup.select.CombiningEvaluator$Or]: #user-content-org.jsoup.select.combiningevaluator$or
[org.jsoup.select.Elements]: #user-content-org.jsoup.select.elements
[org.jsoup.select.Evaluator]: #user-content-org.jsoup.select.evaluator
[org.jsoup.select.Evaluator$AllElements]: #user-content-org.jsoup.select.evaluator$allelements
[org.jsoup.select.Evaluator$Attribute]: #user-content-org.jsoup.select.evaluator$attribute
[org.jsoup.select.Evaluator$AttributeKeyPair]: #user-content-org.jsoup.select.evaluator$attributekeypair
[org.jsoup.select.Evaluator$AttributeStarting]: #user-content-org.jsoup.select.evaluator$attributestarting
[org.jsoup.select.Evaluator$AttributeWithValue]: #user-content-org.jsoup.select.evaluator$attributewithvalue
[org.jsoup.select.Evaluator$AttributeWithValueContaining]: #user-content-org.jsoup.select.evaluator$attributewithvaluecontaining
[org.jsoup.select.Evaluator$AttributeWithValueEnding]: #user-content-org.jsoup.select.evaluator$attributewithvalueending
[org.jsoup.select.Evaluator$AttributeWithValueMatching]: #user-content-org.jsoup.select.evaluator$attributewithvaluematching
[org.jsoup.select.Evaluator$AttributeWithValueNot]: #user-content-org.jsoup.select.evaluator$attributewithvaluenot
[org.jsoup.select.Evaluator$AttributeWithValueStarting]: #user-content-org.jsoup.select.evaluator$attributewithvaluestarting
[org.jsoup.select.Evaluator$Class]: #user-content-org.jsoup.select.evaluator$class
[org.jsoup.select.Evaluator$ContainsData]: #user-content-org.jsoup.select.evaluator$containsdata
[org.jsoup.select.Evaluator$ContainsOwnText]: #user-content-org.jsoup.select.evaluator$containsowntext
[org.jsoup.select.Evaluator$ContainsText]: #user-content-org.jsoup.select.evaluator$containstext
[org.jsoup.select.Evaluator$ContainsWholeOwnText]: #user-content-org.jsoup.select.evaluator$containswholeowntext
[org.jsoup.select.Evaluator$ContainsWholeText]: #user-content-org.jsoup.select.evaluator$containswholetext
[org.jsoup.select.Evaluator$CssNthEvaluator]: #user-content-org.jsoup.select.evaluator$cssnthevaluator
[org.jsoup.select.Evaluator$Id]: #user-content-org.jsoup.select.evaluator$id
[org.jsoup.select.Evaluator$IndexEquals]: #user-content-org.jsoup.select.evaluator$indexequals
[org.jsoup.select.Evaluator$IndexEvaluator]: #user-content-org.jsoup.select.evaluator$indexevaluator
[org.jsoup.select.Evaluator$IndexGreaterThan]: #user-content-org.jsoup.select.evaluator$indexgreaterthan
[org.jsoup.select.Evaluator$IndexLessThan]: #user-content-org.jsoup.select.evaluator$indexlessthan
[org.jsoup.select.Evaluator$IsEmpty]: #user-content-org.jsoup.select.evaluator$isempty
[org.jsoup.select.Evaluator$IsFirstChild]: #user-content-org.jsoup.select.evaluator$isfirstchild
[org.jsoup.select.Evaluator$IsFirstOfType]: #user-content-org.jsoup.select.evaluator$isfirstoftype
[org.jsoup.select.Evaluator$IsLastChild]: #user-content-org.jsoup.select.evaluator$islastchild
[org.jsoup.select.Evaluator$IsLastOfType]: #user-content-org.jsoup.select.evaluator$islastoftype
[org.jsoup.select.Evaluator$IsNthChild]: #user-content-org.jsoup.select.evaluator$isnthchild
[org.jsoup.select.Evaluator$IsNthLastChild]: #user-content-org.jsoup.select.evaluator$isnthlastchild
[org.jsoup.select.Evaluator$IsNthLastOfType]: #user-content-org.jsoup.select.evaluator$isnthlastoftype
[org.jsoup.select.Evaluator$IsNthOfType]: #user-content-org.jsoup.select.evaluator$isnthoftype
[org.jsoup.select.Evaluator$IsOnlyChild]: #user-content-org.jsoup.select.evaluator$isonlychild
[org.jsoup.select.Evaluator$IsOnlyOfType]: #user-content-org.jsoup.select.evaluator$isonlyoftype
[org.jsoup.select.Evaluator$IsRoot]: #user-content-org.jsoup.select.evaluator$isroot
[org.jsoup.select.Evaluator$MatchText]: #user-content-org.jsoup.select.evaluator$matchtext
[org.jsoup.select.Evaluator$Matches]: #user-content-org.jsoup.select.evaluator$matches
[org.jsoup.select.Evaluator$MatchesOwn]: #user-content-org.jsoup.select.evaluator$matchesown
[org.jsoup.select.Evaluator$MatchesWholeOwnText]: #user-content-org.jsoup.select.evaluator$matcheswholeowntext
[org.jsoup.select.Evaluator$MatchesWholeText]: #user-content-org.jsoup.select.evaluator$matcheswholetext
[org.jsoup.select.Evaluator$Tag]: #user-content-org.jsoup.select.evaluator$tag
[org.jsoup.select.Evaluator$TagEndsWith]: #user-content-org.jsoup.select.evaluator$tagendswith
[org.jsoup.select.Evaluator$TagStartsWith]: #user-content-org.jsoup.select.evaluator$tagstartswith
[org.jsoup.select.NodeFilter]: #user-content-org.jsoup.select.nodefilter
[org.jsoup.select.NodeFilter$FilterResult]: #user-content-org.jsoup.select.nodefilter$filterresult
[org.jsoup.select.NodeTraversor]: #user-content-org.jsoup.select.nodetraversor
[org.jsoup.select.NodeVisitor]: #user-content-org.jsoup.select.nodevisitor
[org.jsoup.select.QueryParser]: #user-content-org.jsoup.select.queryparser
[org.jsoup.select.Selector]: #user-content-org.jsoup.select.selector
[org.jsoup.select.Selector$SelectorParseException]: #user-content-org.jsoup.select.selector$selectorparseexception
