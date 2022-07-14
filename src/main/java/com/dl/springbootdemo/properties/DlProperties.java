package com.dl.springbootdemo.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;


@Data
@ConfigurationProperties
public class DlProperties {

    private String name;
    private String pwd;
    private String url;
}
