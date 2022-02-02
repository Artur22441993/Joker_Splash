package com.jjookker.sspllaash.itrfd;

import android.app.Application;
import android.os.Build;

import androidx.annotation.RequiresApi;

public class AJS extends Application {

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    public void onCreate() {
        super.onCreate();
        MainActivity.ajs(this);
    }
}
