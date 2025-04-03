package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class dqlg {
    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object a(defpackage.dqli r4, defpackage.dqlf r5, boolean r6, defpackage.ffgu r7) {
        /*
            boolean r0 = r7 instanceof defpackage.dqlh
            if (r0 == 0) goto L13
            r0 = r7
            dqlh r0 = (defpackage.dqlh) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            dqlh r0 = new dqlh
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r7)
            goto L3f
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            defpackage.ffci.b(r7)
            java.util.List r5 = defpackage.ffdx.b(r5)
            r0.b = r3
            java.lang.Object r7 = b(r4, r5, r6, r0)
            if (r7 != r1) goto L3f
            return r1
        L3f:
            java.util.Map r7 = (java.util.Map) r7
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r3)
            boolean r4 = r7.containsValue(r4)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dqlg.a(dqli, dqlf, boolean, ffgu):java.lang.Object");
    }

    public static /* synthetic */ Object b(dqli dqliVar, List list, boolean z, ffgu ffguVar) {
        if (!z || !c(dqliVar, list)) {
            dqlp dqlpVar = (dqlp) dqliVar;
            return dqlpVar.a.d("PermissionsManager#showPermissionsRequestDialog", new dqlo(list, dqlpVar, null), ffguVar);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(ffmk.f(ffew.a(ffdx.n(list, 10)), 16));
        for (Object obj : list) {
            linkedHashMap.put(obj, true);
        }
        return linkedHashMap;
    }

    public static boolean c(dqli dqliVar, List list) {
        list.getClass();
        if (list.isEmpty()) {
            return true;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!dqliVar.d((dqlf) it.next())) {
                return false;
            }
        }
        return true;
    }
}
