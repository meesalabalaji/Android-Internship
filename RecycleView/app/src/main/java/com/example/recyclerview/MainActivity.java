package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    RecyclerView rv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv = findViewById(R.id.recyclerview);
        int[] images = {R.drawable.a,R.drawable.b,R.drawable.c,
                R.drawable.d,R.drawable.e,R.drawable.f,R.drawable.g,
                R.drawable.h,R.drawable.i,R.drawable.j};
        String[] itemNames = {"Chiken Biryani","Chiken Lolypop",
                "Egg fried Rice","Chiken 65","Mutton Curry","Mutton Biryani",
                "Fish Curry","Prawns Curry","Veg Noodels","Chiken Noodles"};
        String[] itemPrices = {"200","250","100","350","400","350",
                "250","250","100","150"};
        rv.setLayoutManager(new LinearLayoutManager(this));
        itemAdapter adapter = new itemAdapter(this,images,itemNames,itemPrices);
        rv.setAdapter(adapter);
    }
}