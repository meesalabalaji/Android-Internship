package com.example.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*log is to display on monitor(logcat)*/
        Log.i("BALAJI","1 ACTIVITY CREATED");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("BALAJI","1 ACTIVITY STARTED");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("BALAJI","1 ACTIVITY RESUMED");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("BALAJI","1 ACTIVITY PAUSED");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("BALAJI","1 ACTIVITY STOPPED");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("BALAJI","1 ACTIVITY RESTARTED");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("BALAJI","1 ACTIVITY DESTROYED");
    }


    public void next(View view) {
        startActivity(new Intent(this,SecondActivity.class));
    }
}