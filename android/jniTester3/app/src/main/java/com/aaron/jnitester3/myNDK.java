package com.aaron.jnitester3;

public class myNDK {
    static {
        System.loadLibrary("myJNI2");
    }
    public native  String getMycstring();
    public native int getJniAdd(int a, int b);
}
