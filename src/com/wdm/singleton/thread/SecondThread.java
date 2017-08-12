package com.wdm.singleton.thread;

import com.wdm.singleton.impl.LazySingleton;

public class SecondThread extends Thread {

    @Override
    public void run() {
        System.out.println(LazySingleton.getInstance().getName() + "\t"
                            + LazySingleton.getInstance().hashCode());
    }
}
