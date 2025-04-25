package com.tabtale.ttplugins.ttpcore.interfaces.adproviders;

import android.util.Pair;
import java.util.List;

public interface TTPAd {

    void loadAd(String key);
    String getAdNetwork();
    String getAdSourceInstanceId();
    String getMediationAbTestName();
    String getMediationGroupName();
    String getAbTestVariantName();
    List<Pair<String,Long>> getAdapterResponseInfo();
    boolean isLoaded();
    String maxAdFormat();
    String maxAdUnitId();
    String maxNetworkName();
}
