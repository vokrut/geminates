package com.tabtale.ttplugins.ttpcore.interfaces.adproviders;

import android.app.Activity;

import java.util.List;

public interface TTPMediationProvider {

    interface TTPMediationProviderListener {
        void onInit(boolean success);
    }

    void initializeMediation(TTPMediationProviderListener listener);
    void setMobileAsConfig(boolean tagForChildDirectedTreatment, boolean isUA, List<String> testDevices);

    boolean appOpenShouldWaitForMedInit();

}
