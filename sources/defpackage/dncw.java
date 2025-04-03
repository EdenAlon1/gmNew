package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dncw implements ipn {
    @Override // defpackage.ipn
    public final /* synthetic */ int a(iny inyVar, List list, int i) {
        return ipm.a(this, inyVar, list, i);
    }

    @Override // defpackage.ipn
    public final /* synthetic */ int b(iny inyVar, List list, int i) {
        return ipm.b(this, inyVar, list, i);
    }

    @Override // defpackage.ipn
    public final /* synthetic */ int c(iny inyVar, List list, int i) {
        return ipm.c(this, inyVar, list, i);
    }

    @Override // defpackage.ipn
    public final /* synthetic */ int d(iny inyVar, List list, int i) {
        return ipm.d(this, inyVar, list, i);
    }

    @Override // defpackage.ipn
    public final ipo e(ipq ipqVar, List list, long j) {
        ipo ei;
        ipqVar.getClass();
        final ArrayList arrayList = new ArrayList(ffdx.n(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((ipl) it.next()).e(j));
        }
        int i = 0;
        int i2 = ((iqk) arrayList.get(0)).a;
        Iterator it2 = arrayList.subList(1, arrayList.size()).iterator();
        while (it2.hasNext()) {
            i += ((iqk) it2.next()).a;
        }
        int i3 = i2 + ((int) (i * 0.62f));
        Iterator it3 = arrayList.iterator();
        if (!it3.hasNext()) {
            throw new NoSuchElementException();
        }
        int i4 = ((iqk) it3.next()).b;
        while (it3.hasNext()) {
            int i5 = ((iqk) it3.next()).b;
            if (i4 < i5) {
                i4 = i5;
            }
        }
        ei = ipqVar.ei(i3, i4, ffem.a, new ffji() { // from class: dncv
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                iqj iqjVar = (iqj) obj;
                iqjVar.getClass();
                Iterator it4 = arrayList.iterator();
                int i6 = 0;
                while (it4.hasNext()) {
                    iqj.m(iqjVar, (iqk) it4.next(), i6, 0);
                    i6 += (int) (r3.a * 0.62f);
                }
                return ffcu.a;
            }
        });
        return ei;
    }
}
