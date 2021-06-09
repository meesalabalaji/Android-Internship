package com.example.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class itemAdapter extends RecyclerView.Adapter<itemAdapter.MyViewHolder> {

    Context ct;
    int[] myImages;
    String[] myNames,myPrices;

    public itemAdapter(MainActivity mainActivity, int[] images, String[] itemNames, String[] itemPrices) {
        ct = mainActivity;
        myImages = images;
        myNames = itemNames;
        myPrices = itemPrices;

    }

    @NonNull
    @Override
    public itemAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(ct).inflate(R.layout.item_row,parent,false);
        MyViewHolder holder = new MyViewHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull itemAdapter.MyViewHolder holder, int position) {
        holder.iv.setImageResource(myImages[position]);
        holder.tv1.setText(myNames[position]);
        holder.tv2.setText(myPrices[position]);
    }

    @Override
    public int getItemCount() {
        return myImages.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView iv;
        TextView tv1,tv2;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            iv = itemView.findViewById(R.id.itemImage);
            tv1 = itemView.findViewById(R.id.itemName);
            tv2 = itemView.findViewById(R.id.itemPrice);
        }

    }
}
