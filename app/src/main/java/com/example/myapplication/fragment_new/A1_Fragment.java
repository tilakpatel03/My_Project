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
import com.example.myapplication.databinding.FragmentA1Binding;

public class A1_Fragment extends Fragment {
    private FragmentA1Binding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding=FragmentA1Binding.inflate(getLayoutInflater());
        // Inflate the layout for this fragment
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.btn1.setOnClickListener(view1 -> {
            Navigation.findNavController(getView()).navigate(R.id.action_peloFragment_to_bijoFragment);
        });
    }
}