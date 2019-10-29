package com.lintrip.services.impl;

import com.lintrip.services.PriceService;
import com.lintrip.services.PriceStrategyFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * 普通会员价格计算 Service
 *
 * @author kakakeven
 */
@Service
public class VipPriceService implements PriceService {

    @Autowired
    PriceStrategyFactory strategyFactory;

    @Override
    public int computePrice(Integer originPrice) {
        if (originPrice >= 100) {
            return (int) (originPrice * 0.8);
        } else {
            return (int) (originPrice * 0.9);
        }
    }

    @PostConstruct
    @Override
    public void register() {
        strategyFactory.register("vip", this);
    }
}
