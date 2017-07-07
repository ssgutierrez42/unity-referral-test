package com.unitytest.refer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sendReferrerIntent();
    }

    private void sendReferrerIntent() {
        Intent i = new Intent("com.android.vending.INSTALL_REFERRER");
        i.setPackage("com.unitytest.refer");
        i.putExtra("referrer", "\"utm_source=test_source\\&utm_medium=test_medium\\&utm_term=test_term\\&utm_content=test_content\\&utm_campaign=test_name\"");
        sendBroadcast(i);
    }
}
