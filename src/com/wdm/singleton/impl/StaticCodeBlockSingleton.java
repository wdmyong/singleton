package com.wdm.singleton.impl;

/*
 * 饿汉模式，声明的时候就初始化了。
 */
public class StaticCodeBlockSingleton {

    private static StaticCodeBlockSingleton instance = null;

    static {
        instance = new StaticCodeBlockSingleton();
    }

    private String name;

    private StaticCodeBlockSingleton() {
        this.name = "StaticCodeBlockSingleton";
    }

    public static StaticCodeBlockSingleton getInstance() {
        return instance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
