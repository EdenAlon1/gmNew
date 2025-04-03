package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dqbn implements ffjn {
    final /* synthetic */ ffix a;
    final /* synthetic */ hjx b;

    public dqbn(ffix ffixVar, hjx hjxVar) {
        this.a = ffixVar;
        this.b = hjxVar;
    }

    @Override // defpackage.ffjn
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hvi c;
        hvi a;
        hfd hfdVar = (hfd) obj2;
        int intValue = ((Number) obj3).intValue();
        ((ebe) obj).getClass();
        if ((intValue & 17) == 16 && hfdVar.I()) {
            hfdVar.s();
        } else {
            float a2 = dqbw.a(this.b.c());
            if (a2 > 0.0f) {
                c = ebs.c(hvi.e, 1.0f);
                a = dee.a(hxe.a(c, a2), gft.a(hfdVar).J, idb.a);
                ebv.a(a, hfdVar);
                hfdVar.v(1795971012);
                boolean D = hfdVar.D(this.a);
                final ffix ffixVar = this.a;
                Object f = hfdVar.f();
                if (D || f == hfc.a) {
                    f = new ffix() { // from class: dqbm
                        @Override // defpackage.ffix
                        public final Object invoke() {
                            ffix.this.invoke();
                            return ffcu.a;
                        }
                    };
                    hfdVar.y(f);
                }
                hfdVar.o();
                acu.a(false, (ffix) f, hfdVar, 0, 1);
            }
        }
        return ffcu.a;
    }
}
