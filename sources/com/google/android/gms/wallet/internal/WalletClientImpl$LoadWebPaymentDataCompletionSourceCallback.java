package com.google.android.gms.wallet.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wallet.WebPaymentData;
import defpackage.dhri;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class WalletClientImpl$LoadWebPaymentDataCompletionSourceCallback extends WalletClientImpl$BaseWalletServiceCallbacks {
    private final dhri a;

    public WalletClientImpl$LoadWebPaymentDataCompletionSourceCallback(dhri<WebPaymentData> dhriVar) {
        this.a = dhriVar;
    }

    @Override // com.google.android.gms.wallet.internal.WalletClientImpl$BaseWalletServiceCallbacks, com.google.android.gms.wallet.internal.IWalletServiceCallbacks
    public void onWebPaymentDataLoaded(Status status, WebPaymentData webPaymentData, Bundle bundle) {
        this.a.b(webPaymentData);
    }
}
