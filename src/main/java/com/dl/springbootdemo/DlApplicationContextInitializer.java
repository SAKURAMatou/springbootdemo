package com.dl.springbootdemo;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * 初始化bean对象
 */
public class DlApplicationContextInitializer implements ApplicationContextInitializer {
    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {
        applicationContext.getBeanFactory().registerSingleton("dlTypeExcludeFilter", new DlTypeExcludeFilter());
    }
}
