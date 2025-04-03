package j$.util.stream;

import j$.util.Spliterator;

/* loaded from: classes9.dex */
abstract class F2 {
    static long a(long j, long j2, long j3) {
        if (j >= 0) {
            return Math.max(-1L, Math.min(j - j2, j3));
        }
        return -1L;
    }

    static long b(long j, long j2) {
        long j3 = j2 >= 0 ? j + j2 : Long.MAX_VALUE;
        if (j3 >= 0) {
            return j3;
        }
        return Long.MAX_VALUE;
    }

    static Spliterator c(EnumC0129o3 enumC0129o3, Spliterator spliterator, long j, long j2) {
        long j3 = j2 >= 0 ? j + j2 : Long.MAX_VALUE;
        long j4 = j3 >= 0 ? j3 : Long.MAX_VALUE;
        int i = D2.a[enumC0129o3.ordinal()];
        if (i == 1) {
            return new I3(spliterator, j, j4);
        }
        if (i == 2) {
            return new F3((Spliterator.OfInt) spliterator, j, j4);
        }
        if (i == 3) {
            return new G3((Spliterator.OfLong) spliterator, j, j4);
        }
        if (i == 4) {
            return new E3((j$.util.V) spliterator, j, j4);
        }
        throw new IllegalStateException("Unknown shape ".concat(String.valueOf(enumC0129o3)));
    }

    private static int d(long j) {
        return (j != -1 ? EnumC0124n3.u : 0) | EnumC0124n3.t;
    }

    public static DoubleStream e(A a, long j, long j2) {
        if (j >= 0) {
            return new C2(a, d(j2), j, j2);
        }
        throw new IllegalArgumentException("Skip must be non-negative: " + j);
    }

    public static IntStream f(AbstractC0081f0 abstractC0081f0, long j, long j2) {
        if (j >= 0) {
            return new C0177y2(abstractC0081f0, d(j2), j, j2);
        }
        throw new IllegalArgumentException("Skip must be non-negative: " + j);
    }

    public static LongStream g(AbstractC0126o0 abstractC0126o0, long j, long j2) {
        if (j >= 0) {
            return new A2(abstractC0126o0, d(j2), j, j2);
        }
        throw new IllegalArgumentException("Skip must be non-negative: " + j);
    }

    public static Stream h(AbstractC0118m2 abstractC0118m2, long j, long j2) {
        if (j >= 0) {
            return new C0167w2(abstractC0118m2, d(j2), j, j2);
        }
        throw new IllegalArgumentException("Skip must be non-negative: " + j);
    }
}
