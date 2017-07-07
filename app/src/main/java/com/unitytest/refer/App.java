package com.unitytest.refer;

import android.app.Application;
import android.content.IntentFilter;
import android.util.Log;

/**
 * Created by santiago on 7/6/17.
 */

public class App extends Application {

    private static final UnityReferrerReceiver s_UnityReceiver = new UnityReferrerReceiver();

    @Override
    public void onCreate() {
        super.onCreate();

        initUnityReferrerReceiver();
    }

    private void initUnityReferrerReceiver(){
        registerReceiver(s_UnityReceiver, new IntentFilter("com.android.vending.INSTALL_REFERRER"));
        Log.d(App.class.getSimpleName(), "----[Receiver Installed]");
    }
}
