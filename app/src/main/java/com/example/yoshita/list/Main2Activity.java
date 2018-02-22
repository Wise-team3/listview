package com.example.yoshita.list;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Question ques = (Question) getIntent().getSerializableExtra(MainActivity.EXTRA_COUNTRY);
        textView = (TextView) findViewById(R.id.tt);
        textView.setText(ques.getName());
    }
}
