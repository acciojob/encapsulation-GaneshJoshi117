package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly obj = new RWOnly();
//        System.out.println(obj.x);
//        java: x has private access in com.driver.RWOnly
        obj.setX(5);
        System.out.println(obj.getX());
    }
}