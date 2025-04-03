package defpackage;

import j$.time.Duration;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cqer {
    public final Instant a;
    public final Duration b;
    public final int c;
    public final int d;
    public final int e;

    public cqer(Instant instant, Duration duration, int i, int i2, int i3) {
        this.a = instant;
        this.b = duration;
        this.c = i;
        this.d = i2;
        this.e = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cqer)) {
            return false;
        }
        cqer cqerVar = (cqer) obj;
        return ffkj.e(this.a, cqerVar.a) && ffkj.e(this.b, cqerVar.b) && this.c == cqerVar.c && this.d == cqerVar.d && this.e == cqerVar.e;
    }

    public final int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c) * 31) + this.d) * 31) + this.e;
    }

    public final String toString() {
        return "SyncCursorPairResults(lastScannedMessageTimestamp=" + this.a + ", txnDurationMillis=" + this.b + ", messagesSyncedCount=" + this.c + ", localTotal=" + this.d + ", remoteTotal=" + this.e + ")";
    }
}
