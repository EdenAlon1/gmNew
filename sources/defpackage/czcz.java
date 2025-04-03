package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class czcz implements ffjn {
    final /* synthetic */ czcw a;

    public czcz(czcw czcwVar) {
        this.a = czcwVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hvi d;
        hfd hfdVar = (hfd) obj2;
        int intValue = ((Number) obj3).intValue();
        ((dys) obj).getClass();
        if ((intValue & 17) == 16 && hfdVar.I()) {
            hfdVar.s();
        } else {
            czcw czcwVar = this.a;
            hve hveVar = hvi.e;
            dxq dxqVar = dxu.c;
            int i = huo.a;
            ipn a = dyo.a(dxqVar, hum.j, hfdVar, 0);
            int a2 = hey.a(hfdVar);
            hgb c = hfdVar.c();
            hvi b = huz.b(hfdVar, hveVar);
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
            ffjm ffjmVar = iss.f;
            if (hfdVar.H() || !ffkj.e(hfdVar.f(), Integer.valueOf(a2))) {
                Integer valueOf = Integer.valueOf(a2);
                hfdVar.y(valueOf);
                hfdVar.h(valueOf, ffjmVar);
            }
            hlc.b(hfdVar, b, iss.c);
            hfdVar.v(754665817);
            enqv it = czcwVar.a.iterator();
            it.getClass();
            while (it.hasNext()) {
                czbs czbsVar = (czbs) it.next();
                dnds.a(czbsVar.a, null, hfdVar, 0, 2);
                dmjg dmjgVar = czbsVar.b;
                hfdVar.v(754669405);
                if (dmjgVar != null) {
                    d = ebs.d(hvi.e, 1.0f);
                    dmjf.a(dmjgVar, jfw.a(ebs.e(eba.f(d, 16.0f, 14.0f, 24.0f, 14.0f), 110.0f), "actionItemThumbnail"), hfdVar, 0);
                }
                hfdVar.o();
            }
            hfdVar.o();
            hfdVar.n();
        }
        return ffcu.a;
    }
}
