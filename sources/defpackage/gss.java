package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gss implements ipn {
    public static final gss a = new gss();

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
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ipl iplVar = (ipl) list.get(i);
            if (ffkj.e(ioe.b(iplVar), "Spacer")) {
                iqk e = iplVar.e(jzk.m(j, 0, ipqVar.eo(1.0f), 0, 0, 12));
                ArrayList arrayList = new ArrayList(list.size());
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    Object obj = list.get(i2);
                    if (!ffkj.e(ioe.b((ipl) obj), "Spacer")) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                int size3 = arrayList.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    arrayList2.add(((ipl) arrayList.get(i3)).e(jzk.m(j, 0, jzk.b(j) >> 1, 0, 0, 12)));
                }
                ei = ipqVar.ei(jzk.b(j), jzk.a(j), ffem.a, new gsr(arrayList2, e));
                return ei;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
