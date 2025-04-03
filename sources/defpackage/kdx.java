package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kdx implements ipn {
    public static final kdx a = new kdx();

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
        ipo ei2;
        ipo ei3;
        int size = list.size();
        if (size == 0) {
            ei = ipqVar.ei(0, 0, ffem.a, kdu.a);
            return ei;
        }
        if (size == 1) {
            iqk e = ((ipl) list.get(0)).e(j);
            ei2 = ipqVar.ei(e.a, e.b, ffem.a, new kdv(e));
            return ei2;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size2 = list.size();
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < size2; i3++) {
            iqk e2 = ((ipl) list.get(i3)).e(j);
            i = Math.max(i, e2.a);
            i2 = Math.max(i2, e2.b);
            arrayList.add(e2);
        }
        ei3 = ipqVar.ei(i, i2, ffem.a, new kdw(arrayList));
        return ei3;
    }
}
