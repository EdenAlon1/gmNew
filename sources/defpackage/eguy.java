package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eguy implements ffjn {
    final /* synthetic */ ffix a;
    final /* synthetic */ String b;
    final /* synthetic */ ffjm c;
    final /* synthetic */ int d;
    final /* synthetic */ long e;

    public eguy(ffix ffixVar, String str, ffjm ffjmVar, int i, long j) {
        this.a = ffixVar;
        this.b = str;
        this.c = ffjmVar;
        this.d = i;
        this.e = j;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hvi d;
        hvi c;
        egtj egtjVar = (egtj) obj;
        hfd hfdVar = (hfd) obj2;
        ((Number) obj3).intValue();
        egtjVar.getClass();
        int i = huo.a;
        hus husVar = hum.n;
        hve hveVar = hvi.e;
        hfdVar.v(-712709202);
        boolean D = hfdVar.D(this.a);
        Object f = hfdVar.f();
        if (D || f == hfc.a) {
            final ffix ffixVar = this.a;
            f = new ffix() { // from class: eguw
                @Override // defpackage.ffix
                public final Object invoke() {
                    ffix.this.invoke();
                    return ffcu.a;
                }
            };
            hfdVar.y(f);
        }
        hfdVar.o();
        d = ebs.d(dfb.d(hveVar, false, null, egtjVar.a((ffix) f), 7), 1.0f);
        hvi e = eba.e(d, 32.0f, 16.0f);
        hfdVar.v(-712705166);
        boolean D2 = hfdVar.D(this.b);
        final String str = this.b;
        Object f2 = hfdVar.f();
        if (D2 || f2 == hfc.a) {
            f2 = new ffji() { // from class: egux
                @Override // defpackage.ffji
                public final Object invoke(Object obj4) {
                    jkv jkvVar = (jkv) obj4;
                    jkvVar.getClass();
                    jkr.u(jkvVar, str);
                    return ffcu.a;
                }
            };
            hfdVar.y(f2);
        }
        hfdVar.o();
        c = jjs.c(e, false, (ffji) f2);
        ffjm ffjmVar = this.c;
        int i2 = this.d;
        long j = this.e;
        ipn a = ebm.a(dxu.a, husVar, hfdVar, 48);
        int a2 = hey.a(hfdVar);
        hgb c2 = hfdVar.c();
        hvi b = huz.b(hfdVar, c);
        int i3 = ist.a;
        ffix ffixVar2 = iss.a;
        hfdVar.M();
        hfdVar.x();
        if (hfdVar.H()) {
            hfdVar.j(ffixVar2);
        } else {
            hfdVar.z();
        }
        hlc.b(hfdVar, a, iss.e);
        hlc.b(hfdVar, c2, iss.d);
        ffjm ffjmVar2 = iss.f;
        if (hfdVar.H() || !ffkj.e(hfdVar.f(), Integer.valueOf(a2))) {
            Integer valueOf = Integer.valueOf(a2);
            hfdVar.y(valueOf);
            hfdVar.h(valueOf, ffjmVar2);
        }
        hlc.b(hfdVar, b, iss.c);
        ffjmVar.a(hfdVar, 0);
        dwjt.b(jii.a(i2, hfdVar), eba.i(hvi.e, 32.0f, 0.0f, 2), j, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, hfdVar, 48, 0, 131064);
        hfdVar.n();
        return ffcu.a;
    }
}
