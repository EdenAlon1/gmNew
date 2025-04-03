package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmex implements ffjn {
    final /* synthetic */ hvi a;
    final /* synthetic */ long b;
    final /* synthetic */ ebe c;
    final /* synthetic */ ffjn d;

    public dmex(hvi hviVar, long j, ebe ebeVar, ffjn ffjnVar) {
        this.a = hviVar;
        this.b = j;
        this.c = ebeVar;
        this.d = ffjnVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hvi a;
        hvi d;
        dys dysVar = (dys) obj;
        hfd hfdVar = (hfd) obj2;
        int intValue = ((Number) obj3).intValue();
        dysVar.getClass();
        if ((intValue & 6) == 0) {
            intValue |= true != hfdVar.D(dysVar) ? 2 : 4;
        }
        if ((intValue & 19) == 18 && hfdVar.I()) {
            hfdVar.s();
        } else {
            hvi hviVar = this.a;
            ffjn ffjnVar = this.d;
            hvi b = dys.b(hviVar, 1.0f, false);
            dxq dxqVar = dxu.c;
            int i = huo.a;
            ipn a2 = dyo.a(dxqVar, hum.j, hfdVar, 0);
            int a3 = hey.a(hfdVar);
            hgb c = hfdVar.c();
            hvi b2 = huz.b(hfdVar, b);
            int i2 = ist.a;
            ffix ffixVar = iss.a;
            hfdVar.M();
            hfdVar.x();
            if (hfdVar.H()) {
                hfdVar.j(ffixVar);
            } else {
                hfdVar.z();
            }
            hlc.b(hfdVar, a2, iss.e);
            hlc.b(hfdVar, c, iss.d);
            ffjm ffjmVar = iss.f;
            if (hfdVar.H() || !ffkj.e(hfdVar.f(), Integer.valueOf(a3))) {
                Integer valueOf = Integer.valueOf(a3);
                hfdVar.y(valueOf);
                hfdVar.h(valueOf, ffjmVar);
            }
            hlc.b(hfdVar, b2, iss.c);
            ffjnVar.a(dys.a, hfdVar, 6);
            hfdVar.n();
            a = dee.a(hvi.e, this.b, idb.a);
            d = ebs.d(a, 1.0f);
            ebv.a(ebs.e(d, this.c.a()), hfdVar);
        }
        return ffcu.a;
    }
}
