package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class alyi implements alyj {
    public final aqux a;
    public final fjay b;
    public final apyv c;
    private final Instant d;

    public alyi(aqux aquxVar, Instant instant, fjay fjayVar, apyv apyvVar) {
        this.a = aquxVar;
        this.d = instant;
        this.b = fjayVar;
        this.c = apyvVar;
    }

    @Override // defpackage.alyj
    public final Instant a() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof alyi)) {
            return false;
        }
        alyi alyiVar = (alyi) obj;
        return ffkj.e(this.a, alyiVar.a) && ffkj.e(this.d, alyiVar.d) && ffkj.e(this.b, alyiVar.b) && ffkj.e(this.c, alyiVar.c);
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.d.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "AddedOptimisticReaction(selfIdentity=" + this.a + ", timestamp=" + this.d + ", traceId=" + this.b + ", reaction=" + this.c + ")";
    }
}
