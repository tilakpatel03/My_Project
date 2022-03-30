package com.example.myapplication.fragment_new;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;

import com.example.myapplication.R;
import com.example.myapplication.databinding.FragmentA2Binding;
import com.example.myapplication.databinding.FragmentA3Binding;
import com.example.myapplication.databinding.FragmentA3Binding;


public class A3_Fragment extends Fragment implements CompoundButton.OnCheckedChangeListener {
    private FragmentA3Binding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentA3Binding.inflate(getLayoutInflater());
        binding.iv1.setVisibility(View.GONE);
        return binding.getRoot();
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


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.btn3.setOnClickListener(view1 -> {
            Navigation.findNavController(getView()).navigate(R.id.action_tijoFragment_to_peloFragment);
            Navigation.findNavController(getView()).popBackStack();
            binding.cb1.setOnCheckedChangeListener(this);

        });
    }

}