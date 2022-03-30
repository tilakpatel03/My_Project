package com.example.myapplication.backstep;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myapplication.R;
import com.example.myapplication.databinding.FragmentB3Binding;

public class B3_Fragment extends Fragment {
    private FragmentB3Binding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentB3Binding.inflate(getLayoutInflater());
        return binding.getRoot();
    }
}