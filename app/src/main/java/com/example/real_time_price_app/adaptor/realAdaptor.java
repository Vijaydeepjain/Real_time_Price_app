package com.example.real_time_price_app.adaptor;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.real_time_price_app.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import Model.model;

public class realAdaptor extends RecyclerView.Adapter<realAdaptor.ViewHolder>{
    private Context mContext;
    private ArrayList<model> List;

    public realAdaptor(Context mContext, ArrayList<model> list) {
        this.mContext = mContext;
        List = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(mContext).inflate(R.layout.product, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        model currentItem = List.get(position);
        String imageUrl = currentItem.getImagelink();
        String price = currentItem.getPrice();
        String name = currentItem.getName();
        holder.TextViewprice.setText("RS."+price);
        holder.TextViewname.setText(name);
       Picasso.get().load(imageUrl).fit().centerInside().into(holder.ImageViewproduct);
    }

    @Override
    public int getItemCount() {
        return List.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        public ImageView ImageViewproduct;
        public TextView TextViewprice;
        public TextView TextViewname;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ImageViewproduct = itemView.findViewById(R.id.image);
            TextViewprice = itemView.findViewById(R.id.price);
            TextViewname = itemView.findViewById(R.id.name);
        }
    }
}
