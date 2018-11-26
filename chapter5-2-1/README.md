# Spring Boot中使用RabbitMQ

#### Message Broker与AMQP简介（bulabula。。。看不太懂。。。）

Message Broker是一种消息验证、传输、路由的架构模式，其设计目标主要应用于下面这些场景：

- 消息路由到一个或多个目的地
- 消息转化为其他的表现方式
- 执行消息的聚集、消息的分解，并将结果发送到他们的目的地，然后重新组合相应返回给消息用户
- 调用Web服务来检索数据
- 响应事件或错误
- 使用发布-订阅模式来提供内容或基于主题的消息路由

AMQP是Advanced Message Queuing Protocol的简称，它是一个面向消息中间件的开放式标准应用层协议。

AMQP定义了这些特性：

- 消息方向
- 消息队列
- 消息路由（包括：点到点和发布-订阅模式）
- 可靠性
- 安全性

#### RabbitMQ

安装：

- Erlang/OTP
http://www.erlang.org/downloads
- RabbitMQ Server
https://www.rabbitmq.com/download.html

#### Rabbit管理

可以直接通过配置文件的访问进行管理，也可以通过Web的访问进行管理。

通过Web进行管理：

- 执行rabbitmq-plugins enable rabbitmq_management命令，开启Web管理插件，这样我们就可以通过浏览器来进行管理了。
- 打开浏览器并访问：http://localhost:15672/，并使用默认用户guest登录，密码也为guest。
- 点击Admin标签，在这里可以进行用户的管理。