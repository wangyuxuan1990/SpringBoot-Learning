package com.wangyuxuan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class Chapter441Application {

    public static void main(String[] args) {
        SpringApplication.run(Chapter441Application.class, args);
    }
}
