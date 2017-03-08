package com.example.it01.retrofitrx.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.it01.retrofitrx.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IT01 on 3/8/2017.
 */

public class ListDrawingAdapter extends RecyclerView.Adapter<ListDrawingAdapter.ViewHolder>{
    private List <String> headMark = new ArrayList<>();
    private Context context;

    public ListDrawingAdapter(List<String> headMark, Context context) {
        this.headMark = headMark;
        this.context = context;
    }

    @Override
    public ListDrawingAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_drawing, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ListDrawingAdapter.ViewHolder holder, int position) {
        holder.hm.setText(headMark.get(position));
    }

    @Override
    public int getItemCount() {
        return this.headMark.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView hm;
        public ViewHolder(View itemView) {
            super(itemView);
            hm = (TextView) itemView.findViewById(R.id.hm);
        }
    }
}
