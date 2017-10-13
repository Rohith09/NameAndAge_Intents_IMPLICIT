package com.example.chandrassekhar.nameandage2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText et1,et2;
    Button but;

    String name;
    int age;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        send();
    }

    private void send() {
        et1=(EditText)findViewById(R.id.edit1);
        et2=(EditText)findViewById(R.id.edit2);
        but=(Button)findViewById(R.id.button);
        but.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        name=et1.getText().toString();
        age= Integer.parseInt(et2.getText().toString());
        Intent i=new Intent(this,second_activity.class);
        i.putExtra("N1",name);
        i.putExtra("AG",age);
        startActivity(i);
        finish();
    }
}
