package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dbki implements ffjm {
    final /* synthetic */ dbku a;
    final /* synthetic */ hjz b;

    public dbki(dbku dbkuVar, hjz hjzVar) {
        this.a = dbkuVar;
        this.b = hjzVar;
    }

    @Override // defpackage.ffjm
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            dbku dbkuVar = this.a;
            final hjz hjzVar = this.b;
            final int i = 0;
            for (Object obj3 : dbkuVar.b) {
                int i2 = i + 1;
                if (i < 0) {
                    ffdx.l();
                }
                String str = (String) obj3;
                boolean z = hjzVar.c() == i;
                hfdVar.v(1436080935);
                boolean D = hfdVar.D(hjzVar) | hfdVar.B(i);
                Object f = hfdVar.f();
                if (D || f == hfc.a) {
                    f = new ffix() { // from class: dbkg
                        @Override // defpackage.ffix
                        public final Object invoke() {
                            hjzVar.i(i);
                            return ffcu.a;
                        }
                    };
                    hfdVar.y(f);
                }
                hfdVar.o();
                dwjg.a(z, (ffix) f, null, false, hpx.d(-224287663, new dbkh(str), hfdVar), 0L, 0L, hfdVar, 24576, 492);
                i = i2;
            }
        }
        return ffcu.a;
    }
}
