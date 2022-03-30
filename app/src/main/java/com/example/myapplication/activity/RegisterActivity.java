package com.example.myapplication.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.myapplication.databinding.ActivityRegisterBinding;

public class RegisterActivity extends AppCompatActivity {
    private ActivityRegisterBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityRegisterBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().hide();

        binding.b1.setOnClickListener(view -> {
            Intent i = new Intent(RegisterActivity.this,LogInActivity.class);
            startActivity(i);
            onBackPressed();
        });
        binding.TB1.setOnClickListener(view -> {
            Intent i = new Intent(RegisterActivity.this,LogInActivity.class);
            startActivity(i);
            onBackPressed();
        });
    }
}