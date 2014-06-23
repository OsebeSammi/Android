package com.sammi.Buttons;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends Activity
{
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        Button btn = (Button) findViewById(R.id.button3);

        btn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(getBaseContext(),"Button 3 clicked",Toast.LENGTH_LONG).show();
            }
        });

        Button btn4 = (Button) findViewById(R.id.button4);
        btn4.setOnClickListener(btnListener);

        Button btn5 = (Button) findViewById(R.id.button5);
        btn5.setOnClickListener(btnListener);

    }

    private View.OnClickListener btnListener = new View.OnClickListener()
    {
        public void onClick(View view)
        {
            Toast.makeText(getBaseContext(),
                    ((Button) view).getText() + " was clicked!",
                    Toast.LENGTH_LONG).show();
        }

    };

    public void onClick(View view)
    {
        Button btn = (Button) view;
        Toast.makeText(getBaseContext(),btn.getText()+" was clicked",Toast.LENGTH_LONG).show();
    }

    public void onToggle(View view)
    {
        ToggleButton  btn = (ToggleButton) view;
        Toast.makeText(getBaseContext(),btn.getText()+" status"+btn.isChecked(),Toast.LENGTH_LONG).show();
    }
}