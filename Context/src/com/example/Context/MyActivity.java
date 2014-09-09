package com.example.Context;

import android.app.Activity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MyActivity extends Activity
{
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        Button button = (Button) findViewById(R.id.button1);

        button.setOnCreateContextMenuListener(this);
    }

    //created activity is loaded
    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }

    public void onGroupItemClick(MenuItem item)
    {
        if(item.isChecked())
        {
            item.setChecked(false);
        }

        else
        {
            item.setChecked(true);
        }

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        Toast.makeText(this, item.getTitle(), Toast.LENGTH_LONG).show();
        return true;
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo)
    {
        getMenuInflater().inflate(R.menu.activity_main, menu);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item)
    {
        Toast.makeText(this,item.getTitle(),Toast.LENGTH_LONG).show();
        return true;
    }


}
