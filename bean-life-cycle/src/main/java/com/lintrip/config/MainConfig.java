package com.lintrip.config;

import com.lintrip.model.Car;
import com.lintrip.model.Cat;
import com.lintrip.model.Dog;
import com.lintrip.model.Fox;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


/**
 * 主配置
 *
 * @author kakakeven
 */
@Configuration
@ComponentScan("com.lintrip")
public class MainConfig {


    @Bean(initMethod = "init", destroyMethod = "destroy")
    public Car car() {
        return new Car();
    }

    @Bean
    public Cat cat() {
        return new Cat();
    }

    @Bean
    public Dog dog() {
        return new Dog();
    }


    @Bean(initMethod = "init_method",destroyMethod = "destroy_method")
    public Fox fox() {
        return new Fox();
    }
}
