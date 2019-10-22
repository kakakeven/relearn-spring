package com.lintrip;

import com.lintrip.domain.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * XML 配置 Spring入口
 *
 * @author kakakeven
 */
public class XmlApplication {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Person person = (Person) context.getBean("person");
        System.out.println(person);
    }
}
