package com.jiyun.dytest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        System.out.print("我是靳国");
    }

    @Override
    protected void onStart() {
        super.onStart();
    }
}
