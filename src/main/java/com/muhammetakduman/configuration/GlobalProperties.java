package com.muhammetakduman.configuration;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;

@Data
public class GlobalProperties {
    @Value("${spring.datasource.url}")
    private String url ;
    @Value("${spring.datasource.username}")
    private String username;
    @Value("${spring.datasource.password}")
    private String password;
}
