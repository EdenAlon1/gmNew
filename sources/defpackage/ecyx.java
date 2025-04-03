package defpackage;

import com.google.android.gms.phenotype.ExperimentTokens;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ecyx implements ecyr {
    private final AtomicBoolean e = new AtomicBoolean(false);
    public final ConcurrentMap a = new ConcurrentHashMap();
    public final ConcurrentMap b = new ConcurrentHashMap();
    public final ConcurrentMap c = new ConcurrentHashMap();
    public final ConcurrentMap d = new ConcurrentHashMap();

    /* JADX WARN: Removed duplicated region for block: B:108:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0186  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void b(defpackage.dflc r20, defpackage.emyl r21, defpackage.emwl r22) {
        /*
            Method dump skipped, instructions count: 626
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ecyx.b(dflc, emyl, emwl):void");
    }

    private static final void c(ecyq ecyqVar, Object obj, ConcurrentMap concurrentMap, boolean z) {
        Set<ecyq> set = (Set) concurrentMap.putIfAbsent(obj, new enpx(ecyqVar));
        if (set != null) {
            enin eninVar = new enin();
            if (z) {
                HashSet hashSet = new HashSet();
                for (ecyq ecyqVar2 : set) {
                    if (!ecyqVar2.b.equals(ecyqVar.b)) {
                        hashSet.add(ecyqVar2);
                    }
                }
                eninVar.j(hashSet);
            } else {
                eninVar.j(set);
            }
            eninVar.c(ecyqVar);
            concurrentMap.put(obj, eninVar.g());
        }
    }

    public final void a(eyee eyeeVar, Set set, String str, String str2, boolean z, boolean z2) {
        if (!set.isEmpty() && !this.e.getAndSet(true)) {
            dfld.m(new ecyw(this));
        }
        byte[] I = eyeeVar.I();
        byte[][] bArr = ExperimentTokens.a;
        ecyq ecyqVar = new ecyq(new ExperimentTokens(str, I, bArr, bArr, bArr, bArr, null, null, null, null), str2);
        if (z) {
            this.a.put(new emxd(str2, str), ecyqVar);
        } else {
            this.b.put(str2, ecyqVar);
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str3 = (String) it.next();
            if (z) {
                c(ecyqVar, new emxd(str3, str), this.c, z2);
            } else {
                c(ecyqVar, str3, this.d, z2);
            }
        }
    }
}
