package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emnp {
    public static List a(fbup fbupVar) {
        eygr eygrVar = fbupVar.b;
        fbun fbunVar = (fbun) enjk.j(eygrVar);
        return b(eygrVar, fbunVar.d, c(fbunVar.e));
    }

    public static List b(List list, String str, float f) {
        int i;
        int i2 = engw.d;
        engr engrVar = new engr();
        HashMap hashMap = new HashMap();
        hashMap.put(str, 0);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            fbun fbunVar = (fbun) it.next();
            String str2 = fbunVar.d;
            if (hashMap.containsKey(str2)) {
                i = ((Integer) hashMap.get(str2)).intValue();
            } else {
                int size = hashMap.size();
                hashMap.put(str2, Integer.valueOf(size));
                i = size;
            }
            engrVar.h(new excz(fbunVar.b == 30 ? (String) fbunVar.c : "", i, f - c(fbunVar.e), fbunVar.f));
        }
        return engrVar.g();
    }

    private static float c(long j) {
        return (j / 1000.0f) / 1000.0f;
    }
}
