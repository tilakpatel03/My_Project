package com.example.myapplication.backstep;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.Navigation;

import android.content.Intent;
import android.os.Bundle;

import com.example.myapplication.R;
import com.example.myapplication.databinding.ActivityBactivityBinding;

public class B_Activity extends AppCompatActivity {
    private ActivityBactivityBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityBactivityBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().hide();

//        binding.btn7.setOnClickListener(view -> {
//            Navigation.findNavController(this,R.id.fcvb1).navigate(R.id.b1_Fragment);
//        });
//        binding.btn8.setOnClickListener(view -> {
//            Navigation.findNavController(this,R.id.fcvb1).navigate(R.id.b2_Fragment);
//        });

        binding.btn1.setOnClickListener(view -> {
            Navigation.findNavController(this, R.id.fcvb1).navigate(R.id.b1_Fragment);
        });
        binding.btn2.setOnClickListener(view -> {
            Navigation.findNavController(this, R.id.fcvb1).navigate(R.id.b2_Fragment);
        });
        binding.btn3.setOnClickListener(view -> {
            Navigation.findNavController(this, R.id.fcvb1).navigate(R.id.b3_Fragment);
        });
        binding.btn4.setOnClickListener(view -> {
            Navigation.findNavController(this, R.id.fcvb1).navigate(R.id.b4_Fragment);
        });
        binding.btn5.setOnClickListener(view -> {
            Navigation.findNavController(this, R.id.fcvb1).navigate(R.id.b5_Fragment);
        });
        binding.btn6.setOnClickListener(view -> {
            Navigation.findNavController(this, R.id.fcvb1).navigate(R.id.b6_Fragment);
        });
    }
    @Override
    public void onBackPressed() {
        if (checkCurrentFragment("fragment_b1_")){
            Intent i = new Intent(Intent.ACTION_MAIN);
            i.addCategory(Intent.CATEGORY_HOME);
            startActivity(i);
        }else if (checkCurrentFragment("fragment_b2_")){
            Navigation.findNavController(this,R.id.fcvb1).navigate(R.id.b1_Fragment);
        }else if (checkCurrentFragment("fragment_b3_")){
            Navigation.findNavController(this,R.id.fcvb1).navigate(R.id.b1_Fragment);
        }else if (checkCurrentFragment("fragment_b4_")){
            Navigation.findNavController(this,R.id.fcvb1).navigate(R.id.b1_Fragment);
        }else if (checkCurrentFragment("fragment_b5_")){
            Navigation.findNavController(this,R.id.fcvb1).navigate(R.id.b1_Fragment);
        }else if (checkCurrentFragment("fragment_b6_")){
            Navigation.findNavController(this,R.id.fcvb1).navigate(R.id.b1_Fragment);
        }
    }
    Boolean checkCurrentFragment(String name){
        return Navigation.findNavController(this,R.id.fcvb1).getCurrentDestination().getLabel().toString().equals(name);
    }
}