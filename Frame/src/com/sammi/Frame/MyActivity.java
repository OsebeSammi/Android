package com.sammi.Frame;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;

public class MyActivity extends Activity
{
    int count = 1;
    FrameLayout frameLayout;
    ImageView imageView;
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        frameLayout = (FrameLayout) findViewById(R.id.framelayout);
    }

    public void btnClick(View view)
    {
        imageView = (ImageView) frameLayout.findViewWithTag(String.valueOf(count));
        imageView.setVisibility(View.INVISIBLE);

        count++;

        imageView = (ImageView) frameLayout.findViewWithTag(String.valueOf(count));
        imageView.setVisibility(View.VISIBLE);

        if (count == 4)          { count = 1; }
    }
}
