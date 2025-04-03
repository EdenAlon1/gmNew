package defpackage;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dsri implements ffjm {
    final /* synthetic */ dsqr a;
    final /* synthetic */ dspo b;

    public dsri(dsqr dsqrVar, dspo dspoVar) {
        this.a = dsqrVar;
        this.b = dspoVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            hfdVar.v(-672922441);
            boolean F = hfdVar.F(this.a) | hfdVar.D(this.b);
            final dsqr dsqrVar = this.a;
            final dspo dspoVar = this.b;
            Object f = hfdVar.f();
            if (F || f == hfc.a) {
                f = new ffjm() { // from class: dsrh
                    @Override // defpackage.ffjm
                    public final Object a(Object obj3, Object obj4) {
                        ipo ei;
                        irg irgVar = (irg) obj3;
                        final jzk jzkVar = (jzk) obj4;
                        irgVar.getClass();
                        dsqr dsqrVar2 = dsqr.this;
                        List list = dsqrVar2.a;
                        final LinkedHashMap linkedHashMap = new LinkedHashMap(ffmk.f(ffew.a(ffdx.n(list, 10)), 16));
                        for (Object obj5 : list) {
                            dspo dspoVar2 = dspoVar;
                            linkedHashMap.put(obj5, ((dsqq) obj5).e(irgVar, dspoVar2, jzkVar.a, dsqrVar2));
                        }
                        long j = jzkVar.a;
                        ei = irgVar.ei(jzk.b(j), jzk.a(j), ffem.a, new ffji() { // from class: dsrg
                            @Override // defpackage.ffji
                            public final Object invoke(Object obj6) {
                                iqj iqjVar = (iqj) obj6;
                                iqjVar.getClass();
                                for (Map.Entry entry : linkedHashMap.entrySet()) {
                                    dsqq dsqqVar = (dsqq) entry.getKey();
                                    List list2 = (List) entry.getValue();
                                    int size = list2.size();
                                    for (int i = 0; i < size; i++) {
                                        jzk jzkVar2 = jzkVar;
                                        dsqqVar.f(iqjVar, jzkVar2.a, (iqk) list2.get(i));
                                    }
                                }
                                return ffcu.a;
                            }
                        });
                        return ei;
                    }
                };
                hfdVar.y(f);
            }
            hfdVar.o();
            ira.a(null, (ffjm) f, hfdVar, 0, 1);
        }
        return ffcu.a;
    }
}
