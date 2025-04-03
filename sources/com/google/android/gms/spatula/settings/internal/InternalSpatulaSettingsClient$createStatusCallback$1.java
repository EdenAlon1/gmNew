package com.google.android.gms.spatula.settings.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.IStatusCallback;
import defpackage.dfup;
import defpackage.dhri;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class InternalSpatulaSettingsClient$createStatusCallback$1 extends IStatusCallback.Stub {
    final /* synthetic */ dhri<Boolean> $completionSource;

    InternalSpatulaSettingsClient$createStatusCallback$1(dhri<Boolean> dhriVar) {
        this.$completionSource = dhriVar;
    }

    @Override // com.google.android.gms.common.api.internal.IStatusCallback
    public void onResult(Status status) {
        if (status == null) {
            dfup.b(Status.c, false, this.$completionSource);
        } else {
            dfup.b(Status.a, Boolean.valueOf(status.d()), this.$completionSource);
        }
    }
}
