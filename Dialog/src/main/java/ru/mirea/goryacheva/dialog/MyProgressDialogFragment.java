package ru.mirea.goryacheva.dialog;

import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;

import androidx.fragment.app.DialogFragment;

public class MyProgressDialogFragment extends DialogFragment {

    ProgressDialog progressDialog;
    public MyProgressDialogFragment(Activity activity) {
        progressDialog = new ProgressDialog(activity);
    }

    public void setProgressDialog() {
        progressDialog.setTitle("Студент");
        progressDialog.setMessage("Загружаю себя работой");
        progressDialog.setButton(Dialog.BUTTON_POSITIVE, "Хорош",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                    }
                });
        progressDialog.show();
    }
}
