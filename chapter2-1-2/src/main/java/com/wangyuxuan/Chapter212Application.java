package com.wangyuxuan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.bind.Bindable;
import org.springframework.boot.context.properties.bind.Binder;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class Chapter212Application {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Chapter212Application.class, args);

        Binder binder = Binder.get(context.getEnvironment());

        //绑定简单配置
        FooProperties foo = binder.bind("com.wangyuxuan", Bindable.of(FooProperties.class)).get();
        System.out.println(foo.getFoo());

        //绑定List配置
        List<String> post = binder.bind("com.wangyuxuan.post", Bindable.listOf(String.class)).get();
        System.out.println(post);

        List<PostInfo> posts = binder.bind("com.wangyuxuan.posts", Bindable.listOf(PostInfo.class)).get();
        System.out.println(posts);

        //属性的读取
        System.out.println(context.getEnvironment().containsProperty("com.wangyuxuan.database-platform"));
        System.out.println(context.getEnvironment().containsProperty("com.wangyuxuan.databasePlatform"));
    }
}
