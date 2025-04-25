package com.tabtale.ttplugins.ttpcore.interfaces.adproviders;

import android.app.Activity;

public interface TTPRewardedInterstitialAd extends TTPAd
{
    void show(Activity activity, TTPEarnedRewardListener listener);
    void setAdListener(TTPRewardedInterstitialAdListener listener);
}
