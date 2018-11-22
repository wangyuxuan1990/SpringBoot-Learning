# Spring Boot中对log4j进行多环境不同日志级别的控制

对于不同环境的使用人员也不需要改变代码或打包文件，只需要通过执行命令中参加参数即可，比如我想采用生产环境的级别，那么我可以这样运行应用：

```java
java -jar xxx.jar --spring.profiles.active=prod
```