package com.mac.training.applicationclass;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class NetworkReceiver extends BroadcastReceiver {
    private static final String TAG = "Network Tag";

    public NetworkReceiver() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.
        Log.d(TAG, "onReceive: ");
        Intent intent3 = new Intent(context, IntentServiceClass.class);
        context.startService(intent3);
        Toast.makeText(context, "Conection Changes", Toast.LENGTH_SHORT).show();
        ApplicationApp.attr++;
        Log.d(TAG, "onReceive: ATTR: " + ApplicationApp.attr);
    }
}
