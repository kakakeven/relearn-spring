package com.lintrip.config;

import com.lintrip.domain.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 注解配置文件
 */
@Configuration
public class ApplicationConfig {

    @Bean
    public Person person() {
        Person person = new Person();
        person.setName("陈平安");
        person.setAge(22);
        return person;
    }
}
