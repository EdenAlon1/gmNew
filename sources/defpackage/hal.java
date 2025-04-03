package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hal implements Comparable {
    public final int a;
    public final int b;
    public final long c;
    private final int d;

    public hal(int i, int i2, int i3, long j) {
        this.a = i;
        this.b = i2;
        this.d = i3;
        this.c = j;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return ffkj.b(this.c, ((hal) obj).c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hal)) {
            return false;
        }
        hal halVar = (hal) obj;
        return this.a == halVar.a && this.b == halVar.b && this.d == halVar.d && this.c == halVar.c;
    }

    public final int hashCode() {
        long j = this.c;
        return (((((this.a * 31) + this.b) * 31) + this.d) * 31) + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "CalendarDate(year=" + this.a + ", month=" + this.b + ", dayOfMonth=" + this.d + ", utcTimeMillis=" + this.c + ')';
    }
}
