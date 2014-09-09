package com.sammi.Dialogs;


import android.app.Activity;
import android.app.FragmentManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;


public class MyActivity extends Activity implements InputNameDialogFragment.InputNameDialogListener, YesNoDialogFragment.YesNoDialogListener
{
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }

    @Override
    public void onFinishInputDialog(String inputText)
    {
        Toast.makeText(this, "Returned from dialog: " + inputText, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onFinishYesNoDialog(boolean state)
    {
        Toast.makeText(this, "Returned from dialog: " + state,Toast.LENGTH_SHORT).show();
    }

    //===Input Name Dialog===
    public void btnShowDialog(View view)
    {
        showInputNameDialog();
    }

    private void showInputNameDialog()
    {
        FragmentManager fragmentManager = getFragmentManager();
        InputNameDialogFragment inputNameDialog = new InputNameDialogFragment();
        inputNameDialog.setCancelable(false);
        inputNameDialog.setDialogTitle("Enter Name");
        inputNameDialog.show(fragmentManager, "input dialog");
    }


    //===YES/No Dialog===
    public void btnShowYesNoDialog(View view) {
        showYesNoDialog();
    }

    private void showYesNoDialog()
    {
        FragmentManager fragmentManager = getFragmentManager();
        YesNoDialogFragment yesnoDialog = new YesNoDialogFragment();
        yesnoDialog.setCancelable(false);
        yesnoDialog.setDialogTitle("Status change");
        yesnoDialog.show(fragmentManager, "yes/no dialog");
    }


}
