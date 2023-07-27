package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.myapplication.adapters.WallpapersAdapter;
import com.example.myapplication.data.WallpapersData;

import java.util.ArrayList;

public class WallpaperActivity extends AppCompatActivity {

    ArrayList<WallpapersData> wallpapersData;
    WallpapersAdapter adapter;
    RecyclerView rvWallpapers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wallpaper);

        rvWallpapers = findViewById(R.id.rv_wallpapers);
        wallpapersData = new ArrayList<>();
        wallpapersData.add(new WallpapersData("https://wallpaperaccess.com/full/40047.jpg"));
        wallpapersData.add(new WallpapersData("https://i.pinimg.com/originals/5c/2f/04/5c2f04f4904f153719fe291e4357b0ac.jpg"));
        wallpapersData.add(new WallpapersData("https://cdn.wallpapersafari.com/0/93/e5N38X.jpg"));
        wallpapersData.add(new WallpapersData("https://wallpapercave.com/wp/wp2769175.jpg"));
        wallpapersData.add(new WallpapersData("https://www.supercars.net/blog/wp-content/uploads/2020/09/wallpaperflare.com_wallpaper-1-1.jpg"));
        wallpapersData.add(new WallpapersData("https://wallpaperaccess.com/full/40047.jpg"));
        wallpapersData.add(new WallpapersData("https://i.pinimg.com/originals/5c/2f/04/5c2f04f4904f153719fe291e4357b0ac.jpg"));
        wallpapersData.add(new WallpapersData("https://cdn.wallpapersafari.com/0/93/e5N38X.jpg"));
        wallpapersData.add(new WallpapersData("https://wallpapercave.com/wp/wp2769175.jpg"));
        wallpapersData.add(new WallpapersData("https://www.supercars.net/blog/wp-content/uploads/2020/09/wallpaperflare.com_wallpaper-1-1.jpg"));
        wallpapersData.add(new WallpapersData("https://wallpaperaccess.com/full/40047.jpg"));
        wallpapersData.add(new WallpapersData("https://i.pinimg.com/originals/5c/2f/04/5c2f04f4904f153719fe291e4357b0ac.jpg"));
        wallpapersData.add(new WallpapersData("https://cdn.wallpapersafari.com/0/93/e5N38X.jpg"));
        wallpapersData.add(new WallpapersData("https://wallpapercave.com/wp/wp2769175.jpg"));
        wallpapersData.add(new WallpapersData("https://www.supercars.net/blog/wp-content/uploads/2020/09/wallpaperflare.com_wallpaper-1-1.jpg"));

        adapter = new WallpapersAdapter(this, wallpapersData);
        rvWallpapers.setLayoutManager(new GridLayoutManager(this, 2));
        rvWallpapers.setAdapter(adapter);
    }
}