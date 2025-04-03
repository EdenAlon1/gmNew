package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aq implements Cloneable {
    public static final int[] e;
    private static final int h;
    public String a;
    public ArrayList c;
    public boolean d;
    private boolean g;
    public ArrayList b = new ArrayList();
    public final int f = h;

    static {
        char c;
        String a = o.a();
        int hashCode = a.hashCode();
        int i = 1;
        if (hashCode != -413919155) {
            if (hashCode == -99796978 && a.equals("DOUBLE_OPTIONAL")) {
                c = 0;
            }
            c = 65535;
        } else {
            if (a.equals("DOUBLE_REQUIRED")) {
                c = 1;
            }
            c = 65535;
        }
        if (c != 0) {
            if (c != 1) {
                throw new IllegalArgumentException();
            }
            i = 2;
        }
        h = i;
        e = new int[]{1, 2, 3, 4, 5, 6};
    }

    public aq() {
    }

    private final int j(int i) {
        char charAt;
        while (i < this.a.length() && (((charAt = this.a.charAt(i)) >= '0' || "+-.".indexOf(charAt) >= 0) && (charAt <= '9' || charAt == 'e' || charAt == 'E' || charAt == 8734))) {
            i++;
        }
        return i;
    }

    private final int k(int i) {
        String str = this.a;
        byte[] bArr = r.a;
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (charAt > 255) {
                if (charAt >= 8206) {
                    if (charAt > 12336) {
                        if (charAt >= 64830) {
                            if (charAt <= 65094) {
                                if (charAt <= 64831 || charAt >= 65093) {
                                    break;
                                }
                            } else {
                                continue;
                            }
                        } else {
                            continue;
                        }
                    } else if (((r.c[r.b[(charAt - 8192) >> 5]] >> (charAt & 31)) & 1) != 0) {
                        break;
                    }
                } else {
                    continue;
                }
                i++;
            } else {
                if (r.a[charAt] != 0) {
                    break;
                }
                i++;
            }
        }
        return i;
    }

    private final int l(int i) {
        String str = this.a;
        byte[] bArr = r.a;
        while (i < str.length() && r.a(str.charAt(i))) {
            i++;
        }
        return i;
    }

    private final String m() {
        return o(this.a, 0);
    }

    private final String n(int i) {
        return o(this.a, i);
    }

    private static String o(String str, int i) {
        StringBuilder sb = new StringBuilder(44);
        if (i == 0) {
            sb.append("\"");
        } else {
            sb.append("[at pattern index ");
            sb.append(i);
            sb.append("] \"");
        }
        if (str.length() - i <= 24) {
            if (i != 0) {
                str = str.substring(i);
            }
            sb.append(str);
        } else {
            int i2 = i + 20;
            int i3 = i + 19;
            if (true == Character.isHighSurrogate(str.charAt(i3))) {
                i2 = i3;
            }
            sb.append((CharSequence) str, i, i2);
            sb.append(" ...");
        }
        sb.append("\"");
        return sb.toString();
    }

    private final void p(double d, int i, int i2) {
        int size;
        ArrayList arrayList = this.c;
        if (arrayList == null) {
            this.c = new ArrayList();
            size = 0;
        } else {
            size = arrayList.size();
            if (size > 32767) {
                throw new IndexOutOfBoundsException("Too many numeric values");
            }
        }
        this.c.add(Double.valueOf(d));
        v(14, i, i2, size);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0059 A[LOOP:0: B:16:0x0059->B:23:0x0078, LOOP_START, PHI: r0 r1 r3
      0x0059: PHI (r0v7 char) = (r0v6 char), (r0v12 char) binds: [B:6:0x0031, B:23:0x0078] A[DONT_GENERATE, DONT_INLINE]
      0x0059: PHI (r1v5 int) = (r1v4 int), (r1v6 int) binds: [B:6:0x0031, B:23:0x0078] A[DONT_GENERATE, DONT_INLINE]
      0x0059: PHI (r3v1 int) = (r3v0 int), (r3v3 int) binds: [B:6:0x0031, B:23:0x0078] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void q(int r7, int r8, boolean r9) {
        /*
            r6 = this;
            java.lang.String r0 = r6.a
            char r0 = r0.charAt(r7)
            int r1 = r7 + 1
            r2 = 45
            r3 = 0
            r4 = 1
            if (r0 != r2) goto L1d
            if (r1 == r8) goto L43
            int r0 = r7 + 2
            java.lang.String r2 = r6.a
            char r1 = r2.charAt(r1)
            r2 = r1
            r1 = r0
            r0 = r2
            r2 = r4
            goto L2f
        L1d:
            r2 = 43
            if (r0 != r2) goto L2e
            if (r1 == r8) goto L43
            int r0 = r7 + 2
            java.lang.String r2 = r6.a
            char r1 = r2.charAt(r1)
            r2 = r1
            r1 = r0
            r0 = r2
        L2e:
            r2 = r3
        L2f:
            r5 = 8734(0x221e, float:1.2239E-41)
            if (r0 != r5) goto L59
            if (r9 == 0) goto L43
            if (r1 != r8) goto L43
            int r8 = r8 - r7
            if (r4 == r2) goto L3d
            r0 = 9218868437227405312(0x7ff0000000000000, double:Infinity)
            goto L3f
        L3d:
            r0 = -4503599627370496(0xfff0000000000000, double:-Infinity)
        L3f:
            r6.p(r0, r7, r8)
            return
        L43:
            java.lang.NumberFormatException r9 = new java.lang.NumberFormatException
            java.lang.String r0 = r6.a
            java.lang.String r7 = r0.substring(r7, r8)
            java.lang.String r7 = java.lang.String.valueOf(r7)
            java.lang.String r8 = "Bad syntax for numeric value: "
            java.lang.String r7 = r8.concat(r7)
            r9.<init>(r7)
            throw r9
        L59:
            int r9 = r8 - r7
            r4 = 48
            if (r0 < r4) goto L83
            r4 = 57
            if (r0 > r4) goto L83
            int r3 = r3 * 10
            int r0 = r0 + (-48)
            int r4 = r2 + 32767
            int r3 = r3 + r0
            if (r3 <= r4) goto L6d
            goto L83
        L6d:
            if (r1 != r8) goto L78
            if (r2 == 0) goto L72
            int r3 = -r3
        L72:
            r8 = 13
            r6.v(r8, r7, r9, r3)
            return
        L78:
            java.lang.String r9 = r6.a
            int r0 = r1 + 1
            char r9 = r9.charAt(r1)
            r1 = r0
            r0 = r9
            goto L59
        L83:
            java.lang.String r0 = r6.a
            java.lang.String r8 = r0.substring(r7, r8)
            double r0 = java.lang.Double.parseDouble(r8)
            r6.p(r0, r7, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aq.q(int, int, boolean):void");
    }

    private final boolean r(int i) {
        return i > 0 || ((ap) this.b.get(0)).e == 1;
    }

    private final boolean s(int i) {
        char charAt = this.a.charAt(i);
        if (charAt != 's' && charAt != 'S') {
            return false;
        }
        char charAt2 = this.a.charAt(i + 1);
        if (charAt2 != 'e' && charAt2 != 'E') {
            return false;
        }
        int i2 = i + 3;
        char charAt3 = this.a.charAt(i + 2);
        if (charAt3 != 'l' && charAt3 != 'L') {
            return false;
        }
        int i3 = i + 4;
        char charAt4 = this.a.charAt(i2);
        if (charAt4 != 'e' && charAt4 != 'E') {
            return false;
        }
        int i4 = i + 5;
        char charAt5 = this.a.charAt(i3);
        if (charAt5 != 'c' && charAt5 != 'C') {
            return false;
        }
        char charAt6 = this.a.charAt(i4);
        return charAt6 == 't' || charAt6 == 'T';
    }

    /* JADX WARN: Code restructure failed: missing block: B:291:0x062b, code lost:
    
        if (r9 == r(r6)) goto L406;
     */
    /* JADX WARN: Code restructure failed: missing block: B:292:0x062d, code lost:
    
        if (r3 == false) goto L407;
     */
    /* JADX WARN: Code restructure failed: missing block: B:295:0x0667, code lost:
    
        throw new java.lang.IllegalArgumentException("Missing 'other' keyword in " + defpackage.an.a(r4).toLowerCase(java.util.Locale.ENGLISH) + " pattern in " + m());
     */
    /* JADX WARN: Code restructure failed: missing block: B:298:0x0691, code lost:
    
        throw new java.lang.IllegalArgumentException("Bad " + defpackage.an.a(r4).toLowerCase(java.util.Locale.ENGLISH) + " pattern syntax: " + n(r13));
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0097, code lost:
    
        v(3, r1, r9 ? 1 : 0, 0);
        r3 = r11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:127:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x06cc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:398:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0160  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int t(int r20, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 1889
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aq.t(int, int, int, int):int");
    }

    private final void u(int i, int i2, int i3, int i4, int i5) {
        ((ap) this.b.get(i)).d = this.b.size();
        v(i2, i3, i4, i5);
    }

    private final void v(int i, int i2, int i3, int i4) {
        this.b.add(new ap(i, i2, i3, i4));
    }

    public final double a(ap apVar) {
        int i = apVar.e;
        if (i == 13) {
            return apVar.c;
        }
        if (i == 14) {
            return ((Double) this.c.get(apVar.c)).doubleValue();
        }
        return -1.23456789E8d;
    }

    public final int b() {
        return this.b.size();
    }

    public final int c(int i) {
        int i2 = ((ap) this.b.get(i)).d;
        return i2 < i ? i : i2;
    }

    public final Object clone() {
        return e();
    }

    public final ap d(int i) {
        return (ap) this.b.get(i);
    }

    public final aq e() {
        try {
            aq aqVar = (aq) super.clone();
            aqVar.b = (ArrayList) this.b.clone();
            ArrayList arrayList = this.c;
            if (arrayList != null) {
                aqVar.c = (ArrayList) arrayList.clone();
            }
            aqVar.g = false;
            return aqVar;
        } catch (CloneNotSupportedException e2) {
            throw new ar(e2);
        }
    }

    public final boolean equals(Object obj) {
        String str;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        aq aqVar = (aq) obj;
        int i = this.f;
        int i2 = aqVar.f;
        if (i != 0) {
            return i == i2 && ((str = this.a) != null ? str.equals(aqVar.a) : aqVar.a == null) && this.b.equals(aqVar.b);
        }
        throw null;
    }

    public final String f(ap apVar) {
        int i = apVar.a;
        return this.a.substring(i, apVar.b + i);
    }

    public final boolean g(ap apVar, String str) {
        return this.a.regionMatches(apVar.a, str, 0, apVar.b);
    }

    public final int h(int i) {
        return ((ap) this.b.get(i)).e;
    }

    public final int hashCode() {
        int i = this.f;
        if (i == 0) {
            throw null;
        }
        int i2 = i * 37;
        String str = this.a;
        return ((i2 + (str != null ? str.hashCode() : 0)) * 37) + this.b.hashCode();
    }

    public final void i(String str) {
        this.a = str;
        this.d = false;
        this.b.clear();
        ArrayList arrayList = this.c;
        if (arrayList != null) {
            arrayList.clear();
        }
        t(0, 0, 0, 1);
    }

    public final String toString() {
        return this.a;
    }

    public aq(String str) {
        i(str);
    }
}
