package com.dl.springbootdemo;

import com.dl.springbootdemo.properties.DlProperties;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;

//@SpringBootConfiguration
//@EnableAutoConfiguration
//@ComponentScan(value = "com.dl",
//        excludeFilters = {@ComponentScan.Filter(
//                type = FilterType.CUSTOM,
//                classes = {AutoConfigurationExcludeFilter.class}
//        ), @ComponentScan.Filter(
//                type = FilterType.CUSTOM,
//                classes = {TypeExcludeFilter.class}
//        )}
//)
@SpringBootApplication(scanBasePackages = "com.dl")
@MapperScan("com.dl.mapper")
//@ConfigurationPropertiesScan("com.dl.springbootdemo.properties")
@EnableConfigurationProperties(DlProperties.class)
public class SpringbootdemoApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(SpringbootdemoApplication.class, args);
        DlProperties dlProperties = run.getBean(DlProperties.class);
        System.out.println(dlProperties.toString());

    }

}
