package com.tabtale.ttplugins.ttpcore.interfaces.adproviders;

import androidx.annotation.NonNull;

import org.json.JSONObject;

public interface TTPBannersListener {
    void onAdClosed();

    void onAdFailedToLoad(@NonNull String error);

    void onAdOpened();

    void onAdLoaded(String adNetwork);

    void onAdClicked();

    void onILRD(JSONObject ilrdParams);
}
