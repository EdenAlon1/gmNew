package defpackage;

import java.util.Comparator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eju {
    private static final Comparator a = new Comparator() { // from class: ejt
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ffkj.a(((ejs) obj).a(), ((ejs) obj2).a());
        }
    };

    public static final List a(int i, int i2, List list, List list2) {
        if (list.isEmpty()) {
            return ffel.a;
        }
        List am = ffdx.am(list2);
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            ejs ejsVar = (ejs) list.get(i3);
            int a2 = ejsVar.a();
            if (i <= a2 && a2 <= i2) {
                am.add(ejsVar);
            }
        }
        ffdx.q(am, a);
        return am;
    }
}
