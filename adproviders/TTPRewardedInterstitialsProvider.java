package com.tabtale.ttplugins.ttpcore.interfaces.adproviders;

import org.json.JSONObject;

import javax.annotation.Nullable;

public interface TTPRewardedInterstitialsProvider {

    void loadAd(String key);

    void setListener(TTPRewardedInterstitialsListener listener);

    boolean loaded();

    void show(String location);

    String getAdNetwork();

    @Nullable JSONObject getAdShowEventParameters();

    JSONObject createFirebaseAdImpressionEvent();
}
