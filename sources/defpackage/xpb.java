package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xpb implements ffjm {
    final /* synthetic */ hho a;
    final /* synthetic */ dpzx b;

    public xpb(hho hhoVar, dpzx dpzxVar) {
        this.a = hhoVar;
        this.b = dpzxVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            hfdVar.v(-1282603949);
            boolean D = hfdVar.D(this.a);
            final hho hhoVar = this.a;
            Object f = hfdVar.f();
            if (D || f == hfc.a) {
                f = new ffix() { // from class: xpa
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        hho.this.b(false);
                        return ffcu.a;
                    }
                };
                hfdVar.y(f);
            }
            ffix ffixVar = (ffix) f;
            hfdVar.o();
            hvi g = huz.g(hvi.e, new ecp());
            dpzx dpzxVar = this.b;
            if (dpzxVar instanceof dpzv) {
                hfdVar.v(-1105871797);
                ((dpzv) this.b).b.b(true);
                dqco.i(g, (dpzv) this.b, ffixVar, hfdVar, 64);
                hfdVar.o();
            } else {
                if (!(dpzxVar instanceof dpzw)) {
                    hfdVar.v(-1282600834);
                    hfdVar.o();
                    throw new ffcd();
                }
                hfdVar.v(-1282592753);
                dqbw.h(g, (dpzw) this.b, false, ffixVar, hfdVar, 64, 4);
                hfdVar.o();
            }
            acu.a(false, ffixVar, hfdVar, 0, 1);
        }
        return ffcu.a;
    }
}
