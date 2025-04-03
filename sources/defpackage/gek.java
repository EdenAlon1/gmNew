package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gek extends ffkk implements ffjm {
    final /* synthetic */ idh a;
    final /* synthetic */ ffjm b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gek(idh idhVar, ffjm ffjmVar) {
        super(2);
        this.a = idhVar;
        this.b = ffjmVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        long b;
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            hve hveVar = hvi.e;
            b = jzr.b((gdy.a(0) ? 8.0f : gdy.a(1) ? 16.0f : gdy.a(2) ? 28.0f : 0.0f) + 24.0f, 40.0f);
            hvi l = ebs.l(hveVar, b);
            idh idhVar = this.a;
            hvi a = l.a(idhVar instanceof eqd ? iop.a(hvi.e, new gdw((eqd) idhVar)) : hvi.e);
            int i = huo.a;
            ffjm ffjmVar = this.b;
            ipn a2 = dyc.a(hum.e, false);
            int a3 = hey.a(hfdVar);
            hgb c = hfdVar.c();
            hvi b2 = huz.b(hfdVar, a);
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
            ffjm ffjmVar2 = iss.f;
            if (hfdVar.H() || !ffkj.e(hfdVar.f(), Integer.valueOf(a3))) {
                Integer valueOf = Integer.valueOf(a3);
                hfdVar.y(valueOf);
                hfdVar.h(valueOf, ffjmVar2);
            }
            hlc.b(hfdVar, b2, iss.c);
            ffjmVar.a(hfdVar, 0);
            hfdVar.n();
        }
        return ffcu.a;
    }
}
