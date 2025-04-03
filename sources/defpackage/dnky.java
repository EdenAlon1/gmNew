package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dnky implements ffjm {
    final /* synthetic */ dnlc a;

    public dnky(dnlc dnlcVar) {
        this.a = dnlcVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            dnlc dnlcVar = this.a;
            hfdVar.v(1906703382);
            boolean D = hfdVar.D(this.a);
            final dnlc dnlcVar2 = this.a;
            Object f = hfdVar.f();
            if (D || f == hfc.a) {
                f = new ffji() { // from class: dnkx
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj3) {
                        ((Boolean) obj3).booleanValue();
                        dnlc.this.e.invoke();
                        return ffcu.a;
                    }
                };
                hfdVar.y(f);
            }
            hfdVar.o();
            dwjd.a(dnlcVar.d, (ffji) f, null, null, null, hfdVar, 0, 108);
        }
        return ffcu.a;
    }
}
