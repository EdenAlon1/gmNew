package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class enxr extends Number {
    private static final double b;
    private static final long serialVersionUID = 1;
    public final double[] a;

    static {
        double d = 1.0d;
        do {
            d *= 0.5d;
        } while (d + 1.0d != 1.0d);
        b = (1 << ((((int) Math.round((-Math.log(d)) / Math.log(2.0d))) + 1) / 2)) + 1;
    }

    private enxr(double... dArr) {
        this.a = dArr;
    }

    public static enxr c(double d, double d2) {
        double e = e(d2);
        double d3 = d * d2;
        double f = f(d, e, d2 - e, d3);
        if (j(d, d2, d3, f)) {
            throw new ArithmeticException("twoProductError underflowed");
        }
        return new enxr(f, d3);
    }

    private static double e(double d) {
        double d2 = b * d;
        return d2 - (d2 - d);
    }

    private static double f(double d, double d2, double d3, double d4) {
        double e = e(d);
        double d5 = d - e;
        double d6 = e * d2;
        return (d3 * d5) - (((d4 - d6) - (d5 * d2)) - (e * d3));
    }

    private static double g(double d, double d2, double d3) {
        double d4 = d3 - d;
        return (d - (d3 - d4)) + (d2 - d4);
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static defpackage.enxr h(defpackage.enxr r27, defpackage.enxr r28, boolean r29) {
        /*
            Method dump skipped, instructions count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.enxr.h(enxr, enxr, boolean):enxr");
    }

    private static boolean i(double d, double d2) {
        return ((d2 > d ? 1 : (d2 == d ? 0 : -1)) > 0) == ((d2 > (-d) ? 1 : (d2 == (-d) ? 0 : -1)) > 0);
    }

    private static boolean j(double d, double d2, double d3, double d4) {
        if (d4 == 0.0d) {
            boolean z = d == d3 || d2 == d3;
            boolean z2 = (d == 1.0d || d2 == 1.0d) ? false : true;
            boolean z3 = (d == 0.0d || d2 == 0.0d) ? false : true;
            if (z && z2) {
                if (z3) {
                    return true;
                }
            } else if (z3 && d3 == 0.0d) {
                return true;
            }
        }
        return false;
    }

    private static double[] k(double[] dArr, int i) {
        double[] dArr2 = new double[i];
        for (int i2 = 0; i2 < i; i2++) {
            dArr2[i2] = dArr[i2];
        }
        return dArr2;
    }

    public final enxr a(enxr enxrVar) {
        return h(this, enxrVar, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0080, code lost:
    
        if (r1 == 0) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.enxr b(double r29) {
        /*
            r28 = this;
            r0 = r28
            double[] r1 = r0.a
            int r2 = r1.length
            int r2 = r2 + r2
            double[] r3 = new double[r2]
            double r6 = e(r29)
            double r8 = r29 - r6
            r12 = 0
            r13 = r1[r12]
            double r17 = r13 * r29
            r4 = r13
            r10 = r17
            double r19 = f(r4, r6, r8, r10)
            r15 = r29
            boolean r1 = j(r13, r15, r17, r19)
            java.lang.String r13 = "twoProductError underflowed"
            if (r1 != 0) goto L94
            r14 = 0
            int r1 = (r19 > r14 ? 1 : (r19 == r14 ? 0 : -1))
            r4 = 1
            if (r1 == 0) goto L2f
            r3[r12] = r19
            r1 = r4
            goto L30
        L2f:
            r1 = r12
        L30:
            r16 = r17
        L32:
            double[] r5 = r0.a
            int r10 = r5.length
            if (r4 >= r10) goto L7c
            r10 = r5[r4]
            r19 = r4
            r18 = r5
            r4 = r10
            double r10 = r4 * r29
            r27 = r19
            double r25 = f(r4, r6, r8, r10)
            r19 = r18[r12]
            r21 = r29
            r23 = r16
            boolean r4 = j(r19, r21, r23, r25)
            r18 = r25
            if (r4 != 0) goto L76
            double r20 = r16 + r18
            double r4 = g(r16, r18, r20)
            int r16 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r16 == 0) goto L64
            int r16 = r1 + 1
            r3[r1] = r4
            r1 = r16
        L64:
            double r16 = r10 + r20
            double r4 = r16 - r10
            double r20 = r20 - r4
            int r4 = (r20 > r14 ? 1 : (r20 == r14 ? 0 : -1))
            if (r4 == 0) goto L73
            int r4 = r1 + 1
            r3[r1] = r20
            r1 = r4
        L73:
            int r4 = r27 + 1
            goto L32
        L76:
            java.lang.ArithmeticException r1 = new java.lang.ArithmeticException
            r1.<init>(r13)
            throw r1
        L7c:
            int r4 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1))
            if (r4 != 0) goto L83
            if (r1 != 0) goto L88
            goto L84
        L83:
            r12 = r1
        L84:
            int r1 = r12 + 1
            r3[r12] = r16
        L88:
            if (r2 <= r1) goto L8e
            double[] r3 = k(r3, r1)
        L8e:
            enxr r1 = new enxr
            r1.<init>(r3)
            return r1
        L94:
            java.lang.ArithmeticException r1 = new java.lang.ArithmeticException
            r1.<init>(r13)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.enxr.b(double):enxr");
    }

    public final enxr d(enxr enxrVar) {
        return h(this, enxrVar, true);
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        double d = 0.0d;
        for (double d2 : this.a) {
            d += d2;
        }
        return d;
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return (float) doubleValue();
    }

    @Override // java.lang.Number
    public final int intValue() {
        return (int) longValue();
    }

    @Override // java.lang.Number
    public final long longValue() {
        return Math.round(doubleValue());
    }

    public final String toString() {
        return Double.toString(doubleValue());
    }
}
