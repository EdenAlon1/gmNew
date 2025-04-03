package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zrj implements ffjn {
    public static final zrj a = new zrj();

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        ibw ibwVar;
        String str = (String) obj;
        hfd hfdVar = (hfd) obj2;
        ((Number) obj3).intValue();
        hfdVar.v(1136910848);
        if (ffkj.e(str, "error")) {
            hfdVar.v(-1426584062);
            long j = gft.a(hfdVar).w;
            hfdVar.o();
            ibwVar = new ibw(j);
        } else {
            hfdVar.v(-1274395481);
            ibwVar = str == null ? null : new ibw(dooy.a(hfdVar).c.a(str));
            hfdVar.o();
        }
        hfdVar.o();
        return ibwVar;
    }
}
