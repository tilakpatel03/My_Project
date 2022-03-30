package com.example.myapplication.fragment_new;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;

import com.example.myapplication.R;
import com.example.myapplication.databinding.ActivitySwitchBinding;

public class SwitchActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {
    private ActivitySwitchBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySwitchBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.iv1.setVisibility(View.GONE);
    }
    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        if (b){
            if (compoundButton == binding.cb1){
                binding.getRoot().setBackgroundResource(R.drawable.logo);
            }else {
                binding.getRoot().setBackgroundResource(R.drawable.logo);
            }
            binding.iv1.setVisibility(View.VISIBLE);
        }else {
            binding.iv1.setVisibility(View.GONE);
        }
    }
}