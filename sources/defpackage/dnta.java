package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dnta implements ffjn {
    final /* synthetic */ dnto a;
    final /* synthetic */ dntj b;

    public dnta(dnto dntoVar, dntj dntjVar) {
        this.a = dntoVar;
        this.b = dntjVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        eag eagVar = (eag) obj;
        hfd hfdVar = (hfd) obj2;
        int intValue = ((Number) obj3).intValue();
        eagVar.getClass();
        if ((intValue & 6) == 0) {
            intValue |= true != hfdVar.D(eagVar) ? 2 : 4;
        }
        if ((intValue & 19) == 18 && hfdVar.I()) {
            hfdVar.s();
        } else {
            List b = this.a.b();
            hve hveVar = hvi.e;
            int i = huo.a;
            dnte.d(b, eagVar.b(hveVar, hum.n), null, this.b, this.a.a(), hfdVar, 0, 4);
        }
        return ffcu.a;
    }
}
