package com.example.it01.retrofitrx.event;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by IT01 on 3/9/2017.
 */

public class RecycleListener implements RecyclerView.OnItemTouchListener{
    public interface Xxx{
        public void onClick(View view, int position);
        public void onLongClick(View view, int position);
    }
    private Xxx xxx;
    private GestureDetector gd;

    public RecycleListener(Context context, final RecyclerView rv, final Xxx xxx) {
        this.xxx = xxx;
        this.gd = new GestureDetector(context,
                new GestureDetector.SimpleOnGestureListener(){
                    @Override
                    public void onLongPress(MotionEvent e) {
                        View view = rv.findChildViewUnder(e.getX(), e.getY());
                        xxx.onLongClick(view, rv.getChildAdapterPosition(view));
                    }

                    @Override
                    public boolean onSingleTapUp(MotionEvent e) {
                        View view = rv.findChildViewUnder(e.getX(), e.getY());
                        xxx.onClick(view, rv.getChildAdapterPosition(view));
                        return true;
                    }
                });
    }

    @Override
    public boolean onInterceptTouchEvent(RecyclerView rv, MotionEvent e) {
        View view = rv.findChildViewUnder(e.getX(), e.getY());
        return (view != null && gd.onTouchEvent(e));
    }

    @Override
    public void onTouchEvent(RecyclerView rv, MotionEvent e) {

    }

    @Override
    public void onRequestDisallowInterceptTouchEvent(boolean disallowIntercept) {

    }
}
