package com.wdm.singleton.impl;

import java.io.ObjectStreamException;
import java.io.Serializable;

/*
 * 静态内部类，由于采用了静态内部类保证了延迟加载，同时采用静态变量保证线程安全
 */
public class StaticInnerClassSingletonSerial implements Serializable {

    private static final long serialVersionUID = 999L;

    private static class StaticInnerClassSingletonSerialHolder {
        // final修饰符是必要的么，mark一下
        private static final StaticInnerClassSingletonSerial instance = new StaticInnerClassSingletonSerial();
    }

    private String name;

    private StaticInnerClassSingletonSerial() {
        this.name = "StaticInnerClassSingleton";
    }

    public static StaticInnerClassSingletonSerial getInstance() {
        return StaticInnerClassSingletonSerialHolder.instance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // 使用此方法可防止反序列化导致的非单例，即出现多例
    protected Object readResolve() throws ObjectStreamException {
        System.out.println("readResolve");
        return StaticInnerClassSingletonSerialHolder.instance;
    }
}
