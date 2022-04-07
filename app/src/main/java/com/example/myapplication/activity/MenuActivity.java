package com.example.myapplication.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.provider.Settings;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;

import com.example.myapplication.databinding.ActivityMenuBinding;
import com.example.myapplication.R;

public class MenuActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {
private ActivityMenuBinding binding;
private ImageView iv;
private Intent i;
private Intent i1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMenuBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setTitle("My Project");

        registerForContextMenu(binding.tv01);

        binding.animationView.setVisibility(View.GONE);
        binding.cb1.setOnCheckedChangeListener(this);
    }
    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        if (b){
            binding.animationView.setVisibility(View.VISIBLE);
        }else {
            binding.animationView.setVisibility(View.GONE);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.my_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        itamSwitch(item);
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        getMenuInflater().inflate(R.menu.my_menu,menu);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        itamSwitch(item);
        return super.onContextItemSelected(item);
    }

    void checkImgae(){ if(iv!=null){iv.setVisibility(View.GONE);} }

    void itamSwitch (MenuItem item){
        switch (item.getItemId()){
            case R.id.login:
                startActivity(new Intent(this,RegisterActivity.class));
                checkImgae();
                break;
            case R.id.image:
                iv = new ImageView(this);
                iv.setBackgroundResource(R.drawable.backoo);
                binding.getRoot().addView(iv);
                break;
            case R.id.camera:
                i = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivity(i);
                checkImgae();
                break;
            case R.id.settings:
                i1 = new Intent(Settings.ACTION_SETTINGS);
                startActivity(i1);
                checkImgae();
                break;
            case R.id.exit:
                System.exit(0);
                break;
        }
    }
}