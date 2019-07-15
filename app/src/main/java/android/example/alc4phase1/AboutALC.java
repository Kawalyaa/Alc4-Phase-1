package android.example.alc4phase1;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.net.http.SslError;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

public class AboutALC extends AppCompatActivity {
    private WebView aboutAlc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_alc);

        aboutAlc = findViewById(R.id.web_view);
        aboutAlc.getSettings().setJavaScriptEnabled(true);
        aboutAlc.getSettings().setLoadWithOverviewMode(true);
        aboutAlc.getSettings().setUseWideViewPort(true);
        aboutAlc.setHorizontalScrollBarEnabled(false);
        //Launch web within the activity
        aboutAlc.setWebViewClient(new WebViewClient() {
            @Override
            public void onReceivedSslError(WebView view,SslErrorHandler handler, SslError error) {
                handler.proceed();
            }
        });
        //Load the page
        aboutAlc.loadUrl("https://andela.com/alc/");


    }



}
