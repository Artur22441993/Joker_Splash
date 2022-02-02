package com.jjookker.sspllaash.itrfd;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.annotation.RequiresApi;

public class Iushna extends WebViewClient {

    Wedsad wedsad;

    @SuppressLint("StaticFieldLeak")
    public static JS js;

    public Iushna(Wedsad wedsad) {
        this.wedsad = wedsad;
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    public void onPageStarted(WebView view, String url, Bitmap favicon) {
        super.onPageStarted(view, url, favicon);
        if(url.contains(OveStr.yyyy("NDA0"))){
            wedsad.startActivity(new Intent(wedsad.getApplicationContext(), MainActivity.class));
            wedsad.finishAffinity();
        }
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    public void onPageFinished(WebView view, String url) {
        super.onPageFinished(view, url);
        js.getSharedPreferences(js.getPackageName(), js.MODE_PRIVATE).edit().putString(OveStr.yyyy("c2F2ZWRVcmw="),url).apply();
    }
}
