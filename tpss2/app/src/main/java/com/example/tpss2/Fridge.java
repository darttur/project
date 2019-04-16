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
import android.widget.LinearLayout;
import android.widget.Toast;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Fridge extends Fragment implements View.OnClickListener {
    private RecyclerView recyclerView;
    private RecyclerViewAdapter recyclerViewAdapter;
    private List recycler_list;
    private List recycler_list_images;



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


        }
    });

        recyclerView = recyclerView.findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this , LinearLayoutManager.VERTICAL, false);
        layoutManager.scrollToPosition(0);
        recyclerView.setLayoutManager(layoutManager);
        recycler_list = new ArrayList<>(Arrays.asList("First", "Second"));
        recyclerViewAdapter = new RecyclerViewAdapter(recycler_list, recycler_list_images, this);
        recyclerView.setAdapter(recyclerViewAdapter);

        return rootView;
    }

}
