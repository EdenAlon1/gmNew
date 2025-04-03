package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dqbi implements ffjn {
    final /* synthetic */ hkx a;
    final /* synthetic */ dpzx b;
    final /* synthetic */ fvn c;
    final /* synthetic */ ffix d;
    final /* synthetic */ dyn e;
    final /* synthetic */ hjx f;
    final /* synthetic */ dqbx g;

    public dqbi(hkx hkxVar, dqbx dqbxVar, dyn dynVar, dpzx dpzxVar, fvn fvnVar, ffix ffixVar, hjx hjxVar) {
        this.a = hkxVar;
        this.g = dqbxVar;
        this.e = dynVar;
        this.b = dpzxVar;
        this.c = fvnVar;
        this.d = ffixVar;
        this.f = hjxVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hfd hfdVar = (hfd) obj2;
        int intValue = ((Number) obj3).intValue();
        ((dys) obj).getClass();
        if ((intValue & 17) == 16 && hfdVar.I()) {
            hfdVar.s();
        } else {
            final jzn jznVar = (jzn) hfdVar.e(jdr.e);
            hvi b = ecs.b(ebs.u(hvi.e, 0.0f, dqbq.b(this.a), 1));
            hfdVar.v(1795864247);
            boolean D = hfdVar.D(jznVar) | hfdVar.D(this.a) | hfdVar.F(this.g) | hfdVar.D(this.e);
            final dqbx dqbxVar = this.g;
            final dyn dynVar = this.e;
            final hkx hkxVar = this.a;
            final hjx hjxVar = this.f;
            Object f = hfdVar.f();
            if (D || f == hfc.a) {
                ffji ffjiVar = new ffji() { // from class: dqbf
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj4) {
                        ioc iocVar = (ioc) obj4;
                        iocVar.getClass();
                        dqbx dqbxVar2 = dqbxVar;
                        float b2 = dqbq.b(hkxVar) - dqbxVar2.a;
                        float c = dynVar.c() - jzn.this.eg(Float.intBitsToFloat((int) (iod.a(iocVar) & 4294967295L)));
                        ebe ebeVar = dpyw.a;
                        hjxVar.i(ffmk.e(((c - dqbxVar2.a) + 36.0f) / b2, 0.0f, 1.0f));
                        return ffcu.a;
                    }
                };
                hfdVar.y(ffjiVar);
                f = ffjiVar;
            }
            hfdVar.o();
            hvi a = ipx.a(b, (ffji) f);
            dpzx dpzxVar = this.b;
            if (dpzxVar instanceof dpzv) {
                hfdVar.v(-161774883);
                gml d = this.c.a.d();
                hfdVar.v(1795903103);
                boolean F = hfdVar.F(this.b) | hfdVar.D(this.c);
                dpzx dpzxVar2 = this.b;
                fvn fvnVar = this.c;
                Object f2 = hfdVar.f();
                if (F || f2 == hfc.a) {
                    f2 = new dqbh(dpzxVar2, fvnVar, null);
                    hfdVar.y(f2);
                }
                hfdVar.o();
                hgs.g(d, (ffjm) f2, hfdVar);
                int i = acz.a;
                final acd a2 = acz.a(hfdVar);
                dpzv dpzvVar = (dpzv) this.b;
                hfdVar.v(1795915869);
                boolean F2 = hfdVar.F(this.b) | hfdVar.F(a2) | hfdVar.D(this.d);
                final dpzx dpzxVar3 = this.b;
                final ffix ffixVar = this.d;
                Object f3 = hfdVar.f();
                if (F2 || f3 == hfc.a) {
                    f3 = new ffix() { // from class: dqbg
                        @Override // defpackage.ffix
                        public final Object invoke() {
                            acd acdVar;
                            if (((Boolean) ((dpzv) dpzx.this).b.a()).booleanValue() || (acdVar = a2) == null) {
                                ffixVar.invoke();
                            } else {
                                acdVar.gE().d();
                            }
                            return ffcu.a;
                        }
                    };
                    hfdVar.y(f3);
                }
                hfdVar.o();
                dqco.i(a, dpzvVar, (ffix) f3, hfdVar, 64);
                hfdVar.o();
            } else {
                if (!(dpzxVar instanceof dpzw)) {
                    hfdVar.v(1795895279);
                    hfdVar.o();
                    throw new ffcd();
                }
                hfdVar.v(-160417548);
                dqbw.h(a, (dpzw) this.b, false, this.d, hfdVar, 448, 0);
                hfdVar.o();
            }
        }
        return ffcu.a;
    }
}
