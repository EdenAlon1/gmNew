package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class czad implements ffjm {
    final /* synthetic */ boolean a;
    final /* synthetic */ String b;

    public czad(boolean z, String str) {
        this.a = z;
        this.b = str;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else if (this.a) {
            hfdVar.v(-1456259123);
            String str = this.b;
            if (str == null) {
                str = new String();
            }
            dwjt.b(str, null, ibw.d, 0L, null, null, 0L, null, 0L, 2, false, 1, 0, null, gft.d(hfdVar).g, hfdVar, 384, 3120, 55290);
            hfdVar.o();
        } else {
            hfdVar.v(-1456034063);
            String str2 = this.b;
            if (str2 == null) {
                str2 = new String();
            }
            dwjt.b(str2, null, ibw.d, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, gft.d(hfdVar).g, hfdVar, 384, 0, 65530);
            hfdVar.o();
        }
        return ffcu.a;
    }
}
