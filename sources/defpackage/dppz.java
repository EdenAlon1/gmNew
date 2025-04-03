package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dppz implements ffjm {
    final /* synthetic */ int a;
    final /* synthetic */ float b;
    final /* synthetic */ int c;

    public dppz(int i, float f, int i2) {
        this.a = i;
        this.b = f;
        this.c = i2;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            geq.a(jie.a(this.a, hfdVar, 0), jii.a(this.c, hfdVar), hxz.a(hvi.e, this.b), ibw.d, hfdVar, 3072, 0);
        }
        return ffcu.a;
    }
}
