package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class alyk implements alyj {
    public final aqux a;
    private final Instant b;
    private final fjay c;

    public alyk(aqux aquxVar, Instant instant, fjay fjayVar) {
        this.a = aquxVar;
        this.b = instant;
        this.c = fjayVar;
    }

    @Override // defpackage.alyj
    public final Instant a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof alyk)) {
            return false;
        }
        alyk alykVar = (alyk) obj;
        return ffkj.e(this.a, alykVar.a) && ffkj.e(this.b, alykVar.b) && ffkj.e(this.c, alykVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "RemovedOptimisticReaction(selfIdentity=" + this.a + ", timestamp=" + this.b + ", traceId=" + this.c + ")";
    }
}
