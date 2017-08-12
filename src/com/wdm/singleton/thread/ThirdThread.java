package com.wdm.singleton.thread;

import com.wdm.singleton.impl.LazySingletonCheckSyn;

public class ThirdThread extends Thread {

    @Override
    public void run() {
        System.out.println(LazySingletonCheckSyn.getInstance().getName() + "\t"
                            + LazySingletonCheckSyn.getInstance().hashCode());
    }
}
