package com.example.BroadcastXml;

/**
 * Created with IntelliJ IDEA.
 * User: sammi
 * Date: 6/6/14
 * Time: 12:26 PM
 * To change this template use File | Settings | File Templates.
 */

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;


public class MyBroadcastReceiver extends BroadcastReceiver
{
    @Override
    public void onReceive(Context context, Intent intent)
    {
        Toast.makeText(context,"Received broadcast in MySecondBroadcastReceiver; " +" value received: " + intent.getStringExtra("key"),Toast.LENGTH_LONG).show();


    }
}
