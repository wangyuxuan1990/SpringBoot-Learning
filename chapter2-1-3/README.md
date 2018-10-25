# Spring Boot 2.0 事件模型

2.0版本中所有的事件按执行的先后顺序如下：

- ApplicationStartingEvent
- ApplicationEnvironmentPreparedEvent
- ApplicationPreparedEvent
- ApplicationStartedEvent <= 新增的事件
- ApplicationReadyEvent => 之后command-line runners被调用
- ApplicationFailedEvent