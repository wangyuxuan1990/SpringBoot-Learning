# Spring Boot整合MyBatis

####pom.xml中引入依赖：

- 这里用到spring-boot-starter基础和spring-boot-starter-test用来做单元测试验证数据访问
- 引入连接mysql的必要依赖mysql-connector-java
- 引入整合MyBatis的核心依赖mybatis-spring-boot-starter
- 这里不引入spring-boot-starter-jdbc依赖，是由于mybatis-spring-boot-starter中已经包含了此依赖