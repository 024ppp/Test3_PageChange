package com.example.administrator.test3_pagechange;

import android.view.View;
import android.widget.Button;

/**
 * Created by Administrator on 2017/06/07.
 */

public class CreateViewControl {
    public static View createControl(View v, int id) {
        View view = null;
        view = (View) v.findViewById(id);
        return view;
    }
}
