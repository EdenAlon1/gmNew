package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class akzo {
    public final long a;
    public final long b;

    public akzo(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public static final long a(long j) {
        return TimeUnit.HOURS.toMillis(TimeUnit.MILLISECONDS.toHours(j));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof akzo)) {
            return false;
        }
        akzo akzoVar = (akzo) obj;
        return this.a == akzoVar.a && this.b == akzoVar.b;
    }

    public final int hashCode() {
        return (akzm.a(this.a) * 31) + akzm.a(this.b);
    }

    public final String toString() {
        return "ClearcutLogTimestamp(millis=" + this.a + ", elapsedMillis=" + this.b + ")";
    }
}
