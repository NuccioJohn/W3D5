package com.mac.training.applicationclass;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainAct";

    public static final String BUNDLE_KEY_MESSAGE = "MESSAGE_KEY";
    public static final String CUSTOM_EVENT_KEY = "CUSTOM_EVENT";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: 1, App attr:" + ApplicationApp.attr + " " + Thread.currentThread());
        ApplicationApp.attr++;
        Intent intent = new Intent(this, ServiceClass.class);
        startService(intent);
        Intent intent2 = new Intent(this, IntentServiceClass.class);
        startService(intent2);
    }

    private BroadcastReceiver mMessageReceiver = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            String message = intent.getStringExtra(BUNDLE_KEY_MESSAGE);
            Log.d(TAG, "Got message: " + message);
        }
    };

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart: 2");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onStart: 3");
        LocalBroadcastManager.getInstance(this).registerReceiver(mMessageReceiver, new IntentFilter(CUSTOM_EVENT_KEY));

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

    public void onClickImage(View view) {
        Intent intent = new Intent (this, ImageActivity.class);
        startActivity(intent);
    }
}
