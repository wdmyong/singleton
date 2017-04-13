package com.wdm.singleton.thread;

import com.wdm.singleton.impl.HungrySingleton;

public class FirstThread extends Thread {

    @Override
    public void run() {
        System.out.println(HungrySingleton.getInstance().getName() + "\t" 
                            + HungrySingleton.getInstance().hashCode());
    }
}
