package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dnau implements ffjn {
    final /* synthetic */ long a;

    public dnau(long j) {
        this.a = j;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hvi hviVar = (hvi) obj;
        hfd hfdVar = (hfd) obj2;
        ((Number) obj3).intValue();
        hviVar.getClass();
        hfdVar.v(-474393620);
        hfdVar.v(-1125964376);
        boolean C = hfdVar.C(this.a);
        Object f = hfdVar.f();
        if (C || f == hfc.a) {
            final long j = this.a;
            ffji ffjiVar = new ffji() { // from class: dnat
                @Override // defpackage.ffji
                public final Object invoke(Object obj4) {
                    ifo ifoVar = (ifo) obj4;
                    ifoVar.getClass();
                    ifoVar.p();
                    ifoVar.r(j, 0L, (r20 & 4) != 0 ? ifq.c(ifoVar.b(), 0L) : 0L, (r20 & 8) != 0 ? 1.0f : 0.0f, (r20 & 16) != 0 ? ifu.a : null, (r20 & 32) != 0 ? null : null, (r20 & 64) != 0 ? 3 : 0);
                    return ffcu.a;
                }
            };
            hfdVar.y(ffjiVar);
            f = ffjiVar;
        }
        hfdVar.o();
        hvi c = hxs.c(hviVar, (ffji) f);
        hfdVar.o();
        return c;
    }
}
