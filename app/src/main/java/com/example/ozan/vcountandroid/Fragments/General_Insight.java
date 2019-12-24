package com.example.ozan.vcountandroid.Fragments;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.ozan.vcountandroid.R;


public class General_Insight extends Fragment {
    Button InButton;
    Button OutButton;
    Button Adult;
    Button Child;
    Button Included;
    Button Excluded;
    Button WeeklyOn;
    Button WeeklyOf;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstance){
        View rootView = inflater.inflate(R.layout.general_insight,container,false);






        InButton=(Button)rootView.findViewById(R.id.InButton);
        OutButton=(Button)rootView.findViewById(R.id.OutButton);
        Adult=(Button)rootView.findViewById(R.id.Adult);
        Child=(Button)rootView.findViewById(R.id.Child);
        Included=(Button)rootView.findViewById(R.id.SInc);
        Excluded=(Button)rootView.findViewById(R.id.SDec);
        WeeklyOn=(Button)rootView.findViewById(R.id.WOn);
        WeeklyOf=(Button)rootView.findViewById(R.id.WOff);

        InButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                InButton.setTextColor(Color.WHITE);
                InButton.setBackgroundResource(R.drawable.leftblue);
                OutButton.setTextColor(Color.BLACK);
                OutButton.setBackgroundResource(R.drawable.rightwhite);
            }
        });
        OutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OutButton.setTextColor(Color.WHITE);
                OutButton.setBackgroundResource(R.drawable.rightblue);
                InButton.setTextColor(Color.BLACK);
                InButton.setBackgroundResource(R.drawable.leftwhite);

            }
        });
        Adult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Adult.setTextColor(Color.WHITE);
                Adult.setBackgroundResource(R.drawable.leftblue);
                Child.setTextColor(Color.BLACK);
                Child.setBackgroundResource(R.drawable.rightwhite);
            }
        });
        Child.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Child.setTextColor(Color.WHITE);
                Child.setBackgroundResource(R.drawable.rightblue);
                Adult.setTextColor(Color.BLACK);
                Adult.setBackgroundResource(R.drawable.leftwhite);

            }
        });
        Included.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Included.setTextColor(Color.WHITE);
                Included.setBackgroundResource(R.drawable.leftblue);
                Excluded.setTextColor(Color.BLACK);
                Excluded.setBackgroundResource(R.drawable.rightwhite);
            }
        });
        Excluded.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Excluded.setTextColor(Color.WHITE);
                Excluded.setBackgroundResource(R.drawable.rightblue);
                Included.setTextColor(Color.BLACK);
                Included.setBackgroundResource(R.drawable.leftwhite);

            }
        });
        WeeklyOn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                WeeklyOn.setTextColor(Color.WHITE);
                WeeklyOn.setBackgroundResource(R.drawable.leftblue);
                WeeklyOf.setTextColor(Color.BLACK);
                WeeklyOf.setBackgroundResource(R.drawable.rightwhite);
            }
        });
        WeeklyOf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                WeeklyOf.setTextColor(Color.WHITE);
                WeeklyOf.setBackgroundResource(R.drawable.rightblue);
                WeeklyOn.setTextColor(Color.BLACK);
                WeeklyOn.setBackgroundResource(R.drawable.leftwhite);

            }
        });

        return rootView;
    }


}