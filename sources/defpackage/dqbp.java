package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dqbp implements ffjm {
    final /* synthetic */ fvn a;
    final /* synthetic */ hkx b;
    final /* synthetic */ dpzx c;
    final /* synthetic */ hho d;
    final /* synthetic */ dyn e;
    final /* synthetic */ hjx f;
    final /* synthetic */ dqbx g;

    public dqbp(fvn fvnVar, dqbx dqbxVar, hkx hkxVar, dyn dynVar, dpzx dpzxVar, hjx hjxVar, hho hhoVar) {
        this.a = fvnVar;
        this.g = dqbxVar;
        this.b = hkxVar;
        this.e = dynVar;
        this.c = dpzxVar;
        this.f = hjxVar;
        this.d = hhoVar;
    }

    @Override // defpackage.ffjm
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            Object f = hfdVar.f();
            if (f == hfc.a) {
                f = hgs.a(ffhe.a, hfdVar);
                hfdVar.y(f);
            }
            final ffsk ffskVar = (ffsk) f;
            hfdVar.v(46264898);
            boolean F = hfdVar.F(ffskVar) | hfdVar.D(this.a);
            final fvn fvnVar = this.a;
            Object f2 = hfdVar.f();
            if (F || f2 == hfc.a) {
                f2 = new ffix() { // from class: dqbe
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        ffqy.d(ffsk.this, null, null, new dqbo(fvnVar, null), 3);
                        return ffcu.a;
                    }
                };
                hfdVar.y(f2);
            }
            ffix ffixVar = (ffix) f2;
            hfdVar.o();
            dqbx dqbxVar = this.g;
            long j = ibw.g;
            long j2 = gft.a(hfdVar).J;
            long j3 = gft.a(hfdVar).G;
            dwfc.a(hpx.d(-1363669419, new dqbi(this.b, this.g, this.e, this.c, this.a, ffixVar, this.f), hfdVar), null, this.a, dqbxVar.a, null, j3, j2, 0.0f, 0.0f, hpx.d(-588813298, new dqbj(this.f), hfdVar), false, hpx.d(1398593821, new dqbl(this.c, ffixVar, this.f, this.d), hfdVar), null, j, 0L, hpx.d(1947012094, new dqbn(ffixVar, this.f), hfdVar), hfdVar, 805306374, 199728);
        }
        return ffcu.a;
    }
}
