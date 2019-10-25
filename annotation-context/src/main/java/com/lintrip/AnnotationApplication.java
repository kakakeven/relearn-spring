package com.lintrip;

import com.lintrip.config.ApplicationConfig;
import com.lintrip.domain.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Annotation 配置 Spring入口
 *
 * @author kakakeven
 */
public class AnnotationApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        Person person = (Person) context.getBean("pingan");
        System.out.println();
        System.out.println(person);
        String[] beanNames = context.getBeanDefinitionNames();
        for (String beanName:beanNames) {
            System.out.println(beanName);
        }
    }
}
