package defpackage;

import j$.util.Optional;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class avox implements azak {
    final /* synthetic */ avpd a;
    private final ffbz b;

    public avox(final avpd avpdVar) {
        this.a = avpdVar;
        this.b = ffca.a(new ffix() { // from class: avow
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Iterable, java.lang.Object] */
            @Override // defpackage.ffix
            public final Object invoke() {
                ?? r0 = avpd.this.h.get();
                r0.getClass();
                ArrayList arrayList = new ArrayList();
                for (aoku aokuVar : r0) {
                    Optional e = aokuVar != null ? aokuVar.e() : null;
                    if (e != null) {
                        arrayList.add(e);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : arrayList) {
                    if (((Optional) obj).isPresent()) {
                        arrayList2.add(obj);
                    }
                }
                ArrayList arrayList3 = new ArrayList(ffdx.n(arrayList2, 10));
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    arrayList3.add((awui) ((Optional) it.next()).get());
                }
                return arrayList3;
            }
        });
    }

    private final List c() {
        return (List) this.b.a();
    }

    @Override // defpackage.azak
    public final void a(azan azanVar, Map map) {
        azanVar.getClass();
        map.getClass();
        if (azanVar != azan.RCS || map.isEmpty() || Collections.disjoint(map.keySet(), c())) {
            return;
        }
        this.a.i = true;
        avpd avpdVar = this.a;
        avpdVar.b.a(elfo.e(null), avpdVar.g);
    }

    @Override // defpackage.azak
    public final void b(azan azanVar, awui awuiVar) {
        if (azanVar == azan.RCS && awuiVar != null && c().contains(awuiVar)) {
            this.a.i = true;
            avpd avpdVar = this.a;
            avpdVar.b.a(elfo.e(null), avpdVar.g);
        }
    }
}
