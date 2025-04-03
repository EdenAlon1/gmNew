package defpackage;

import androidx.car.app.model.Alert;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class doci implements ipn {
    public static final doci a = new doci();

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
        Object obj;
        ipo ei;
        ipqVar.getClass();
        int size = list.size();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i2);
            if (ffkj.e(ioe.b((ipl) obj), "horizontal_card_media")) {
                break;
            }
            i2++;
        }
        ipl iplVar = (ipl) obj;
        int size2 = list.size();
        for (int i3 = 0; i3 < size2; i3++) {
            ipl iplVar2 = (ipl) list.get(i3);
            if (ffkj.e(ioe.b(iplVar2), "horizontal_text_content")) {
                int d = iplVar != null ? iplVar.d(Alert.DURATION_SHOW_INDEFINITELY) : 0;
                int f = ffmk.f(jzk.b(j) - d, 0);
                int min = Math.min(iplVar2.c(f), jzk.a(j));
                final ArrayList arrayList = new ArrayList(ffdx.n(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ipl iplVar3 = (ipl) it.next();
                    Object b = ioe.b(iplVar3);
                    Integer valueOf = ffkj.e(b, "horizontal_text_content") ? Integer.valueOf(f) : ffkj.e(b, "horizontal_card_media") ? Integer.valueOf(d) : null;
                    arrayList.add(iplVar3.e(jzk.m(j, valueOf != null ? valueOf.intValue() : jzk.d(j), valueOf != null ? valueOf.intValue() : jzk.b(j), 0, min, 4)));
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    i += ((iqk) it2.next()).a;
                }
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
                ei = ipqVar.ei(i, i4, ffem.a, new ffji() { // from class: docb
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj2) {
                        iqj iqjVar = (iqj) obj2;
                        iqjVar.getClass();
                        int i6 = 0;
                        for (iqk iqkVar : arrayList) {
                            iqj.m(iqjVar, iqkVar, i6, 0);
                            i6 += iqkVar.a;
                        }
                        return ffcu.a;
                    }
                });
                return ei;
            }
        }
        kau.a("Collection contains no element matching the predicate.");
        throw new ffbx();
    }
}
