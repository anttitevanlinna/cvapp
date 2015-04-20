package com.herokuapp.anttitevanlinna.portfolioapp;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final WebView myWebView = (WebView) findViewById(R.id.webView);
        myWebView.loadUrl(WebReferences.current());
        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        myWebView.setWebViewClient(new WebViewClient());

        myWebView.setOnTouchListener(
            new SwipeListener(this) {
                public void onSwipeRight() {
                    WebReferences.right();
                    myWebView.loadUrl(WebReferences.current());
                    Toast.makeText(MainActivity.this, WebReferences.current(), Toast.LENGTH_SHORT).show();
                }
                public void onSwipeLeft() {
                    WebReferences.left();
                    myWebView.loadUrl(WebReferences.current());
                    Toast.makeText(MainActivity.this, WebReferences.current(), Toast.LENGTH_SHORT).show();
                }
            }
        );

    }


}
