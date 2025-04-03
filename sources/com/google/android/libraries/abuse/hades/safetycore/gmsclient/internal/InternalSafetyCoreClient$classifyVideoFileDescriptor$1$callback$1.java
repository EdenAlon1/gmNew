package com.google.android.libraries.abuse.hades.safetycore.gmsclient.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.libraries.abuse.hades.safetycore.gmsclient.internal.ISafetyCoreCallbacks;
import defpackage.dfup;
import defpackage.dhri;
import defpackage.dlkh;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class InternalSafetyCoreClient$classifyVideoFileDescriptor$1$callback$1 extends ISafetyCoreCallbacks.Stub {
    final /* synthetic */ dhri<dlkh> $completionSource;

    InternalSafetyCoreClient$classifyVideoFileDescriptor$1$callback$1(dhri<dlkh> dhriVar) {
        this.$completionSource = dhriVar;
    }

    @Override // com.google.android.libraries.abuse.hades.safetycore.gmsclient.internal.ISafetyCoreCallbacks
    public void onClassificationResult(Status status, dlkh dlkhVar) {
        status.getClass();
        dfup.b(status, dlkhVar, this.$completionSource);
    }
}
