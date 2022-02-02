package com.jjookker.sspllaash.itrfd;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

import androidx.annotation.RequiresApi;

public class TRxs extends WebChromeClient {

    Wedsad wedsad;

    public TRxs(Wedsad wedsad) {
        this.wedsad = wedsad;
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    public boolean onShowFileChooser(WebView view,
                                     ValueCallback<Uri[]> udad,
                                     FileChooserParams idbsad) {
        if (OveStr.ugdak != null) {
            OveStr.ugdak.onReceiveValue(null);
        }
        OveStr.ugdak = udad;
        Intent contentSelectionIntent = new Intent(Intent.ACTION_GET_CONTENT);
        contentSelectionIntent.addCategory(Intent.CATEGORY_OPENABLE);
        contentSelectionIntent.setType("*/*");
        Intent[] intentArray = new Intent[0];
        Intent chooserIntent = new Intent(Intent.ACTION_CHOOSER);
        chooserIntent.putExtra(Intent.EXTRA_INTENT, contentSelectionIntent);
        chooserIntent.putExtra(Intent.EXTRA_TITLE, OveStr.yyyy("U2VsZWN0IE9wdGlvbjo="));
        chooserIntent.putExtra(Intent.EXTRA_INITIAL_INTENTS, intentArray);
        wedsad.startActivityForResult(chooserIntent, 1);
        return true;
    }
}
