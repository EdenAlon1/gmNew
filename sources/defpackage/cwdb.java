package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cwdb implements ffjn {
    final /* synthetic */ cwcq a;
    final /* synthetic */ hkx b;
    final /* synthetic */ rva c;

    public cwdb(cwcq cwcqVar, rva rvaVar, hkx hkxVar) {
        this.a = cwcqVar;
        this.c = rvaVar;
        this.b = hkxVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hvi c;
        hfd hfdVar = (hfd) obj2;
        int intValue = ((Number) obj3).intValue();
        ((ebe) obj).getClass();
        if ((intValue & 17) == 16 && hfdVar.I()) {
            hfdVar.s();
        } else {
            c = ebs.c(hvi.e, 1.0f);
            cwdc.e(hfdVar);
            cwcq cwcqVar = this.a;
            hkx hkxVar = this.b;
            int i = huo.a;
            ipn a = dyc.a(hum.a, false);
            int a2 = hey.a(hfdVar);
            hgb c2 = hfdVar.c();
            hvi b = huz.b(hfdVar, c);
            int i2 = ist.a;
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
            fgdj fgdjVar = cwcqVar.d;
            dyi dyiVar = dyi.a;
            hfdVar.v(1715177364);
            hvi a3 = dyiVar.a(hvr.a(hvi.e, 3.0f), hum.i);
            hfdVar.v(1715177910);
            hvi c3 = cwcqVar.j.a ? eba.c(ecm.b(a3, new eat(ecv.f(hfdVar), 32)), eba.h(0.0f, 0.0f, 16.0f, 17.0f, 3)) : eba.c(ecs.a(a3), eba.h(0.0f, 0.0f, 16.0f, 17.0f, 3));
            hfdVar.o();
            hfdVar.o();
            cwaz.a(fgdjVar, c3, hfdVar, 0);
            cwap.i(cwcqVar.f, hvr.a(hvi.e, 2.0f), null, hfdVar, 48);
            cwdc.b(cwcqVar, dyiVar.a(hvr.a(hvi.e, 1.0f), hum.a), hfdVar, 0);
            doau a4 = cwdc.a(hkxVar);
            dmvt dmvtVar = a4 instanceof dmvt ? (dmvt) a4 : null;
            hfdVar.v(1715195803);
            if (dmvtVar != null) {
                dmva.a(dmvtVar, null, hfdVar, 0);
            }
            hfdVar.o();
            doau a5 = cwdc.a(hkxVar);
            dmfn dmfnVar = a5 instanceof dmfn ? (dmfn) a5 : null;
            hfdVar.v(1715197831);
            if (dmfnVar != null) {
                dmff.a(dmfnVar, null, hfdVar, 0, 2);
            }
            hfdVar.o();
            hfdVar.n();
            cwni.a(this.c, ibw.g, false, null, hfdVar, 48, 12);
        }
        return ffcu.a;
    }
}
