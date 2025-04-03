package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zdh implements ffjm {
    final /* synthetic */ zcm a;
    final /* synthetic */ ffji b;
    final /* synthetic */ hkx c;
    final /* synthetic */ hho d;

    public zdh(zcm zcmVar, ffji ffjiVar, hkx hkxVar, hho hhoVar) {
        this.a = zcmVar;
        this.b = ffjiVar;
        this.c = hkxVar;
        this.d = hhoVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            gmk f = gim.f(true, hfdVar, 6, 2);
            long j = ibw.g;
            eql eqlVar = zck.a;
            long a = zck.a(hfdVar);
            zcm zcmVar = this.a;
            dmff.d(null, f, j, a, zcmVar, hpx.d(799993543, new zdg(zcmVar, this.b, this.c, this.d), hfdVar), hfdVar, 196992, 1);
        }
        return ffcu.a;
    }
}
