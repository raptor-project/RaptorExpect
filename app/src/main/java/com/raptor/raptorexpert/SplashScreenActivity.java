package com.raptor.raptorexpert;

import android.content.res.AssetManager;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

import java.io.IOException;
import java.io.InputStream;

public class SplashScreenActivity extends AppCompatActivity {
    ImageView imageView;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.splash_screen_activity);
      //  imageView=findViewById(R.id.imageView);
      /*  String pathUri="file:///android_asset/purplesplash.svg";
        Glide.with(this).load(Uri.parse(pathUri)).into(imageView);*/
  /*      AssetManager assetManager = getAssets();
        ImageView imageView = (ImageView) findViewById(R.id.imageView);
        try {
            InputStream ims = assetManager.open("purplesplash.svg");
            Drawable d = Drawable.createFromStream(ims, null);
            imageView.setImageDrawable(d);
        } catch (IOException ex) {
            return;
        }*/
      /*  ImageView iw= (ImageView)findViewById(R.id.imageView);
        int resID = getResources().getIdentifier("file:///android_asset/purplesplash.svg", "drawable",  getPackageName());
        iw.setImageResource(resID);*/
/*
        webView.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);*/




/*        webView.setInitialScale(1);
        webView.getSettings().setLoadWithOverviewMode(true);
        webView.getSettings().setUseWideViewPort(true);*/
    }
}
