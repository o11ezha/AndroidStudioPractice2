package ru.mirea.goryacheva.dialog;

import android.app.TimePickerDialog;
import android.widget.TimePicker;

import androidx.fragment.app.DialogFragment;

import java.util.Calendar;

public class MyTimeDialogFragment extends DialogFragment {
   Calendar calendar = Calendar.getInstance();
   TimePickerDialog.OnTimeSetListener time = new TimePickerDialog.OnTimeSetListener() {
       @Override
       public void onTimeSet(TimePicker timePicker, int hour, int minute) {
           calendar.set(Calendar.HOUR_OF_DAY, hour);
           calendar.set(Calendar.MINUTE, minute);
       }
   };
}
