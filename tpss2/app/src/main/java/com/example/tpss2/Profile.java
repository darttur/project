package com.example.tpss2;


import android.annotation.SuppressLint;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import java.text.ParsePosition;


public class Profile extends Fragment {

    EditText weight, height, age, sex, physic;

    @SuppressLint("WrongViewCast")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_profile, container, false);

       EditText weight = (EditText) rootView.findViewById(R.id.weighte);
       EditText height = (EditText) rootView.findViewById(R.id.heighte);
       EditText age = (EditText) rootView.findViewById(R.id.agee);
       EditText sex = (EditText) rootView.findViewById(R.id.sexe);
       EditText physic = (EditText) rootView.findViewById(R.id.physice);




        return rootView;
    }

}
