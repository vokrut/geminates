package com.tabtale.ttplugins.ttpcore.interfaces.adproviders;

public interface TTPAdShowListener {
    void onShown(TTPAd ad);
    void onClosed(TTPAd ad);
    void onClick(TTPAd ad);
    void onILRDDataReceived(TTPAd ad, TTPILRDData ilrdData);
}
