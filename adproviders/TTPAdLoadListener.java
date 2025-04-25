package com.tabtale.ttplugins.ttpcore.interfaces.adproviders;

public interface TTPAdLoadListener {
    void onLoaded(TTPAd ad, Double revenue);
    void onFailedToLoad(TTPAd ad, String errorMessage);
}
