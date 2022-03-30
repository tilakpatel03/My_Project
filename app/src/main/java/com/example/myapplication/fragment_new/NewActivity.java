package com.example.myapplication.fragment_new;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;

import com.example.myapplication.databinding.ActivityNewBinding;

public class NewActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {
    private ActivityNewBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityNewBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().hide();

    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

    }
}