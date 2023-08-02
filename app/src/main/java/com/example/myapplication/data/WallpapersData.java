package com.example.myapplication.data;

import java.io.Serializable;

public class WallpapersData implements Serializable {
    private String url;

    public WallpapersData(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
