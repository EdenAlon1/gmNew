package defpackage;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class owa {
    public static final void a(HashMap hashMap, ffji ffjiVar) {
        int i;
        hashMap.getClass();
        HashMap hashMap2 = new HashMap(999);
        loop0: while (true) {
            i = 0;
            for (Object obj : hashMap.keySet()) {
                obj.getClass();
                hashMap2.put(obj, hashMap.get(obj));
                i++;
                if (i == 999) {
                    break;
                }
            }
            ffjiVar.invoke(hashMap2);
            hashMap2.clear();
        }
        if (i > 0) {
            ffjiVar.invoke(hashMap2);
        }
    }
}
