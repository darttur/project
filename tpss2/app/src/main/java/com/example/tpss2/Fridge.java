package com.example.tpss2;

import android.annotation.SuppressLint;
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
import android.widget.TextView;
import android.widget.Toast;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Fridge extends Fragment implements View.OnClickListener {
    //private RecyclerView recyclerView;
    //private RecyclerView.LayoutManager LayoutManager;
    //private RecyclerViewAdapter recyclerViewAdapter;
    //private List<String> listData = new ArrayList<>();
    //private List recycler_list_images;



    @Override
    public void onClick(View view) {

    }


    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_fridge, container, false);
//        Button btn = rootView.findViewById(R.id.add);
        //final TextView tex = rootView.findViewById(R.id.products);

        //setupList(8);

//        recyclerView=rootView.findViewById(R.id.recycler_view_fridge);
//        recyclerView.setHasFixedSize(true);
//        LayoutManager = new LinearLayoutManager(getContext());
//        recyclerView.setLayoutManager(LayoutManager);
//        RecyclerAdapter adapter = new RecyclerAdapter(listData,getContext());
//        recyclerView.setAdapter(adapter);

//        btn.setOnClickListener(new View.OnClickListener() {
//        @Override
//        public void onClick(View v) {
//
//        }
//    });
        return rootView;
    }
//    private void setupList(int n){
//        for(int i=0;i<n;i++)
//            listData.add("щось там "+i);
//    }

}
