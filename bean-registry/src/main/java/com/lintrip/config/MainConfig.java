package com.lintrip.config;

import com.lintrip.model.Apple;
import com.lintrip.model.Banana;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

@ComponentScan
@Configuration
public class MainConfig {

    @Scope(value = "prototype")
    @Bean
    public Apple apple() {
        return new Apple();
    }

    @Lazy
    @Bean
    public Banana banana() {
        return new Banana();
    }
}
