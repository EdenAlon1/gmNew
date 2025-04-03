package com.google.android.gms.contactkeys.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.contactkeys.internal.IContactKeyStatusCallback;
import defpackage.dfup;
import defpackage.dhri;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class InternalContactKeyClient$updateE2eeContactKeyRemoteVerificationState$1$callback$1 extends IContactKeyStatusCallback.Stub {
    final /* synthetic */ dhri<Void> $completionSource;

    InternalContactKeyClient$updateE2eeContactKeyRemoteVerificationState$1$callback$1(dhri<Void> dhriVar) {
        this.$completionSource = dhriVar;
    }

    @Override // com.google.android.gms.contactkeys.internal.IContactKeyStatusCallback
    public void onResult(Status status) {
        status.getClass();
        dfup.a(status, this.$completionSource);
    }
}
