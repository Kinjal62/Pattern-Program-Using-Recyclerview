package com.example.recyclerviewdemo.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerviewdemo.R;
import com.example.recyclerviewdemo.model.RecyclerviewModelPattern;

import java.util.ArrayList;

public class RecyclerViewAdapterPattern extends RecyclerView.Adapter<RecyclerViewAdapterPattern.ViewHolder>{

    ArrayList<RecyclerviewModelPattern> myListdata;
    Context ctx;

    public RecyclerViewAdapterPattern(Context ctx, ArrayList<RecyclerviewModelPattern> myListdata){
        this.ctx = ctx;
        this.myListdata = myListdata;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v1= LayoutInflater.from(ctx).inflate(R.layout.raw_pattern, parent, false);
        return new RecyclerViewAdapterPattern.ViewHolder(v1);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.rvPattern.setText(myListdata.get(position).getItemPattern());
    }

    @Override
    public int getItemCount() {
        return myListdata.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{
        TextView rvPattern;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            rvPattern = itemView.findViewById(R.id.rvPattern);
        }
    }
}
