package com.google.android.libraries.abuse.hades.safetycore.gmsclient.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.libraries.abuse.hades.safetycore.gmsclient.internal.IBooleanCallback;
import defpackage.dfup;
import defpackage.dhri;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class InternalSafetyCoreClient$isClassifierAvailable$1$callback$1 extends IBooleanCallback.Stub {
    final /* synthetic */ dhri<Boolean> $completionSource;

    InternalSafetyCoreClient$isClassifierAvailable$1$callback$1(dhri<Boolean> dhriVar) {
        this.$completionSource = dhriVar;
    }

    @Override // com.google.android.libraries.abuse.hades.safetycore.gmsclient.internal.IBooleanCallback
    public void onResult(Status status, boolean z) {
        status.getClass();
        dfup.b(status, Boolean.valueOf(z), this.$completionSource);
    }
}
