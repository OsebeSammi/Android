package com.example.DatePicker;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.Toast;

public class MyActivity extends Activity
{
    DatePicker datePicker;
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        datePicker = (DatePicker) findViewById(R.id.datePicker);
    }

    public void btnClick(View view)
    {
        Toast.makeText(getBaseContext(),"Date picked "+ datePicker.getMonth()+1 + "/" + datePicker.getDayOfMonth() + "/" + datePicker.getYear(),Toast.LENGTH_SHORT).show();
    }
}
