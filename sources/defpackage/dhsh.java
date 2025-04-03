package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhsh {
    public final dhtr a;
    public final long b;

    public dhsh(dhtr dhtrVar, long j) {
        this.a = dhtrVar;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dhsh)) {
            return false;
        }
        dhsh dhshVar = (dhsh) obj;
        return this.b == dhshVar.b && Objects.equals(this.a, dhshVar.a);
    }

    public final int hashCode() {
        return Objects.hash(this.a, Long.valueOf(this.b));
    }

    public final String toString() {
        return "Ticks{originalTicker=BasicPhysicalTicker, value=" + this.b + "}";
    }
}
