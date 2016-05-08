package com.bz.toollibrary.bitmaploader.compress;

import android.graphics.Bitmap;

import com.bz.toollibrary.bitmaploader.config.ImageConfig;


public interface IBitmapCompress {

	public Bitmap compress(byte[] bitmapBytes, ImageConfig config, int origW, int origH) throws Exception;
}
