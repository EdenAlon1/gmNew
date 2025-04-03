package com.google.android.gms.search.nativeapi.internal;

import com.google.android.gms.search.nativeapi.GetNativeApiInfoCall$Response;
import com.google.android.gms.search.nativeapi.internal.INativeApiCallbacks;
import defpackage.dfse;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class NativeApiResultCallbacks<R> extends INativeApiCallbacks.Stub {
    private final dfse a;
    private final Class b;

    public NativeApiResultCallbacks(dfse<R> dfseVar, Class<R> cls) {
        this.a = dfseVar;
        this.b = cls;
    }

    @Override // com.google.android.gms.search.nativeapi.internal.INativeApiCallbacks
    public void onGetNativeApiInfoResponse(GetNativeApiInfoCall$Response getNativeApiInfoCall$Response) {
        this.a.c(this.b.cast(getNativeApiInfoCall$Response));
    }
}
