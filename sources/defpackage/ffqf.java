package defpackage;

/* compiled from: PG */
@ffiv
/* loaded from: classes6.dex */
public final class ffqf implements Comparable {
    private final long a;

    public static long b(long j) {
        int i = ffqe.a;
        long b = ffqe.b();
        ffpz ffpzVar = ffpz.a;
        ffpzVar.getClass();
        return (((-1) + j) | 1) == Long.MAX_VALUE ? ffpw.l(ffqd.a(j)) : ffqd.b(b, j, ffpzVar);
    }

    public static final long c(long j, long j2) {
        int i = ffqe.a;
        ffpz ffpzVar = ffpz.a;
        ffpzVar.getClass();
        if (((j2 - 1) | 1) != Long.MAX_VALUE) {
            return (((-1) + j) | 1) == Long.MAX_VALUE ? ffqd.a(j) : ffqd.b(j, j2, ffpzVar);
        }
        if (j != j2) {
            return ffpw.l(ffqd.a(j2));
        }
        long j3 = ffpw.a;
        return 0L;
    }

    public final long a() {
        return b(this.a);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        ffqf ffqfVar = (ffqf) obj;
        ffqfVar.getClass();
        long c = c(this.a, ffqfVar.a);
        long j = ffpw.a;
        return ffpw.a(c, 0L);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ffqf) && this.a == ((ffqf) obj).a;
    }

    public final int hashCode() {
        long j = this.a;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return "ValueTimeMark(reading=" + this.a + ")";
    }
}
