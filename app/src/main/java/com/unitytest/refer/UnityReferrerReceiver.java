package com.unitytest.refer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Created by santiago on 7/6/17.
 */

public class UnityReferrerReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d(UnityReferrerReceiver.class.getSimpleName(), "---[Unity] Received INSTALL_REFERRER");
    }
}
