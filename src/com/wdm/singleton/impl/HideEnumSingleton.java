package com.wdm.singleton.impl;

/*
 * 枚举实现单例：安全式。
 */
public class HideEnumSingleton {

    private enum EnumSingleton {

        enumValue;

        private Object object;

        EnumSingleton() {
            System.out.println("HideEnumSingleton -> EnumSingleton -> 构造函数调用");
            object = new Object();
        }

        public Object getObject() {
            return object;
        }
    }

    public static Object getObject() {
        return EnumSingleton.enumValue.getObject();
    }
}
