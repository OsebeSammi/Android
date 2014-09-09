package com.sammi.Dialogs;

import android.app.DialogFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created with IntelliJ IDEA.
 * User: sammi
 * Date: 6/30/14
 * Time: 12:54 PM
 * To change this template use File | Settings | File Templates.
 */
public class InputNameDialogFragment extends DialogFragment
{
    EditText textName;
    Button btn;

    static String dialogTitle;

    public InputNameDialogFragment()
    {}

    public void setDialogTitle(String title)
    {
        dialogTitle = title;
    }

    public interface InputNameDialogListener
    {
        void onFinishInputDialog(String inputText);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_inputname_dialog, container);

        textName = (EditText) view.findViewById(R.id.txtName);
        btn = (Button) view.findViewById(R.id.btnDone);

        btn.setOnClickListener
        (
            new View.OnClickListener()
            {
                public void onClick(View view)
                {
                    //---gets the calling activity---
                    InputNameDialogListener activity = (InputNameDialogListener) getActivity();

                    activity.onFinishInputDialog(textName.getText().toString());
                    //---dismiss the alert---
                    dismiss();
                }
            }
        );

        //---show the keyboard automatically---
        textName.requestFocus();
        getDialog().getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_VISIBLE);

        //---set the title for the dialog---
        getDialog().setTitle(dialogTitle);

        return view;
    }
}
