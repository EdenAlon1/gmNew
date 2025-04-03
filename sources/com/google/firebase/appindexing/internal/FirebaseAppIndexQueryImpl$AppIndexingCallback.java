package com.google.firebase.appindexing.internal;

import defpackage.dhri;
import defpackage.euoy;
import defpackage.eupi;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class FirebaseAppIndexQueryImpl$AppIndexingCallback<R> extends AbstractAppIndexingCallback {
    private final dhri a;
    private final Class b;

    public FirebaseAppIndexQueryImpl$AppIndexingCallback(dhri<R> dhriVar, Class<R> cls) {
        this.a = dhriVar;
        this.b = cls;
    }

    @Override // com.google.firebase.appindexing.internal.AbstractAppIndexingCallback, com.google.firebase.appindexing.internal.IAppIndexingCallback
    public void onGetIndexableResponse(euoy euoyVar) {
        Thing thing;
        if (euoyVar.a.d() && ((thing = euoyVar.b) == null || this.b.isInstance(thing))) {
            this.a.b(this.b.cast(euoyVar.b));
        } else {
            this.a.a(eupi.a(euoyVar.a, "GetIndexable error, please try again."));
        }
    }
}
