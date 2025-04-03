package com.google.android.gms.contactkeys.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.contactkeys.E2eeSelfKeyParcelable;
import com.google.android.gms.contactkeys.internal.ISelfKeyCallback;
import defpackage.dfup;
import defpackage.dhri;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class InternalContactKeyClient$getE2eeSelfKey$1$callback$1 extends ISelfKeyCallback.Stub {
    final /* synthetic */ dhri<E2eeSelfKeyParcelable> $completionSource;

    InternalContactKeyClient$getE2eeSelfKey$1$callback$1(dhri<E2eeSelfKeyParcelable> dhriVar) {
        this.$completionSource = dhriVar;
    }

    @Override // com.google.android.gms.contactkeys.internal.ISelfKeyCallback
    public void onResult(Status status, E2eeSelfKeyParcelable e2eeSelfKeyParcelable) {
        status.getClass();
        dfup.b(status, e2eeSelfKeyParcelable, this.$completionSource);
    }
}
