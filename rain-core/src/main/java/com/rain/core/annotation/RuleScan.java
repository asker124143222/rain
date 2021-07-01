package com.rain.core.annotation;


import com.rain.core.rule.RuleFactoryBean;
import com.rain.core.rule.RuleScannerRegistrar;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Import(RuleScannerRegistrar.class)
public @interface RuleScan {
    String[] value() default {};
    String[] basePackages() default {};
    Class<?>[] basePackageClasses() default {};
    Class<? extends Annotation> annotationClass() default Annotation.class;
    Class<? extends RuleFactoryBean> factoryBean() default RuleFactoryBean.class;
}
