package com.lintrip.services;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * 价格策略工厂
 *
 * @author kakakeven
 */
@Component
public class PriceStrategyFactory {

    private static Map<String, PriceService> priceServiceMap = new HashMap<String, PriceService>();

    public PriceService getPriceService(String userType) {
        return priceServiceMap.get(userType);
    }

    public void register(String userType, PriceService priceService) {
        priceServiceMap.put(userType, priceService);
    }
}
