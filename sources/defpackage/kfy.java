package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kfy {
    public static final void a(kgt kgtVar, List list) {
        ArrayList arrayList;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ipl iplVar = (ipl) list.get(i);
            Object b = ioe.b(iplVar);
            if (b == null && (b = kgd.a(iplVar)) == null) {
                b = new kfw();
            }
            khs b2 = kgtVar.b(b.toString());
            if (b2 != null) {
                b2.af = iplVar;
                kiu kiuVar = b2.ag;
                if (kiuVar != null) {
                    kiuVar.aq = b2.af;
                }
            }
            Object f = iplVar.f();
            kge kgeVar = f instanceof kge ? (kge) f : null;
            String b3 = kgeVar != null ? kgeVar.b() : null;
            if (b3 != null && (b instanceof String)) {
                String str = (String) b;
                if (kgtVar.b(str) instanceof khs) {
                    if (kgtVar.g.containsKey(b3)) {
                        arrayList = (ArrayList) kgtVar.g.get(b3);
                    } else {
                        arrayList = new ArrayList();
                        kgtVar.g.put(b3, arrayList);
                    }
                    arrayList.add(str);
                }
            }
        }
    }
}
