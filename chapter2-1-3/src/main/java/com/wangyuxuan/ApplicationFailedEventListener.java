package com.wangyuxuan;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.event.ApplicationFailedEvent;
import org.springframework.context.ApplicationListener;

/**
 * @Auther: wangyuxuan
 * @Date: 2018/10/25 15:32
 * @Description:
 */
@Slf4j
public class ApplicationFailedEventListener implements ApplicationListener<ApplicationFailedEvent> {
    @Override
    public void onApplicationEvent(ApplicationFailedEvent event) {
        log.info("......ApplicationFailedEvent......");
    }
}
