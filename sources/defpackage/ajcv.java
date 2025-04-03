package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ajcv implements ekrm {
    public final eisx a;
    public final cjeo b;
    public final aixt c;
    public final cqoh d;
    public final ajct e;
    private final ffsk f;

    public ajcv(ffsk ffskVar, eisx eisxVar, cjeo cjeoVar, aixt aixtVar, cqoh cqohVar, ajct ajctVar) {
        ffskVar.getClass();
        eisxVar.getClass();
        cjeoVar.getClass();
        cqohVar.getClass();
        this.f = ffskVar;
        this.a = eisxVar;
        this.b = cjeoVar;
        this.c = aixtVar;
        this.d = cqohVar;
        this.e = ajctVar;
    }

    @Override // defpackage.ekrm
    public final ListenableFuture a() {
        elfl c;
        c = axol.c(this.f, ffhe.a, ffsm.a, new ajcu(this, null));
        return c;
    }
}
