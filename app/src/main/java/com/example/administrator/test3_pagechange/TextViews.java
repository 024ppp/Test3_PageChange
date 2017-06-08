package com.example.administrator.test3_pagechange;

import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Administrator on 2017/06/07.
 */

public class TextViews {
    View view;
    TextView textView;

    public static TextView createTextView(View v, int id){
        TextView txt = null;
        txt = (TextView) v.findViewById(id);
        return txt;
    }
/*
    TextViews(View v, int position) {
        this.view = v;
        switch (position){
            case 0:
                textView = (TextView) view.findViewById(R.id.txt0);
                break;
            case 1:
                textView = (TextView) view.findViewById(R.id.txt1);
                break;
        }

    }

    public void setText(String msg){
       textView.setText(msg);
    }
    */
}
