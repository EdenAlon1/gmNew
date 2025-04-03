package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dosb implements ffjn {
    final /* synthetic */ List a;
    final /* synthetic */ ffix b;

    public dosb(List list, ffix ffixVar) {
        this.a = list;
        this.b = ffixVar;
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
                hfdVar.v(1191371803);
                boolean D = hfdVar.D(dlsrVar) | hfdVar.D(this.b);
                final ffix ffixVar = this.b;
                Object f = hfdVar.f();
                if (D || f == hfc.a) {
                    f = new ffix() { // from class: dosa
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
                dose.i(dlsrVar, false, (ffix) f, hfdVar, 0);
            }
        }
        return ffcu.a;
    }
}
