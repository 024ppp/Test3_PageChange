package com.example.administrator.test3_pagechange;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Toolbar toolbar;
    Button btn1, btn2;
    TextView txt1, txt2;
    static int cnt = 0;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity0);
        btn1 = (Button) findViewById(R.id.next_bt);
        btn1.setOnClickListener(this);
        txt1 = (TextView) findViewById(R.id.textView1);
        txt1.setText(Integer.toString(cnt));

        setContentView(R.layout.activity1);
        btn2 = (Button) findViewById(R.id.back_bt);
        btn2.setOnClickListener(this);
        txt2 = (TextView) findViewById(R.id.textView2);
        txt2.setText(Integer.toString(cnt));

        setContentView(R.layout.activity_main);
        setViews();
    }

    private void setViews() {
        toolbar = (Toolbar) findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);
        FragmentManager manager = getSupportFragmentManager();
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewPager);
        ExampleFragmentPagerAdapter adapter = new ExampleFragmentPagerAdapter(manager);
        viewPager.setAdapter(adapter);
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        tabLayout.setupWithViewPager(viewPager);
    }

    @Override
    public void onClick(View v) {
        LayoutInflater layoutInflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view;
        cnt++;

        switch (v.getId()) {
            case R.id.next_bt:
                view = layoutInflater.inflate(R.layout.activity1, null, false);
                setContentView(view);
                btn2 = (Button) view.findViewById(R.id.back_bt);
                btn2.setOnClickListener(this);

                txt2 = (TextView) findViewById(R.id.textView2);
                txt2.setText(Integer.toString(cnt));
                break;

            case R.id.back_bt:
                view = layoutInflater.inflate(R.layout.activity0, null, false);
                setContentView(view);
                btn1 = (Button) view.findViewById(R.id.next_bt);
                btn1.setOnClickListener(this);

                txt1 = (TextView) findViewById(R.id.textView1);
                txt1.setText(Integer.toString(cnt));
                break;
        }
    }
}