package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gtw extends ffkk implements ffjm {
    final /* synthetic */ int a;
    final /* synthetic */ gul b;
    final /* synthetic */ int c;
    final /* synthetic */ long d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gtw(int i, gul gulVar, int i2, long j) {
        super(2);
        this.a = i;
        this.b = gulVar;
        this.c = i2;
        this.d = j;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hvi c;
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            int i = this.a;
            gul gulVar = this.b;
            String D = guj.D(i, gulVar.k(), this.c, hfdVar);
            int i2 = huo.a;
            int i3 = this.c;
            long j = this.d;
            huo huoVar = hum.e;
            hve hveVar = hvi.e;
            ipn a = dyc.a(huoVar, false);
            int a2 = hey.a(hfdVar);
            hgb c2 = hfdVar.c();
            hvi b = huz.b(hfdVar, hveVar);
            int i4 = ist.a;
            ffix ffixVar = iss.a;
            hfdVar.M();
            hfdVar.x();
            if (hfdVar.H()) {
                hfdVar.j(ffixVar);
            } else {
                hfdVar.z();
            }
            hlc.b(hfdVar, a, iss.e);
            hlc.b(hfdVar, c2, iss.d);
            ffjm ffjmVar = iss.f;
            if (hfdVar.H() || !ffkj.e(hfdVar.f(), Integer.valueOf(a2))) {
                Integer valueOf = Integer.valueOf(a2);
                hfdVar.y(valueOf);
                hfdVar.h(valueOf, ffjmVar);
            }
            hlc.b(hfdVar, b, iss.c);
            hve hveVar2 = hvi.e;
            boolean D2 = hfdVar.D(D);
            Object f = hfdVar.f();
            if (D2 || f == hfc.a) {
                f = new gtv(D);
                hfdVar.y(f);
            }
            c = jjs.c(hveVar2, false, (ffji) f);
            grl.b(fwc.a(i3, 2, 6), c, j, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, hfdVar, 0, 0, 131064);
            hfdVar.n();
        }
        return ffcu.a;
    }
}
