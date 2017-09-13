package io.appium.sampleapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_main);

        WebView wv = (WebView) findViewById(R.id.wv1);
        WebView.setWebContentsDebuggingEnabled(true);

        wv.getSettings().setBuiltInZoomControls(true);
        wv.getSettings().setJavaScriptEnabled(false);

        wv.setWebViewClient(new WebViewClient());

        wv.loadUrl("http://appium.io/");

        super.onCreate(savedInstanceState);
    }
}
