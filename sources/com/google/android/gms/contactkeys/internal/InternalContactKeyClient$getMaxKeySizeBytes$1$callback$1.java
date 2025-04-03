package com.google.android.gms.contactkeys.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.contactkeys.internal.IContactKeyIntCallback;
import defpackage.dfup;
import defpackage.dhri;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class InternalContactKeyClient$getMaxKeySizeBytes$1$callback$1 extends IContactKeyIntCallback.Stub {
    final /* synthetic */ dhri<Integer> $completionSource;

    InternalContactKeyClient$getMaxKeySizeBytes$1$callback$1(dhri<Integer> dhriVar) {
        this.$completionSource = dhriVar;
    }

    @Override // com.google.android.gms.contactkeys.internal.IContactKeyIntCallback
    public void onResult(Status status, int i) {
        status.getClass();
        dfup.b(status, 5000, this.$completionSource);
    }
}
