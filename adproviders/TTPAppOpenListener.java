package com.tabtale.ttplugins.ttpcore.interfaces.adproviders;

import org.json.JSONObject;

public interface TTPAppOpenListener {

    void onAdLoaded(String adNetwork);

    void onAdFailedToLoad(String adNetwork, String loadAdError);

    void onAdFailedToShow(String adError);

    void onAdShown(String adNetwork);

    void onAdClosed(String adNetwork);

    void onAdClicked(String adNetwork);

    void onILRD(JSONObject ilrdParmas);

}
