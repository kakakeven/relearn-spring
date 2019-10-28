package com.lintrip;

import com.lintrip.config.MainConfig;
import com.lintrip.model.Apple;
import com.lintrip.model.Banana;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanRegistryTest {

    AnnotationConfigApplicationContext context;

    @Before
    public void init() {
        context = context = new AnnotationConfigApplicationContext(MainConfig.class);
    }

    @Test
    public void testBeanScope() {
        Banana banana01 = (Banana) context.getBean("banana");
        Apple apple01 = (Apple) context.getBean("apple");
        Apple apple02 = (Apple) context.getBean("apple");
        Banana banana02 = (Banana) context.getBean("banana");
        Assert.assertEquals(banana01, banana02);
        Assert.assertNotEquals(apple01, apple02);
    }
}
