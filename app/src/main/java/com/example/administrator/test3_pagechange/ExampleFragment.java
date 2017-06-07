package com.example.administrator.test3_pagechange;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by yuki on 2016/09/28.
 */

public class ExampleFragment extends Fragment implements View.OnClickListener {
    private final static String POSITION = "background_color";
    int[] pages = { R.layout.activity0, R.layout.activity1};

    public static ExampleFragment newInstance(int position) {
        ExampleFragment frag = new ExampleFragment();
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
        int position = getArguments().getInt(POSITION);

        /*
        View view = inflater.inflate(R.layout.fragment_main, null);
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.fragment_main_linearlayout);
        linearLayout.setBackgroundResource(getArguments().getInt(BACKGROUND_COLOR));
        */
        View view = inflater.inflate(pages[position], null);
        MainActivity.cnt++;

        switch (position) {
            case 0:
                TextView textView1 = (TextView) view.findViewById(R.id.textView1);
                textView1.setText(Integer.toString(MainActivity.cnt) + "数字カウントは一回ずつ");
                Button btn1 = (Button) view.findViewById(R.id.next_bt);
                btn1.setOnClickListener(this);
                break;
            case 1:
                TextView textView2 = (TextView) view.findViewById(R.id.textView2);
                textView2.setText(Integer.toString(MainActivity.cnt) + "らしい");
                Button btn2 = (Button) view.findViewById(R.id.back_bt);
                btn2.setOnClickListener(this);
                break;
        }

        return view;
    }

    @Override
    public void onClick(View v) {
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
