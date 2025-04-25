package com.tabtale.ttplugins.ttpcore.interfaces.adproviders;

import androidx.annotation.NonNull;

public interface TTPRewardedAdsListener extends TTPAdShowListener {

    void onLoaded(TTPAd ad, Double revenue, String location);
    void onFailedToLoad(TTPAd ad, String errorMessage, String location);
    void onShowFailed(TTPAd ad, String errorMessage);
    void onAdRevenueReceived(double revenue);
    void onAdRevenuePaid(@NonNull TTPAd ad, @NonNull TTPILRDData ilrdData);
    void sendAdRequest();
}
