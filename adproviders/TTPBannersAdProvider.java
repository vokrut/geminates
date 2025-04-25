package com.tabtale.ttplugins.ttpcore.interfaces.adproviders;

import android.util.Pair;
import android.view.View;

import org.json.JSONObject;

import javax.annotation.Nullable;

public interface TTPBannersAdProvider {

    void initBanners();

    void setAdKey(String adKey);

    void setListener(TTPBannersListener listener);

    void requestBanner();

    int getHeightInPixels();

    Pair<Integer, Integer> getHouseAdsBannerSize();

    Pair<Integer, Integer> getRealBannerSize();

    void calculateBannerSizes(boolean landscape);

    View getAdView();

    void notifyShow();

    void notifyHide();

    @Nullable JSONObject getAdShowEventParameters();

    JSONObject createFirebaseAdImpressionEvent();

    boolean isInitialized();
}
