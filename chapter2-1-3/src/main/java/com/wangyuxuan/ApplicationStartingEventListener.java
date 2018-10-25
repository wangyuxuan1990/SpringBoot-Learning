package com.wangyuxuan;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.event.ApplicationStartingEvent;
import org.springframework.context.ApplicationListener;

/**
 * @Auther: wangyuxuan
 * @Date: 2018/10/25 14:52
 * @Description:
 */
@Slf4j
public class ApplicationStartingEventListener implements ApplicationListener<ApplicationStartingEvent> {
    @Override
    public void onApplicationEvent(ApplicationStartingEvent event) {
        log.info("......ApplicationStartingEvent......");
    }
}
