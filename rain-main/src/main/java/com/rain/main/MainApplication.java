package com.rain.main;

import com.rain.core.annotation.RuleScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @Author: xu.dm
 * @since: 2021/7/1 13:17
 * @Description: 通过java -Dloader.path="./lib" 载入外部类库
 **/
@RuleScan(basePackages = "com.rain.plugins.service")
@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(MainApplication.class, args);
    }
}
