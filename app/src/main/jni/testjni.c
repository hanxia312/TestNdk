#include <jni.h>

JNIEXPORT jstring JNICALL
Java_cn_peapad_avsdk_testndk_Test_helloC(JNIEnv *env, jobject instance) {

    // TODO


    return (*env)->NewStringUTF(env, "hahahhahaha");
}