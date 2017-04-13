package com.wdm.singleton.impl;

/*
 * 懒加载方式1
 * 非线性安全
 * 
 */
public class LazySingletonFirstSyn {

    private static LazySingletonFirstSyn instance = null;

    private String name;

    private LazySingletonFirstSyn() {
        this.name = "LazySingletonFirstSyn";
    }

    // 方法1，整个方法加关键字synchronized同步保证只有一个实例
    synchronized public static LazySingletonFirstSyn getInstance() {
        if (instance == null) {
            // 模拟初始化操作需要时间，在多线程环境下会有出现多个实例
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            instance = new LazySingletonFirstSyn();
        }
        return instance;
    }

    /*
     * 同步块效果同上
     */
    public static LazySingletonFirstSyn getInstance1() {
        synchronized (LazySingletonFirstSyn.class) {
            if (instance == null) {
                // 模拟初始化操作需要时间，在多线程环境下会有出现多个实例
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                instance = new LazySingletonFirstSyn();
            }
        }
        return instance;
    }

    /*
     * 同步范围减小，效率提高，然而线程不安全
     */
    public static LazySingletonFirstSyn getInstance2() {
        if (instance == null) {
            // 模拟初始化操作需要时间，在多线程环境下会有出现多个实例
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (LazySingletonFirstSyn.class) {
                instance = new LazySingletonFirstSyn();
            }
        }
        return instance;
    }

    /*
     * 双检查锁机制
     */
    public static LazySingletonFirstSyn getInstance3() {
        if (instance == null) {
            // 模拟初始化操作需要时间，在多线程环境下会有出现多个实例
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (LazySingletonFirstSyn.class) {
                // 再检查一次，为空才进行new操作，保证效率的同时线程安全
                if (instance == null) {
                    instance = new LazySingletonFirstSyn();
                }
            }
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
