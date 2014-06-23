package com.sammi.Broadcast;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

/*

Creating Broadcast in code

 */
public class MainActivity extends Activity
{
    MyBroadcastReceiver myReceiver;
    IntentFilter intentFilter;
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        myReceiver = new MyBroadcastReceiver();
        intentFilter = new IntentFilter("MY_SPECIFIC_ACTION");

    }

    @Override
    public void onResume()
    {
        super.onResume();

        intentFilter.setPriority(10);
        //register the receiver
        registerReceiver(myReceiver,intentFilter);
    }

    @Override
    protected void onPause()
    {
        super.onPause();
        //unregister the receiver
        unregisterReceiver(myReceiver);
    }

    public void onClick(View view)
    {
        Intent i = new Intent("MY_SPECIFIC_ACTION");
        i.putExtra("key","hallo there, you just received a broadcast");
        //sendBroadcast(i); //this is for sending unordered broadcasts
        sendOrderedBroadcast(i,null);//sending ordered broadcasts, 2nd argument is permission
    }
}
