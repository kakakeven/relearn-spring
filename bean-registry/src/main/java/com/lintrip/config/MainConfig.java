package com.lintrip;

import com.lintrip.model.Apple;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan
@Configuration
public class MainConfig {

    @Bean
    public Apple apple() {
        return new Apple();
    }
}
