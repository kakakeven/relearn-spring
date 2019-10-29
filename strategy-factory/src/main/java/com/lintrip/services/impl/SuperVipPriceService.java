package com.lintrip.services.impl;

import com.lintrip.services.PriceService;
import com.lintrip.services.PriceStrategyFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * 超级会员价格计算 Service
 *
 * @author kakakeven
 */
@Service
public class SuperVipPriceService implements PriceService {

    @Autowired
    PriceStrategyFactory strategyFactory;

    @Override
    public int computePrice(Integer originPrice) {
        return (int) (originPrice * 0.75);
    }

    @PostConstruct
    @Override
    public void register() {
        strategyFactory.register("superVip", this);
    }

}
