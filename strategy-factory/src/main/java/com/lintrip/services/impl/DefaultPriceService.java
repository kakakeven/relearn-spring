package com.lintrip.services.impl;

import com.lintrip.services.PriceService;
import com.lintrip.services.PriceStrategyFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * 默认价格计算 Service
 *
 * @author kakakeven
 */
@Service
public class DefaultPriceService implements PriceService {

    @Autowired
    PriceStrategyFactory strategyFactory;

    @Override
    public int computePrice(Integer originPrice) {
        return originPrice;
    }

    @PostConstruct
    @Override
    public void register() {
        strategyFactory.register("default", this);
    }
}
