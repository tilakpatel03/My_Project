package com.example.myapplication.fragment_new;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myapplication.R;
import com.example.myapplication.databinding.FragmentA1Binding;
import com.example.myapplication.databinding.FragmentA2Binding;
import com.example.myapplication.databinding.FragmentA2Binding;

public class A2_Fragment extends Fragment {
    private FragmentA2Binding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentA2Binding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.btn2.setOnClickListener(view1 -> {
            Navigation.findNavController(getView()).navigate(R.id.action_bijoFragment_to_tijoFragment);
        });
        binding.btn4.setOnClickListener(view1 -> {
            Navigation.findNavController(getView()).popBackStack();
        });
    }
}