package defpackage;

import android.os.Build;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amn {
    public static final bdn a = new bbf("camera2.streamSpec.streamUseCase", Long.TYPE, null);
    private static final Map b;
    private static final Map c;

    static {
        HashMap hashMap = new HashMap();
        b = hashMap;
        HashMap hashMap2 = new HashMap();
        c = hashMap2;
        if (Build.VERSION.SDK_INT >= 33) {
            HashSet hashSet = new HashSet();
            hashSet.add(bhj.PREVIEW);
            hashSet.add(bhj.METERING_REPEATING);
            hashMap.put(4L, hashSet);
            HashSet hashSet2 = new HashSet();
            hashSet2.add(bhj.PREVIEW);
            hashSet2.add(bhj.METERING_REPEATING);
            hashSet2.add(bhj.IMAGE_ANALYSIS);
            hashMap.put(1L, hashSet2);
            HashSet hashSet3 = new HashSet();
            hashSet3.add(bhj.IMAGE_CAPTURE);
            hashMap.put(2L, hashSet3);
            HashSet hashSet4 = new HashSet();
            hashSet4.add(bhj.VIDEO_CAPTURE);
            hashMap.put(3L, hashSet4);
            HashSet hashSet5 = new HashSet();
            hashSet5.add(bhj.PREVIEW);
            hashSet5.add(bhj.IMAGE_CAPTURE);
            hashSet5.add(bhj.VIDEO_CAPTURE);
            hashMap2.put(4L, hashSet5);
            HashSet hashSet6 = new HashSet();
            hashSet6.add(bhj.PREVIEW);
            hashSet6.add(bhj.VIDEO_CAPTURE);
            hashMap2.put(3L, hashSet6);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static bdp a(bdp bdpVar, long j) {
        bdn bdnVar = a;
        if (bfy.g(bdpVar, bdnVar) && ((Long) bfy.b(bdpVar, bdnVar)).longValue() == j) {
            return null;
        }
        bfh b2 = bfh.b(bdpVar);
        b2.c(bdnVar, Long.valueOf(j));
        return new afm(b2);
    }

    public static void b() {
        throw new IllegalArgumentException("Either all use cases must have non-default stream use case assigned or none should have it");
    }

    public static boolean c(bhj bhjVar, long j, List list) {
        if (Build.VERSION.SDK_INT < 33) {
            return false;
        }
        if (bhjVar != bhj.STREAM_SHARING) {
            Map map = b;
            Long valueOf = Long.valueOf(j);
            return map.containsKey(valueOf) && ((Set) map.get(valueOf)).contains(bhjVar);
        }
        Map map2 = c;
        Long valueOf2 = Long.valueOf(j);
        if (!map2.containsKey(valueOf2)) {
            return false;
        }
        Set set = (Set) map2.get(valueOf2);
        if (list.size() != set.size()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!set.contains((bhj) it.next())) {
                return false;
            }
        }
        return true;
    }

    public static boolean d(bdp bdpVar, bhj bhjVar) {
        return !((Boolean) bdpVar.m(bhh.v, false)).booleanValue() && bdpVar.s(beo.a) && anh.a(bhjVar, ((Integer) bdpVar.l(beo.a)).intValue()) == 5;
    }
}
