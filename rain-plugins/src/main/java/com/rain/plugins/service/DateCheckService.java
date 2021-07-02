package com.rain.plugins.service;


import com.rain.supports.event.RawEvent;
import com.rain.supports.rule.RuleService;
import org.springframework.core.annotation.Order;

import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author: xu.dm
 * @since: 2021/7/1 15:43
 * @Description: TODO
 **/
@Order(200)
public class DateCheckService implements RuleService {
    @Override
    public Object doService(Object event) {
        RawEvent data = (RawEvent) event;

        SecureRandom random = new SecureRandom();
        int i = random.nextInt(5000);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss:SSS'Z'");
        System.out.println(simpleDateFormat.format(new Date()) + " DateCheckService->随机编号：" + i);
        data.setComment(data.getComment()+" -> DateCheck done ... ");
        System.out.println(data.toString());
        return data;
    }
}
