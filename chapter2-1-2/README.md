# Spring Boot 2.0

**简单类型**

除移除特殊字符外，还会将配置均以全小写的方式进行匹配和加载。

所以，下面的4种配置方式都是等价的：

spring.jpa.databaseplatform=mysql

推荐

spring.jpa.database-platform=mysql

spring.jpa.databasePlatform=mysql

spring.JPA.database_platform=mysql

**List类型**

注意：在Spring Boot 2.0中对于List类型的配置必须是连续的，不然会抛出UnboundConfigurationPropertiesException异常

spring.my-example.url[0]=http://example.com

spring.my-example.url[1]=http://spring.io

支持逗号分割（上下等价）

spring.my-example.url=http://example.com,http://spring.io

**Map类型**

注意：如果Map类型的key包含非字母数字和-的字符，需要用[]括起来

spring.my-example.foo=bar

spring.my-example.hello=world

spring.my-example.[foo.baz]=bar

**属性的读取**

唯一名称符合如下规则：

- 通过.分离各个元素
- 最后一个.将前缀与属性名称分开
- 必须是字母（a-z）和数字(0-9)
- 必须是小写字母
- 用连字符-来分隔单词
- 唯一允许的其他字符是[和]，用于List的索引
- 不能以数字开头

注意：使用@Value获取配置内容的时候也需要这样的特点