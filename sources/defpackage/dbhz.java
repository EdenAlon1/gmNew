package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dbhz implements ffjn {
    final /* synthetic */ List a;
    final /* synthetic */ ffji b;
    final /* synthetic */ hho c;

    public dbhz(List list, ffji ffjiVar, hho hhoVar) {
        this.a = list;
        this.b = ffjiVar;
        this.c = hhoVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hfd hfdVar = (hfd) obj2;
        int intValue = ((Number) obj3).intValue();
        ((dys) obj).getClass();
        if ((intValue & 17) == 16 && hfdVar.I()) {
            hfdVar.s();
        } else {
            List<eixn> list = this.a;
            final ffji ffjiVar = this.b;
            final hho hhoVar = this.c;
            for (final eixn eixnVar : list) {
                hfdVar.v(-167105214);
                boolean D = hfdVar.D(ffjiVar) | hfdVar.F(eixnVar);
                Object f = hfdVar.f();
                if (D || f == hfc.a) {
                    f = new ffix() { // from class: dbhx
                        @Override // defpackage.ffix
                        public final Object invoke() {
                            ffji.this.invoke(eixnVar);
                            dbip.f(hhoVar, false);
                            return ffcu.a;
                        }
                    };
                    hfdVar.y(f);
                }
                hfdVar.o();
                fil.b((ffix) f, null, false, null, hpx.d(-1880401122, new dbhy(eixnVar), hfdVar), hfdVar, 196608);
            }
        }
        return ffcu.a;
    }
}
