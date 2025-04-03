package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dnyj implements ffjm {
    final /* synthetic */ dnym a;
    final /* synthetic */ int b;
    final /* synthetic */ boolean c;

    public dnyj(dnym dnymVar, int i, boolean z) {
        this.a = dnymVar;
        this.b = i;
        this.c = z;
    }

    @Override // defpackage.ffjm
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            int size = ((dnyn) this.a).a.size();
            for (int i = 0; i < size; i++) {
                int i2 = this.b;
                int i3 = i2 - 1;
                if (i > i3) {
                    break;
                }
                if (i != i3 || ((dnyn) this.a).a.size() <= i2) {
                    hfdVar.v(369272422);
                    dnyk.c(this.c, hpx.d(-1033169775, new dnyi(this.a, i), hfdVar), hfdVar, 48);
                    hfdVar.o();
                } else {
                    hfdVar.v(369007713);
                    dnyk.c(this.c, hpx.d(-1466777080, new dnyh(this.a, i), hfdVar), hfdVar, 48);
                    hfdVar.o();
                }
            }
        }
        return ffcu.a;
    }
}
