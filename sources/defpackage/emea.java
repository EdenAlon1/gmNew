package defpackage;

import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emea {
    public static final emeb a(emcx emcxVar, emdy emdyVar) {
        emcxVar.getClass();
        Objects.toString(emcxVar);
        String concat = "Features are not available, status: ".concat(emcxVar.toString());
        int ordinal = emcxVar.ordinal();
        if (ordinal == 1 || ordinal == 2) {
            return new emdx(concat, emdyVar);
        }
        if (ordinal == 3) {
            return new emeb(concat, null, 7, null, null, 26);
        }
        Objects.toString(emcxVar);
        throw new IllegalArgumentException("Unexpected value, ".concat(emcxVar.toString()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x001f, code lost:
    
        if (r0 != 12) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.emeb b(defpackage.sao r8) {
        /*
            int r0 = r8.a
            r1 = 1
            r2 = 2
            if (r0 != r2) goto L2d
            int r0 = r8.b
            r3 = 4
            if (r0 == r3) goto L2b
            r4 = 9
            r5 = 5
            if (r0 == r5) goto L29
            r6 = 7
            if (r0 == r6) goto L27
            if (r0 == r4) goto L25
            r3 = 15
            r5 = 11
            if (r0 == r3) goto L27
            if (r0 == r5) goto L22
            r3 = 12
            if (r0 == r3) goto L29
            goto L2c
        L22:
            r0 = 3
            r1 = r0
            goto L2c
        L25:
            r1 = r3
            goto L2c
        L27:
            r1 = r5
            goto L2c
        L29:
            r1 = r4
            goto L2c
        L2b:
            r1 = r2
        L2c:
            r0 = r2
        L2d:
            r4 = r1
            int r1 = r8.b
            r2 = r1
            emeb r1 = new emeb
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
            r7 = 1
            r2 = 0
            r3 = r8
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.emea.b(sao):emeb");
    }
}
