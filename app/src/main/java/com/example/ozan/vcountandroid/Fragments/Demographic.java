package com.example.ozan.vcountandroid.Fragments;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.Toast;

import com.example.ozan.vcountandroid.R;

import java.util.ArrayList;
import java.util.Calendar;

import in.galaxyofandroid.spinerdialog.OnSpinerItemClick;
import in.galaxyofandroid.spinerdialog.SpinnerDialog;

public class Demographic extends Fragment implements DatePickerDialog.OnDateSetListener {

    Button placeholder;
    Button calendar;
    SpinnerDialog spinnerDialog;
    ArrayList<String> places = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstance){
        final View rootView = inflater.inflate(R.layout.demographic,container,false);

        placeholder = rootView.findViewById(R.id.placeholder);
        calendar = rootView.findViewById(R.id.calendar);

        places.clear();
        places.add("ankara");
        places.add("istanbul");

        spinnerDialog = new SpinnerDialog(getActivity(),places,"");
        spinnerDialog.bindOnSpinerListener(new OnSpinerItemClick() {
            @Override
            public void onClick(String s, int i) {
                Toast.makeText(getActivity(), s, Toast.LENGTH_SHORT).show();
            }
        });

        placeholder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                spinnerDialog.showSpinerDialog();
            }
        });

        calendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDatePickerDialog();
            }
        });

        return rootView;
    }
    @Override
    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
        Calendar c = Calendar.getInstance();
        String date = month + "/" + dayOfMonth + "/" + year;
        Toast.makeText(getActivity(), date, Toast.LENGTH_SHORT).show();
    }
    public void showDatePickerDialog(){
        DatePickerDialog datePickerDialog = new DatePickerDialog(
                getActivity(),
                this,
                Calendar.getInstance().get(Calendar.YEAR),
                Calendar.getInstance().get(Calendar.MONTH),
                Calendar.getInstance().get(Calendar.DAY_OF_MONTH));
        datePickerDialog.show();
    }
}

