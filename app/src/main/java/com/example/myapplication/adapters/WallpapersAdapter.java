package com.example.myapplication.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.myapplication.R;
import com.example.myapplication.data.WallpapersData;

import java.util.ArrayList;

public class WallpapersAdapter extends RecyclerView.Adapter<WallpapersAdapter.ViewHolder>{

    Context context;
    private ArrayList<WallpapersData> wallpapers;

    public static class ViewHolder extends RecyclerView.ViewHolder{
        private ImageView img;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            img = itemView.findViewById(R.id.img);
        }

        public ImageView getImg() {
            return img;
        }
    }

    public WallpapersAdapter(Context c, ArrayList<WallpapersData> wall) {
        this.context = c;
        this.wallpapers = wall;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.list_item_wallpaper, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        WallpapersData data = wallpapers.get(position);
        Glide.with(context).load(data.getUrl()).into(holder.getImg());
    }

    @Override
    public int getItemCount() {
        return wallpapers.size();
    }
}
