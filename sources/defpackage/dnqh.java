package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dnqh implements ffjn {
    final /* synthetic */ cxj a;
    final /* synthetic */ dnsh b;

    public dnqh(cxj cxjVar, dnsh dnshVar) {
        this.a = cxjVar;
        this.b = dnshVar;
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
            String str = ((Number) this.a.d()).floatValue() == 0.0f ? "" : (String) this.b.e.invoke();
            hve hveVar = hvi.e;
            int i = huo.a;
            dwjt.b(str, eagVar.b(hveVar, hum.n), gft.a(hfdVar).o, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, gft.d(hfdVar).l, hfdVar, 0, 0, 65528);
            hfdVar.v(579942741);
            for (dmzz dmzzVar : this.b.b) {
                dwho.a(dnaa.a(dmzzVar, hfdVar), dmzzVar.name(), ebs.k(eagVar.b(hvi.e, hum.n), 12.0f), gft.a(hfdVar).o, hfdVar, 0, 0);
            }
            hfdVar.o();
            Iterator it = this.b.c.iterator();
            while (it.hasNext()) {
                dwjt.b((String) it.next(), null, gft.a(hfdVar).o, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, gft.d(hfdVar).l, hfdVar, 0, 0, 65530);
            }
        }
        return ffcu.a;
    }
}
