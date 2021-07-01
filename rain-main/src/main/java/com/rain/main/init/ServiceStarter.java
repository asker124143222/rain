package com.rain.main.init;

import com.rain.main.service.BusinessService;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @Author: xu.dm
 * @since: 2021/7/1 13:22
 * @Description: TODO
 **/
@Component
public class ServiceStarter implements ApplicationRunner {

    @Resource
    private BusinessService businessService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        while(true){
            Thread.sleep(2000);
            businessService.doBusiness();
        }
    }
}
