package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class egwo implements ffjn {
    final /* synthetic */ boolean a;
    final /* synthetic */ ffix b;
    final /* synthetic */ dyh c;
    final /* synthetic */ boolean d;

    public egwo(boolean z, ffix ffixVar, dyh dyhVar, boolean z2) {
        this.a = z;
        this.b = ffixVar;
        this.c = dyhVar;
        this.d = z2;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hvi c;
        egtj egtjVar = (egtj) obj;
        hfd hfdVar = (hfd) obj2;
        ((Number) obj3).intValue();
        egtjVar.getClass();
        hfdVar.v(1808208277);
        boolean D = hfdVar.D(this.b);
        Object f = hfdVar.f();
        if (D || f == hfc.a) {
            final ffix ffixVar = this.b;
            f = new ffix() { // from class: egwl
                @Override // defpackage.ffix
                public final Object invoke() {
                    ffix.this.invoke();
                    return ffcu.a;
                }
            };
            hfdVar.y(f);
        }
        hfdVar.o();
        ffix a = egtjVar.a((ffix) f);
        eql eqlVar = eqm.a;
        ebf ebfVar = new ebf(0.0f, 0.0f, 0.0f, 0.0f);
        hvi k = ebs.k(this.c.a(hvi.e, new hut(1.0f, 0.85f)), 56.0f);
        hfdVar.v(1808214293);
        Object f2 = hfdVar.f();
        if (f2 == hfc.a) {
            f2 = new ffji() { // from class: egwm
                @Override // defpackage.ffji
                public final Object invoke(Object obj4) {
                    jkv jkvVar = (jkv) obj4;
                    jkvVar.getClass();
                    jkr.u(jkvVar, "photoEdit");
                    return ffcu.a;
                }
            };
            hfdVar.y(f2);
        }
        boolean z = this.a;
        hfdVar.o();
        c = jjs.c(k, false, (ffji) f2);
        ebe ebeVar = dwfd.a;
        dwfj.b(a, c, !z, eqlVar, null, dwfd.c(3.0f, hfdVar, 30), ebfVar, hpx.d(-1408188657, new egwn(this.d), hfdVar), hfdVar, 817889280, 336);
        return ffcu.a;
    }
}
