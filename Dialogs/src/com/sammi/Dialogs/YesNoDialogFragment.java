package com.sammi.Dialogs;

import android.app.DialogFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created with IntelliJ IDEA.
 * User: sammi
 * Date: 6/30/14
 * Time: 2:58 PM
 * To change this template use File | Settings | File Templates.
 */
public class YesNoDialogFragment extends DialogFragment
{
    Button btnYes, btnNo;
    static String dialogTitle;

    //---Interface containing methods to be implemented
    // by calling activity---
    public interface YesNoDialogListener
    {
        void onFinishYesNoDialog(boolean state);
    }

    public YesNoDialogFragment()
    {
        //empty constructor required
    }

    public void setDialogTitle(String title)
    {
        dialogTitle = title;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_yes_no_dialog, container);

        btnNo = (Button) view.findViewById(R.id.btnNo);
        btnYes = (Button) view.findViewById(R.id.btnYes);

        btnNo.setOnClickListener(btnListener);
        btnYes.setOnClickListener(btnListener);

        getDialog().setTitle(dialogTitle);

        return view;
    }

    private View.OnClickListener btnListener = new View.OnClickListener()
    {
        @Override
        public void onClick(View v)
        {
            //---gets the calling activity---
            YesNoDialogListener activity = (YesNoDialogListener) getActivity();
            boolean state = ((Button) v).getText().toString().equals("Yes");

            activity.onFinishYesNoDialog(state);
            //---dismiss the alert---
            dismiss();

        }
    };
}