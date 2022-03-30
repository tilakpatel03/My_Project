package com.example.myapplication.objectactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.myapplication.R;
public class BijiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biji);
        setTitle("View");

        TextView t = findViewById(R.id.tv);
        Intent i = getIntent();
        String s = i.getStringExtra("data");
        t.setText(s);
    }
}