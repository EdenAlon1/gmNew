package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahrn implements ekrm {
    public static final cfup a = cfvl.k(cfvl.b, "smarts_classification_cleanup_interval_days", 7);
    public final ffbr b;
    private final ffsk c;

    public ahrn(ffbr ffbrVar, ffsk ffskVar) {
        ffbrVar.getClass();
        ffskVar.getClass();
        this.b = ffbrVar;
        this.c = ffskVar;
    }

    @Override // defpackage.ekrm
    public final ListenableFuture a() {
        elfl c;
        if (((Boolean) ((cfup) ctjd.bI.get()).e()).booleanValue()) {
            c = axol.c(this.c, ffhe.a, ffsm.a, new ahrm(this, null));
            return c;
        }
        elfl e = elfo.e(null);
        e.getClass();
        return e;
    }
}
