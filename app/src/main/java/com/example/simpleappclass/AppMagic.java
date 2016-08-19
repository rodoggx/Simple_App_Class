package com.example.simpleappclass;

import android.app.Application;
import android.util.Log;

/**
 * Created by RodoggX on 8/19/2016.
 */
public class AppMagic extends Application {

    private static final String TAG = "AppMagicTAG_";

    private int mCounter = 0;

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d(TAG, "onCreate: ");
    }

    public int getCounter() {
        return mCounter;
    }

    public void incrementCounter() {
        mCounter++;
    }

}
