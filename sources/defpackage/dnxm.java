package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dnxm implements ffjn {
    final /* synthetic */ dnwo a;

    public dnxm(dnwo dnwoVar) {
        this.a = dnwoVar;
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
            dwjt.b("+" + Math.min(this.a.a, 99), dlsj.c(dynVar.a(hveVar, hum.e)), gft.a(hfdVar).s, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, jpo.y(gft.d(hfdVar).l, 0L, er, null, null, null, null, 0L, null, 0, 0, er, null, null, 0, 16646141), hfdVar, 0, 0, 65528);
        }
        return ffcu.a;
    }
}
