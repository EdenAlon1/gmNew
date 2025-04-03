package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class min {
    public static final min a;
    public static final min b;
    public final long c;
    public final long d;

    static {
        min minVar = new min(0L, 0L);
        a = minVar;
        new min(Long.MAX_VALUE, Long.MAX_VALUE);
        new min(Long.MAX_VALUE, 0L);
        new min(0L, Long.MAX_VALUE);
        b = minVar;
    }

    public min(long j, long j2) {
        lti.a(j >= 0);
        lti.a(j2 >= 0);
        this.c = j;
        this.d = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            min minVar = (min) obj;
            if (this.c == minVar.c && this.d == minVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.c) * 31) + ((int) this.d);
    }
}
