package defpackage;

import j$.time.Instant;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cqiz implements cqjb {
    public final Instant a;
    public final Instant b;
    private final int c;
    private final UUID d;
    private final UUID e;

    public cqiz(Instant instant, Instant instant2, int i, UUID uuid, UUID uuid2) {
        instant.getClass();
        instant2.getClass();
        this.a = instant;
        this.b = instant2;
        this.c = i;
        this.d = uuid;
        this.e = uuid2;
    }

    @Override // defpackage.cqjb
    public final int a() {
        return this.c;
    }

    @Override // defpackage.cqjb
    public final cqai b(cqaj cqajVar) {
        return cqajVar.a(this.b.toEpochMilli(), this.a.toEpochMilli());
    }

    @Override // defpackage.cqjb
    public final UUID c() {
        return this.e;
    }

    @Override // defpackage.cqjb
    public final UUID d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cqiz)) {
            return false;
        }
        cqiz cqizVar = (cqiz) obj;
        return ffkj.e(this.a, cqizVar.a) && ffkj.e(this.b, cqizVar.b) && this.c == cqizVar.c && ffkj.e(this.d, cqizVar.d) && ffkj.e(this.e, cqizVar.e);
    }

    public final int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    public final String toString() {
        return "TimeBasedSyncBatch(upperBoundTime=" + this.a + ", lowerBoundTime=" + this.b + ", targetMessagesToUpdate=" + this.c + ", syncId=" + this.d + ", batchId=" + this.e + ")";
    }
}
