package defpackage;

import j$.time.Duration;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cqfd {
    public final cqfe a;
    public final boolean b;
    public final Instant c;
    public final int d;
    public final int e;
    public final Duration f;
    public final Duration g;
    public final int h;
    public final int i;

    /* JADX WARN: Multi-variable type inference failed */
    public cqfd() {
        this(null, 0 == true ? 1 : 0, 511);
    }

    public static /* synthetic */ cqfd a(cqfd cqfdVar, cqfe cqfeVar) {
        boolean z = cqfdVar.b;
        Instant instant = cqfdVar.c;
        int i = cqfdVar.d;
        int i2 = cqfdVar.e;
        Duration duration = cqfdVar.f;
        Duration duration2 = cqfdVar.g;
        int i3 = cqfdVar.h;
        int i4 = cqfdVar.i;
        cqfeVar.getClass();
        return new cqfd(cqfeVar, z, instant, i, i2, duration, duration2, i3, i4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cqfd)) {
            return false;
        }
        cqfd cqfdVar = (cqfd) obj;
        return this.a == cqfdVar.a && this.b == cqfdVar.b && ffkj.e(this.c, cqfdVar.c) && this.d == cqfdVar.d && this.e == cqfdVar.e && ffkj.e(this.f, cqfdVar.f) && ffkj.e(this.g, cqfdVar.g) && this.h == cqfdVar.h && this.i == cqfdVar.i;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Instant instant = this.c;
        return ((((((((((((((hashCode + (true != this.b ? 1237 : 1231)) * 31) + (instant == null ? 0 : instant.hashCode())) * 31) + this.d) * 31) + this.e) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h) * 31) + this.i;
    }

    public final String toString() {
        return "BatchStats(status=" + this.a + ", isFinalBatch=" + this.b + ", lastScannedMessageTime=" + this.c + ", messagesSyncedCount=" + this.d + ", messagesUpdatedCount=" + this.e + ", transactionTime=" + this.f + ", totalBatchTime=" + this.g + ", remoteTotal=" + this.h + ", localTotal=" + this.i + ")";
    }

    public cqfd(cqfe cqfeVar, boolean z, Instant instant, int i, int i2, Duration duration, Duration duration2, int i3, int i4) {
        cqfeVar.getClass();
        duration.getClass();
        duration2.getClass();
        this.a = cqfeVar;
        this.b = z;
        this.c = instant;
        this.d = i;
        this.e = i2;
        this.f = duration;
        this.g = duration2;
        this.h = i3;
        this.i = i4;
    }

    public /* synthetic */ cqfd(cqfe cqfeVar, Duration duration, int i) {
        this((i & 1) != 0 ? cqfe.a : cqfeVar, false, null, 0, 0, (i & 32) != 0 ? Duration.ZERO : null, (i & 64) != 0 ? Duration.ZERO : duration, 0, 0);
    }
}
