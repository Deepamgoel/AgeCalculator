package com.example.deepamgoel.practicejava;

import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    int date = 1, month = 1, year = 1990;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void incD(View view) {

        date++;

        if (date > 31)
            date = 1;

        displayD(date);
    }


    public void decD(View view) {

        date--;

        if (date < 1)
            date = 31;

        displayD(date);
    }

    public void incM(View view) {

        month++;

        if (month > 12)
            month = 1;

        displayM(month);
    }

    public void decM(View view) {

        month--;

        if (month < 1)
            month = 12;

        displayM(month);
    }

    public void incY(View view) {

        year++;

        if (year > 2018)
            year = 1990;

        displayY(year);
    }

    public void decY(View view) {

        year--;

        if (year < 1990)
            year = 2018;

        displayY(year);
    }

    private void displayD(int x) {
        TextView dayTextView = findViewById(R.id.DateVar);
        dayTextView.setText(String.format(Locale.getDefault(), "%d", x));
    }

    private void displayM(int y) {
        TextView dayTextView = findViewById(R.id.MonthVar);
        dayTextView.setText(String.format(Locale.getDefault(), "%d", y));
    }

    private void displayY(int z) {
        TextView dayTextView = findViewById(R.id.YearVar);
        dayTextView.setText(String.format(Locale.getDefault(), "%d", z));
    }


    private java.util.Date getDate() {
        Calendar temp = Calendar.getInstance();
        Calendar dt = Calendar.getInstance();
        dt.clear();
        dt.set(temp.get(Calendar.YEAR), temp.get(Calendar.MONTH), temp.get(Calendar.DATE));
        return dt.getTime();
    }


    public void calc(View view) {
        Toast.makeText(this, "Live Your Life and Forget Your Age!", Toast.LENGTH_LONG).show();
        displayAge();
//
//        java.util.Date SysDate = getDate();
//
//        String sysDay          = (String) DateFormat.format("dd",   SysDate);
//        String sysMonthNumber  = (String) DateFormat.format("MM",   SysDate);
//        String sysYear         = (String) DateFormat.format("yyyy", SysDate);
//

    }


    private void displayAge() {
        TextView age = findViewById(R.id.Age);
        age.setText(String.format("%s", getDate()));
    }


}
