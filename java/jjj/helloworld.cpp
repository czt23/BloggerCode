#include <jni.h>
#include <stdio.h>
#include "helloworld.h"

JNIEXPORT void JNICALL
Java_helloworld_print(JNIEnv *env, jobject obj)
{
    printf("���o���o�@��!\n");
    return;
}