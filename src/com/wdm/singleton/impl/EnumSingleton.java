package com.wdm.singleton.impl;

/*
 * 枚举实现单例：暴露式
 */
public enum EnumSingleton {

    enumValue;

    private Object object;

    private EnumSingleton() {
        System.out.println("EnumSingleton 构造函数调用");
        object = new Object();
    }

    public Object getObject() {
        return object;
    }
}
