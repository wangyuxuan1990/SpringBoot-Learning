package com.wangyuxuan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableAsync
public class Chapter412Application {

    public static void main(String[] args) {
        SpringApplication.run(Chapter412Application.class, args);
    }
}
