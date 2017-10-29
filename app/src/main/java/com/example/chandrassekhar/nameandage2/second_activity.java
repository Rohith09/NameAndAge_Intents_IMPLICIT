package com.example.chandrassekhar.nameandage2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;


public class second_activity extends AppCompatActivity {
    TextView tv1,tv2,tv3,tv4;
    Intent ci;
    String name,email,bio;
    int age;
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);
        tv1=(TextView)findViewById(R.id.text1);
        tv2=(TextView)findViewById(R.id.text2);
        tv3=(TextView)findViewById(R.id.text3);
        tv4=(TextView)findViewById(R.id.text4);
        ci=getIntent();
        name=ci.getStringExtra("N1");
        age=ci.getIntExtra("AG",-1);
        email=ci.getStringExtra("EM");
        bio=ci.getStringExtra("BIO");
        tv1.setText(name);
        tv2.setText(String.valueOf(age));
        tv3.setText(email);
        tv4.setText(bio);

    }
}
