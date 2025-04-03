package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmvv implements ffjn {
    final /* synthetic */ dmvi a;

    public dmvv(dmvi dmviVar) {
        this.a = dmviVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        dys dysVar = (dys) obj;
        hfd hfdVar = (hfd) obj2;
        int intValue = ((Number) obj3).intValue();
        dysVar.getClass();
        if ((intValue & 6) == 0) {
            intValue |= true != hfdVar.D(dysVar) ? 2 : 4;
        }
        if ((intValue & 19) == 18 && hfdVar.I()) {
            hfdVar.s();
        } else {
            dmuy.e(this.a.a, false, hfdVar, 0, 2);
            dmvi dmviVar = this.a;
            hfdVar.v(-2004387718);
            String str = dmviVar.c;
            if (str != null) {
                dmuy.h(str, this.a.d, eba.j(hvi.e, 24.0f, 16.0f, 24.0f, 0.0f, 8), hfdVar, 0, 8);
            }
            hfdVar.o();
            hfdVar.v(-2004378648);
            if (!this.a.b.isEmpty()) {
                dmuy.f(dys.b(hvi.e, 1.0f, false), this.a.b, hfdVar, 0);
            }
            hfdVar.o();
            dmvi dmviVar2 = this.a;
            dmuy.b(dmviVar2.e, dmviVar2.f, hfdVar, 0);
        }
        return ffcu.a;
    }
}
