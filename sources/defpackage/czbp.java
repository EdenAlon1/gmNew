package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class czbp implements ffjm {
    final /* synthetic */ czbd a;
    final /* synthetic */ cvo b;
    final /* synthetic */ czbe c;
    final /* synthetic */ crw d;
    final /* synthetic */ float e;

    public czbp(czbd czbdVar, cvo cvoVar, czbe czbeVar, crw crwVar, float f) {
        this.a = czbdVar;
        this.b = cvoVar;
        this.c = czbeVar;
        this.d = crwVar;
        this.e = f;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else if (this.a.a) {
            hfdVar.v(969743865);
            cvo cvoVar = this.b;
            czbe czbeVar = this.c;
            cysv.e(cvoVar, czbeVar.b, this.d, this.e, hfdVar, 0);
            hfdVar.o();
        } else {
            hfdVar.v(969956401);
            czdo.a(this.c.a, hfdVar, 0);
            hfdVar.o();
        }
        return ffcu.a;
    }
}
