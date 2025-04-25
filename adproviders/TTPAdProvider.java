package com.tabtale.ttplugins.ttpcore.interfaces.adproviders;

import androidx.annotation.Nullable;

import org.json.JSONObject;

public interface TTPAdProvider {

    enum Source {
        Banners, Interstitial, RewardedVideo, RewardedInter, AppOpen
    }

    void register(TTPMediationListener mediationListener);

    boolean isMediationInitiated();

    boolean shouldCacheOnShow();

    boolean canCacheWithoutInternet();

    TTPInterstitialsProvider getInterstitialAdsProvider();

    TTPAppOpenProvider getAppOpenProvider();

    TTPBannersAdProvider getBannersAdProvider();

    TTPRewardedAdsProvider getRewardedAdsProvider();

    TTPRewardedInterstitialsProvider getRewardedInterstitialsProvider();
}
