package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffcw {
    public static final double a(long j) {
        return j + eobe.a;
    }

    public static final String b(long j, int i) {
        if (j >= 0) {
            String l = Long.toString(j, i);
            l.getClass();
            return l;
        }
        long j2 = i;
        long j3 = (j >>> 1) / j2;
        long j4 = j3 + j3;
        long j5 = j - (j4 * j2);
        if (j5 >= j2) {
            j4++;
            j5 -= j2;
        }
        String l2 = Long.toString(j4, i);
        l2.getClass();
        String l3 = Long.toString(j5, i);
        l3.getClass();
        return l2.concat(l3);
    }
}
