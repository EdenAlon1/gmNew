package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class evcr extends feey {
    final /* synthetic */ dfqg a;

    public evcr(dfqg dfqgVar) {
        this.a = dfqgVar;
    }

    @Override // defpackage.feey
    public final Status a(int i) {
        return this.a.d(i) ? Status.b : Status.i.withDescription("Rejected by (1st-party only) security policy");
    }
}
