package com.lintrip.model;

/**
 * 汽车
 *
 * @author kakakeven
 */
public class Car {
    public Car() {
        System.out.println("construct new Car....");
    }

    public void run() {
        System.out.println("Car is running one the road...");
    }

    public void init() {
        System.out.println("invoke car's init method [init]...");
    }

    public void destroy() {
        System.out.println("invoke car's destroy method [destroy]...");
    }
}
