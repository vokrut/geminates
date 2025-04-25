package com.tabtale.ttplugins.ttpcore.interfaces.adproviders;

import android.content.Context;

import com.tabtale.ttplugins.ttpcore.common.TTPConsentData;

public interface TTPForwardConsent {
    void setConsent(Context context, TTPConsentData consentData);
}
