package com.wangyuxuan;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;

/**
 * @Auther: wangyuxuan
 * @Date: 2018/10/25 15:24
 * @Description:
 */
@Slf4j
public class ApplicationStartedEventListener implements ApplicationListener<ApplicationStartedEvent> {
    @Override
    public void onApplicationEvent(ApplicationStartedEvent event) {
        log.info("......ApplicationStartedEvent......");
    }
}
