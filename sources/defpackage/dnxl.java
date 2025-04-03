package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dnxl implements ffjn {
    final /* synthetic */ dnwm a;

    public dnxl(dnwm dnwmVar) {
        this.a = dnwmVar;
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
            long er = ((jzn) hfdVar.e(jdr.e)).er(dynVar.d() * 0.6666f);
            hve hveVar = hvi.e;
            int i = huo.a;
            dwjt.b(String.valueOf(this.a.b), dlsj.c(dynVar.a(hveVar, hum.e)), gft.a(hfdVar).v, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, jpo.y(gft.d(hfdVar).f, 0L, er, null, null, null, null, 0L, null, 0, 0, er, null, null, 0, 16646141), hfdVar, 0, 0, 65528);
        }
        return ffcu.a;
    }
}
