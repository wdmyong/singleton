package com.wdm.singleton.thread;

import com.wdm.singleton.impl.StaticCodeBlockSingleton;

public class FifthThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println(StaticCodeBlockSingleton.getInstance().getName() + "\t" 
                            + StaticCodeBlockSingleton.getInstance().hashCode());
        }
    }
}
