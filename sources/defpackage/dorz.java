package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dorz implements ffjn {
    final /* synthetic */ List a;
    final /* synthetic */ boolean b;
    final /* synthetic */ ffix c;

    public dorz(List list, boolean z, ffix ffixVar) {
        this.a = list;
        this.b = z;
        this.c = ffixVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hfd hfdVar = (hfd) obj2;
        int intValue = ((Number) obj3).intValue();
        ((dys) obj).getClass();
        if ((intValue & 17) == 16 && hfdVar.I()) {
            hfdVar.s();
        } else {
            for (final dlsr dlsrVar : this.a) {
                boolean z = this.b;
                hfdVar.v(-1347259635);
                boolean D = hfdVar.D(dlsrVar) | hfdVar.D(this.c);
                final ffix ffixVar = this.c;
                Object f = hfdVar.f();
                if (D || f == hfc.a) {
                    f = new ffix() { // from class: dory
                        @Override // defpackage.ffix
                        public final Object invoke() {
                            dlsr.this.k.invoke();
                            ffixVar.invoke();
                            return ffcu.a;
                        }
                    };
                    hfdVar.y(f);
                }
                hfdVar.o();
                dose.i(dlsrVar, z, (ffix) f, hfdVar, 0);
            }
        }
        return ffcu.a;
    }
}
