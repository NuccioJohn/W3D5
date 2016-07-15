package com.mac.training.applicationclass;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;

/**
 * Created by admin on 7/15/2016.
 */
public class ServiceClass extends Service{


    private static final String TAG = "Service Tag";



    @Override
    public void onCreate() {
        super.onCreate();
        ApplicationApp.attr++;
        Log.d(TAG, "onCreate: ApplicationApp" + ApplicationApp.attr);
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.d(TAG, "onStartCommand: ");
        return super.onStartCommand(intent, flags, startId);

    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
