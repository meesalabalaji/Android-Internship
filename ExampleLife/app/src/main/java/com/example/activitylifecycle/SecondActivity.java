package com.example.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        /*log is to display on monitor(logcat)*/
        Log.i("BALAJI","ACTIVITY 2 CREATED");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("BALAJI","ACTIVITY 2 STARTED");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("BALAJI","ACTIVITY 2 RESUMED");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("BALAJI","ACTIVITY 2 PAUSED");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("BALAJI","ACTIVITY 2 STOPPED");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("BALAJI","ACTIVITY 2 RESTARTED");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("BALAJI","ACTIVITY 2 DESTROYED");
    }
}