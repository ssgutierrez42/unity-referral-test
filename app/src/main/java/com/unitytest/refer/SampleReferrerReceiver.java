package com.unitytest.refer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Created by santiago on 7/6/17.
 */

public class SampleReferrerReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d(SampleReferrerReceiver.class.getSimpleName(), "---[Sample] Received INSTALL_REFERRER");
    }
}
