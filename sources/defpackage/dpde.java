package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpde extends dpdf {
    public final Instant a;
    public final Object b;

    public dpde(Instant instant, Object obj) {
        this.a = instant;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dpde)) {
            return false;
        }
        dpde dpdeVar = (dpde) obj;
        return ffkj.e(this.a, dpdeVar.a) && ffkj.e(this.b, dpdeVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Object obj = this.b;
        return hashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "DataPacket(timestamp=" + this.a + ", value=" + this.b + ")";
    }
}
