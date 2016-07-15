package com.mac.training.applicationclass;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainAct";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: 1, App attr:" + ApplicationApp.attr);
        ApplicationApp.attr++;
        Intent intent = new Intent(this, ServiceClass.class);
        startService(intent);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart: 2");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onStart: 3");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onStart: 4");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onStart: 5");
    }

}
