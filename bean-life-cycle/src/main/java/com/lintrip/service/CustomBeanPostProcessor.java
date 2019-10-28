package com.lintrip.service;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

/**
 * 自定义处理器
 *
 * @author kakakeven
 */
@Component
public class CustomBeanPostProcessor implements BeanPostProcessor {

    public static Set<String> registeredBeanSet = new HashSet<String>();

    static {
        registeredBeanSet.add("cat");
        registeredBeanSet.add("car");
        registeredBeanSet.add("dog");
        registeredBeanSet.add("fox");
    }

    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (registeredBeanSet.contains(beanName)) {
            System.out.println("invoke CustomBeanPostProcessor's postProcessBeforeInitialization before init bean [" + beanName + "]");
        }
        return bean;
    }

    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (registeredBeanSet.contains(beanName)) {
            System.out.println("invoke CustomBeanPostProcessor's postProcessAfterInitialization after init bean [" + beanName + "]");
        }
        return bean;
    }
}
