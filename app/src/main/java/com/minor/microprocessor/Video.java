package com.minor.microprocessor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Video extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);

        WebView webView=findViewById(R.id.web);
        webView.loadUrl("https://www.youtube.com/results?search_query=pawan+chandani+microprocessor");
    }
}
