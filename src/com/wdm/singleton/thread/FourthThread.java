package com.wdm.singleton.thread;

import com.wdm.singleton.impl.StaticInnerClassSingleton;

public class FourthThread extends Thread {

    @Override
    public void run() {
        System.out.println(StaticInnerClassSingleton.getInstance().getName() + "\t" 
                            + StaticInnerClassSingleton.getInstance().hashCode());
    }
}
