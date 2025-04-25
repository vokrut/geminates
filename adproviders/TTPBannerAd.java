package com.tabtale.ttplugins.ttpcore.interfaces.adproviders;

import android.view.View;

import android.util.Pair;

public interface TTPBannerAd extends TTPAd {

    void onResume();
    void onPause();

    void setAdSize(TTPAdSize ttpAdSize);

    void setAdUnitId(String adUnitId);

    View getAdView();

    void setListener(TTPBannerAdListener listener);

    Pair<Integer,Integer> getAdaptiveBannerSize();

    void notifyHide();

    void notifyShow();

}
