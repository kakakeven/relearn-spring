package com.lintrip;

import com.lintrip.config.MainConfig;
import com.lintrip.services.PriceStrategyFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) throws Exception {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);
        for (String beanName : context.getBeanDefinitionNames()) {
            System.out.println(beanName);
        }
        PriceStrategyFactory factory = (PriceStrategyFactory) context.getBean("priceStrategyFactory");
        int originPrice = 100;
        String userType = "superVip";
        int price = factory.getPriceService(userType).computePrice(originPrice);
        System.out.println(price);
    }
}
