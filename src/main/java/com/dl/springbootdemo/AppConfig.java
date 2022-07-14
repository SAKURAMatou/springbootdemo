package com.dl.springbootdemo;


import com.dl.service.OrderService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration(proxyBeanMethods = true)
public class AppConfig {
//    @Bean(name = "orderService")
//    @ConditionalOnBean(UserService.class)
//    public OrderService getOrderService() {
//        System.out.println("ConditionalOnBean");
//        return new OrderService();
//    }
//
//    @Bean
//    @ConditionalOnMissingBean
//    public OrderService getOrderService1() {
//        System.out.println("ConditionalOnMissingBean");
//        return new OrderService();
//    }

    @Bean
//    @ConditionalOnWarDeployment
    public OrderService getOrderService2() {
        System.out.println("ConditionalOnWarDeployment");
        return new OrderService();
    }

//    @Bean
//    public void getOrderService2() {
//        System.out.println(getUserService());
//    }

//    @Bean
//    public UserService getUserService() {
//        return new UserService();
//    }

}
