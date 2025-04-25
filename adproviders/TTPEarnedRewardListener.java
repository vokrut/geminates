package com.tabtale.ttplugins.ttpcore.interfaces.adproviders;

public interface TTPEarnedRewardListener {
    void onUserEarnedReward(int rewardAmount, String rewardType, String adNetwork);

}
