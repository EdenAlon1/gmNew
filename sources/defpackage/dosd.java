package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dosd implements ffjm {
    final /* synthetic */ dlsr a;

    public dosd(dlsr dlsrVar) {
        this.a = dlsrVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        jpo jpoVar;
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            dlsr dlsrVar = this.a;
            if (((Boolean) dooy.b(hfdVar).j.invoke()).booleanValue()) {
                hfdVar.v(-694096575);
                jpoVar = (jpo) hfdVar.e(grl.a);
                hfdVar.o();
            } else {
                hfdVar.v(-694042635);
                jpoVar = gft.d(hfdVar).j;
                hfdVar.o();
            }
            dwjt.b(dlsrVar.a, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, jpoVar, hfdVar, 0, 0, 65534);
        }
        return ffcu.a;
    }
}
