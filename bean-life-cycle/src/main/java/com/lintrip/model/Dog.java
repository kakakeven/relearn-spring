package com.lintrip.model;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Dog {
    public Dog(){
        System.out.println("construct new Dog...");
    }

    @PostConstruct
    public void init() throws Exception {
        System.out.println("invoke dog's init method [@PostConstruct]...");
    }

    @PreDestroy
    public void destroy() throws Exception {
        System.out.println("invoke dog's init method [@PreDestroy]...");
    }
}
