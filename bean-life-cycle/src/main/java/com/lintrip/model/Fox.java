package com.lintrip.model;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Fox implements DisposableBean, InitializingBean {
    public Fox(){
        System.out.println("construct new fox...");
    }

    public void init_method() throws Exception {
        System.out.println("invoke fox's init method [init_method]...");
    }

    public void destroy_method() throws Exception {
        System.out.println("invoke fox's destroy method [@destroy_method]...");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("invoke fox's init method [afterPropertiesSet implements InitializingBean]...");
    }

    public void destroy() throws Exception {
        System.out.println("invoke fox's destroy method [destroy implements DisposableBean]...");
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("invoke fox's init method [@PostConstruct]...");
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("invoke fox's destroy method [@PreDestroy]...");
    }


}
