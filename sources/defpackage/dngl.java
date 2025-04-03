package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dngl implements ffjm {
    final /* synthetic */ dngv a;

    public dngl(dngv dngvVar) {
        this.a = dngvVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            boolean z = this.a.d;
            String q = dngm.q(z, hfdVar);
            hfdVar.v(-1758659902);
            boolean D = hfdVar.D(this.a);
            final dngv dngvVar = this.a;
            Object f = hfdVar.f();
            if (D || f == hfc.a) {
                f = new ffji() { // from class: dngk
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj3) {
                        ((Boolean) obj3).booleanValue();
                        dngv.this.f.invoke();
                        return ffcu.a;
                    }
                };
                hfdVar.y(f);
            }
            hfdVar.o();
            dmkb.b(new dmke(q, z, (ffji) f, false), null, hfdVar, 0, 2);
        }
        return ffcu.a;
    }
}
