package com.google.android.gms.kids.internal;

import com.google.android.gms.common.api.Status;
import defpackage.dfup;
import defpackage.dhri;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class InternalParentalControlsClient$registerCacheCallback$registrationMethods$1$1 extends AbstractKidsCallbacks {
    final /* synthetic */ dhri<Void> $taskCompletionSource;

    InternalParentalControlsClient$registerCacheCallback$registrationMethods$1$1(dhri<Void> dhriVar) {
        this.$taskCompletionSource = dhriVar;
    }

    @Override // com.google.android.gms.kids.internal.AbstractKidsCallbacks, com.google.android.gms.kids.internal.IKidsCallbacks
    public void onStatus(Status status) {
        status.getClass();
        dfup.a(status, this.$taskCompletionSource);
    }
}
