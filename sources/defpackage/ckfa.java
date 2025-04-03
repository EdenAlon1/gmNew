package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class ckfa extends ckgr {
    public final ckgd a;
    public final long b;
    public final UUID c;

    public ckfa(ckgd ckgdVar, long j, UUID uuid) {
        if (ckgdVar == null) {
            throw new NullPointerException("Null rcsAvailabilityUpdate");
        }
        this.a = ckgdVar;
        this.b = j;
        if (uuid == null) {
            throw new NullPointerException("Null execId");
        }
        this.c = uuid;
    }

    @Override // defpackage.ckgr
    public final long a() {
        return this.b;
    }

    @Override // defpackage.ckgr
    public final ckgd b() {
        return this.a;
    }

    @Override // defpackage.ckgr
    public final UUID c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ckgr) {
            ckgr ckgrVar = (ckgr) obj;
            if (this.a.equals(ckgrVar.b()) && this.b == ckgrVar.a() && this.c.equals(ckgrVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() ^ 1000003;
        long j = this.b;
        return (((hashCode * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        UUID uuid = this.c;
        return "ExecutionInfo{rcsAvailabilityUpdate=" + this.a.toString() + ", triggerTime=" + this.b + ", execId=" + uuid.toString() + "}";
    }
}
