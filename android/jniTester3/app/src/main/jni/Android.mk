LOCAL_PATH := $(call my-dir)

include $(CLEAR_VARS)

LOCAL_MODULE := myJNI2
LOCAL_SRC_FILES := myJNI2.cpp

include $(BUILD_SHARED_LIBRARY)