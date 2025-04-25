package com.tabtale.ttplugins.ttpcore.interfaces.adproviders;

import androidx.annotation.NonNull;

import org.json.JSONObject;

import javax.annotation.Nullable;

public interface TTPRewardedAdsProvider {

    boolean loaded(@Nullable String location);

    String show(String location);

    void setListener(@NonNull TTPRewardedVideoEventsListener listener);

    void setRewardListener(TTPEarnedRewardListener listener);

    void setKey(@NonNull String key);

    String getKey();

    void startCaching();
}
