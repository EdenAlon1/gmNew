package com.google.android.gms.wallet.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wallet.firstparty.GetClientTokenResponse;
import defpackage.dhri;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class WalletClientImpl$GetClientTokenCompletionSourceCallback extends WalletClientImpl$BaseWalletServiceCallbacks {
    private final dhri a;

    public WalletClientImpl$GetClientTokenCompletionSourceCallback(dhri<byte[]> dhriVar) {
        this.a = dhriVar;
    }

    @Override // com.google.android.gms.wallet.internal.WalletClientImpl$BaseWalletServiceCallbacks, com.google.android.gms.wallet.internal.IWalletServiceCallbacks
    public void onClientTokenReceived(Status status, GetClientTokenResponse getClientTokenResponse, Bundle bundle) {
        this.a.b(getClientTokenResponse.a);
    }
}
