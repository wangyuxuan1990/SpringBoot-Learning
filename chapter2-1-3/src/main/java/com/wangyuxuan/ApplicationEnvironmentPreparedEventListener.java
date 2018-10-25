package com.wangyuxuan;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.event.ApplicationEnvironmentPreparedEvent;
import org.springframework.context.ApplicationListener;

/**
 * @Auther: wangyuxuan
 * @Date: 2018/10/25 15:08
 * @Description:
 */
@Slf4j
public class ApplicationEnvironmentPreparedEventListener implements ApplicationListener<ApplicationEnvironmentPreparedEvent> {
    @Override
    public void onApplicationEvent(ApplicationEnvironmentPreparedEvent event) {
        log.info("......ApplicationEnvironmentPreparedEvent......");
    }
}
