package com.wangyuxuan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;

import java.util.concurrent.Executor;

@SpringBootApplication
public class Chapter414Application {

    public static void main(String[] args) {
        SpringApplication.run(Chapter414Application.class, args);
    }

    @EnableAsync
    @Configuration
    class TaskPoolConfig{

        @Bean("taskExecutor")
        public Executor taskExecutor(){
            ThreadPoolTaskScheduler executor = new ThreadPoolTaskScheduler();
            executor.setPoolSize(20);
            executor.setThreadNamePrefix("taskExecutor-");
            //设置线程池关闭的时候等待所有任务都完成再继续销毁其他的Bean，这样这些异步任务的销毁就会先于Redis线程池的销毁。
            executor.setWaitForTasksToCompleteOnShutdown(true);
            //设置线程池中任务的等待时间，如果超过这个时候还没有销毁就强制销毁，以确保应用最后能够被关闭，而不是阻塞住。
            executor.setAwaitTerminationSeconds(60);
            return executor;
        }
    }
}
