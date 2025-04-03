package com.google.android.gms.auth.api.phone.internal;

import android.app.PendingIntent;
import android.util.Log;
import com.google.android.gms.auth.api.phone.internal.IMissedCallRetrieverCallbacks;
import com.google.android.gms.common.api.Status;
import defpackage.dfdn;
import defpackage.dfup;
import defpackage.dfxq;
import defpackage.dhri;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class InternalMissedCallRetrieverClient$startIncomingCallRetriever$1$callback$1 extends IMissedCallRetrieverCallbacks.Stub {
    final /* synthetic */ dhri<PendingIntent> $completionSource;

    InternalMissedCallRetrieverClient$startIncomingCallRetriever$1$callback$1(dhri<PendingIntent> dhriVar) {
        this.$completionSource = dhriVar;
    }

    @Override // com.google.android.gms.auth.api.phone.internal.IMissedCallRetrieverCallbacks
    public void onMissedCallRetrieverResult(PendingIntent pendingIntent, Status status) {
        dfxq dfxqVar = dfdn.a;
        Log.i(dfxqVar.a, dfxqVar.a("InternalMissedCallRetrieverClient#onMissedCallRetrieverResult invoked with status: %s", status != null ? Integer.valueOf(status.f) : null));
        dfup.b(status, pendingIntent, this.$completionSource);
    }
}
