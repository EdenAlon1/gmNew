package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evsa {
    /* JADX WARN: Removed duplicated region for block: B:19:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0023 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String a(java.lang.String r7) {
        /*
            int r0 = r7.length()
            r1 = 0
            r2 = r1
        L6:
            if (r2 == r0) goto L90
            int r3 = r2 + 1
            char r4 = r7.charAt(r2)
            r5 = 126(0x7e, float:1.77E-43)
            r6 = 55296(0xd800, float:7.7486E-41)
            if (r4 > r5) goto L1a
            r5 = 32
            if (r4 < r5) goto L21
            goto L48
        L1a:
            if (r4 >= r6) goto L21
            r5 = 160(0xa0, float:2.24E-43)
            if (r4 < r5) goto L21
            goto L48
        L21:
            if (r4 >= r6) goto L34
            r2 = 10
            if (r4 == r2) goto L48
            r2 = 13
            if (r4 == r2) goto L48
            r2 = 9
            if (r4 == r2) goto L48
            r2 = 12
            if (r4 == r2) goto L48
            goto L58
        L34:
            r5 = 57343(0xdfff, float:8.0355E-41)
            r6 = 65534(0xfffe, float:9.1833E-41)
            if (r4 <= r5) goto L4a
            r2 = 64976(0xfdd0, float:9.1051E-41)
            if (r4 < r2) goto L48
            r2 = 65007(0xfdef, float:9.1094E-41)
            if (r4 <= r2) goto L58
            if (r4 >= r6) goto L58
        L48:
            r2 = r3
            goto L6
        L4a:
            int r3 = java.lang.Character.codePointAt(r7, r2)
            r4 = 65536(0x10000, float:9.18355E-41)
            if (r3 < r4) goto L58
            r3 = r3 & r6
            if (r3 == r6) goto L58
            int r2 = r2 + 2
            goto L6
        L58:
            int r0 = r7.length()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r0)
        L61:
            if (r1 >= r0) goto L8c
            char r3 = r7.charAt(r1)
            boolean r4 = b(r3)
            if (r4 == 0) goto L73
            r2.append(r3)
            int r1 = r1 + 1
            goto L61
        L73:
            int r3 = java.lang.Character.codePointAt(r7, r1)
            boolean r4 = b(r3)
            r5 = 1
            if (r5 == r4) goto L82
            r4 = 65533(0xfffd, float:9.1831E-41)
            goto L83
        L82:
            r4 = r3
        L83:
            r2.appendCodePoint(r4)
            int r3 = java.lang.Character.charCount(r3)
            int r1 = r1 + r3
            goto L61
        L8c:
            java.lang.String r7 = r2.toString()
        L90:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.evsa.a(java.lang.String):java.lang.String");
    }

    public static boolean b(int i) {
        return i <= 126 ? i >= 32 || i == 10 || i == 13 || i == 9 || i == 12 : i < 55296 ? i >= 160 : i < 64976 ? i > 57343 : i > 65007 && (i & 65534) != 65534 && i <= 1114111;
    }
}
