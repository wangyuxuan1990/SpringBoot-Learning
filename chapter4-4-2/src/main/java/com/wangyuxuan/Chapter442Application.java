package com.wangyuxuan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class Chapter442Application {

    public static void main(String[] args) {
        SpringApplication.run(Chapter442Application.class, args);
    }
}
