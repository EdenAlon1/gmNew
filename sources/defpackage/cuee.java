package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cuee {
    public final long a;
    public final cuen b;
    public final cuef c;
    public final Instant d;

    public cuee(long j, cuen cuenVar, cuef cuefVar, Instant instant) {
        cuenVar.getClass();
        cuefVar.getClass();
        this.a = j;
        this.b = cuenVar;
        this.c = cuefVar;
        this.d = instant;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cuee)) {
            return false;
        }
        cuee cueeVar = (cuee) obj;
        return this.a == cueeVar.a && this.b == cueeVar.b && this.c == cueeVar.c && ffkj.e(this.d, cueeVar.d);
    }

    public final int hashCode() {
        long j = this.a;
        return (((((((int) (j ^ (j >>> 32))) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "A2pConversationSubscription(participantId=" + this.a + ", toolstoneState=" + this.b + ", subscriptionState=" + this.c + ", lastActionTimestamp=" + this.d + ")";
    }
}
