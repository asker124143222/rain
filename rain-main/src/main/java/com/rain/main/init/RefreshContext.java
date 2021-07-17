package com.rain.main.init;

import org.springframework.beans.BeansException;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @Author: xu.dm
 * @since: 2021/7/2 13:10
 * @Description: 未实现
 **/
@Component
public class RefreshContext implements ApplicationRunner, ApplicationContextAware {

    private ConfigurableApplicationContext applicationContext;

    @Override
    public void run(ApplicationArguments args) throws Exception {

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = (ConfigurableApplicationContext)applicationContext;
    }
}
