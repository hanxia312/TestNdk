package cn.peapad.avsdk.testndk;

public class JNISoundTouch {
    public native void setChannels(int channel);
    public native void setTempoChange(float newTempo);
    public native void setPitchSemiTones(int newPitch);
    public native void setRateChange(float newRate);

    public native void putSamples(short[] samples, int len);
    public native short[] receiveSamples();

    static{
        System.loadLibrary("soundtouch");
    }
}
