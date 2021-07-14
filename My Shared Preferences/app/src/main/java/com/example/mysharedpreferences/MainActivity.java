package com.example.mysharedpreferences;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;

import com.example.mysharedpreferences.databinding.ActivityMainBinding;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
    }

    public void showdata(View view) {
        Snackbar.make(view,binding.username.getText().toString()+"\n"+
                binding.password.getText().toString()+"\n",Snackbar.LENGTH_LONG).show();

    }
}