package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xoh implements ffjm {
    final /* synthetic */ acd a;
    final /* synthetic */ hkx b;

    public xoh(acd acdVar, hkx hkxVar) {
        this.a = acdVar;
        this.b = hkxVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            dmzz dmzzVar = xok.a(this.b).b;
            hfdVar.v(-1639196304);
            boolean F = hfdVar.F(this.a);
            final acd acdVar = this.a;
            Object f = hfdVar.f();
            if (F || f == hfc.a) {
                f = new ffix() { // from class: xog
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        aca gE;
                        acd acdVar2 = acd.this;
                        if (acdVar2 != null && (gE = acdVar2.gE()) != null) {
                            gE.d();
                        }
                        return ffcu.a;
                    }
                };
                hfdVar.y(f);
            }
            hfdVar.o();
            xok.b(dmzzVar, (ffix) f, hfdVar, 0);
        }
        return ffcu.a;
    }
}
