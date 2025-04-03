package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cywm implements ffjm {
    final /* synthetic */ boolean a;
    final /* synthetic */ cyxb b;
    final /* synthetic */ hho c;
    final /* synthetic */ hho d;
    final /* synthetic */ int e;

    public cywm(boolean z, int i, cyxb cyxbVar, hho hhoVar, hho hhoVar2) {
        this.a = z;
        this.e = i;
        this.b = cyxbVar;
        this.c = hhoVar;
        this.d = hhoVar2;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            boolean z = this.a;
            cyh cyhVar = cyvr.a;
            cru.b(z, null, ctt.c(cxu.c(350, 0, cyvr.c, 2), 0.0f, cywo.c(this.e, hfdVar)), ctt.f(cxu.c(150, 0, cyvr.a, 2), 0.25f, cywo.c(this.e, hfdVar)), null, hpx.d(-368526049, new cywl(this.b, this.c, this.d), hfdVar), hfdVar, 196608, 18);
        }
        return ffcu.a;
    }
}
