package com.mac.training.applicationclass;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

/**
 * Created by admin on 7/15/2016.
 */
public class IntentServiceClass extends IntentService {

    private static final String TAG = "Intent Service Tag";

    public IntentServiceClass() {
        super("IntentServiceClass");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        ApplicationApp.attr++;
        Log.d(TAG, "onHandleIntent: ApplicationApp" + ApplicationApp.attr);
    }
}
