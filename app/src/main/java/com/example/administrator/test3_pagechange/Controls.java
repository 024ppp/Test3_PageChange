package com.example.administrator.test3_pagechange;

import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Administrator on 2017/06/07.
 */

public class Controls {
    TextView txt1, txt2;

    Controls(View v, int position) {
        /*
        switch(v.getId()) {
            case R.id.next_bt:
                txt1 = (TextView) v.findViewById(R.id.txt1);
                break;
            case R.id.back_bt:
                txt2 = (TextView) v.findViewById(R.id.txt2);
                break;
        }
        */
        switch (position){
            case 1:
                txt1 = (TextView) v.findViewById(R.id.txt1);
                break;
            case 2:
                txt2 = (TextView) v.findViewById(R.id.txt2);
                break;
        }

    }

    public void setText(String msg, int position){
        switch (position){
            case 1:
                txt1.setText(msg);
                break;
            case 2:
                txt2.setText(msg);
                break;
        }
    }
}
