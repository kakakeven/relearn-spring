package com.lintrip;

import com.lintrip.config.MainConfig;
import com.lintrip.model.Car;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 注解应用入口类
 *
 * @author kakakeven
 */
public class AnnnotationApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);
        Car car = (Car) context.getBean("car");
        car.run();
        context.close();
    }
}
