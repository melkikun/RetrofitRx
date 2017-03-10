package com.example.it01.retrofitrx.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.it01.retrofitrx.R;
import com.example.it01.retrofitrx.entities.MasterDrawing;

/**
 * Created by IT01 on 3/10/2017.
 */

public class DetailDrawingAdapter extends RecyclerView.Adapter<DetailDrawingAdapter.ViewHolder>{
    private MasterDrawing masterDrawing;
    private Context context;

    public DetailDrawingAdapter(MasterDrawing masterDrawing, Context context) {
        this.masterDrawing = masterDrawing;
        this.context = context;
    }

    //untuk inflater ke layout detail list dan xml detailnya
    @Override
    public DetailDrawingAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.detail_drawing, parent, false);
        return new ViewHolder(view);
    }

    //untuk parsing data ke layout detail dan variabel di dalam class view holder
    @Override
    public void onBindViewHolder(DetailDrawingAdapter.ViewHolder holder, int position) {
        Log.d("message : ", holder.hm+"");
        holder.hm.setText(masterDrawing.getHeadMark());
    }

    //mengembalikan jumlah list dari recycler view
    @Override
    public int getItemCount() {
        return 1;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView hm;
        public ViewHolder(View itemView) {
            super(itemView);
            hm = (TextView) itemView.findViewById(R.id.hm);
        }
    }
}
