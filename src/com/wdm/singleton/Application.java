package com.wdm.singleton;

import com.wdm.singleton.impl.EnumSingleton;
import com.wdm.singleton.thread.EnumThread;
import com.wdm.singleton.thread.FifthThread;
import com.wdm.singleton.thread.FirstThread;
import com.wdm.singleton.thread.FourthThread;
import com.wdm.singleton.thread.SecondThread;
import com.wdm.singleton.thread.ThirdThread;

public class Application {

    public static void main(String[] args) {
        hungrySingleExp();
        lazySingleExp1();
        lazySingleExpSyn();
        staticInnerClass();
        staticCodeBlock();
        enumSingleton();
    }

    /*
     * 饿汉模式调用
     */
    private static void hungrySingleExp() {
        Thread t1 = new FirstThread();
        Thread t2 = new FirstThread();
        Thread t3 = new FirstThread();
        t1.start();
        t2.start();
        t3.start();
    }

    /*
     * 懒加载1调用
     */
    private static void lazySingleExp1() {
        Thread t1 = new SecondThread();
        Thread t2 = new SecondThread();
        Thread t3 = new SecondThread();
        t1.start();
        t2.start();
        t3.start();
    }

    /*
     * 懒加载syn调用
     */
    private static void lazySingleExpSyn() {
        Thread t1 = new ThirdThread();
        Thread t2 = new ThirdThread();
        Thread t3 = new ThirdThread();
        t1.start();
        t2.start();
        t3.start();
    }

    /*
     * 懒加载syn调用
     */
    private static void staticInnerClass() {
        Thread t1 = new FourthThread();
        Thread t2 = new FourthThread();
        Thread t3 = new FourthThread();
        t1.start();
        t2.start();
        t3.start();
    }

    /*
     * 静态代码块初始化调用
     */
    private static void staticCodeBlock() {
        Thread t1 = new FifthThread();
        Thread t2 = new FifthThread();
        Thread t3 = new FifthThread();
        t1.start();
        t2.start();
        t3.start();
    }

    /*
     * 枚举实现单例调用
     */
    private static void enumSingleton() {
        Thread t1 = new EnumThread();
        Thread t2 = new EnumThread();
        Thread t3 = new EnumThread();
        t1.start();
        t2.start();
        t3.start();
    }
}
