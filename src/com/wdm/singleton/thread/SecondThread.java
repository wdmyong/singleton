package com.wdm.singleton.thread;

import com.wdm.singleton.impl.LazySingletonFirst;

public class SecondThread extends Thread {

    @Override
    public void run() {
        System.out.println(LazySingletonFirst.getInstance().getName() + "\t" 
                            + LazySingletonFirst.getInstance().hashCode());
    }
}
