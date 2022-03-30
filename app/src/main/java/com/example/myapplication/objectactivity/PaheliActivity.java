package com.example.myapplication.objectactivity;

import androidx.appcompat.app.AppCompatActivity;
import com.example.myapplication.R;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class PaheliActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paheli);
        getSupportActionBar().hide();

        Button b = findViewById(R.id.b2);
        EditText e = findViewById(R.id.edit);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String str = e.getText().toString();
                if(str.isEmpty()){
                    e.setError("Fill the data");
                }else {
                    Intent i = new Intent(PaheliActivity.this,BijiActivity.class);
                    i.putExtra("data",str);
                    startActivity(i);
                }

            }
        });
    }
}