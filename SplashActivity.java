package com.aitecube.yunfeng.frametest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        TextView textView=new TextView(SplashActivity.this);
        textView.setText("我是搞测试的！！！");
        textView.setTextSize(30);
    }
}
