package com.sammi.Star;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.LinearLayout;

public class MainActivity extends Activity
{
    LinearLayout rating;
    CheckBox star;
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        rating = (LinearLayout) findViewById(R.id.ratings);

        for(int i = 1;i <= 5; i++)
        {
            star = (CheckBox) rating.findViewWithTag(String.valueOf(i));
            star.setOnClickListener(starsListener);
        }
    }

    private View.OnClickListener starsListener = new View.OnClickListener()
    {

        public void onClick(View view)
        {
            //getting value of clicked tag
            int tag = Integer.valueOf((String) view.getTag());

            //check stars
            for (int i = 1; i <= tag; i++)
            {
                star = (CheckBox) rating.findViewWithTag(String.valueOf(i));
                star.setChecked(true);
            }

            //uncheck the remaining stars
            for(int i = tag+1; i<=5 ;i++)
            {
                star = (CheckBox) rating.findViewWithTag(String.valueOf(i));
                star.setChecked(false);
            }


        }

    };
}
