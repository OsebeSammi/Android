package com.sammi.Linking;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        /*//link to another activity
        Intent i = new Intent("net.learn2develop.Activity2");

        startActivity(Intent.createChooser(i,"Choose an application"));*/
    }

    public void onClick(View view) {
        Intent i = new Intent("net.learn2develop.Activity2");

        //---use putExtra() to add new key/value pairs---
        i.putExtra("str1", "This is a string");
        i.putExtra("age1", 25);

        //---use a Bundle object to add new key/values
        // pairs---
        Bundle extras = new Bundle();
        extras.putString("str2", "This is another string");
        extras.putInt("age2", 35);
        //---attach the Bundle object to the Intent object---
        i.putExtras(extras);

        MyCustomerClass myCustomerClass = new MyCustomerClass();
        myCustomerClass.setName("Sam osebe");
        myCustomerClass.setEmail("ms.osebe@gmail.com");

        //passing an object
        i.putExtra("passedObject", myCustomerClass);


        //start the activity to get a result back
        startActivityForResult(i, 1);
    }

    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        //check the code is 1
        if (requestCode == 1) {
            //check result is ok
            if (resultCode == RESULT_OK) {
                //get result
                Toast.makeText(this, Integer.toString(data.getIntExtra("age3", 0)), Toast.LENGTH_LONG).show();

                //getting the uri
                //use getData as it was set with setData
                Uri url = data.getData();

                Toast.makeText(this, url.toString(), Toast.LENGTH_LONG).show();
            }
        }
    }


}
