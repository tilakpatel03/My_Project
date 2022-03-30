package com.example.myapplication.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.myapplication.databinding.ActivityLogInBinding;

public class LogInActivity extends AppCompatActivity {
    private ActivityLogInBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityLogInBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().hide();

        binding.TB1.setOnClickListener(view -> {
            Intent i = new Intent(LogInActivity.this,RegisterActivity.class);
            startActivity(i);
        });
        binding.B2.setOnClickListener(view -> {
            Intent i = new Intent(LogInActivity.this,ForgotActivity.class);
            startActivity(i);
        });
        binding.B1.setOnClickListener(view -> {
            startActivity(new Intent(this,MenuActivity.class));
        });
    }
}