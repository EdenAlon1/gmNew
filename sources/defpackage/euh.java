package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class euh extends ffkk implements ffjn {
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    final /* synthetic */ jpo c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public euh(int i, int i2, jpo jpoVar) {
        super(3);
        this.a = i;
        this.b = i2;
        this.c = jpoVar;
    }

    private static final Object b(hkx hkxVar) {
        return hkxVar.a();
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hfd hfdVar = (hfd) obj2;
        ((Number) obj3).intValue();
        hfdVar.v(408240218);
        eui.a(this.a, this.b);
        if (this.a == 1 && this.b == Integer.MAX_VALUE) {
            hve hveVar = hvi.e;
            hfdVar.o();
            return hveVar;
        }
        jzn jznVar = (jzn) hfdVar.e(jdr.e);
        jse jseVar = (jse) hfdVar.e(jdr.g);
        kah kahVar = (kah) hfdVar.e(jdr.j);
        boolean D = hfdVar.D(this.c) | hfdVar.D(kahVar);
        jpo jpoVar = this.c;
        Object f = hfdVar.f();
        if (D || f == hfc.a) {
            f = jpp.b(jpoVar, kahVar);
            hfdVar.y(f);
        }
        jpo jpoVar2 = (jpo) f;
        boolean D2 = hfdVar.D(jseVar) | hfdVar.D(jpoVar2);
        Object f2 = hfdVar.f();
        if (D2 || f2 == hfc.a) {
            jsf n = jpoVar2.n();
            jsy q = jpoVar2.q();
            if (q == null) {
                q = jsy.e;
            }
            jss o = jpoVar2.o();
            int i = o != null ? o.a : 0;
            jst p = jpoVar2.p();
            f2 = jseVar.a(n, q, i, p != null ? p.a : 65535);
            hfdVar.y(f2);
        }
        hkx hkxVar = (hkx) f2;
        boolean D3 = hfdVar.D(b(hkxVar)) | hfdVar.D(jznVar) | hfdVar.D(jseVar) | hfdVar.D(this.c) | hfdVar.D(kahVar);
        Object f3 = hfdVar.f();
        if (D3 || f3 == hfc.a) {
            f3 = Integer.valueOf((int) (ewf.a(jpoVar2, jznVar, jseVar, ewf.a, 1) & 4294967295L));
            hfdVar.y(f3);
        }
        int intValue = ((Number) f3).intValue();
        boolean D4 = hfdVar.D(kahVar) | hfdVar.D(jznVar) | hfdVar.D(jseVar) | hfdVar.D(this.c) | hfdVar.D(b(hkxVar));
        Object f4 = hfdVar.f();
        if (D4 || f4 == hfc.a) {
            f4 = Integer.valueOf((int) (ewf.a(jpoVar2, jznVar, jseVar, ewf.a + '\n' + ewf.a, 2) & 4294967295L));
            hfdVar.y(f4);
        }
        int intValue2 = ((Number) f4).intValue() - intValue;
        Integer valueOf = this.a == 1 ? null : Integer.valueOf((-intValue2) + intValue);
        int i2 = this.b;
        Integer valueOf2 = i2 != Integer.MAX_VALUE ? Integer.valueOf(intValue + (intValue2 * (i2 - 1))) : null;
        hvi f5 = ebs.f(hvi.e, valueOf != null ? jznVar.ek(valueOf.intValue()) : Float.NaN, valueOf2 != null ? jznVar.ek(valueOf2.intValue()) : Float.NaN);
        hfdVar.o();
        return f5;
    }
}
