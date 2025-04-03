package defpackage;

import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fiig {
    public static long a(Map map) {
        long j = 0;
        if (map == null) {
            return 0L;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (((String) entry.getKey()) != null) {
                j += r3.length();
            }
            if (entry.getValue() != null) {
                while (((List) entry.getValue()).iterator().hasNext()) {
                    j += ((String) r2.next()).length();
                }
            }
        }
        return j;
    }

    public static int b(int i) {
        if (i != 0) {
            return i != 1 ? 3 : 2;
        }
        return 1;
    }
}
