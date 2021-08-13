package com.shubham.basic;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private Context context;
    private List<Integer>list=new ArrayList<>();
    private List<String>listitem=new ArrayList<>();

    public MyAdapter(Context context, List<Integer> list, List<String> listitem) {
        this.context = context;
        this.list = list;
        this.listitem = listitem;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false);
        return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.tv_text.setText(listitem.get(position));
        holder.iv_image.setImageResource(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView iv_image;
        private TextView tv_text;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

        iv_image=itemView.findViewById(R.id.iv_image);
        tv_text=itemView.findViewById(R.id.tv_text);

        }
    }
}
