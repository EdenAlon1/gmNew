package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class geh extends ffkk implements ffjm {
    final /* synthetic */ ffjm a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public geh(ffjm ffjmVar) {
        super(2);
        this.a = ffjmVar;
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
            int i = huo.a;
            ffjm ffjmVar = this.a;
            ipn a = dyc.a(hum.e, false);
            int a2 = hey.a(hfdVar);
            hgb c = hfdVar.c();
            hvi b2 = huz.b(hfdVar, l);
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
            hlc.b(hfdVar, c, iss.d);
            ffjm ffjmVar2 = iss.f;
            if (hfdVar.H() || !ffkj.e(hfdVar.f(), Integer.valueOf(a2))) {
                Integer valueOf = Integer.valueOf(a2);
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
