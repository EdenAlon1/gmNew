package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axvr {
    public final long a;
    public final Instant b;

    public axvr(long j, Instant instant) {
        this.a = j;
        this.b = instant;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof axvr)) {
            return false;
        }
        axvr axvrVar = (axvr) obj;
        return this.a == axvrVar.a && ffkj.e(this.b, axvrVar.b);
    }

    public final int hashCode() {
        long j = this.a;
        return (((int) (j ^ (j >>> 32))) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "ContactIdWithDeletedTimestamp(contactId=" + this.a + ", deletedTimestamp=" + this.b + ")";
    }
}
