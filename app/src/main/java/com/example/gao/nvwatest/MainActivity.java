package com.example.gao.nvwatest;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by gao on 2016/8/18.
 */
public class MainActivity extends Activity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);
        textView = (TextView)findViewById(R.id.textView);
        textView.setText("Bug已经修复！");
    }


}
