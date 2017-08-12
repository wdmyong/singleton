package com.wdm.singleton.impl;

/*
 * 枚举实现单例：暴露式
 */
public enum EnumSingleton {

    enumValue;

    private InnerClass object;

    EnumSingleton() {
        System.out.println("EnumSingleton 构造函数调用");
        object = new InnerClass();
    }

    public InnerClass getObject() {
        return object;
    }

    public class InnerClass {
        private int id;
        private String name;

        private InnerClass() {
            id = 0;
            name = "name";
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
