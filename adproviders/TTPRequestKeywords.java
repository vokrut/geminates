package com.tabtale.ttplugins.ttpcore.interfaces.adproviders;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;

@Keep
public interface TTPRequestKeywords {
    void setKeywordForRequest(@NonNull String keyword, @NonNull String value);

    void setCpmKeywordForRequest(float cpm);
}
