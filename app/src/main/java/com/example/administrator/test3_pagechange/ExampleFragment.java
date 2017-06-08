package com.example.administrator.test3_pagechange;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by yuki on 2016/09/28.
 */

public class ExampleFragment extends Fragment implements View.OnClickListener {
    private final static String POSITION = "POSITION";
    int[] pages = { R.layout.activity0, R.layout.activity1};
    int cnt = 0;
    TextView textView1, textView2;
    Button button1;

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
        /*
        View view = inflater.inflate(R.layout.fragment_main, null);
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.fragment_main_linearlayout);
        linearLayout.setBackgroundResource(getArguments().getInt(BACKGROUND_COLOR));
        */
        int position = getArguments().getInt(POSITION);
        View view = inflater.inflate(pages[position], null);

        switch(position) {
            case 0:
                textView1 = TextViews.createTextView(view, R.id.txt0);
                textView2 = (TextView) CreateViewControl.createControl(view, R.id.textView1);
                button1 = Buttons.createButton(view, R.id.next_bt);
                break;
            case 1:
                textView1 = TextViews.createTextView(view, R.id.txt1);
                textView2 = (TextView) CreateViewControl.createControl(view, R.id.textView2);
                button1 = Buttons.createButton(view, R.id.back_bt);
                break;
        }

        button1.setOnClickListener(this);


        return view;
    }

    @Override
    public void onClick(View v) {
        cnt++;
        String msg = Integer.toString(cnt) + "MSG";
        textView1.setText(msg);
        textView2.setText(msg);

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
