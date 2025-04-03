package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fco implements kev {
    private final huo a;
    private final fcu b;
    private long c = 0;

    public fco(huo huoVar, fcu fcuVar) {
        this.a = huoVar;
        this.b = fcuVar;
    }

    @Override // defpackage.kev
    public final long a(kac kacVar, long j, kah kahVar, long j2) {
        long a = this.b.a();
        if ((9223372034707292159L & a) == 9205357640488583168L) {
            a = this.c;
        }
        this.c = a;
        return kaa.d(kaa.d(kacVar.d(), kab.c(a)), this.a.a(j2, 0L, kahVar));
    }
}
