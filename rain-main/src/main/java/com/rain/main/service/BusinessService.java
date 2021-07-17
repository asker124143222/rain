package com.rain.main.service;

import com.rain.supports.event.RawEvent;
import com.rain.supports.rule.RuleService;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.annotation.AnnotationAwareOrderComparator;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @Author: xu.dm
 * @since: 2021/7/1 11:52
 * @Description: TODO
 **/
@Service
public class BusinessService implements InitializingBean, ApplicationContextAware {

    private ApplicationContext applicationContext;
    private List<RuleService> ruleServices = new ArrayList<>();

    @Override
    public void afterPropertiesSet() throws Exception {
        Map<String, RuleService> serviceMap = this.applicationContext.getBeansOfType(RuleService.class);
        this.ruleServices.addAll(serviceMap.values());
        AnnotationAwareOrderComparator.sort(this.ruleServices);
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
        for (RuleService service : ruleServices) {
            data = service.doService(data);
            System.out.println("verify result -> "+data);
            System.out.println();
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

    // todo 刷新RuleService
    private void refresh() {

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
