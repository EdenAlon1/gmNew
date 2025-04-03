package com.google.android.gms.contactkeys.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.contactkeys.E2eeContactKeyParcelable;
import com.google.android.gms.contactkeys.internal.IContactKeyCallback;
import defpackage.dfup;
import defpackage.dhri;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class InternalContactKeyClient$getE2eeContactKey$1$callback$1 extends IContactKeyCallback.Stub {
    final /* synthetic */ dhri<E2eeContactKeyParcelable> $completionSource;

    InternalContactKeyClient$getE2eeContactKey$1$callback$1(dhri<E2eeContactKeyParcelable> dhriVar) {
        this.$completionSource = dhriVar;
    }

    @Override // com.google.android.gms.contactkeys.internal.IContactKeyCallback
    public void onResult(Status status, E2eeContactKeyParcelable e2eeContactKeyParcelable) {
        status.getClass();
        dfup.b(status, e2eeContactKeyParcelable, this.$completionSource);
    }
}
