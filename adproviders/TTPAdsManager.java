package com.tabtale.ttplugins.ttpcore.interfaces.adproviders;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;

import java.util.List;

@Keep
public interface TTPAdsManager extends TTPRequestKeywords {
    TTPMediationProvider getMediationProvider();
    TTPBannerAd getBannerAd();
    TTPInterstitialManager createInterstitialManager(@NonNull TTPInterstitialAdListener interstitialListener);
    TTPRewardedVideoManager createRewardedVideoManager(@NonNull TTPRewardedAdsListener rewardedAdsListener);
    TTPAppOpenAd getAppOpenAd();
    TTPRewardedInterstitialAd getRewardedInterstitialAd();
    TTPForwardConsent getForwardConsent();
    String getDefaultNetworkName();
    String getAdPlatform();
    boolean shouldCacheOnShow();
    boolean canCacheWithoutInternet();
    List<String> getKeywordsKeyValueList(); //key-value separated with underscore '_'
}
