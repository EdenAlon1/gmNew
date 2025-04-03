package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class feeu extends feey {
    @Override // defpackage.feey
    public final Status a(int i) {
        return i == feex.a ? Status.b : Status.i.withDescription("Rejected by (internal-only) security policy");
    }
}
