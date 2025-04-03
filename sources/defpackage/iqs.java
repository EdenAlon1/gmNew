package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iqs extends iuf {
    public static final iqs a = new iqs();

    private iqs() {
        super("Undefined intrinsics block and it is required");
    }

    @Override // defpackage.ipn
    public final ipo e(ipq ipqVar, List list, long j) {
        ipo ei;
        ipo ei2;
        ipo ei3;
        int size = list.size();
        if (size == 0) {
            ei = ipqVar.ei(jzk.d(j), jzk.c(j), ffem.a, iqp.a);
            return ei;
        }
        if (size == 1) {
            iqk e = ((ipl) list.get(0)).e(j);
            ei2 = ipqVar.ei(jzl.c(j, e.a), jzl.b(j, e.b), ffem.a, new iqq(e));
            return ei2;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size2 = list.size();
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < size2; i3++) {
            iqk e2 = ((ipl) list.get(i3)).e(j);
            i = Math.max(e2.a, i);
            i2 = Math.max(e2.b, i2);
            arrayList.add(e2);
        }
        ei3 = ipqVar.ei(jzl.c(j, i), jzl.b(j, i2), ffem.a, new iqr(arrayList));
        return ei3;
    }
}
