# Spring Boot开发Web应用

*默认配置*

Spring Boot默认提供静态资源目录位置需置于classpath下，目录名需符合如下规则：

- /static
- /public
- /resources
- /META-INF/resources

举例：我们可以在src/main/resources/目录下创建static，在该位置放置一个图片文件。启动程序后，尝试访问http://localhost:8080/D.jpg。如能显示图片，配置成功。

*模板引擎*

Spring Boot提供了默认配置的模板引擎主要有以下几种：

- Thymeleaf
- FreeMarker
- Velocity
- Groovy
- Mustache

当你使用上述模板引擎中的任何一个，它们默认的模板配置路径为：src/main/resources/templates。当然也可以修改这个路径，具体如何修改，可在后续各模板引擎的配置属性中查询并修改。

*Thymeleaf的默认参数配置*

如有需要修改默认配置的时候，只需复制下面要修改的属性到application.properties中，并修改成需要的值，如修改模板文件的扩展名，修改默认的模板路径等。

- // Enable template caching.
- spring.thymeleaf.cache=true 
- // Check that the templates location exists.
- spring.thymeleaf.check-template-location=true 
- // Content-Type value.
- spring.thymeleaf.content-type=text/html 
- // Enable MVC Thymeleaf view resolution.
- spring.thymeleaf.enabled=true 
- // Template encoding.
- spring.thymeleaf.encoding=UTF-8 
- // Comma-separated list of view names that should be excluded from resolution.
- spring.thymeleaf.excluded-view-names= 
- // Template mode to be applied to templates. See also StandardTemplateModeHandlers.
- spring.thymeleaf.mode=HTML5 
- // Prefix that gets prepended to view names when building a URL.
- spring.thymeleaf.prefix=classpath:/templates/ 
- // Suffix that gets appended to view names when building a URL.
- spring.thymeleaf.suffix=.html  spring.thymeleaf.template-resolver-order= # Order of the template resolver in the chain. spring.thymeleaf.view-names= # Comma-separated list of view names that can be resolved.
