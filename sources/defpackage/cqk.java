package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cqk extends ffkk implements ffjm {
    final /* synthetic */ dbe a;
    final /* synthetic */ Object b;
    final /* synthetic */ ffji c;
    final /* synthetic */ cqw d;
    final /* synthetic */ hss e;
    final /* synthetic */ ffjo f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cqk(dbe dbeVar, Object obj, ffji ffjiVar, cqw cqwVar, hss hssVar, ffjo ffjoVar) {
        super(2);
        this.a = dbeVar;
        this.b = obj;
        this.c = ffjiVar;
        this.d = cqwVar;
        this.e = hssVar;
        this.f = ffjoVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        int intValue = ((Number) obj2).intValue();
        if (hfdVar.J((intValue & 3) != 2, intValue & 1)) {
            ffji ffjiVar = this.c;
            cqw cqwVar = this.d;
            Object f = hfdVar.f();
            if (f == hfc.a) {
                f = (csi) ffjiVar.invoke(cqwVar);
                hfdVar.y(f);
            }
            csi csiVar = (csi) f;
            boolean E = hfdVar.E(ffkj.e(this.a.d().b(), this.b));
            dbe dbeVar = this.a;
            Object obj3 = this.b;
            ffji ffjiVar2 = this.c;
            cqw cqwVar2 = this.d;
            Object f2 = hfdVar.f();
            if (E || f2 == hfc.a) {
                f2 = ffkj.e(dbeVar.d().b(), obj3) ? cug.a : ((csi) ffjiVar2.invoke(cqwVar2)).b;
                hfdVar.y(f2);
            }
            Object obj4 = this.b;
            dbe dbeVar2 = this.a;
            cug cugVar = (cug) f2;
            Object f3 = hfdVar.f();
            if (f3 == hfc.a) {
                f3 = new cqr(ffkj.e(obj4, dbeVar2.f()));
                hfdVar.y(f3);
            }
            cue cueVar = csiVar.a;
            cqr cqrVar = (cqr) f3;
            hve hveVar = hvi.e;
            boolean F = hfdVar.F(csiVar);
            Object f4 = hfdVar.f();
            if (F || f4 == hfc.a) {
                f4 = new cqe(csiVar);
                hfdVar.y(f4);
            }
            hvi a = iop.a(hveVar, (ffjn) f4);
            cqrVar.a.b(Boolean.valueOf(ffkj.e(this.b, this.a.f())));
            hvi a2 = a.a(cqrVar);
            dbe dbeVar3 = this.a;
            boolean F2 = hfdVar.F(this.b);
            Object obj5 = this.b;
            Object f5 = hfdVar.f();
            if (F2 || f5 == hfc.a) {
                f5 = new cqf(obj5);
                hfdVar.y(f5);
            }
            ffji ffjiVar3 = (ffji) f5;
            boolean D = hfdVar.D(cugVar);
            Object f6 = hfdVar.f();
            if (D || f6 == hfc.a) {
                f6 = new cqg(cugVar);
                hfdVar.y(f6);
            }
            cru.g(dbeVar3, ffjiVar3, a2, cueVar, cugVar, (ffjm) f6, hpx.d(-616195562, new cqj(this.e, this.b, this.d, this.f), hfdVar), hfdVar, 12582912);
        } else {
            hfdVar.s();
        }
        return ffcu.a;
    }
}
