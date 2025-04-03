package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhsm {
    public final long a;
    private final dhso b;
    private final Long c;
    private final dhsh d;

    public dhsm(dhso dhsoVar, long j, Long l, dhsh dhshVar) {
        this.b = dhsoVar;
        this.a = j;
        this.c = l;
        this.d = dhshVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dhsm)) {
            return false;
        }
        dhsm dhsmVar = (dhsm) obj;
        return this.a == dhsmVar.a && Objects.equals(this.c, dhsmVar.c) && this.b.equals(dhsmVar.b) && this.d.equals(dhsmVar.d);
    }

    public final int hashCode() {
        return Objects.hash(this.b, Long.valueOf(this.a), this.c, this.d);
    }

    public final String toString() {
        dhsh dhshVar = this.d;
        return "ComputedInstant{originalTimeSignal=" + this.b.toString() + ", instantUnixMillis=" + this.a + ", estimatedErrorUnixMillis=" + this.c + ", ticks=" + dhshVar.toString() + "}";
    }
}
