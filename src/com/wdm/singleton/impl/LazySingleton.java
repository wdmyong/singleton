package com.wdm.singleton.impl;

/*
 * 懒加载方式1
 * 非线性安全
 * 
 */
public class LazySingleton {

    private static LazySingleton instance = null;

    private String name;

    private LazySingleton() {
        this.name = "LazyFirstSingleton";
    }

    public static LazySingleton getInstance() {
        if (instance == null) {
            // 模拟初始化操作需要时间，在多线程环境下会有出现多个实例
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            instance = new LazySingleton();
        }
        return instance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
