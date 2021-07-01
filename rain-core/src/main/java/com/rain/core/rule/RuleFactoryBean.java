package com.rain.core.rule;

import com.rain.supports.rule.RuleService;
import org.springframework.beans.factory.FactoryBean;

/**
 * @Author: xu.dm
 * @since: 2021/7/1 16:04
 * @Description: 暂时不使用，从设计角度，主要用来产生代理对象或者对接口进行实现。
 **/
public class RuleFactoryBean implements FactoryBean<RuleService> {
    @Override
    public RuleService getObject() throws Exception {
        return null;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }
}
