package defpackage;

import j$.util.Objects;
import java.math.BigDecimal;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qbw {
    private static final BigDecimal a = new BigDecimal(20);
    private static final BigDecimal b = new BigDecimal(90);
    private static final BigDecimal c = new BigDecimal(180);
    private static final BigDecimal d = new BigDecimal(4);
    private static final BigDecimal e = new BigDecimal(5);
    private final String f;

    public qbw(double d2, double d3) {
        BigDecimal bigDecimal;
        int min = Math.min(12, 15);
        if (min < 4 || (min < 10 && (min & 1) == 1)) {
            throw new IllegalArgumentException(a.h(min, "Illegal code length "));
        }
        BigDecimal bigDecimal2 = b;
        double min2 = Math.min(Math.max(d2, -bigDecimal2.intValue()), bigDecimal2.intValue());
        double d4 = d3;
        while (true) {
            BigDecimal bigDecimal3 = c;
            if (d4 >= (-bigDecimal3.intValue())) {
                break;
            }
            int intValue = bigDecimal3.intValue();
            d4 += intValue + intValue;
        }
        while (true) {
            bigDecimal = c;
            if (d4 < bigDecimal.intValue()) {
                break;
            }
            int intValue2 = bigDecimal.intValue();
            d4 -= intValue2 + intValue2;
        }
        BigDecimal bigDecimal4 = b;
        if (min2 == bigDecimal4.doubleValue()) {
            min2 -= (min <= 10 ? Math.pow(a.intValue(), Math.floor((min / (-2)) + 2)) : Math.pow(a.intValue(), -3.0d) / Math.pow(e.intValue(), min - 10)) * 0.9d;
        }
        BigDecimal bigDecimal5 = new BigDecimal(min2 + bigDecimal4.doubleValue());
        BigDecimal bigDecimal6 = new BigDecimal(d4 + bigDecimal.doubleValue());
        StringBuilder sb = new StringBuilder();
        BigDecimal bigDecimal7 = a;
        BigDecimal multiply = bigDecimal7.multiply(bigDecimal7);
        BigDecimal multiply2 = bigDecimal7.multiply(bigDecimal7);
        int i = 0;
        while (i < min) {
            if (i < 10) {
                BigDecimal bigDecimal8 = a;
                multiply = multiply.divide(bigDecimal8);
                multiply2 = multiply2.divide(bigDecimal8);
                BigDecimal divide = bigDecimal5.divide(multiply, 0, 3);
                BigDecimal divide2 = bigDecimal6.divide(multiply2, 0, 3);
                bigDecimal5 = bigDecimal5.subtract(multiply.multiply(divide));
                bigDecimal6 = bigDecimal6.subtract(multiply2.multiply(divide2));
                sb.append("23456789CFGHJMPQRVWX".charAt(divide.intValue()));
                sb.append("23456789CFGHJMPQRVWX".charAt(divide2.intValue()));
                i += 2;
            } else {
                multiply = multiply.divide(e);
                BigDecimal bigDecimal9 = d;
                multiply2 = multiply2.divide(bigDecimal9);
                BigDecimal divide3 = bigDecimal5.divide(multiply, 0, 3);
                BigDecimal divide4 = bigDecimal6.divide(multiply2, 0, 3);
                bigDecimal5 = bigDecimal5.subtract(multiply.multiply(divide3));
                bigDecimal6 = bigDecimal6.subtract(multiply2.multiply(divide4));
                sb.append("23456789CFGHJMPQRVWX".charAt((divide3.intValue() * bigDecimal9.intValue()) + divide4.intValue()));
                i++;
            }
            if (i == 8) {
                sb.append('+');
            }
        }
        if (i < 8) {
            while (i < 8) {
                sb.append('0');
                i++;
            }
            sb.append('+');
        }
        this.f = sb.toString();
    }

    public final qbv a() {
        try {
            if (new qbw(this.f).b()) {
                String replace = this.f.replace("+", "").replace("0", "");
                BigDecimal bigDecimal = a;
                BigDecimal multiply = bigDecimal.multiply(bigDecimal);
                BigDecimal multiply2 = bigDecimal.multiply(bigDecimal);
                BigDecimal bigDecimal2 = BigDecimal.ZERO;
                BigDecimal bigDecimal3 = BigDecimal.ZERO;
                int i = 0;
                while (i < Math.min(replace.length(), 15)) {
                    int i2 = i + 1;
                    if (i < 10) {
                        BigDecimal bigDecimal4 = a;
                        multiply = multiply.divide(bigDecimal4);
                        multiply2 = multiply2.divide(bigDecimal4);
                        bigDecimal2 = bigDecimal2.add(multiply.multiply(new BigDecimal("23456789CFGHJMPQRVWX".indexOf(replace.charAt(i)))));
                        bigDecimal3 = bigDecimal3.add(multiply2.multiply(new BigDecimal("23456789CFGHJMPQRVWX".indexOf(replace.charAt(i2)))));
                        i += 2;
                    } else {
                        int indexOf = "23456789CFGHJMPQRVWX".indexOf(replace.charAt(i));
                        BigDecimal bigDecimal5 = d;
                        int intValue = indexOf / bigDecimal5.intValue();
                        int intValue2 = indexOf % bigDecimal5.intValue();
                        multiply = multiply.divide(e);
                        multiply2 = multiply2.divide(bigDecimal5);
                        bigDecimal2 = bigDecimal2.add(multiply.multiply(new BigDecimal(intValue)));
                        bigDecimal3 = bigDecimal3.add(multiply2.multiply(new BigDecimal(intValue2)));
                        i = i2;
                    }
                }
                BigDecimal bigDecimal6 = b;
                BigDecimal subtract = bigDecimal2.subtract(bigDecimal6);
                BigDecimal bigDecimal7 = c;
                return new qbv(subtract, bigDecimal3.subtract(bigDecimal7), bigDecimal2.subtract(bigDecimal6).add(multiply), bigDecimal3.subtract(bigDecimal7).add(multiply2));
            }
        } catch (IllegalArgumentException unused) {
        }
        throw new IllegalStateException("Method decode() could only be called on valid full codes, code was " + this.f + ".");
    }

    public final boolean b() {
        return this.f.indexOf(43) == 8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f, ((qbw) obj).f);
    }

    public final int hashCode() {
        String str = this.f;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return this.f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0051, code lost:
    
        if (r1 <= 17) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public qbw(java.lang.String r11) {
        /*
            r10 = this;
            r10.<init>()
            java.lang.String r0 = r11.toUpperCase()
            if (r0 == 0) goto Lac
            int r1 = r0.length()
            r2 = 2
            if (r1 < r2) goto Lac
            java.lang.String r0 = r0.toUpperCase()
            r1 = 43
            int r3 = r0.indexOf(r1)
            r4 = -1
            if (r3 == r4) goto Lac
            int r1 = r0.lastIndexOf(r1)
            if (r3 != r1) goto Lac
            int r1 = r3 % 2
            if (r1 != 0) goto Lac
            r1 = 8
            java.lang.String r5 = "23456789CFGHJMPQRVWX"
            r6 = 0
            r7 = 1
            if (r3 != r1) goto L53
            char r8 = r0.charAt(r6)
            int r8 = r5.indexOf(r8)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
            r9.getClass()
            if (r8 > r1) goto Lac
            char r1 = r0.charAt(r7)
            int r1 = r5.indexOf(r1)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r1)
            r8.getClass()
            r8 = 17
            if (r1 > r8) goto Lac
        L53:
            r1 = r6
            r8 = r1
        L55:
            if (r1 >= r3) goto L81
            r9 = 48
            if (r8 == 0) goto L63
            char r8 = r0.charAt(r1)
            if (r8 != r9) goto Lac
        L61:
            r8 = r7
            goto L7f
        L63:
            char r8 = r0.charAt(r1)
            int r8 = r5.indexOf(r8)
            if (r8 == r4) goto L6f
            r8 = r6
            goto L7f
        L6f:
            char r8 = r0.charAt(r1)
            if (r8 != r9) goto Lac
            if (r1 == r2) goto L61
            r8 = 4
            if (r1 == r8) goto L61
            r8 = 6
            if (r1 != r8) goto Lac
            r1 = r8
            goto L61
        L7f:
            int r1 = r1 + r7
            goto L55
        L81:
            int r1 = r0.length()
            int r6 = r3 + 1
            if (r1 <= r6) goto La5
            if (r8 != 0) goto Lac
            int r1 = r0.length()
            int r3 = r3 + r2
            if (r1 == r3) goto Lac
        L92:
            int r1 = r0.length()
            if (r6 >= r1) goto La5
            char r1 = r0.charAt(r6)
            int r1 = r5.indexOf(r1)
            if (r1 == r4) goto Lac
            int r6 = r6 + 1
            goto L92
        La5:
            java.lang.String r11 = r11.toUpperCase()
            r10.f = r11
            return
        Lac:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "The provided code '"
            java.lang.String r2 = "' is not a valid Open Location Code."
            java.lang.String r11 = defpackage.a.a(r11, r1, r2)
            r0.<init>(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qbw.<init>(java.lang.String):void");
    }
}
