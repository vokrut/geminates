package com.tabtale.ttplugins.ttpcore.interfaces.adproviders;

import android.app.Activity;
import android.util.DisplayMetrics;
import android.view.Display;

public class TTPAdSizeFactory {

    private class BannerSizes {
        private final static int BANNER_HEIGHT = 50;
        private final static int BANNER_WIDTH = 320;
        private final static int FULL_BANNER_HEIGHT = 60;
        private final static int FULL_BANNER_WIDTH = 468;
        private final static int LEADERBOARD_HEIGHT = 90;
        private final static int LEADERBOARD_WIDTH = 728;
    }

    public static TTPAdSize createAdaptiveBannersAdSize(TTPBannerAd bannerAd)
    {
        return new TTPAdSize(bannerAd);
    }

    public static TTPAdSize createGenericAdSize(Activity activity, boolean landscape)
    {
        DisplayMetrics metrics = new DisplayMetrics();
        Display display = activity.getWindowManager().getDefaultDisplay();
        display.getRealMetrics(metrics);
        float adsWithRatio = landscape ? 0.7f : 1.0f;
        int pixels;
        if(landscape) {
            pixels = Math.max(metrics.heightPixels, metrics.widthPixels);
        }
        else {
            pixels = Math.min(metrics.heightPixels, metrics.widthPixels);
        }
        if (728.0f < pixels / metrics.density * adsWithRatio) {
            return new TTPAdSize(BannerSizes.LEADERBOARD_WIDTH, BannerSizes.LEADERBOARD_HEIGHT, TTPAdSize.TTPAdSizeType.LEADERBOARD);
        } else if (468.0f < pixels / metrics.density * adsWithRatio) {
            return new TTPAdSize(BannerSizes.FULL_BANNER_WIDTH, BannerSizes.FULL_BANNER_HEIGHT, TTPAdSize.TTPAdSizeType.FULL_BANNER);
        }
        return new TTPAdSize(BannerSizes.BANNER_WIDTH, BannerSizes.BANNER_HEIGHT, TTPAdSize.TTPAdSizeType.BANNER);
    }

}
