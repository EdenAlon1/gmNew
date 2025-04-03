package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffqd {
    public static final long a(long j) {
        return j < 0 ? ffpw.b : ffpw.a;
    }

    public static final long b(long j, long j2, ffpz ffpzVar) {
        long j3 = j - j2;
        if (((~(j3 ^ j2)) & (j3 ^ j)) >= 0) {
            return ffpy.e(j3, ffpzVar);
        }
        if (ffpzVar.compareTo(ffpz.c) >= 0) {
            return ffpw.l(a(j3));
        }
        long a = ffqa.a(1L, ffpz.c, ffpzVar);
        long j4 = (j / a) - (j2 / a);
        long j5 = (j % a) - (j2 % a);
        long j6 = ffpw.a;
        return ffpw.j(ffpy.e(j4, ffpz.c), ffpy.e(j5, ffpzVar));
    }
}
