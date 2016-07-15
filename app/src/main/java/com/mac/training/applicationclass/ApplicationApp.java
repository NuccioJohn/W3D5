package com.mac.training.applicationclass;

import android.app.Application;
import android.util.Log;

/**
 * Created by admin on 7/15/2016.
 */
public class ApplicationApp extends Application {

    private static final String TAG = "ApplicationApp";
    public static int attr = 0;

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d(TAG, "onCreate: 0, App attr: " + attr + " " + Thread.currentThread().getName());
        attr++;
    }
}
