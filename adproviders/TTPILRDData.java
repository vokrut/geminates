package com.tabtale.ttplugins.ttpcore.interfaces.adproviders;

import com.tabtale.ttplugins.ttpcore.interfaces.Analytics;

public class TTPILRDData {
    private final float mRevenue;
    private final String mCurrency;
    private final String mPrecision;
    private String mNetworkPlacement;
    private String mPlacement;
    private String mCreativeIdentifier;
    private String adUnitID;

    public TTPILRDData(float revenue, String currency, String precision, String creativeIdentifier) {
        this.mRevenue = revenue;
        this.mCurrency = currency;
        this.mPrecision = precision;
        this.mNetworkPlacement = Analytics.NA;
        this.mPlacement = Analytics.NA;
        this.mCreativeIdentifier = creativeIdentifier;
    }

    public TTPILRDData(float revenue, String currency, String creativeIdentifier) {
        this(revenue, currency, Analytics.NA, creativeIdentifier);
    }

    public void setAdditionalILRDData(String networkPlacement, String placement) {
        this.mNetworkPlacement = networkPlacement;
        this.mPlacement = placement;
    }

    public float getRevenue() {
        return mRevenue;
    }

    public String getCurrency() {
        return mCurrency;
    }

    public String getPrecision() {
        return mPrecision;
    }

    public String getNetworkPlacement() { return mNetworkPlacement; }
    public String getPlacement() { return mPlacement; }
    public String getCreativeIdentifier() { return  mCreativeIdentifier; }
    public String setAdUnitId(String adUnitID) { return this.adUnitID = adUnitID; }
    public String getAdUnitID() { return adUnitID; }
}
