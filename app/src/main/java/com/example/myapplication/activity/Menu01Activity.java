package com.example.myapplication.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.myapplication.databinding.ActivityDashboardBinding;
import com.example.myapplication.databinding.ActivityMenu01Binding;
import com.example.myapplication.databinding.ActivityRegisterBinding;

public class Menu01Activity extends AppCompatActivity {
    private ActivityMenu01Binding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMenu01Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}