package defpackage;

import java.net.IDN;
import java.net.InetAddress;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhhi {
    public static final String a(String str) {
        boolean I;
        int i;
        str.getClass();
        I = ffpc.I(str, ":", false);
        int i2 = -1;
        int i3 = 0;
        if (!I) {
            try {
                String ascii = IDN.toASCII(str);
                ascii.getClass();
                Locale locale = Locale.US;
                locale.getClass();
                String lowerCase = ascii.toLowerCase(locale);
                lowerCase.getClass();
                if (lowerCase.length() != 0) {
                    int length = lowerCase.length();
                    for (0; i < length; i + 1) {
                        char charAt = lowerCase.charAt(i);
                        i = (ffkj.a(charAt, 31) > 0 && ffkj.a(charAt, 127) < 0 && ffpc.P(" #%/:?@[\\]", charAt, 0, 6) == -1) ? i + 1 : 0;
                        return null;
                    }
                    return lowerCase;
                }
            } catch (IllegalArgumentException unused) {
            }
            return null;
        }
        InetAddress b = (ffpc.t(str, "[") && ffpc.n(str, "]")) ? b(str, 1, str.length() - 1) : b(str, 0, str.length());
        if (b == null) {
            return null;
        }
        byte[] address = b.getAddress();
        int length2 = address.length;
        if (length2 != 16) {
            if (length2 == 4) {
                return b.getHostAddress();
            }
            throw new AssertionError(a.a(str, "Invalid IPv6 address: '", "'"));
        }
        address.getClass();
        int i4 = 0;
        int i5 = 0;
        while (i4 < address.length) {
            int i6 = i4;
            while (i6 < 16 && address[i6] == 0 && address[i6 + 1] == 0) {
                i6 += 2;
            }
            int i7 = i6 - i4;
            if (i7 > i5 && i7 >= 4) {
                i2 = i4;
                i5 = i7;
            }
            i4 = i6 + 2;
        }
        fhmt fhmtVar = new fhmt();
        while (i3 < address.length) {
            if (i3 == i2) {
                fhmtVar.O(58);
                i3 += i5;
                if (i3 == 16) {
                    fhmtVar.O(58);
                }
            } else {
                if (i3 > 0) {
                    fhmtVar.O(58);
                }
                fhmtVar.W((fhhl.z(address[i3]) << 8) | fhhl.z(address[i3 + 1]));
                i3 += 2;
            }
        }
        return fhmtVar.m();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final java.net.InetAddress b(java.lang.String r13, int r14, int r15) {
        /*
            Method dump skipped, instructions count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fhhi.b(java.lang.String, int, int):java.net.InetAddress");
    }
}
