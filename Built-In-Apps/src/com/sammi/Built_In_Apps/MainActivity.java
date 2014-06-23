package com.sammi.Built_In_Apps;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        Intent i = new Intent(android.content.Intent.ACTION_VIEW);
        i.setData(Uri.parse("geo:37,0"));
        startActivity(i);

    }

    public void geo(View view)
    {
        Intent i = new Intent(android.content.Intent.ACTION_VIEW);
        i.setData(Uri.parse("geo:37,0"));
        startActivity(i);
    }

    public void googlePlay(View view)
    {
        Intent i = new Intent(android.content.Intent.ACTION_VIEW);
        i.setData(Uri.parse("market://details?id=com.zinio.mobile.android.reader"));
        startActivity(i);
    }

    public void email(View view)
    {
        Intent i = new Intent(Intent.ACTION_SEND);
        i.setData(Uri.parse("mailto:"));
        String[] to = { "someone1@example.com" , "someone2@example.com" };
        String[] cc = { "someone3@example.com" , "someone4@example.com" };
        i.putExtra(Intent.EXTRA_EMAIL, to);
        i.putExtra(Intent.EXTRA_CC, cc);
        i.putExtra(Intent.EXTRA_SUBJECT, "Subject here...");
        i.putExtra(Intent.EXTRA_TEXT, "Message here...");
        i.setType("message/rfc822");
        startActivity(Intent.createChooser(i, "Email"));

    }

    public void sendBinaryContent(View view)
    {
        Uri uriToImage = Uri.parse("android.resource://net.learn2develop.CallingApps/drawable/" +Integer.toString(R.drawable.android));

        Intent i = new Intent(android.content.Intent.ACTION_SEND);
        i.setType("image/jpeg");
        i.putExtra(Intent.EXTRA_STREAM, uriToImage);
        i.putExtra(Intent.EXTRA_TEXT, "Text...");
        startActivity(Intent.createChooser(i, "Apps that can respond to this"));

        //for multiple images use arraylist

        /*Intent i = new Intent(android.content.Intent.ACTION_VIEW);
        To just open and image
        //---indicates the type that the target activity will handle---
        i.setType("image/jpeg");
        startActivity(i);*/


        /*
        To open a specific image from sd card
        Intent i = new Intent(android.content.Intent.ACTION_VIEW);
        i.setDataAndType(Uri.parse("file:///storage/sdcard0/MyPhoto.jpg"), "image*//*");
        startActivity(i);*/

    }
}

