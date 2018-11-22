# Spring Boot 1.5.x新特性：动态修改日志级别

#### loggers端点

在application.properties中增加一个配置，来关闭安全认证校验。

```
management.security.enabled=false
```

发送POST请求到/loggers/com.wangyuxuan端点，修改日志级别，其中请求体Body内容为：

```json
{
    "configuredLevel": "DEBUG"
}
```

发送GET请求到/loggers/com.didispace端点，来查看当前的日志级别设置：

```json
{
  "configuredLevel": "DEBUG",
  "effectiveLevel": "DEBUG"
}
```

我们也可以不限定条件，直接通过GET请求访问/loggers来获取所有的日志级别设置。