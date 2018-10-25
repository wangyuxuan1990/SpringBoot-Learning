package com.wangyuxuan;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;

/**
 * @Auther: wangyuxuan
 * @Date: 2018/10/25 15:29
 * @Description:
 */
@Slf4j
public class ApplicationReadyEventListener implements ApplicationListener<ApplicationReadyEvent> {
    @Override
    public void onApplicationEvent(ApplicationReadyEvent event) {
        log.info("......ApplicationReadyEvent......");
    }
}
