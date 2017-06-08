package com.example.administrator.test3_pagechange;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Administrator on 2017/06/07.
 */

public class Buttons {
    View view;
    Button button;

    public static Button createButton(View v, int id){
        Button btn = null;
        btn = (Button) v.findViewById(id);
        return btn;
    }
/*
    Buttons(View v, int position) {
        this.view = v;
        switch (position){
            case 0:
                button = (Button) view.findViewById(R.id.next_bt);
                break;
            case 1:
                button = (Button) view.findViewById(R.id.back_bt);
                break;
        }
    }
    */

    public void setText(String msg){
        button.setText(msg);
    }
}
