package com.example.firebase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;

public class HomeActivity2 extends AppCompatActivity {
    TextView tv;
    FirebaseAuth auth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home2);
        tv = findViewById(R.id.textView);
        auth = FirebaseAuth.getInstance();
        tv.setText("WELCOME"+auth.getCurrentUser().getEmail());
    }
}