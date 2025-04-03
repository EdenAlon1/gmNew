package defpackage;

import android.hardware.camera2.params.DynamicRangeProfiles;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aqd {
    private static final Map a;
    private static final Map b;

    static {
        HashMap hashMap = new HashMap();
        a = hashMap;
        HashMap hashMap2 = new HashMap();
        b = hashMap2;
        hashMap.put(1L, aua.b);
        hashMap2.put(aua.b, Collections.singletonList(1L));
        hashMap.put(2L, aua.c);
        hashMap2.put((aua) hashMap.get(2L), Collections.singletonList(2L));
        hashMap.put(4L, aua.d);
        hashMap2.put(aua.d, Collections.singletonList(4L));
        hashMap.put(8L, aua.e);
        hashMap2.put(aua.e, Collections.singletonList(8L));
        List asList = Arrays.asList(64L, 128L, 16L, 32L);
        Iterator it = asList.iterator();
        while (it.hasNext()) {
            a.put((Long) it.next(), aua.f);
        }
        b.put(aua.f, asList);
        List asList2 = Arrays.asList(1024L, 2048L, 256L, 512L);
        Iterator it2 = asList2.iterator();
        while (it2.hasNext()) {
            a.put((Long) it2.next(), aua.g);
        }
        b.put(aua.g, asList2);
    }

    public static aua a(long j) {
        return (aua) a.get(Long.valueOf(j));
    }

    public static Long b(aua auaVar, DynamicRangeProfiles dynamicRangeProfiles) {
        Set supportedProfiles;
        List<Long> list = (List) b.get(auaVar);
        if (list == null) {
            return null;
        }
        supportedProfiles = dynamicRangeProfiles.getSupportedProfiles();
        for (Long l : list) {
            if (supportedProfiles.contains(l)) {
                return l;
            }
        }
        return null;
    }
}
