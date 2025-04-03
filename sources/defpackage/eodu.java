package defpackage;

import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eodu {
    public static final /* synthetic */ int a = 0;
    private static final enra b;

    static {
        HashMap hashMap = new HashMap();
        enrc.a('\"', "&quot;", hashMap);
        enrc.a('\'', "&#39;", hashMap);
        enrc.a('&', "&amp;", hashMap);
        enrc.a('<', "&lt;", hashMap);
        enrc.a('>', "&gt;", hashMap);
        b = new enrb(hashMap);
    }

    static String a(String str) {
        char[] cArr;
        enra enraVar = b;
        str.getClass();
        int i = 0;
        while (i < str.length()) {
            char charAt = str.charAt(i);
            enqx enqxVar = (enqx) enraVar;
            if (charAt < enqxVar.b && enqxVar.a[charAt] != null) {
                int length = str.length();
                char[] a2 = enre.a();
                int length2 = a2.length;
                int i2 = 0;
                int i3 = 0;
                while (i < length) {
                    int i4 = i + 1;
                    char charAt2 = str.charAt(i);
                    char[] cArr2 = null;
                    if (charAt2 < enqxVar.b && (cArr = enqxVar.a[charAt2]) != null) {
                        cArr2 = cArr;
                    }
                    if (cArr2 != null) {
                        int i5 = i - i2;
                        int i6 = i3 + i5;
                        int length3 = cArr2.length;
                        int i7 = i6 + length3;
                        if (length2 < i7) {
                            int i8 = length - i;
                            length2 = i8 + i8 + i7;
                            a2 = enqz.a(a2, i3, length2);
                        }
                        if (i5 > 0) {
                            str.getChars(i2, i, a2, i3);
                            i3 = i6;
                        }
                        if (length3 > 0) {
                            System.arraycopy(cArr2, 0, a2, i3, length3);
                            i3 += length3;
                        }
                        i2 = i4;
                    }
                    i = i4;
                }
                int i9 = length - i2;
                if (i9 > 0) {
                    int i10 = i9 + i3;
                    if (length2 < i10) {
                        a2 = enqz.a(a2, i3, i10);
                    }
                    str.getChars(i2, length, a2, i3);
                    i3 = i10;
                }
                return new String(a2, 0, i3);
            }
            char c = enqxVar.c;
            i++;
        }
        return str;
    }
}
