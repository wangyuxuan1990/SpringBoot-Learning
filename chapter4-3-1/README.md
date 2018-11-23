# Spring Boot中使用Spring Security进行安全控制

### 整合Spring Security

#### 添加依赖

在pom.xml中添加如下配置，引入对Spring Security的依赖。

```xml
<dependencies>
    ...
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-security</artifactId>
        </dependency>
    ...
</dependencies>
```

#### Spring Security配置

- 通过@EnableWebSecurity注解开启Spring Security的功能
- 继承WebSecurityConfigurerAdapter，并重写它的方法来设置一些web安全的细节
- configure(HttpSecurity http)方法
  - 通过authorizeRequests()定义哪些URL需要被保护、哪些不需要被保护。
  - 通过formLogin()定义当需要用户登录时候，转到的登录页面。
- configureGlobal(AuthenticationManagerBuilder auth)方法，在内存中创建了一个用户，该用户的名称为user，密码为password，用户角色为USER。

根据配置，Spring Security提供了一个过滤器来拦截请求并验证用户身份。如果用户身份认证失败，页面就重定向到/login?error，并且页面中会展现相应的错误信息。若用户想要注销登录，可以通过访问/login?logout请求，在完成注销之后，页面展现相应的成功消息。

注：Spring security 5.0中新增了多种加密方式，也改变了密码的格式。https://blog.csdn.net/canon_in_d_major/article/details/79675033