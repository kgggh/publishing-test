package com.example.module2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.logging.Logger;

@Configuration
public class TestAutoConfiguration {
    private final Logger log = Logger.getLogger(TestAutoConfiguration.class.getName());

    @Bean
    public String moduleTestBeanV2() {
        log.info("[module-2] Init Auto Configured Bean~~~~~!!!!!!!!");
        return "";
    }
}
