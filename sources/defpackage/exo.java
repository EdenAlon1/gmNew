package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class exo extends ffkk implements ffjn {
    final /* synthetic */ jpo a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public exo(jpo jpoVar) {
        super(3);
        this.a = jpoVar;
    }

    private static final Object b(hkx hkxVar) {
        return hkxVar.a();
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hfd hfdVar = (hfd) obj2;
        ((Number) obj3).intValue();
        hfdVar.v(1582736677);
        jzn jznVar = (jzn) hfdVar.e(jdr.e);
        jse jseVar = (jse) hfdVar.e(jdr.g);
        kah kahVar = (kah) hfdVar.e(jdr.j);
        boolean D = hfdVar.D(this.a) | hfdVar.D(kahVar);
        Object f = hfdVar.f();
        if (D || f == hfc.a) {
            f = jpp.b(this.a, kahVar);
            hfdVar.y(f);
        }
        jpo jpoVar = (jpo) f;
        boolean D2 = hfdVar.D(jseVar) | hfdVar.D(jpoVar);
        Object f2 = hfdVar.f();
        if (D2 || f2 == hfc.a) {
            jsf n = jpoVar.n();
            jsy q = jpoVar.q();
            if (q == null) {
                q = jsy.e;
            }
            jss o = jpoVar.o();
            int i = o != null ? o.a : 0;
            jst p = jpoVar.p();
            f2 = jseVar.a(n, q, i, p != null ? p.a : 65535);
            hfdVar.y(f2);
        }
        jpo jpoVar2 = this.a;
        hkx hkxVar = (hkx) f2;
        Object f3 = hfdVar.f();
        if (f3 == hfc.a) {
            f3 = new exl(kahVar, jznVar, jseVar, jpoVar2, b(hkxVar));
            hfdVar.y(f3);
        }
        exl exlVar = (exl) f3;
        Object b = b(hkxVar);
        if (kahVar != exlVar.a || !ffkj.e(jznVar, exlVar.b) || !ffkj.e(jseVar, exlVar.c) || !ffkj.e(jpoVar, exlVar.d) || !ffkj.e(b, exlVar.e)) {
            exlVar.a = kahVar;
            exlVar.b = jznVar;
            exlVar.c = jseVar;
            exlVar.d = jpoVar;
            exlVar.e = b;
            exlVar.f = exlVar.a();
        }
        hve hveVar = hvi.e;
        boolean F = hfdVar.F(exlVar);
        Object f4 = hfdVar.f();
        if (F || f4 == hfc.a) {
            f4 = new exn(exlVar);
            hfdVar.y(f4);
        }
        hvi a = iop.a(hveVar, (ffjn) f4);
        hfdVar.o();
        return a;
    }
}
