# Spring Boot实现异步调用

1. 在Spring Boot的主类中加入@EnableAsync注解，使异步调用生效
2. 通过使用@Async注解就能简单的将原来的同步函数变为异步函数

注： @Async所修饰的函数不要定义为static类型，这样异步调用不会生效

使用Future<T>来返回异步调用的结果