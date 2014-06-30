package com.example.RadioButtons;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MyActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.rdbGp1);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId)
            {
                RadioButton rb1 = (RadioButton) findViewById(R.id.rdb1);
                RadioButton rb2 = (RadioButton) findViewById(R.id.rdb2);

                if(rb1.isChecked())
                {
                    Toast.makeText(getBaseContext(),rb1.getText(),Toast.LENGTH_LONG).show();
                }

                else
                {
                    Toast.makeText(getBaseContext(),rb2.getText(),Toast.LENGTH_LONG).show();
                }
            }
        });

        CheckBox checkBox = (CheckBox) findViewById(R.id.chkAutosave);

        checkBox.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View v)
            {
                if(((CheckBox)v).isChecked())
                {
                    Toast.makeText(getBaseContext(),"Get content"+" has been checked",Toast.LENGTH_LONG).show();
                }
                else
                {
                    Toast.makeText(getBaseContext(),"Get content has been unchecked",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
