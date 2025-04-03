package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes6.dex */
public class ffmm extends ffml {
    public static final double a(double d, double d2) {
        return d < d2 ? d2 : d;
    }

    public static final double b(double d, double d2, double d3) {
        if (d2 <= d3) {
            return d < d2 ? d2 : d > d3 ? d3 : d;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d3 + " is less than minimum " + d2 + ".");
    }

    public static final float c(float f, float f2) {
        return f < f2 ? f2 : f;
    }

    public static final float d(float f, float f2) {
        return f > f2 ? f2 : f;
    }

    public static final float e(float f, float f2, float f3) {
        if (f2 <= f3) {
            return f < f2 ? f2 : f > f3 ? f3 : f;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f3 + " is less than minimum " + f2 + ".");
    }

    public static final int f(int i, int i2) {
        return i < i2 ? i2 : i;
    }

    public static final int g(int i, int i2) {
        return i > i2 ? i2 : i;
    }

    public static final int h(int i, ffmg ffmgVar) {
        ffmgVar.getClass();
        if (ffmgVar.a()) {
            throw new IllegalArgumentException(a.i(ffmgVar, "Cannot coerce value to an empty range: ", "."));
        }
        ffmj ffmjVar = (ffmj) ffmgVar;
        return i < ffmjVar.d().intValue() ? ffmjVar.d().intValue() : i > ffmjVar.c().intValue() ? ffmjVar.c().intValue() : i;
    }

    public static final int i(int i, int i2, int i3) {
        if (i2 <= i3) {
            return i < i2 ? i2 : i > i3 ? i3 : i;
        }
        throw new IllegalArgumentException(a.x(i2, i3, "Cannot coerce value to an empty range: maximum ", " is less than minimum ", "."));
    }

    public static final long j(long j, long j2) {
        return j < j2 ? j2 : j;
    }

    public static final long k(long j, long j2) {
        return j > j2 ? j2 : j;
    }

    public static final long l(long j, long j2, long j3) {
        if (j2 <= j3) {
            return j < j2 ? j2 : j > j3 ? j3 : j;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j3 + " is less than minimum " + j2 + ".");
    }

    public static final Comparable m(Comparable comparable, Comparable comparable2) {
        return comparable.compareTo(comparable2) < 0 ? comparable2 : comparable;
    }

    public static final Comparable n(Comparable comparable, Comparable comparable2) {
        comparable.getClass();
        return comparable.compareTo(comparable2) > 0 ? comparable2 : comparable;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003b A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Comparable o(java.lang.Comparable r3, java.lang.Comparable r4, java.lang.Comparable r5) {
        /*
            if (r4 == 0) goto L28
            if (r5 == 0) goto L28
            int r0 = r4.compareTo(r5)
            if (r0 > 0) goto L18
            int r0 = r3.compareTo(r4)
            if (r0 >= 0) goto L11
            goto L31
        L11:
            int r4 = r3.compareTo(r5)
            if (r4 <= 0) goto L3b
            goto L3a
        L18:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Cannot coerce value to an empty range: maximum "
            java.lang.String r1 = " is less than minimum "
            java.lang.String r2 = "."
            java.lang.String r4 = defpackage.a.k(r4, r5, r0, r1, r2)
            r3.<init>(r4)
            throw r3
        L28:
            if (r4 == 0) goto L32
            int r0 = r3.compareTo(r4)
            if (r0 < 0) goto L31
            goto L32
        L31:
            return r4
        L32:
            if (r5 == 0) goto L3b
            int r4 = r3.compareTo(r5)
            if (r4 <= 0) goto L3b
        L3a:
            return r5
        L3b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ffmm.o(java.lang.Comparable, java.lang.Comparable, java.lang.Comparable):java.lang.Comparable");
    }

    public static final ffmh p(ffmh ffmhVar, int i) {
        ffmhVar.getClass();
        if (ffmhVar.c <= 0) {
            i = -i;
        }
        return new ffmh(ffmhVar.a, ffmhVar.b, i);
    }

    public static final ffmj q(int i, int i2) {
        return i2 <= Integer.MIN_VALUE ? ffmj.d : new ffmj(i, i2 - 1);
    }

    public static final boolean r(ffmg ffmgVar, long j) {
        Integer valueOf = j < 2147483648L ? Integer.valueOf((int) j) : null;
        if (valueOf != null) {
            return ((ffmj) ffmgVar).e(valueOf.intValue());
        }
        return false;
    }

    public static final Comparable s(Comparable comparable, ffmf ffmfVar) {
        if (ffmfVar.a()) {
            throw new IllegalArgumentException(a.i(ffmfVar, "Cannot coerce value to an empty range: ", "."));
        }
        return (!ffmf.e(comparable, ffmfVar.c()) || ffmf.e(ffmfVar.c(), comparable)) ? (!ffmf.e(ffmfVar.b(), comparable) || ffmf.e(comparable, ffmfVar.b())) ? comparable : ffmfVar.b() : ffmfVar.c();
    }
}
