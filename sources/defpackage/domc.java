package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class domc implements ffjm {
    final /* synthetic */ dnwi a;
    final /* synthetic */ dyh b;
    final /* synthetic */ doml c;

    public domc(dnwi dnwiVar, dyh dyhVar, doml domlVar) {
        this.a = dnwiVar;
        this.b = dyhVar;
        this.c = domlVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            dnwi dnwiVar = this.a;
            dyh dyhVar = this.b;
            hvi h = ebs.h(hvi.e, 16.0f);
            int i = huo.a;
            hvi a = dyhVar.a(h, hum.i);
            if (dlsp.a(this.c.i.d, hfdVar)) {
                a = a.a(dlsj.c(hvi.e));
            }
            dnwg.i(dnwiVar, a, hfdVar, 0);
        }
        return ffcu.a;
    }
}
