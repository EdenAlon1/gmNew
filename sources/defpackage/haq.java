package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class haq {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final long e;

    public haq(int i, int i2, int i3, int i4, long j) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof haq)) {
            return false;
        }
        haq haqVar = (haq) obj;
        return this.a == haqVar.a && this.b == haqVar.b && this.c == haqVar.c && this.d == haqVar.d && this.e == haqVar.e;
    }

    public final int hashCode() {
        long j = this.e;
        return (((((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d) * 31) + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "CalendarMonth(year=" + this.a + ", month=" + this.b + ", numberOfDays=" + this.c + ", daysFromStartOfWeekToFirstOfMonth=" + this.d + ", startUtcTimeMillis=" + this.e + ')';
    }
}
