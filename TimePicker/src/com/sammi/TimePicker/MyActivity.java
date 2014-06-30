package com.sammi.TimePicker;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TimePicker;
import android.widget.Toast;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class MyActivity extends Activity
{
    TimePicker timePicker;
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        timePicker = (TimePicker) findViewById(R.id.timePicker);
        timePicker.setIs24HourView(true);

    }

    public void btnClick(View view)
    {
        NumberFormat format = new DecimalFormat("00");
        Toast.makeText(getBaseContext(),"time selected: "+ timePicker.getCurrentHour() +" : " +  format.format(timePicker.getCurrentMinute()),Toast.LENGTH_SHORT).show();
    }
}
