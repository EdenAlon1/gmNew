package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class abbr implements ffjm {
    final /* synthetic */ ffji a;
    final /* synthetic */ ajiy b;
    final /* synthetic */ abbs c;
    final /* synthetic */ Long d;
    final /* synthetic */ ffji e;
    final /* synthetic */ apyv f;
    final /* synthetic */ int g;

    public abbr(ffji ffjiVar, ajiy ajiyVar, abbs abbsVar, Long l, ffji ffjiVar2, int i, apyv apyvVar) {
        this.a = ffjiVar;
        this.b = ajiyVar;
        this.c = abbsVar;
        this.d = l;
        this.e = ffjiVar2;
        this.g = i;
        this.f = apyvVar;
    }

    @Override // defpackage.ffjm
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            hfdVar.v(-906772771);
            boolean D = hfdVar.D(this.a);
            final ffji ffjiVar = this.a;
            Object f = hfdVar.f();
            if (D || f == hfc.a) {
                f = new abgm() { // from class: abbn
                    @Override // defpackage.abgm
                    public final void a(dqzc dqzcVar) {
                        dqzcVar.getClass();
                        ffji.this.invoke(apzb.b(dqzcVar));
                    }
                };
                hfdVar.y(f);
            }
            abgm abgmVar = (abgm) f;
            hfdVar.o();
            int i = this.g;
            apyv apyvVar = this.f;
            abgv abgvVar = (abgv) abgx.a.createBuilder();
            abgvVar.getClass();
            abgy.d(i, abgvVar);
            apxx apxxVar = apyvVar instanceof apxx ? (apxx) apyvVar : null;
            if (apxxVar != null) {
                abgy.c(apxxVar.a, abgvVar);
            }
            abgx a = abgy.a(abgvVar);
            hfdVar.v(-906782158);
            boolean F = hfdVar.F(this.b);
            final ajiy ajiyVar = this.b;
            Object f2 = hfdVar.f();
            if (F || f2 == hfc.a) {
                f2 = new ffix() { // from class: abbo
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        ajiy.this.a();
                        return ffcu.a;
                    }
                };
                hfdVar.y(f2);
            }
            ffix ffixVar = (ffix) f2;
            hfdVar.o();
            hfdVar.v(-906780422);
            boolean F2 = hfdVar.F(this.c) | hfdVar.D(this.d);
            final abbs abbsVar = this.c;
            final Long l = this.d;
            Object f3 = hfdVar.f();
            if (F2 || f3 == hfc.a) {
                f3 = new ffix() { // from class: abbp
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        abbs.this.a.a(l);
                        return ffcu.a;
                    }
                };
                hfdVar.y(f3);
            }
            ffix ffixVar2 = (ffix) f3;
            hfdVar.o();
            hfdVar.v(-906777251);
            boolean D2 = hfdVar.D(this.a);
            final ffji ffjiVar2 = this.a;
            Object f4 = hfdVar.f();
            if (D2 || f4 == hfc.a) {
                f4 = new ffji() { // from class: abbq
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj3) {
                        String str = (String) obj3;
                        str.getClass();
                        ffji.this.invoke(apzb.a(str));
                        return ffcu.a;
                    }
                };
                hfdVar.y(f4);
            }
            hfdVar.o();
            abgr.a(new abgn(a, ffixVar, ffixVar2, (ffji) f4, abgmVar, this.e), hfdVar, 0);
        }
        return ffcu.a;
    }
}
