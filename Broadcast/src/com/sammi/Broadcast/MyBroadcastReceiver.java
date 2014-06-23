package com.sammi.Broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created with IntelliJ IDEA.
 * User: sammi
 * Date: 6/6/14
 * Time: 2:30 PM
 * To change this template use File | Settings | File Templates.
 */
public class MyBroadcastReceiver extends BroadcastReceiver
{
    @Override
    public void onReceive(Context context, Intent intent)
    {
        Toast.makeText(context, "Received broadcast, The value is" + intent.getStringExtra("key"), Toast.LENGTH_LONG).show();

        abortBroadcast();//must have been called using the sendOrderedBroadcast
    }
}
