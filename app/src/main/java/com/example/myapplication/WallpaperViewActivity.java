package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.myapplication.data.WallpapersData;

public class WallpaperViewActivity extends AppCompatActivity {

    ImageView img;
    WallpapersData data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wallpaper_view);

        data = (WallpapersData) getIntent().getSerializableExtra("wallpaper");
        img = findViewById(R.id.img);

        Glide.with(this).load(data.getUrl()).into(img);
    }
}