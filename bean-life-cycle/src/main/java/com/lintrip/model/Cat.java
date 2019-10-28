package com.lintrip.model;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Cat implements InitializingBean, DisposableBean {

    public Cat(){
        System.out.println("construct new Cat...");
    }

    public void destroy() throws Exception {
        System.out.println("invoke cat's destroy method [destroy implements DisposableBean]...");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("invoke cat's init method [afterPropertiesSet implements InitializingBean]...");
    }
}
