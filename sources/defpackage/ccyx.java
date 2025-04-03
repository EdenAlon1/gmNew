package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccyx {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0120 A[Catch: all -> 0x0034, LOOP:0: B:13:0x011a->B:15:0x0120, LOOP_END, TryCatch #0 {all -> 0x0034, blocks: (B:11:0x002f, B:12:0x010f, B:13:0x011a, B:15:0x0120, B:17:0x012e, B:18:0x014b, B:20:0x0151, B:22:0x0168), top: B:10:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0151 A[Catch: all -> 0x0034, LOOP:1: B:18:0x014b->B:20:0x0151, LOOP_END, TryCatch #0 {all -> 0x0034, blocks: (B:11:0x002f, B:12:0x010f, B:13:0x011a, B:15:0x0120, B:17:0x012e, B:18:0x014b, B:20:0x0151, B:22:0x0168), top: B:10:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x018c A[LOOP:2: B:29:0x0186->B:31:0x018c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v22, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v0, types: [ffjm] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r12v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(java.util.Map r10, defpackage.ffji r11, defpackage.ffjm r12, defpackage.ffgu r13) {
        /*
            Method dump skipped, instructions count: 426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ccyx.a(java.util.Map, ffji, ffjm, ffgu):java.lang.Object");
    }

    public static final Map b(Map map, ffjm ffjmVar) {
        map.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(ffew.a(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object key2 = entry.getKey();
            Object obj = ((ffch) entry.getValue()).a;
            if (ffch.d(obj)) {
                try {
                    obj = ffjmVar.a(key2, obj);
                } catch (Throwable th) {
                    obj = ffci.a(th);
                }
            }
            linkedHashMap.put(key, new ffch(obj));
        }
        return linkedHashMap;
    }

    public static final Object d(Map map, ffjn ffjnVar, ffgu ffguVar) {
        return ffsl.a(new ccyw(map, ffjnVar, null), ffguVar);
    }
}
