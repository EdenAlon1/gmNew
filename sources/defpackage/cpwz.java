package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cpwz implements ekrm {
    public static final emyl a;
    public static final cfva b;
    public static final enru c;
    private static final emyl f;
    public final coxk d;
    public final ffbr e;
    private final ffsk g;

    static {
        emyl w = cfvl.w("enable_dangling_parts_metrics");
        w.getClass();
        f = w;
        emyl w2 = cfvl.w("enable_dangling_parts_log_zero");
        w2.getClass();
        a = w2;
        b = cfvl.e(cfvl.b, "dangling_parts_metrics_interval_days", 7);
        c = enru.c("com/google/android/apps/messaging/shared/telephony/analytics/DanglingPartsSynclet");
    }

    public cpwz(coxk coxkVar, ffbr ffbrVar, ffsk ffskVar) {
        coxkVar.getClass();
        ffbrVar.getClass();
        ffskVar.getClass();
        this.d = coxkVar;
        this.e = ffbrVar;
        this.g = ffskVar;
    }

    @Override // defpackage.ekrm
    public final ListenableFuture a() {
        elfl c2;
        if (((Boolean) ((cfup) f.get()).e()).booleanValue() && ctid.h) {
            c2 = axol.c(this.g, ffhe.a, ffsm.a, new cpwy(this, null));
            return c2;
        }
        elfl e = elfo.e(null);
        e.getClass();
        return e;
    }
}
