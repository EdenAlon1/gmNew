package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aicz implements ffjm {
    final /* synthetic */ List a;

    public aicz(List list) {
        this.a = list;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            hvi j = eba.j(hvi.e, 0.0f, 16.0f, 0.0f, 16.0f, 5);
            dxn dxnVar = new dxn(8.0f, true, dxr.a);
            ebe g = eba.g(8.0f, 0.0f, 2);
            hfdVar.v(-820154844);
            boolean F = hfdVar.F(this.a);
            final List list = this.a;
            Object f = hfdVar.f();
            if (F || f == hfc.a) {
                f = new ffji() { // from class: aicw
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj3) {
                        edp edpVar = (edp) obj3;
                        edpVar.getClass();
                        List list2 = list;
                        edpVar.a(list2.size(), null, new aicx(list2), new hpw(-632812321, true, new aicy(list2)));
                        return ffcu.a;
                    }
                };
                hfdVar.y(f);
            }
            hfdVar.o();
            edh.b(j, null, g, dxnVar, null, null, false, null, (ffji) f, hfdVar, 24966, 490);
        }
        return ffcu.a;
    }
}
