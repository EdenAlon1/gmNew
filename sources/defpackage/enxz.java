package defpackage;

import com.android.vcard.VCardConfig;
import java.io.Serializable;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enxz implements Comparable<enxz>, Serializable, enyg {
    public static final enxz[] b;
    public static final emvz c;
    public final long d;
    private static final int[] e = new int[1024];
    private static final int[] f = new int[1024];
    public static final enxz a = new enxz(0);

    static {
        R(0, 0, 0, 0, 0, 0);
        R(0, 0, 0, 1, 0, 1);
        R(0, 0, 0, 2, 0, 2);
        R(0, 0, 0, 3, 0, 3);
        b = new enxz[6];
        for (int i = 0; i < 6; i++) {
            b[i] = r(i);
        }
        c = new emvp('0');
    }

    public enxz(long j) {
        this.d = j;
    }

    public static void A(int i, int i2, enxo enxoVar) {
        enxoVar.e(enzn.a(i, i2), enzn.a(i + i2, i2));
    }

    public static boolean F(long j) {
        return (j & (m(0) + (-1))) == 0;
    }

    public static boolean J(long j, long j2) {
        return j + Long.MIN_VALUE >= j2 + Long.MIN_VALUE;
    }

    public static boolean K(long j, long j2) {
        return j + Long.MIN_VALUE > j2 + Long.MIN_VALUE;
    }

    public static boolean L(long j, long j2) {
        return j + Long.MIN_VALUE <= j2 + Long.MIN_VALUE;
    }

    public static boolean M(long j, long j2) {
        return j + Long.MIN_VALUE < j2 + Long.MIN_VALUE;
    }

    public static enxz N(String str) {
        if (str != null && !str.isEmpty() && !str.equals("X")) {
            if (str.toLowerCase(Locale.ROOT).startsWith("0x")) {
                str = str.substring(2);
            }
            int length = str.length();
            if (length <= 16) {
                long j = 0;
                for (int i = 0; i < length; i++) {
                    int digit = Character.digit(str.charAt(i), 16);
                    if (digit != -1) {
                        j = (j * 16) + digit;
                    }
                }
                return new enxz(j << ((16 - length) * 4));
            }
        }
        return a;
    }

    private static final int O(int i, int i2, int i3, int i4) {
        int i5 = i3 * 4;
        return e[i4 + (((i >> i5) & 15) << 6) + (((i2 >> i5) & 15) << 2)];
    }

    private static final int P(int i) {
        return i & 3;
    }

    private static final long Q(long j, int i, int i2) {
        int i3 = i & 3;
        return j | ((i2 >> 2) << ((i3 + i3) * 4));
    }

    private static void R(int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = i5 << 2;
        if (i == 4) {
            int i8 = ((i2 << 4) + i3) << 2;
            e[i8 + i4] = i7 + i6;
            f[i7 + i4] = i8 + i6;
            return;
        }
        int i9 = i + 1;
        int i10 = i2 + i2;
        int i11 = i3 + i3;
        for (int i12 = 0; i12 < 4; i12++) {
            int a2 = enxw.a(i6, i12);
            R(i9, (a2 >>> 1) + i10, (a2 & 1) + i11, i4, i7 + i12, i6 ^ enxw.b(i12));
        }
    }

    public static int c(long j) {
        return (int) (j >>> 33);
    }

    public static int d(long j) {
        return (int) ((j >>> 2) & 2147483647L);
    }

    static int e(long j) {
        return (int) (j & 3);
    }

    static int f(long j) {
        return (int) (j >> 32);
    }

    public static int g(int i) {
        return 1 << (30 - i);
    }

    public static long i(int i) {
        return (i << 61) + m(0);
    }

    public static long m(int i) {
        int i2 = 30 - i;
        return 1 << (i2 + i2);
    }

    static long n(long j) {
        long lowestOneBit = Long.lowestOneBit(j) << 2;
        return (j & (-lowestOneBit)) | lowestOneBit;
    }

    static long o(long j) {
        return j + (Long.lowestOneBit(j) - 1);
    }

    static long p(long j) {
        return j - (Long.lowestOneBit(j) - 1);
    }

    public static enxz r(int i) {
        return new enxz(i(i));
    }

    public static enxz s(int i, int i2, int i3) {
        long j = i;
        int i4 = i & 1;
        long j2 = j << 28;
        for (int i5 = 7; i5 >= 4; i5--) {
            int O = O(i2, i3, i5, i4);
            j2 = Q(j2, i5, O);
            i4 = P(O);
        }
        long j3 = 0;
        for (int i6 = 3; i6 >= 0; i6--) {
            int O2 = O(i2, i3, i6, i4);
            j3 = Q(j3, i6, O2);
            i4 = P(O2);
        }
        long j4 = (j2 << 32) + j3;
        return new enxz(j4 + j4 + 1);
    }

    public static enxz t(int i, int i2, int i3, boolean z) {
        if (z) {
            return s(i, i2, i3);
        }
        int max = Math.max(-1, Math.min(1073741824, i2));
        int max2 = Math.max(-1, Math.min(1073741824, i3));
        double max3 = Math.max(-1.0000000000000002d, Math.min(1.0000000000000002d, (max + max + VCardConfig.VCARD_TYPE_V30_GENERIC) * 9.313225746154785E-10d));
        double max4 = Math.max(-1.0000000000000002d, Math.min(1.0000000000000002d, (max2 + max2 + VCardConfig.VCARD_TYPE_V30_GENERIC) * 9.313225746154785E-10d));
        enzm n = enzn.n(i);
        double a2 = n.a(max3, max4);
        double b2 = n.b(max3, max4);
        double c2 = n.c(max3, max4);
        int g = enzn.g(a2, b2, c2);
        enzl m = enzn.m(g);
        return s(g, enzn.e((m.a(a2, b2, c2) + 1.0d) * 0.5d), enzn.e((m.b(a2, b2, c2) + 1.0d) * 0.5d));
    }

    public static enxz u(enyr enyrVar) {
        int f2 = enzn.f(enyrVar);
        enzl m = enzn.m(f2);
        return s(f2, enzn.e(enzn.d(m.a(enyrVar.e, enyrVar.f, enyrVar.g))), enzn.e(enzn.d(m.b(enyrVar.e, enyrVar.f, enyrVar.g))));
    }

    public final boolean B(enxz enxzVar) {
        return J(enxzVar.d, p(this.d)) && L(enxzVar.d, o(this.d));
    }

    public final boolean C(enxz enxzVar) {
        return J(this.d, enxzVar.d);
    }

    public final boolean D(enxz enxzVar) {
        return K(this.d, enxzVar.d);
    }

    public final boolean E() {
        return F(this.d);
    }

    public final boolean G() {
        return (((int) this.d) & 1) != 0;
    }

    public final boolean H() {
        return b() < 6 && (l() & 1537228672809129301L) != 0;
    }

    public final boolean I(enxz enxzVar) {
        return L(this.d, enxzVar.d);
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(enxz enxzVar) {
        long j = this.d;
        long j2 = enxzVar.d;
        if (M(j, j2)) {
            return -1;
        }
        return !K(j, j2) ? 0 : 1;
    }

    public final int b() {
        return (int) (this.d >>> 61);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof enxz) && this.d == ((enxz) obj).d;
    }

    public final int h() {
        if (G()) {
            return 30;
        }
        return 30 - (Long.numberOfTrailingZeros(this.d) >> 1);
    }

    public final int hashCode() {
        long j = this.d;
        return (int) ((j >>> 32) + j);
    }

    public final long j() {
        long q = q();
        int c2 = c(q);
        int d = d(q);
        int i = G() ? 1 : (((((int) this.d) >>> 2) ^ c2) & 1) != 0 ? 2 : 0;
        return (((c2 + c2) + i) << 32) | ((d + d + i) & 4294967295L);
    }

    @Override // defpackage.enyg
    public final long k() {
        return this.d;
    }

    public final long l() {
        return Long.lowestOneBit(this.d);
    }

    public final long q() {
        int b2 = b() & 1;
        int i = 0;
        int i2 = 7;
        int i3 = 0;
        while (i2 >= 0) {
            int i4 = i2 == 7 ? 2 : 4;
            int i5 = f[b2 + ((((1 << (i4 + i4)) - 1) & ((int) (this.d >>> (((i2 + i2) * 4) + 1)))) << 2)];
            int i6 = i2 * 4;
            i += (i5 >> 6) << i6;
            i3 += ((i5 >> 2) & 15) << i6;
            b2 = P(i5);
            i2--;
        }
        if ((l() & 1229782938247303440L) != 0) {
            b2 ^= 1;
        }
        return (i << 33) | (i3 << 2) | b2;
    }

    public final String toString() {
        long j = this.d & 2305843009213693951L;
        return "(face=" + b() + ", pos=" + Long.toHexString(j) + ", level=" + h() + ")";
    }

    public final enxz v() {
        long l = l();
        return new enxz(this.d + l + l);
    }

    public final enxz w(int i) {
        long m = m(i);
        return new enxz(m | (this.d & (-m)));
    }

    public final enxz x() {
        return new enxz(o(this.d));
    }

    public final enxz y() {
        return new enxz(p(this.d));
    }

    public final enyr z() {
        long j = j();
        return enzn.h(b(), f(j), (int) j);
    }

    public enxz() {
        this(0L);
    }
}
