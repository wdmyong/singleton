package com.wdm.singleton.thread;

import com.wdm.singleton.impl.LazySingletonFirstSyn;

public class ThirdThread extends Thread {

    @Override
    public void run() {
        System.out.println(LazySingletonFirstSyn.getInstance().getName() + "\t" 
                            + LazySingletonFirstSyn.getInstance().hashCode());
    }
}
