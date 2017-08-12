package com.wdm.singleton.thread;

import com.wdm.singleton.impl.EnumSingleton;
import com.wdm.singleton.impl.HideEnumSingleton;

public class EnumThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println(EnumSingleton.enumValue.getObject().getName());
            System.out.println(HideEnumSingleton.getObject().hashCode());
        }
    }

}
