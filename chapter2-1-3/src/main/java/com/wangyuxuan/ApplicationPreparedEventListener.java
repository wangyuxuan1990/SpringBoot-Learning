package com.wangyuxuan;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.event.ApplicationPreparedEvent;
import org.springframework.context.ApplicationListener;

/**
 * @Auther: wangyuxuan
 * @Date: 2018/10/25 15:13
 * @Description:
 */
@Slf4j
public class ApplicationPreparedEventListener implements ApplicationListener<ApplicationPreparedEvent> {
    @Override
    public void onApplicationEvent(ApplicationPreparedEvent event) {
        log.info("......ApplicationPreparedEvent......");
    }
}
