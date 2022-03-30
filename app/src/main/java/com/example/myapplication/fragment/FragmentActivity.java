package com.example.myapplication.fragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.myapplication.R;
import com.example.myapplication.databinding.ActivityFragmentBinding;

import android.os.Bundle;

public class FragmentActivity extends AppCompatActivity {
    private ActivityFragmentBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityFragmentBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().hide();

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.add(R.id.fcv1,new FirstFragment());
        ft.commit();

        binding.btn1.setOnClickListener(view -> {
            FragmentManager fm1 = getSupportFragmentManager();
            FragmentTransaction ft1 = fm1.beginTransaction();
            ft1.replace(R.id.fcv1,new FirstFragment());
            ft1.commit();
        });

        binding.btn2.setOnClickListener(view -> {
            FragmentManager fm2 = getSupportFragmentManager();
            FragmentTransaction ft2 = fm2.beginTransaction();
            ft2.replace(R.id.fcv1,new SecondFragment());
            ft2.addToBackStack("First");
            ft2.commit();
        });

        binding.btn3.setOnClickListener(view -> {
            FragmentManager fm3 = getSupportFragmentManager();
            FragmentTransaction ft3 = fm3.beginTransaction();
            ft3.replace(R.id.fcv1,new ThirdFragment());
            ft3.addToBackStack("First");
            ft3.commit();

        });
    }
}