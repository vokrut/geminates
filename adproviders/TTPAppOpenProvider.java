package com.tabtale.ttplugins.ttpcore.interfaces.adproviders;

import androidx.annotation.NonNull;

import org.json.JSONObject;

import javax.annotation.Nullable;

public interface TTPAppOpenProvider {

    void loadAd(String key, Boolean landscape, @NonNull Boolean gotConsent);

    void setListener(TTPAppOpenListener appOpenListener);

    boolean loaded();

    void show();

    String getAdNetwork();

    @Nullable JSONObject getAdShowEventParameters();

    JSONObject createFirebaseAdImpressionEvent();

    boolean shouldWaitForMediationInit();
}
