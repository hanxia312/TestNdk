package cn.peapad.avsdk.testndk;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends Activity {
    private static final String TAG ="MainActivity" ;
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=(TextView)findViewById(R.id.text);
        Test test=new Test();
        textView.setText(test.helloC());
        Log.i(TAG,"AHAHAHHA");

    }
}
