package com.example.myapplication.viewBinding_dataBinding;

import androidx.appcompat.app.AppCompatActivity;
import com.example.myapplication.R;
import com.example.myapplication.databinding.ActivityViewBindingBinding;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


public class ViewBindingActivity extends AppCompatActivity {
    private ActivityViewBindingBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityViewBindingBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        EditText e = findViewById(R.id.etName);
        EditText e1 = findViewById(R.id.etAddress);
        EditText e2 = findViewById(R.id.etPhonenumber);
        EditText e3 = findViewById(R.id.etEmail);
        EditText e4 = findViewById(R.id.etAge);
        binding.btnEnter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = e.getText().toString();
                String str1 = e1.getText().toString();
                String str2 = e2.getText().toString();
                String str3 = e3.getText().toString();
                String str4 = e4.getText().toString();

                Intent i = new Intent(ViewBindingActivity.this,ViewBinding02Activity.class);
                i.putExtra("name",str);
                i.putExtra("add",str1);
                i.putExtra("phone",str2);
                i.putExtra("email",str3);
                i.putExtra("age",str4);
                startActivity(i);


//                if(str.isEmpty()){
//                    e.setError("Fill the data");
//                }else {
//                    Intent i = new Intent(ViewBindingActivity.this,ViewBinding02Activity.class);
//                    i.putExtra("data",str);
//                    startActivity(i);
//                }
//                if(str1.isEmpty()){
//                    e1.setError("Fill the data");
//                }else {
//                    Intent i1 = new Intent(ViewBindingActivity.this, ViewBinding02Activity.class);
//                    i1.putExtra("data1", str1);
//                    startActivity(i1);
//                }
//                if(str2.isEmpty()){
//                    e2.setError("Fill the data");
//                }else {
//                    Intent i2 = new Intent(ViewBindingActivity.this, ViewBinding02Activity.class);
//                    i2.putExtra("data2", str2);
//                    startActivity(i2);
//                }
//                if(str3.isEmpty()){
//                    e3.setError("Fill the data");
//                }
//                else {
//                    Intent i3 = new Intent(ViewBindingActivity.this, ViewBinding02Activity.class);
//                    i3.putExtra("data3", str3);
//                    startActivity(i3);
//                }
//                if(str4.isEmpty()){
//                    e4.setError("Fill the data");
//                }else {
//                    Intent i4 = new Intent(ViewBindingActivity.this, ViewBinding02Activity.class);
//                    i4.putExtra("data4", str4);
//                    startActivity(i4);
//                }

            }
        });
    }
}