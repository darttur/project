package com.example.tpss2;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter <RecyclerViewAdapter.ViewHolder> {

    private List<String> records;
    private Fridge context;

    public RecyclerViewAdapter(List recycler_list, List<String> records, Fridge context) {
        this.records = records;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recyclerview_item, viewGroup, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder (ViewHolder viewHolder, int i) {
        String record = records.get(i);

        viewHolder.name.setText(record);

    }

    @Override
    public int getItemCount() {
        return records.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        private TextView name;
        private ImageView image;

        public ViewHolder (View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.info_text);
            image = itemView.findViewById(R.id.back_image);
        }
    }

}
