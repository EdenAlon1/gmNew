package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmgx implements ffjn {
    final /* synthetic */ int a;
    final /* synthetic */ long b;

    public dmgx(int i, long j) {
        this.a = i;
        this.b = j;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        dyn dynVar = (dyn) obj;
        hfd hfdVar = (hfd) obj2;
        int intValue = ((Number) obj3).intValue();
        dynVar.getClass();
        if ((intValue & 6) == 0) {
            intValue |= true != hfdVar.D(dynVar) ? 2 : 4;
        }
        if ((intValue & 19) == 18 && hfdVar.I()) {
            hfdVar.s();
        } else {
            long er = ((jzn) hfdVar.e(jdr.e)).er(dynVar.d() * 0.4666f);
            hve hveVar = hvi.e;
            int i = huo.a;
            dwjt.b(String.valueOf(Math.min(this.a, 99)), dlsj.c(dynVar.a(hveVar, hum.e)), this.b, 0L, null, null, 0L, new jyj(3), 0L, 0, false, 0, 0, null, jpo.y(gft.d(hfdVar).o, 0L, er, null, null, null, null, 0L, null, 0, 0, er, null, null, 0, 16646141), hfdVar, 0, 0, 65016);
        }
        return ffcu.a;
    }
}
