package com.tabtale.ttplugins.ttpcore.interfaces.adproviders;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.util.Pair;

public class TTPAdSize {

    private boolean mAdaptive;
    private int mWidth;
    private int mHeight;

    public TTPAdSize(TTPBannerAd ttpBannerAd)
    {
        Pair<Integer,Integer> whPair = ttpBannerAd.getAdaptiveBannerSize();
        mWidth = whPair.first;
        mHeight = whPair.second;
        mAdaptive = true;
    }

    public TTPAdSize(int width, int height, TTPAdSizeType ttpAdSizeType)
    {
        mWidth = width;
        mHeight = height;
        mAdSizeType = ttpAdSizeType;
    }

    public enum TTPAdSizeType {
        LEADERBOARD, FULL_BANNER, BANNER
    }

    private TTPAdSizeType mAdSizeType;

    public int getWidthInPixels(Context context)
    {
        return pointToPixels(mWidth, context);
    }

    public int getWidth()
    {
        return mWidth;
    }

    public int getHeightInPixels(Context context)
    {
        return pointToPixels(mHeight, context);
    }

    public int getHeight()
    {
        return mHeight;
    }

    public TTPAdSizeType getAdSizeType() {
        return mAdSizeType;
    }

    public boolean isAdaptive()
    {
        return mAdaptive;
    }

    private int pointToPixels(int points, Context context)
    {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (points * scale);
    }
}
