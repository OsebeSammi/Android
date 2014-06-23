package com.example.Auto_Launching;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created with IntelliJ IDEA.
 * User: sammi
 * Date: 6/9/14
 * Time: 8:55 PM
 * To change this template use File | Settings | File Templates.
 */
public class BootupReceiver extends BroadcastReceiver
{
    @Override
    public void onReceive(Context context, Intent intent)
    {
        Toast.makeText(context,"App started",Toast.LENGTH_LONG).show();
        Intent i = new Intent(context,MyActivity.class);
        i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(i);
    }
}
