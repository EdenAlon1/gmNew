package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class emfu implements ffjn {
    final /* synthetic */ emge a;
    final /* synthetic */ hkx b;
    final /* synthetic */ hkx c;

    public emfu(emge emgeVar, hkx hkxVar, hkx hkxVar2) {
        this.a = emgeVar;
        this.b = hkxVar;
        this.c = hkxVar2;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        dyh dyhVar = (dyh) obj;
        hfd hfdVar = (hfd) obj2;
        int intValue = ((Number) obj3).intValue();
        dyhVar.getClass();
        if ((intValue & 6) == 0) {
            intValue |= true != hfdVar.D(dyhVar) ? 2 : 4;
        }
        if ((intValue & 19) == 18 && hfdVar.I()) {
            hfdVar.s();
        } else {
            emfj.a(this.a, hfdVar, 0);
            emfc.c(this.a, hfdVar, 0);
            emfy.a(hfdVar, 0);
            hfdVar.v(1410898066);
            if (this.b.a() == emfz.a) {
                emfy.g(emeh.a, hfdVar, 6);
            }
            hfdVar.o();
            hfdVar.v(1410901440);
            if (this.c.a() != null) {
                emge emgeVar = this.a;
                hkx hkxVar = this.c;
                ffix ffixVar = emgeVar.v;
                Object a = hkxVar.a();
                a.getClass();
                emfy.d(ffixVar, (emgv) a, hfdVar, 0);
            }
            hfdVar.o();
            int i = (intValue & 14) | 48;
            emfy.f(dyhVar, hpx.d(-695132004, new emft(this.b, this.a), hfdVar), hfdVar, i);
            emfy.e(dyhVar, emeh.b, hfdVar, i);
        }
        return ffcu.a;
    }
}
