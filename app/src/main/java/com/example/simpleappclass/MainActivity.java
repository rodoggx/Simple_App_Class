package com.example.simpleappclass;

import android.content.Intent;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivityTAG_";

    private AppMagic mAppMagic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mAppMagic = ((AppMagic) getApplication());


        Log.d(TAG, "onCreate: ");
        mAppMagic.incrementCounter();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart: ");
        mAppMagic.incrementCounter();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause: ");
        mAppMagic.incrementCounter();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume: ");
        mAppMagic.incrementCounter();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop: ");
        mAppMagic.incrementCounter();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: ");
        mAppMagic.incrementCounter();
    }

    @Override
    protected void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        Log.d(TAG, "onSaveInstanceState: ");
        mAppMagic.incrementCounter();
    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.d(TAG, "onRestoreInstanceState: ");
        mAppMagic.incrementCounter();
    }

    public void printMagic(View view) {
        Log.d(TAG, "printMagic: " + mAppMagic.getCounter());
    }

    public void startService(View view) {
        Intent intent = new Intent(getApplicationContext(), MyService.class);
                startService(intent);
    }
}
