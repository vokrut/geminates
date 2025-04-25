package com.tabtale.ttplugins.ttpcore.interfaces.adproviders;

import org.json.JSONObject;

public interface TTPRewardedVideoEventsListener {

    void onAdLoaded(String adNetwork, String location);

    void onAdRevenueReceived(double revenue);

    void onAdFailedToLoad(String adNetwork, String loadAdError, String location);

    void onAdFailedToShow(String adNetwork, String adError, String location);

    void onAdShown(String adNetwork, String location);

    void onAdClosed(String adNetwork, String location);

    void onAdClicked(String adNetwork);

    void onILRD(JSONObject ilrdParmas);
}
