package com.example.finalproject;

import android.content.Context;
import android.graphics.Color;
import androidx.appcompat.widget.AppCompatTextView;
import android.util.AttributeSet;
import android.view.Gravity;

public class MonthItemView extends AppCompatTextView {

    private MonthItem item;

    public MonthItemView(Context context){
        super(context);
        init();
    }

    public MonthItemView(Context context, AttributeSet attrs){
        super(context, attrs);
        init();
    }

    private void init(){
        setBackgroundColor(Color.WHITE);
    }

    public MonthItem getItem(){
        return item;
    }

    public void setItem(MonthItem item){
        this.item = item;

        int day = item.getDay();
        if (day != 0) {
            setText(String.valueOf(day));
            setGravity(Gravity.CENTER);
            setTextColor(Color.BLACK);
            setTextSize(20);
        }else{
            setText("");
        }
    }
}