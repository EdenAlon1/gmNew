package defpackage;

import android.text.TextUtils;
import android.util.Patterns;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ayvs {
    private final ffbr f;
    private static final cfup e = cfvl.k(cfvl.b, "phone_numbers_equal__loose_match__min_match", 7);
    static final cfup a = cfvl.n(cfvl.b, "phone_numbers_equal__use_lib_phone_number", true);
    static final cfup b = cfvl.n(cfvl.b, "phone_numbers_equal__use_custom_phone_recognizer", true);
    public static final Pattern c = Pattern.compile("(\\+?[0-9]+[\\- \\.]*)?(\\([0-9]+\\)[\\- \\.]*)?([0-9][0-9\\- \\.]+[0-9])");
    public static final Pattern d = Pattern.compile("\\s*(\"[^\"]*\"|[^<>\"]+)\\s*<([^<>]+)>\\s*");

    public ayvs(ffbr ffbrVar) {
        this.f = ffbrVar;
    }

    public static int a() {
        return ((Integer) e.e()).intValue();
    }

    public static elfl b() {
        return e.b();
    }

    public static boolean c(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Matcher matcher = d.matcher(str);
        if (matcher.matches()) {
            str = matcher.group(2);
            emyw.e(str);
        }
        return Patterns.EMAIL_ADDRESS.matcher(str).matches();
    }

    public static boolean d(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return (((Boolean) b.e()).booleanValue() ? c : Patterns.PHONE).matcher(str).matches();
    }

    static boolean e(String str, String str2, int i) {
        int length;
        int length2;
        int i2;
        int i3;
        boolean z;
        if (str != null && str.equals(str2)) {
            return true;
        }
        if (!d(str2) || !d(str)) {
            if (c(str)) {
                str = str.toLowerCase(Locale.US);
            }
            if (c(str2)) {
                str2 = str2.toLowerCase(Locale.US);
            }
            return str.equals(str2);
        }
        if (str == null || str2 == null || (length = str.length()) == 0 || (length2 = str2.length()) == 0) {
            return false;
        }
        int i4 = length - 1;
        int i5 = length2 - 1;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (i4 >= 0 && i5 >= 0) {
            char charAt = str.charAt(i4);
            if (h(charAt)) {
                z = false;
            } else {
                i4--;
                i6++;
                z = true;
            }
            char charAt2 = str2.charAt(i5);
            if (!h(charAt2)) {
                i5--;
                i7++;
                z = true;
            }
            if (!z) {
                if (charAt2 != charAt) {
                    break;
                }
                i4--;
                i5--;
                i8++;
            }
        }
        if (i8 < i) {
            int length3 = str.length() - i6;
            return length3 == str2.length() - i7 && length3 == i8;
        }
        if (i8 >= i && (i4 < 0 || i5 < 0)) {
            return true;
        }
        int i9 = i5 + 1;
        int i10 = i4 + 1;
        if (i(str, i10) && i(str2, i9)) {
            return true;
        }
        if (k(str, i10) && j(str2, i9)) {
            return true;
        }
        if (k(str2, i9) && j(str, i10)) {
            return true;
        }
        boolean z2 = str.charAt(0) == '+';
        boolean z3 = str2.charAt(0) == '+';
        boolean z4 = z2 && (i3 = i4 - i5) >= 0 && i3 <= 1;
        boolean z5 = z3 && (i2 = i5 - i4) >= 0 && i2 <= 1;
        if (i4 < 4 && i5 < 4) {
            if (z4 || z5) {
                return (z2 && z3) ? false : true;
            }
            return false;
        }
        return false;
    }

    private static boolean g(char c2) {
        return c2 >= '0' && c2 <= '9';
    }

    private static boolean h(char c2) {
        return (c2 >= '0' && c2 <= '9') || c2 == '*' || c2 == '#' || c2 == '+';
    }

    private static boolean i(String str, int i) {
        char c2 = 0;
        for (int i2 = 0; i2 < i; i2++) {
            char charAt = str.charAt(i2);
            if (c2 != 0) {
                if (c2 != 2) {
                    if (c2 != 4) {
                        if (h(charAt)) {
                            return false;
                        }
                    } else if (charAt == '1') {
                        c2 = 5;
                    } else if (h(charAt)) {
                        return false;
                    }
                } else if (charAt == '0') {
                    c2 = 3;
                } else if (charAt == '1') {
                    c2 = 4;
                } else if (h(charAt)) {
                    return false;
                }
            } else if (charAt == '+') {
                c2 = 1;
            } else if (charAt == '0') {
                c2 = 2;
            } else if (h(charAt)) {
                return false;
            }
        }
        return c2 == 1 || c2 == 3 || c2 == 5;
    }

    private static boolean j(String str, int i) {
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            char charAt = str.charAt(i3);
            switch (i2) {
                case 0:
                    if (charAt == '+') {
                        i2 = 1;
                        break;
                    } else if (charAt == '0') {
                        i2 = 2;
                        break;
                    } else {
                        if (h(charAt)) {
                            return false;
                        }
                        break;
                    }
                case 1:
                case 3:
                case 5:
                    if (g(charAt)) {
                        i2 = 6;
                        break;
                    } else {
                        if (h(charAt)) {
                            return false;
                        }
                        break;
                    }
                case 2:
                    if (charAt == '0') {
                        i2 = 3;
                        break;
                    } else if (charAt == '1') {
                        i2 = 4;
                        break;
                    } else {
                        if (h(charAt)) {
                            return false;
                        }
                        break;
                    }
                case 4:
                    if (charAt == '1') {
                        i2 = 5;
                        break;
                    } else {
                        if (h(charAt)) {
                            return false;
                        }
                        break;
                    }
                case 6:
                case 7:
                    if (g(charAt)) {
                        i2++;
                        break;
                    } else {
                        if (h(charAt)) {
                            return false;
                        }
                        break;
                    }
                default:
                    if (h(charAt)) {
                        return false;
                    }
                    break;
            }
        }
        return i2 == 6 || i2 == 7 || i2 == 8;
    }

    private static boolean k(String str, int i) {
        boolean z = false;
        for (int i2 = 0; i2 < i; i2++) {
            char charAt = str.charAt(i2);
            if (charAt == '0') {
                if (z) {
                    z = true;
                    charAt = '0';
                } else {
                    z = true;
                }
            }
            if (h(charAt)) {
                return false;
            }
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005b A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int f(java.lang.String r6, java.lang.String r7, int r8, java.lang.String r9) {
        /*
            r5 = this;
            boolean r0 = r6.equals(r7)
            r1 = 1
            if (r0 == 0) goto L8
            return r1
        L8:
            boolean r0 = d(r6)
            r2 = 4
            if (r0 == 0) goto L5c
            boolean r0 = d(r7)
            if (r0 == 0) goto L5c
            cfup r0 = defpackage.ayvs.a
            java.lang.Object r0 = r0.e()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L25
        L23:
            r1 = r2
            goto L58
        L25:
            ffbr r0 = r5.f     // Catch: defpackage.esfg -> L23
            java.lang.Object r0 = r0.b()     // Catch: defpackage.esfg -> L23
            esfl r0 = (defpackage.esfl) r0     // Catch: defpackage.esfg -> L23
            java.lang.String r3 = r6.trim()     // Catch: defpackage.esfg -> L23
            esfh r0 = r0.n(r3, r9)     // Catch: defpackage.esfg -> L23
            ffbr r3 = r5.f     // Catch: defpackage.esfg -> L23
            java.lang.Object r3 = r3.b()     // Catch: defpackage.esfg -> L23
            esfl r3 = (defpackage.esfl) r3     // Catch: defpackage.esfg -> L23
            java.lang.String r4 = r7.trim()     // Catch: defpackage.esfg -> L23
            esfh r9 = r3.n(r4, r9)     // Catch: defpackage.esfg -> L23
            ffbr r3 = r5.f     // Catch: defpackage.esfg -> L23
            java.lang.Object r3 = r3.b()     // Catch: defpackage.esfg -> L23
            esfl r3 = (defpackage.esfl) r3     // Catch: defpackage.esfg -> L23
            int r9 = r3.k(r0, r9)     // Catch: defpackage.esfg -> L23
            r0 = 5
            if (r9 != r0) goto L55
            goto L58
        L55:
            if (r9 != r2) goto L23
            r1 = 2
        L58:
            if (r1 != r2) goto L5b
            goto L5c
        L5b:
            return r1
        L5c:
            boolean r6 = e(r6, r7, r8)
            if (r6 == 0) goto L64
            r6 = 3
            return r6
        L64:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ayvs.f(java.lang.String, java.lang.String, int, java.lang.String):int");
    }
}
