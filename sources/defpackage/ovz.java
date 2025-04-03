package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ovz {
    /* JADX WARN: Removed duplicated region for block: B:13:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0050 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List a(defpackage.ota r9, int r10, int r11) {
        /*
            if (r10 != r11) goto L5
            ffel r9 = defpackage.ffel.a
            return r9
        L5:
            r0 = 0
            r1 = 1
            if (r11 <= r10) goto Lb
            r2 = r1
            goto Lc
        Lb:
            r2 = r0
        Lc:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
        L11:
            if (r2 == 0) goto L16
            if (r10 >= r11) goto L18
            goto L19
        L16:
            if (r10 > r11) goto L19
        L18:
            return r3
        L19:
            r4 = 0
            if (r2 == 0) goto L35
            java.util.Map r5 = r9.a
            java.lang.Integer r6 = java.lang.Integer.valueOf(r10)
            java.lang.Object r5 = r5.get(r6)
            java.util.TreeMap r5 = (java.util.TreeMap) r5
            if (r5 != 0) goto L2b
            goto L43
        L2b:
            java.util.NavigableSet r6 = r5.descendingKeySet()
            ffcf r7 = new ffcf
            r7.<init>(r5, r6)
            goto L4e
        L35:
            java.util.Map r5 = r9.a
            java.lang.Integer r6 = java.lang.Integer.valueOf(r10)
            java.lang.Object r5 = r5.get(r6)
            java.util.TreeMap r5 = (java.util.TreeMap) r5
            if (r5 != 0) goto L45
        L43:
            r7 = r4
            goto L4e
        L45:
            java.util.Set r6 = r5.keySet()
            ffcf r7 = new ffcf
            r7.<init>(r5, r6)
        L4e:
            if (r7 != 0) goto L51
            return r4
        L51:
            java.lang.Object r5 = r7.a
            java.lang.Object r6 = r7.b
            java.util.Map r5 = (java.util.Map) r5
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r6 = r6.iterator()
        L5d:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L8b
            java.lang.Object r7 = r6.next()
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            if (r2 == 0) goto L76
            int r8 = r10 + 1
            if (r8 > r7) goto L5d
            if (r7 > r11) goto L5d
            goto L7a
        L76:
            if (r11 > r7) goto L5d
            if (r7 >= r10) goto L5d
        L7a:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r7)
            java.lang.Object r10 = r5.get(r10)
            r10.getClass()
            r3.add(r10)
            r5 = r1
            r10 = r7
            goto L8c
        L8b:
            r5 = r0
        L8c:
            if (r5 != 0) goto L11
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ovz.a(ota, int, int):java.util.List");
    }

    public static final boolean b(orp orpVar, int i, int i2) {
        if (i <= i2 || !orpVar.j) {
            return orpVar.i && !orpVar.k.contains(Integer.valueOf(i));
        }
        return false;
    }
}
