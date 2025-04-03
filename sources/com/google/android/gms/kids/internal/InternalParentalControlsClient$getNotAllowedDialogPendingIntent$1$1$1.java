package com.google.android.gms.kids.internal;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import defpackage.dfup;
import defpackage.dhri;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class InternalParentalControlsClient$getNotAllowedDialogPendingIntent$1$1$1 extends AbstractKidsCallbacks {
    final /* synthetic */ dhri<PendingIntent> $completionSource;

    InternalParentalControlsClient$getNotAllowedDialogPendingIntent$1$1$1(dhri<PendingIntent> dhriVar) {
        this.$completionSource = dhriVar;
    }

    @Override // com.google.android.gms.kids.internal.AbstractKidsCallbacks, com.google.android.gms.kids.internal.IKidsCallbacks
    public void onPendingIntent(Status status, PendingIntent pendingIntent) {
        status.getClass();
        dfup.b(status, pendingIntent, this.$completionSource);
    }
}
