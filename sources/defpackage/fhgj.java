package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhgj {
    public static final int a(String str) {
        str.getClass();
        if (ffkj.e(str, "http")) {
            return 80;
        }
        return !ffkj.e(str, "https") ? -1 : 443;
    }

    public static final fhgk b(String str) {
        str.getClass();
        fhgi fhgiVar = new fhgi();
        fhgiVar.c(null, str);
        return fhgiVar.a();
    }

    public static /* synthetic */ String c(String str, int i, int i2, boolean z, int i3) {
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        boolean z2 = true;
        if (1 == (i3 & 1)) {
            i = 0;
        }
        boolean z3 = z & ((i3 & 4) == 0);
        str.getClass();
        int i4 = i;
        while (i4 < i2) {
            char charAt = str.charAt(i4);
            if (charAt == '%') {
                z2 = z3;
            } else if (charAt != '+' || !z3) {
                i4++;
            }
            fhmt fhmtVar = new fhmt();
            fhmtVar.T(str, i, i4);
            while (i4 < i2) {
                int codePointAt = str.codePointAt(i4);
                if (codePointAt == 37) {
                    int i5 = i4 + 2;
                    if (i5 < i2) {
                        int f = fhhl.f(str.charAt(i4 + 1));
                        int f2 = fhhl.f(str.charAt(i5));
                        if (f == -1 || f2 == -1) {
                            codePointAt = 37;
                            fhmtVar.U(codePointAt);
                            i4 += Character.charCount(codePointAt);
                        } else {
                            fhmtVar.O((f << 4) + f2);
                            i4 = Character.charCount(37) + i5;
                        }
                    } else {
                        codePointAt = 37;
                    }
                }
                if (codePointAt == 43 && z2) {
                    fhmtVar.O(32);
                    i4++;
                }
                fhmtVar.U(codePointAt);
                i4 += Character.charCount(codePointAt);
            }
            return fhmtVar.m();
        }
        String substring = str.substring(i, i2);
        substring.getClass();
        return substring;
    }

    public static final List d(String str) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i <= str.length()) {
            int P = ffpc.P(str, '&', i, 4);
            if (P == -1) {
                P = str.length();
            }
            int P2 = ffpc.P(str, '=', i, 4);
            if (P2 == -1 || P2 > P) {
                String substring = str.substring(i, P);
                substring.getClass();
                arrayList.add(substring);
                arrayList.add(null);
            } else {
                String substring2 = str.substring(i, P2);
                substring2.getClass();
                arrayList.add(substring2);
                String substring3 = str.substring(P2 + 1, P);
                substring3.getClass();
                arrayList.add(substring3);
            }
            i = P + 1;
        }
        return arrayList;
    }

    public static /* synthetic */ String e(String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, int i3) {
        char c;
        int i4;
        int length = (i3 & 2) != 0 ? str.length() : i2;
        boolean z5 = true;
        int i5 = 1 == (i3 & 1) ? 0 : i;
        boolean z6 = ((i3 & 8) == 0) & z;
        boolean z7 = ((i3 & 16) == 0) & z2;
        boolean z8 = ((i3 & 32) == 0) & z3;
        boolean z9 = ((i3 & 64) == 0) & z4;
        str.getClass();
        int i6 = i5;
        while (i6 < length) {
            int codePointAt = str.codePointAt(i6);
            int i7 = 43;
            int i8 = 127;
            if (codePointAt >= 32 && codePointAt != 127 && ((codePointAt < 128 || z9) && !ffpc.L(str2, (char) codePointAt) && (codePointAt != 37 || (z6 && (!z7 || f(str, i6, length)))))) {
                if (codePointAt == 43 && z8) {
                    z8 = true;
                } else {
                    i6 += Character.charCount(codePointAt);
                }
            }
            fhmt fhmtVar = new fhmt();
            fhmtVar.T(str, i5, i6);
            fhmt fhmtVar2 = null;
            while (i6 < length) {
                int codePointAt2 = str.codePointAt(i6);
                if (z6) {
                    if (codePointAt2 != 9 && codePointAt2 != 10 && codePointAt2 != 12) {
                        if (codePointAt2 == 13) {
                            codePointAt2 = 13;
                        }
                    }
                    c = '%';
                    i6 += Character.charCount(codePointAt2);
                    z5 = true;
                    i7 = 43;
                    i8 = 127;
                }
                if (codePointAt2 == i7 && z8) {
                    fhmtVar.aa(z5 != z6 ? "%2B" : "+");
                    c = '%';
                    i6 += Character.charCount(codePointAt2);
                    z5 = true;
                    i7 = 43;
                    i8 = 127;
                } else {
                    if (codePointAt2 >= 32 && codePointAt2 != i8) {
                        if ((codePointAt2 < 128 || z9) && !ffpc.L(str2, (char) codePointAt2)) {
                            if (codePointAt2 != 37) {
                                i4 = codePointAt2;
                            } else if (z6 && (!z7 || f(str, i6, length))) {
                                i4 = 37;
                            }
                            fhmtVar.U(codePointAt2);
                            codePointAt2 = i4;
                            c = '%';
                            i6 += Character.charCount(codePointAt2);
                            z5 = true;
                            i7 = 43;
                            i8 = 127;
                        }
                    }
                    if (fhmtVar2 == null) {
                        fhmtVar2 = new fhmt();
                    }
                    fhmtVar2.U(codePointAt2);
                    while (!fhmtVar2.D()) {
                        byte d = fhmtVar2.d();
                        fhmtVar.O(37);
                        fhmtVar.O(fhgk.a[(d & 255) >> 4]);
                        fhmtVar.O(fhgk.a[d & 15]);
                    }
                    c = '%';
                    i6 += Character.charCount(codePointAt2);
                    z5 = true;
                    i7 = 43;
                    i8 = 127;
                }
            }
            return fhmtVar.m();
        }
        String substring = str.substring(i5, length);
        substring.getClass();
        return substring;
    }

    private static final boolean f(String str, int i, int i2) {
        int i3 = i + 2;
        return i3 < i2 && str.charAt(i) == '%' && fhhl.f(str.charAt(i + 1)) != -1 && fhhl.f(str.charAt(i3)) != -1;
    }
}
