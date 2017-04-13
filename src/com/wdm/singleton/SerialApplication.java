package com.wdm.singleton;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.wdm.singleton.impl.StaticInnerClassSingletonSerial;

/*
 * 测试静态内部类序列化
 */
public class SerialApplication {

    public static void main(String[] args) {
        try {
            StaticInnerClassSingletonSerial singleton = StaticInnerClassSingletonSerial.getInstance();
            FileOutputStream fileOutputStream = new FileOutputStream(new File("test.txt"));
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(singleton);
            objectOutputStream.close();
            fileOutputStream.close();
            System.out.println(singleton.getName() + "\t" + singleton.hashCode());
        } catch (Exception e) {
            System.err.println(e);
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(new File("test.txt"));
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            StaticInnerClassSingletonSerial singleton = (StaticInnerClassSingletonSerial)objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
            System.out.println(singleton.getName() + "\t" + singleton.hashCode());
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
