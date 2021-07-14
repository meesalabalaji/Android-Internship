package com.example.workmanager;

import android.content.Context;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.work.Worker;
import androidx.work.WorkerParameters;

public class ThirdClass extends Worker {
    public ThirdClass(@NonNull  Context context, @NonNull  WorkerParameters workerParams) {
        super(context, workerParams);
    }

    @NonNull

    @Override
    public Result doWork() {
        Log.i("APSSDC","Third Work");
        return Result.success();
    }
}