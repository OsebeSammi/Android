package com.sammi.Linking;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

/**
 * Created with IntelliJ IDEA.
 * User: sammi
 * Date: 6/4/14
 * Time: 9:09 PM
 * To change this template use File | Settings | File Templates.
 */
public class Activity2 extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.main);

        //---get the data passed in using getStringExtra()---
        Toast.makeText(this, getIntent().getStringExtra("str1"), Toast.LENGTH_SHORT).show();


        //---get the data passed in using getIntExtra()---
        Toast.makeText(this, Integer.toString(getIntent().getIntExtra("age1", 0)), Toast.LENGTH_SHORT).show();

        //---get the Bundle object passed in---
        Bundle bundle = getIntent().getExtras();

        //---get the data using the getString()---
        Toast.makeText(this, bundle.getString("str2"), Toast.LENGTH_SHORT).show();

        //---get the data using the getInt() method---
        Toast.makeText(this, Integer.toString(bundle.getInt("age2")), Toast.LENGTH_SHORT).show();

        //accessing the object passed
        //---get the custom object passed in---
        MyCustomerClass obj = (MyCustomerClass) getIntent().getSerializableExtra("passedObject");
        Toast.makeText(this, obj.Name(), Toast.LENGTH_SHORT).show();
        Toast.makeText(this, obj.Email(), Toast.LENGTH_SHORT).show();

    }

    public void onClick(View view) {
        //use an intent object to return data
        Intent i = new Intent();

        //using putExtra
        i.putExtra("age3", 43);

        //passing back a uri, use setData
        i.setData(Uri.parse("www.learn2develop.net\n"));

        setResult(RESULT_OK, i);

        finish();
    }
}