package com.tabtale.ttplugins.ttpcore.interfaces.adproviders;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public interface TTPInterstitialManager {

    void setKey(@Nonnull String key);

    String getKey();

    void startCaching();

    boolean isLoaded();

    TTPAd getShownInterstitial();

    String show();
}
