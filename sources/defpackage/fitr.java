package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fitr {
    public static final ConcurrentHashMap a = new ConcurrentHashMap();

    static {
        new AtomicReferenceArray(25);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(java.lang.String r3) {
        /*
            int r0 = r3.length()
            r1 = 0
            if (r0 <= 0) goto L14
            char r3 = r3.charAt(r1)
            r2 = 1
            switch(r3) {
                case 67: goto L13;
                case 68: goto L13;
                case 70: goto L13;
                case 72: goto L13;
                case 75: goto L13;
                case 77: goto L10;
                case 83: goto L13;
                case 87: goto L13;
                case 89: goto L13;
                case 99: goto L13;
                case 100: goto L13;
                case 101: goto L13;
                case 104: goto L13;
                case 107: goto L13;
                case 109: goto L13;
                case 115: goto L13;
                case 119: goto L13;
                case 120: goto L13;
                case 121: goto L13;
                default: goto Lf;
            }
        Lf:
            goto L14
        L10:
            r3 = 2
            if (r0 > r3) goto L14
        L13:
            return r2
        L14:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fitr.a(java.lang.String):boolean");
    }

    public static String b(int[] iArr) {
        StringBuilder sb = new StringBuilder();
        int i = iArr[0];
        char charAt = "yyyy-MM-dd'T'HH:mm:ss.SSS".charAt(i);
        if ((charAt >= 'A' && charAt <= 'Z') || (charAt >= 'a' && charAt <= 'z')) {
            sb.append(charAt);
            while (true) {
                int i2 = i + 1;
                if (i2 >= 25 || "yyyy-MM-dd'T'HH:mm:ss.SSS".charAt(i2) != charAt) {
                    break;
                }
                sb.append(charAt);
                i = i2;
            }
        } else {
            sb.append('\'');
            boolean z = false;
            while (i < 25) {
                char charAt2 = "yyyy-MM-dd'T'HH:mm:ss.SSS".charAt(i);
                if (charAt2 != '\'') {
                    if (!z && ((charAt2 >= 'A' && charAt2 <= 'Z') || (charAt2 >= 'a' && charAt2 <= 'z'))) {
                        i--;
                        break;
                    }
                    sb.append(charAt2);
                } else {
                    int i3 = i + 1;
                    if (i3 >= 25 || "yyyy-MM-dd'T'HH:mm:ss.SSS".charAt(i3) != '\'') {
                        z = !z;
                    } else {
                        sb.append('\'');
                        i = i3;
                    }
                }
                i++;
            }
        }
        iArr[0] = i;
        return sb.toString();
    }
}
