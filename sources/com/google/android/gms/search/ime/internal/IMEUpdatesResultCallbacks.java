package com.google.android.gms.search.ime.internal;

import com.google.android.gms.search.ime.GetCorpusHandlesRegisteredForIMECall$Response;
import com.google.android.gms.search.ime.GetIMEUpdatesCall$Response;
import com.google.android.gms.search.ime.internal.IIMEUpdatesCallbacks;
import defpackage.dfse;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class IMEUpdatesResultCallbacks<R> extends IIMEUpdatesCallbacks.Stub {
    private final dfse a;
    private final Class b;

    public IMEUpdatesResultCallbacks(dfse<R> dfseVar, Class<R> cls) {
        this.a = dfseVar;
        this.b = cls;
    }

    @Override // com.google.android.gms.search.ime.internal.IIMEUpdatesCallbacks
    public void onGetCorpusHandlesRegisteredForIMEResponse(GetCorpusHandlesRegisteredForIMECall$Response getCorpusHandlesRegisteredForIMECall$Response) {
        this.a.c(this.b.cast(getCorpusHandlesRegisteredForIMECall$Response));
    }

    @Override // com.google.android.gms.search.ime.internal.IIMEUpdatesCallbacks
    public void onGetIMEUpdatesResponse(GetIMEUpdatesCall$Response getIMEUpdatesCall$Response) {
        this.a.c(this.b.cast(getIMEUpdatesCall$Response));
    }
}
