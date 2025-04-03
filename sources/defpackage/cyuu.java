package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cyuu implements ffjn {
    final /* synthetic */ cyup a;
    final /* synthetic */ ffix b;

    public cyuu(cyup cyupVar, ffix ffixVar) {
        this.a = cyupVar;
        this.b = ffixVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hfd hfdVar = (hfd) obj2;
        int intValue = ((Number) obj3).intValue();
        ((dys) obj).getClass();
        if ((intValue & 17) == 16 && hfdVar.I()) {
            hfdVar.s();
        } else {
            int i = huo.a;
            hus husVar = hum.n;
            dxn dxnVar = new dxn(24.0f, true, dxr.a);
            hvi e = ebs.e(eba.i(hvi.e, 20.0f, 0.0f, 2), 56.0f);
            cyup cyupVar = this.a;
            ffix ffixVar = this.b;
            ipn a = ebm.a(dxnVar, husVar, hfdVar, 54);
            int a2 = hey.a(hfdVar);
            hgb c = hfdVar.c();
            hvi b = huz.b(hfdVar, e);
            int i2 = ist.a;
            ffix ffixVar2 = iss.a;
            hfdVar.M();
            hfdVar.x();
            if (hfdVar.H()) {
                hfdVar.j(ffixVar2);
            } else {
                hfdVar.z();
            }
            hlc.b(hfdVar, a, iss.e);
            hlc.b(hfdVar, c, iss.d);
            ffjm ffjmVar = iss.f;
            if (hfdVar.H() || !ffkj.e(hfdVar.f(), Integer.valueOf(a2))) {
                Integer valueOf = Integer.valueOf(a2);
                hfdVar.y(valueOf);
                hfdVar.h(valueOf, ffjmVar);
            }
            hlc.b(hfdVar, b, iss.c);
            hfdVar.v(1135566145);
            enqv it = cyupVar.a.iterator();
            it.getClass();
            while (it.hasNext()) {
                dlsr dlsrVar = (dlsr) it.next();
                dlsrVar.getClass();
                cyuv.a(dlsrVar, ffixVar, cyupVar.b, hfdVar, 0);
            }
            hfdVar.o();
            hfdVar.n();
        }
        return ffcu.a;
    }
}
