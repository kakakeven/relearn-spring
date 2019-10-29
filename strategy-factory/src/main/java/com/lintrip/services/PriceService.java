package com.lintrip.services;

/**
 * 价格计算服务
 *
 * @author kakakeven
 */
public interface PriceService {

    /**
     * 计算价格
     *
     * @param originPrice
     * @return
     */
    int computePrice(Integer originPrice);


    /**
     * 注册 Service 到工厂类
     */
    void register();
}
