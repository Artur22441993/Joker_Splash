package com.jjookker.sspllaash.itrfd;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.WebView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Wedsad extends AppCompatActivity {

    WebView ryjap;

    @Override
    public void onBackPressed() {
        if (ryjap.isFocused() && ryjap.canGoBack()) {
            ryjap.goBack();
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if (requestCode != OveStr.jdadwu || OveStr.ugdak == null) {
            super.onActivityResult(requestCode, resultCode, data);
            return;
        }
        Uri[] results = null;
        if (resultCode == Activity.RESULT_OK) {
            if (data == null) {
                if (OveStr.iuhdad != null) {
                    results = new Uri[]{Uri.parse(OveStr.iuhdad)};
                }
            } else {
                String dataString = data.getDataString();
                if (dataString != null) {
                    results = new Uri[]{Uri.parse(dataString)};
                }
            }
        }
        OveStr.ugdak.onReceiveValue(results);
        OveStr.ugdak = null;
        if (OveStr.uygdq == null) {
            super.onActivityResult(requestCode, resultCode, data);
            return;
        }
        Uri result = null;
        try {
            if (resultCode != RESULT_OK) {
                result = null;
            } else {
                result = data == null ? OveStr.iuhad : data.getData();
            }
        } catch (Exception e) { }
        OveStr.uygdq.onReceiveValue(result);
        OveStr.uygdq = null;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().addFlags(1024);
        setContentView(R.layout.udhs);
        ryjap = findViewById(R.id.ryjap);
        OveStr.sdk(ryjap);
        ryjap.setWebViewClient(new Iushna(this));
        ryjap.setWebChromeClient(new TRxs(this));
        ryjap.loadUrl(OveStr.iuuhw);

    }

}
