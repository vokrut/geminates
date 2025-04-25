package com.tabtale.ttplugins.ttpcore.interfaces.adproviders;

import org.json.JSONObject;

public interface TTPInterstitialEventsListener {

    void onAdLoaded(String adNetwork);

    void onAdRevenueReceived(double revenue);

    void onAdFailedToLoad(String adNetwork, String loadAdError);

    void onAdFailedToShow(String adNetwork, String adError);

    void onAdShown(String adNetwork);

    void onAdClosed(String adNetwork);

    void onAdClicked(String adNetwork);

    void onILRD(JSONObject ilrdParams);
}
