package com.rain.core.rule;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;

/**
 * @Author: xu.dm
 * @since: 2021/7/1 16:47
 * @Description: TODO
 **/
public class ClassPathRuleScanner extends ClassPathBeanDefinitionScanner {

    public ClassPathRuleScanner(BeanDefinitionRegistry registry) {
        super(registry);
    }
}
