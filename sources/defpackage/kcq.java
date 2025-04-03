package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kcq implements kev {
    private final huo a;

    public kcq(huo huoVar) {
        this.a = huoVar;
    }

    @Override // defpackage.kev
    public final long a(kac kacVar, long j, kah kahVar, long j2) {
        long b = kacVar.b();
        long a = kacVar.a();
        huo huoVar = this.a;
        long a2 = huoVar.a(0L, (b << 32) | (a & 4294967295L), kahVar);
        long a3 = huoVar.a(0L, j2, kahVar);
        long j3 = a3 >> 32;
        long j4 = a3 & 4294967295L;
        return kaa.d(kaa.d(kaa.d(kacVar.d(), a2), ((-((int) j4)) & 4294967295L) | ((-((int) j3)) << 32)), ((kaa.a(0L) * (kahVar == kah.a ? 1 : -1)) << 32) | (kaa.b(0L) & 4294967295L));
    }
}
