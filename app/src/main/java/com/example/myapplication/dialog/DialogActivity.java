package com.example.myapplication.dialog;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.myapplication.databinding.ActivityDialogBinding;

public class DialogActivity extends AppCompatActivity {
    private ActivityDialogBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDialogBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}