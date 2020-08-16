package com.yang.se;

public class Singleton {
    private volatile static Singleton uniqueInstance;
    private Singleton(){
    }
    public static Singleton getUniqueInstance(){
        //首先判断对象是否已经实例化过
        if(uniqueInstance == null){
            synchronized (Singleton.class){
                if(uniqueInstance == null){
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }
}
