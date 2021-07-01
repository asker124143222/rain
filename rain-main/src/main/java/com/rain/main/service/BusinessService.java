package com.rain.main.service;

import com.rain.core.rule.RuleService;
import com.rain.main.event.RawEvent;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.Map;

/**
 * @Author: xu.dm
 * @since: 2021/7/1 11:52
 * @Description: TODO
 **/
@Service
public class BusinessService implements InitializingBean, ApplicationContextAware {

    private ApplicationContext applicationContext;
    private Map<String, RuleService> serviceMap;

    @Override
    public void afterPropertiesSet() throws Exception {
        this.serviceMap = this.applicationContext.getBeansOfType(RuleService.class);
    }

    // 生产模拟数据
    private Object createData(){
        long round = Math.round(Math.random() * 10000);
        RawEvent rawEvent = new RawEvent();
        rawEvent.setId(round);
        rawEvent.setType("order"+round);
        rawEvent.setComment("订单消息"+round);
        rawEvent.setEventDate(new Date());
        return rawEvent;
    }

    private void doVerify(Object data) {
        System.out.println("verify data ...");
        for (String key : this.serviceMap.keySet()) {
            Object result = this.serviceMap.get(key).doService(data);
            System.out.println("verify result -> "+result);
        }
    }

    private void doSaveFile() {
        System.out.println("save file ...");
    }

    private void doAnalysis(){
        System.out.println("analysis data ...");
    }

    public void doBusiness() {
        Object data = createData();
        doVerify(data);
        doSaveFile();
        doAnalysis();
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
