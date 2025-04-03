package defpackage;

/* compiled from: PG */
@ffiv
/* loaded from: classes6.dex */
public final class ffpw implements Comparable {
    public static final long a;
    public static final long b;
    public final long c;

    static {
        int i = ffpx.a;
        a = ffpy.a(4611686018427387903L);
        b = ffpy.a(-4611686018427387903L);
    }

    public static int a(long j, long j2) {
        long j3 = j ^ j2;
        if (j3 < 0 || (((int) j3) & 1) == 0) {
            return ffkj.b(j, j2);
        }
        int i = (((int) j) & 1) - (((int) j2) & 1);
        return r(j) ? -i : i;
    }

    public static final int b(long j) {
        if (q(j)) {
            return 0;
        }
        return (int) (k(j, ffpz.f) % 24);
    }

    public static final int c(long j) {
        if (q(j)) {
            return 0;
        }
        return (int) (k(j, ffpz.e) % 60);
    }

    public static final int d(long j) {
        if (q(j)) {
            return 0;
        }
        boolean t = t(j);
        long i = i(j);
        return (int) (t ? ffpy.b(i % 1000) : i % 1000000000);
    }

    public static final int e(long j) {
        if (q(j)) {
            return 0;
        }
        return (int) (h(j) % 60);
    }

    public static final long f(long j) {
        return k(j, ffpz.g);
    }

    public static final long g(long j) {
        return (t(j) && o(j)) ? i(j) : k(j, ffpz.c);
    }

    public static final long h(long j) {
        return k(j, ffpz.d);
    }

    public static final long i(long j) {
        return j >> 1;
    }

    public static final long j(long j, long j2) {
        if (q(j)) {
            if (o(j2) || (j2 ^ j) >= 0) {
                return j;
            }
            throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
        }
        if (q(j2)) {
            return j2;
        }
        if ((((int) j) & 1) != (((int) j2) & 1)) {
            return t(j) ? u(i(j), i(j2)) : u(i(j2), i(j));
        }
        long i = i(j) + i(j2);
        if (p(j)) {
            if (i < -4611686018426999999L || i >= 4611686018427000000L) {
                return ffpy.a(ffpy.c(i));
            }
            int i2 = ffpx.a;
            return i + i;
        }
        if (i < -4611686018426L || i >= 4611686018427L) {
            return ffpy.a(ffmk.l(i, -4611686018427387903L, 4611686018427387903L));
        }
        int i3 = ffpx.a;
        long b2 = ffpy.b(i);
        return b2 + b2;
    }

    public static final long k(long j, ffpz ffpzVar) {
        ffpzVar.getClass();
        if (j == a) {
            return Long.MAX_VALUE;
        }
        if (j == b) {
            return Long.MIN_VALUE;
        }
        return ffqa.a(i(j), p(j) ? ffpz.a : ffpz.c, ffpzVar);
    }

    public static final long l(long j) {
        int i = ffpx.a;
        int i2 = ((int) j) & 1;
        long j2 = -i(j);
        return j2 + j2 + i2;
    }

    public static String m(long j) {
        boolean z;
        int i;
        if (j == 0) {
            return "0s";
        }
        if (j == a) {
            return "Infinity";
        }
        if (j == b) {
            return "-Infinity";
        }
        StringBuilder sb = new StringBuilder();
        boolean r = r(j);
        if (r) {
            sb.append('-');
        }
        if (r(j)) {
            j = l(j);
        }
        long f = f(j);
        int i2 = 0;
        boolean z2 = f != 0;
        int b2 = b(j);
        boolean z3 = b2 != 0;
        int c = c(j);
        boolean z4 = c != 0;
        int e = e(j);
        int d = d(j);
        if (e != 0) {
            z = true;
        } else if (d != 0) {
            z = true;
            e = 0;
        } else {
            d = 0;
            z = false;
            e = 0;
        }
        if (z2) {
            sb.append(f);
            sb.append('d');
            i = 1;
        } else {
            i = 0;
        }
        if (z3 || (z2 && (z4 || z))) {
            int i3 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(b2);
            sb.append('h');
            i = i3;
        }
        if (z4 || (z && (z3 || z2))) {
            int i4 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(c);
            sb.append('m');
            i = i4;
        }
        if (z) {
            int i5 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            if (e != 0) {
                i2 = e;
            } else if (!z2 && !z3 && !z4) {
                if (d >= 1000000) {
                    s(sb, d / 1000000, d % 1000000, 6, "ms");
                } else if (d >= 1000) {
                    s(sb, d / 1000, d % 1000, 3, "us");
                } else {
                    sb.append(d);
                    sb.append("ns");
                }
                i = i5;
            }
            s(sb, i2, d, 9, "s");
            i = i5;
        }
        if (r && i > 1) {
            sb.insert(1, '(').append(')');
        }
        return sb.toString();
    }

    public static final boolean n(long j, long j2) {
        return j == j2;
    }

    public static final boolean o(long j) {
        return !q(j);
    }

    public static final boolean p(long j) {
        return (((int) j) & 1) == 0;
    }

    public static final boolean q(long j) {
        return j == a || j == b;
    }

    public static final boolean r(long j) {
        return j < 0;
    }

    public static final void s(StringBuilder sb, int i, int i2, int i3, String str) {
        sb.append(i);
        if (i2 != 0) {
            sb.append('.');
            String S = ffpc.S(String.valueOf(i2), i3);
            int i4 = -1;
            int length = S.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i5 = length - 1;
                    if (S.charAt(length) != '0') {
                        i4 = length;
                        break;
                    } else if (i5 < 0) {
                        break;
                    } else {
                        length = i5;
                    }
                }
            }
            int i6 = i4 + 1;
            if (i6 < 3) {
                sb.append((CharSequence) S, 0, i6);
            } else {
                sb.append((CharSequence) S, 0, ((i4 + 3) / 3) * 3);
            }
        }
        sb.append(str);
    }

    private static final boolean t(long j) {
        return (((int) j) & 1) == 1;
    }

    private static final long u(long j, long j2) {
        long c = ffpy.c(j2);
        long j3 = j + c;
        if (j3 < -4611686018426L || j3 >= 4611686018427L) {
            return ffpy.a(ffmk.l(j3, -4611686018427387903L, 4611686018427387903L));
        }
        long b2 = j2 - ffpy.b(c);
        int i = ffpx.a;
        long b3 = ffpy.b(j3) + b2;
        return b3 + b3;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return a(this.c, ((ffpw) obj).c);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ffpw) && this.c == ((ffpw) obj).c;
    }

    public final int hashCode() {
        return ffpv.a(this.c);
    }

    public final String toString() {
        return m(this.c);
    }
}
