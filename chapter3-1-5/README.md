# Spring Boot Swagger2
通过@Configuration注解，让Spring来加载该类配置。

再通过@EnableSwagger2注解来启用Swagger2。

再通过createRestApi函数创建Docket的Bean之后，apiInfo()用来创建该Api的基本信息（这些基本信息会展现在文档页面中）。

select()函数返回一个ApiSelectorBuilder实例用来控制哪些接口暴露给Swagger来展现。

通过@ApiOperation注解来给API增加说明、通过@ApiImplicitParams、@ApiImplicitParam注解来给参数增加说明。

访问：http://localhost:8080/swagger-ui.html