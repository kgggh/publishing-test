package com.example.module1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.logging.Logger;

@Configuration
public class TestAutoConfiguration {
    private final Logger log = Logger.getLogger(TestAutoConfiguration.class.getName());

    @Bean
    public String moduleTestBeanV1() {
        log.info("[module-1] Init Auto Configured Bean~~~~~!!!!!!!!!!");
        return "";
    }
}
