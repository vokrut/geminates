package com.tabtale.ttplugins.ttpcore.interfaces.adproviders;

import android.app.Activity;

import org.json.JSONObject;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public interface TTPRewardedVideoManager {

    void setKey(@Nonnull String key);

    String getKey();

    void startCaching();

    boolean isLoaded(@Nullable String location);

    TTPAd getShownRewardedAd();

    String show(@Nonnull String location, @Nonnull TTPEarnedRewardListener listener);
}
