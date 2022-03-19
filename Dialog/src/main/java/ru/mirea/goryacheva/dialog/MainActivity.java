package ru.mirea.goryacheva.dialog;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.app.TimePickerDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickShowDialog(View view) {
        MyDialog dialogFragment = new MyDialog();
        dialogFragment.show(getSupportFragmentManager(), "mirea");
    }

    public void onPositiveClicked() {
        Toast.makeText(getApplicationContext(), "Вы выбрали кнопку \"Уже заливаю\"!",
                Toast.LENGTH_LONG).show();
    }
    public void onNegativeClicked() {
        Toast.makeText(getApplicationContext(), "Вы выбрали кнопку \"Нет\"!",
                Toast.LENGTH_LONG).show();
    }
    public void onNeutralClicked() {
        Toast.makeText(getApplicationContext(), "Вы выбрали кнопку \"Пью кофе\"!",
                Toast.LENGTH_LONG).show();
    }

    public void onProgress(View view){
        MyProgressDialogFragment fragment = new MyProgressDialogFragment(this);
        fragment.setProgressDialog();
    }

    public void OnChooseTime(View v){
        MyTimeDialogFragment fragment = new MyTimeDialogFragment();
        new TimePickerDialog(MainActivity.this, fragment.time,
                fragment.calendar.get(Calendar.HOUR_OF_DAY),
                fragment.calendar.get(Calendar.MINUTE), true).show();
    }

    public void OnChooseDate(View v){
        MyDateDialogFragment fragment = new MyDateDialogFragment();
        new DatePickerDialog(MainActivity.this, fragment.date,
                fragment.calendar.get(Calendar.YEAR),
                fragment.calendar.get(Calendar.MONTH),
                fragment.calendar.get(Calendar.DAY_OF_MONTH)).show();
    }
}