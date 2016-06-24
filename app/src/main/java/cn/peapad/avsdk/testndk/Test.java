package cn.peapad.avsdk.testndk;

/**
 * Created by sks on 2016/6/24.
 */
public class Test {
    public native  String helloC();
    static{
        System.loadLibrary("testjni");
    }

}
