package com.example.administrator.test3_pagechange;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by yuki on 2016/09/28.
 */

public class Fragment extends android.support.v4.app.Fragment implements View.OnClickListener {
    private final static String POSITION = "POSITION";
    int[] pages = { R.layout.activity0, R.layout.activity1};
    int cnt = 0;
    Button button1;

    ArrayList<TextView> textViews = new ArrayList<TextView>();

    public static Fragment newInstance(int position) {
        Fragment frag = new Fragment();
        Bundle b = new Bundle();
        b.putInt(POSITION, position);
        frag.setArguments(b);
        return frag;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        /*
        View view = inflater.inflate(R.layout.fragment_main, null);
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.fragment_main_linearlayout);
        linearLayout.setBackgroundResource(getArguments().getInt(BACKGROUND_COLOR));
        */
        int position = getArguments().getInt(POSITION);
        View view = inflater.inflate(pages[position], null);

        setControls(view, position);

        button1.setOnClickListener(this);
        return view;
    }

    private void setControls(View view, int position){
        ArrayList<Integer> txtId = new ArrayList<Integer>();

        switch(position) {
            case 0:
                txtId.add(R.id.txt0);
                txtId.add(R.id.textView1);
                button1 = (Button) view.findViewById(R.id.next_bt);
                break;
            case 1:
                txtId.add(R.id.txt1);
                txtId.add(R.id.txt2);
                txtId.add(R.id.textView2);
                button1 = (Button) view.findViewById(R.id.back_bt);
                break;
        }

        for (int id : txtId) {
            textViews.add((TextView) view.findViewById(id));
        }
    }

    @Override
    public void onClick(View v) {
        cnt++;
        String msg = Integer.toString(cnt) + "MSG";

        for (TextView txt : textViews) {
            txt.setText(txt.getId() + "\n" + msg);
        }

        switch(v.getId()) {
            case R.id.next_bt:
                Toast.makeText(getActivity().getApplicationContext(), "Hello", Toast.LENGTH_SHORT).show();
                break;
            case R.id.back_bt:
                Toast.makeText(getActivity().getApplicationContext(), "World!", Toast.LENGTH_SHORT).show();
                break;

        }
    }
}
