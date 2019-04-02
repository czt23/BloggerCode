//
// Created by tks35 on 2019/4/2.
//
#include "com_aaron_jnitester3_myNDK.h"

JNIEXPORT jstring JNICALL Java_com_aaron_jnitester3_myNDK_getMycstring
        (JNIEnv *env, jobject){
    return (*env).NewStringUTF("MY !!  NDKString!!");
}

JNIEXPORT jint JNICALL Java_com_aaron_jnitester3_myNDK_getJniAdd
        (JNIEnv *env, jobject object, jint a, jint b) {
    return a + b;
}

