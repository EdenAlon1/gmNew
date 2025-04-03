package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dqbl implements ffjm {
    final /* synthetic */ dpzx a;
    final /* synthetic */ ffix b;
    final /* synthetic */ hho c;
    final /* synthetic */ hjx d;

    public dqbl(dpzx dpzxVar, ffix ffixVar, hjx hjxVar, hho hhoVar) {
        this.a = dpzxVar;
        this.b = ffixVar;
        this.d = hjxVar;
        this.c = hhoVar;
    }

    @Override // defpackage.ffjm
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            float a = dqbw.a(this.d.c());
            if (a > 0.0f) {
                dpzx dpzxVar = this.a;
                ffix ffixVar = this.b;
                ffxx a2 = dpzxVar.a();
                hfdVar.v(1795847653);
                final hho hhoVar = this.c;
                Object f = hfdVar.f();
                if (f == hfc.a) {
                    f = new ffji() { // from class: dqbk
                        @Override // defpackage.ffji
                        public final Object invoke(Object obj3) {
                            dqbq.c(hho.this, ((jzq) obj3).a);
                            return ffcu.a;
                        }
                    };
                    hfdVar.y(f);
                }
                hfdVar.o();
                dqbw.i(a2, a, ffixVar, (ffji) f, hfdVar, 3072);
            } else {
                dqbq.c(this.c, 64.0f);
            }
        }
        return ffcu.a;
    }
}
