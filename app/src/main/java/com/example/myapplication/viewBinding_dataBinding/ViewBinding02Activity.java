package com.example.myapplication.viewBinding_dataBinding;

import androidx.appcompat.app.AppCompatActivity;
import com.example.myapplication.R;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ViewBinding02Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_binding02);

        TextView t = findViewById(R.id.tv01);
        TextView t1 = findViewById(R.id.tv02);
        TextView t2 = findViewById(R.id.tv03);
        TextView t3 = findViewById(R.id.tv04);
        TextView t4 = findViewById(R.id.tv05);

        Intent i = getIntent();

        String s = i.getStringExtra("name");
        String s1 = i.getStringExtra("add");
        String s2 = i.getStringExtra("phone");
        String s3 = i.getStringExtra("email");
        String s4 = i.getStringExtra("age");

        t.setText(s);
        t1.setText(s1);
        t2.setText(s2);
        t3.setText(s3);
        t4.setText(s4);



    }
}