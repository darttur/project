package com.example.tpss2;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Fridge extends Fragment implements View.OnClickListener {

//    private RecyclerView recyclerView;


    @Override
    public void onClick(View view) {

    }


    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_fridge, container, false);
        Button btn = (Button) rootView.findViewById(R.id.add);
    btn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
//            recyclerView = recyclerView.findViewById(R.id.recycler_view);
//            recyclerView.addItemDecoration( );

            Toast.makeText(getActivity(), "Вы нажали на кнопку",
                    Toast.LENGTH_SHORT).show();
        }
    });


        return rootView;
    }

}
