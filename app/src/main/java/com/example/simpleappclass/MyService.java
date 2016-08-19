package com.example.simpleappclass;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;

/**
 * Created by RodoggX on 8/19/2016.
 */
public class MyService extends Service {

    private AppMagic mAppMagic;

    private static final String TAG = "MYServiceTAG_";
    public MyService() {

    }

    @Override
    public void onCreate() {
        super.onCreate();

        mAppMagic = ((AppMagic) getApplication());

        Log.d(TAG, "onCreate: ");
        mAppMagic.incrementCounter();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.d(TAG, "onStartCommand: ");
        mAppMagic.incrementCounter();
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException("Not Yet Implemented");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: " + mAppMagic.getCounter());
    }
}
