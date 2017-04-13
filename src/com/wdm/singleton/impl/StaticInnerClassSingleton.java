package com.wdm.singleton.impl;

/*
 * 静态内部类，由于采用了静态内部类保证了延迟加载，同时采用静态变量保证线程安全
 */
public class StaticInnerClassSingleton {

    private static class StaticInnerClassSingletonHolder {
        // final修饰符是必要的么，mark一下
        private static final StaticInnerClassSingleton instance = new StaticInnerClassSingleton();
    }

    private String name;

    private StaticInnerClassSingleton() {
        this.name = "StaticInnerClassSingleton";
    }

    public static StaticInnerClassSingleton getInstance() {
        return StaticInnerClassSingletonHolder.instance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
