package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.IStatusCallback;
import defpackage.dfse;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class StatusCallback extends IStatusCallback.Stub {
    private final dfse a;

    public StatusCallback(dfse<Status> dfseVar) {
        this.a = dfseVar;
    }

    @Override // com.google.android.gms.common.api.internal.IStatusCallback
    public void onResult(Status status) {
        this.a.c(status);
    }
}
