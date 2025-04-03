package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fof implements ipn {
    public static final fof a = new fof();

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
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        boolean z = false;
        int i = Integer.MIN_VALUE;
        int i2 = 0;
        int i3 = Integer.MIN_VALUE;
        int i4 = Integer.MIN_VALUE;
        for (int i5 = 0; i5 < size; i5++) {
            iqk e = ((ipl) list.get(i5)).e(j);
            arrayList.add(e);
            if (e.eh(imt.a) != Integer.MIN_VALUE && (i3 == Integer.MIN_VALUE || e.eh(imt.a) < i3)) {
                i3 = e.eh(imt.a);
            }
            if (e.eh(imt.b) != Integer.MIN_VALUE && (i4 == Integer.MIN_VALUE || e.eh(imt.b) > i4)) {
                i4 = e.eh(imt.b);
            }
            i2 = Math.max(i2, e.b);
        }
        if (i3 != Integer.MIN_VALUE) {
            if (i4 != Integer.MIN_VALUE) {
                z = true;
            } else {
                i4 = Integer.MIN_VALUE;
            }
            i = i3;
        }
        int max = Math.max(ipqVar.eo((i == i4 || !z) ? 48.0f : 68.0f), i2);
        ei = ipqVar.ei(jzk.b(j), max, ffem.a, new foe(arrayList, max));
        return ei;
    }
}
