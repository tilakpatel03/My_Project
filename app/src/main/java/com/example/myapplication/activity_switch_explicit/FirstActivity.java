package com.example.myapplication.activity_switch_explicit;

import androidx.appcompat.app.AppCompatActivity;
import com.example.myapplication.R;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        getSupportActionBar().hide();

        Button b = findViewById(R.id.btnb1);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(FirstActivity.this,SceondActivity.class);
                startActivity(i);
            }
        });
    }
}