package defpackage;

import java.util.HashMap;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class empb {
    public static List a(fbts fbtsVar, long j) {
        int i;
        int i2 = engw.d;
        engr engrVar = new engr();
        HashMap hashMap = new HashMap();
        hashMap.put(fbtsVar.g, 0);
        fbup fbupVar = fbtsVar.f;
        if (fbupVar == null) {
            fbupVar = fbup.a;
        }
        for (fbun fbunVar : fbupVar.b) {
            String str = fbunVar.d;
            if (hashMap.containsKey(str)) {
                i = ((Integer) hashMap.get(str)).intValue();
            } else {
                int size = hashMap.size();
                hashMap.put(str, Integer.valueOf(size));
                i = size;
            }
            engrVar.h(new excz(fbunVar.b == 30 ? (String) fbunVar.c : "", i, (j / 1000.0f) - ((fbunVar.e / 1000.0f) / 1000.0f)));
        }
        return engrVar.g();
    }
}
