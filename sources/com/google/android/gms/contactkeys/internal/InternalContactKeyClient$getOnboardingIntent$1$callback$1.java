package com.google.android.gms.contactkeys.internal;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.contactkeys.internal.IContactKeyIntentCallback;
import defpackage.dfup;
import defpackage.dhri;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class InternalContactKeyClient$getOnboardingIntent$1$callback$1 extends IContactKeyIntentCallback.Stub {
    final /* synthetic */ dhri<PendingIntent> $completionSource;

    InternalContactKeyClient$getOnboardingIntent$1$callback$1(dhri<PendingIntent> dhriVar) {
        this.$completionSource = dhriVar;
    }

    @Override // com.google.android.gms.contactkeys.internal.IContactKeyIntentCallback
    public void onResult(Status status, PendingIntent pendingIntent) {
        status.getClass();
        pendingIntent.getClass();
        dfup.b(status, pendingIntent, this.$completionSource);
    }
}
