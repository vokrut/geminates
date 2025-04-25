package com.tabtale.ttplugins.ttpcore.interfaces.adproviders;

import androidx.annotation.NonNull;

import org.json.JSONObject;

import javax.annotation.Nullable;

public interface TTPInterstitialsProvider {

    boolean loaded();

    String show(String location);

    void setListener(@NonNull TTPInterstitialEventsListener listener);

    void setKey(@NonNull String key);

    String getKey();

    void startCaching();
}
