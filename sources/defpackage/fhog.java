package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhog {
    public static final String a(int i) {
        char[] cArr = new char[i];
        Arrays.fill(cArr, ' ');
        return new String(cArr);
    }

    public static final String b(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        int length = str.length();
        while (length > 0) {
            int i = length - 1;
            if (!Character.isWhitespace(str.charAt(i))) {
                break;
            }
            length = i;
        }
        return str.substring(0, length);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x003d, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int c(java.lang.String r6) {
        /*
            r0 = 10
            r1 = 0
            int r2 = r6.indexOf(r0, r1)
            r3 = 74
            r4 = -1
            if (r2 == r4) goto L12
            if (r2 <= r3) goto Lf
            goto L12
        Lf:
            int r2 = r2 + 1
            return r2
        L12:
            r2 = 9
            int r1 = r6.indexOf(r2, r1)
            if (r1 == r4) goto L20
            if (r1 <= r3) goto L1d
            goto L20
        L1d:
            int r1 = r1 + 1
            return r1
        L20:
            int r1 = r6.length()
            if (r1 <= r3) goto L46
            r1 = r3
        L27:
            if (r1 < 0) goto L3b
            char r2 = r6.charAt(r1)
            r5 = 32
            if (r2 == r5) goto L3b
            if (r2 == r0) goto L3b
            r5 = 13
            if (r2 != r5) goto L38
            goto L3b
        L38:
            int r1 = r1 + (-1)
            goto L27
        L3b:
            if (r1 <= 0) goto L3e
            return r1
        L3e:
            int r6 = r6.length()
            if (r6 != r3) goto L45
            return r4
        L45:
            return r3
        L46:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fhog.c(java.lang.String):int");
    }
}
