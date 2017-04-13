package com.wdm.singleton.impl;

/*
 * 饿汉模式，声明的时候就初始化了。
 */
public class HungrySingleton {

    private static HungrySingleton instance = new HungrySingleton();

    private String name;

    private HungrySingleton() {
        this.name = "HungrySingleton";
    }

    public static HungrySingleton getInstance() {
        return instance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
