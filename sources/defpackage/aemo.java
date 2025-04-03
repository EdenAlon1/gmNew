package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aemo implements ffjm {
    final /* synthetic */ hkx a;
    final /* synthetic */ aemw b;

    public aemo(hkx hkxVar, aemw aemwVar) {
        this.a = hkxVar;
        this.b = aemwVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            cyxb b = aemq.b(this.a);
            cyxc cyxcVar = b != null ? b.c : null;
            hfdVar.v(14747580);
            boolean D = hfdVar.D(this.a) | hfdVar.F(this.b);
            aemw aemwVar = this.b;
            hkx hkxVar = this.a;
            Object f = hfdVar.f();
            if (D || f == hfc.a) {
                f = new aemn(aemwVar, hkxVar, null);
                hfdVar.y(f);
            }
            hfdVar.o();
            hgs.g(cyxcVar, (ffjm) f, hfdVar);
            cywo.a(aemq.b(this.a), hfdVar, 0);
        }
        return ffcu.a;
    }
}
