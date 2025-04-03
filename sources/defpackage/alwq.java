package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class alwq implements ekrm {
    public final ffbr a;
    public final alwh b;
    public final entd c;
    private final ffsk d;

    public alwq(ffbr ffbrVar, alwh alwhVar, ffsk ffskVar) {
        ffbrVar.getClass();
        ffskVar.getClass();
        this.a = ffbrVar;
        this.b = alwhVar;
        this.d = ffskVar;
        this.c = entd.c("BugleCobalt");
    }

    @Override // defpackage.ekrm
    public final ListenableFuture a() {
        elfl c;
        c = axol.c(this.d, ffhe.a, ffsm.a, new alwp(this, null));
        return c;
    }
}
