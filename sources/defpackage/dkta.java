package defpackage;

import java.util.Collection;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkta {
    public static boolean a(Collection collection) {
        return collection == null || collection.isEmpty();
    }

    public static long[] b(Collection collection) {
        int i = 0;
        if (collection == null) {
            return new long[0];
        }
        long[] jArr = new long[collection.size()];
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            jArr[i] = ((Long) it.next()).longValue();
            i++;
        }
        return jArr;
    }
}
