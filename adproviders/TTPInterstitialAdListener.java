package com.tabtale.ttplugins.ttpcore.interfaces.adproviders;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public interface TTPInterstitialAdListener extends TTPAdShowListener, TTPAdLoadListener {

    void onShowFailed(TTPAd ad, String errorMessage);

    void onAdRevenueReceived(double revenue);

    void onAdRevenuePaid(@NonNull TTPAd ad, @NonNull TTPILRDData ilrdData);

    void sendAdRequest();
}
