package com.lintrip;

import com.lintrip.config.MainConfig;
import com.lintrip.services.PriceStrategyFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 策略工厂测试类
 *
 * @author kakakeven
 */
public class StrategyFactoryTest {
    AnnotationConfigApplicationContext context;

    @Before
    public void init() {
        context = new AnnotationConfigApplicationContext(MainConfig.class);
    }

    @Test
    public void testComputePrice() {
        int originPrice = 100;
        PriceStrategyFactory factory = (PriceStrategyFactory) context.getBean("priceStrategyFactory");
        int defaultPrice = factory.getPriceService("default").computePrice(originPrice);
        int vipPrice = factory.getPriceService("vip").computePrice(originPrice);
        int superPrice = factory.getPriceService("superVip").computePrice(originPrice);
        Assert.assertEquals(100, defaultPrice);
        Assert.assertEquals(80, vipPrice);
        Assert.assertEquals(75, superPrice);
    }
}
