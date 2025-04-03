package com.google.android.gms.kids.internal;

import com.google.android.gms.common.api.Status;
import defpackage.dfup;
import defpackage.dhri;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class InternalParentalControlsClient$registerCacheCallback$registrationMethods$2$1 extends AbstractKidsCallbacks {
    final /* synthetic */ dhri<Boolean> $taskCompletionSource;

    InternalParentalControlsClient$registerCacheCallback$registrationMethods$2$1(dhri<Boolean> dhriVar) {
        this.$taskCompletionSource = dhriVar;
    }

    @Override // com.google.android.gms.kids.internal.AbstractKidsCallbacks, com.google.android.gms.kids.internal.IKidsCallbacks
    public void onStatus(Status status) {
        status.getClass();
        dfup.b(status, true, this.$taskCompletionSource);
    }
}
