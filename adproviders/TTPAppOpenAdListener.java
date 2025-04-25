package com.tabtale.ttplugins.ttpcore.interfaces.adproviders;

import androidx.annotation.NonNull;

public interface TTPAppOpenAdListener extends TTPAdShowListener, TTPAdLoadListener {

    void onShowFailed(String errorMessage);

    void onAdRevenueReceived(double revenue);

    void onAdRevenuePaid(@NonNull TTPAd ad, @NonNull TTPILRDData ilrdData);
}
