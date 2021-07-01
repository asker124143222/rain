package com.rain.plugins.service;



import com.rain.supports.rule.RuleService;

import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author: xu.dm
 * @since: 2021/7/1 15:43
 * @Description: TODO
 **/
public class NameCheckService implements RuleService {
    @Override
    public Object doService(Object event) {
        SecureRandom random = new SecureRandom();
        int i = random.nextInt(6000);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss:SSS'Z'");
        System.out.println(simpleDateFormat.format(new Date()) + " NameCheckService->随机编号：" + i);
        System.out.println(event.toString());
        return event;
    }
}
