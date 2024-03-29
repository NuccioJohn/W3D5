package com.mac.training.applicationclass;

import android.content.Intent;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class ImageActivity extends AppCompatActivity {

    private static final String TAG = "Image Activity Tag";
    public static final String MESSAGE_BROADCASTED = "Broadcasted Message";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);
        ImageView image2 = ((ImageView) findViewById(R.id.a_image_img));
        Picasso.with(getApplicationContext()).load("http://i.imgur.com/DvpvklR.png").into(image2);
    }

    public void onClickNetwork(View view) {
        Log.d(TAG, "broadcastMessage: " + MESSAGE_BROADCASTED);
        Intent intent = new Intent(MainActivity.CUSTOM_EVENT_KEY);
        intent.putExtra(MainActivity.BUNDLE_KEY_MESSAGE, MESSAGE_BROADCASTED);
        LocalBroadcastManager.getInstance(this).sendBroadcast(intent);
    }
}
