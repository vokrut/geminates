package com.tabtale.ttplugins.ttpcore.interfaces.adproviders;

import android.app.Activity;

public interface TTPAppOpenAd extends TTPAd {
    void loadAd(Activity activity, String key);
    void show(Activity activity);
    void setAdListener(TTPAppOpenAdListener listener);
}
