package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjpc extends cjpd {
    private final long a;
    private final UUID b;

    public cjpc(long j, UUID uuid) {
        this.a = j;
        this.b = uuid;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cjpc)) {
            return false;
        }
        cjpc cjpcVar = (cjpc) obj;
        return this.a == cjpcVar.a && ffkj.e(this.b, cjpcVar.b);
    }

    public final int hashCode() {
        long j = this.a;
        return (((int) (j ^ (j >>> 32))) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "SaveToTelephonyFailure(xMessageId=" + this.a + ", persistenceId=" + this.b + ")";
    }
}
