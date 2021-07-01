package com.rain.supports.rule;

/**
 * @Author: xu.dm
 * @since: 2021/7/1 10:30
 * @Description: 规则抽象接口
 **/
public interface RuleService {
    Object doService(Object event);
}
