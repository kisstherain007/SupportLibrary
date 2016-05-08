package com.bz.toollibrary.bitmaploader.config;


import com.bz.toollibrary.bitmaploader.compress.IBitmapCompress;

/**
 * Created by n911305 on 2016/1/14.
 */
public class ImageConfig {

    private int maxWidth = 0;// 图片最大宽度

    private int maxHeight = 0;// 图片最大高度

    private Class<? extends IBitmapCompress> bitmapCompress;

    private int loadingRes;

    private int loadfaildRes;

    public int getMaxWidth() {
        return maxWidth;
    }

    public void setMaxWidth(int maxWidth) {
        this.maxWidth = maxWidth;
    }

    public int getMaxHeight() {
        return maxHeight;
    }

    public void setMaxHeight(int maxHeight) {
        this.maxHeight = maxHeight;
    }

    public int getLoadfaildRes() {
        return loadfaildRes;
    }

    public void setLoadfaildRes(int loadfaildRes) {
        this.loadfaildRes = loadfaildRes;
    }

    public int getLoadingRes() {
        return loadingRes;
    }

    public void setLoadingRes(int loadingRes) {
        this.loadingRes = loadingRes;
    }
}
