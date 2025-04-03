package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjpe extends cjpg {
    public final long a;
    public final UUID b;
    public final cjoy c;

    public cjpe(long j, UUID uuid, cjoy cjoyVar) {
        this.a = j;
        this.b = uuid;
        this.c = cjoyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cjpe)) {
            return false;
        }
        cjpe cjpeVar = (cjpe) obj;
        return this.a == cjpeVar.a && ffkj.e(this.b, cjpeVar.b) && ffkj.e(this.c, cjpeVar.c);
    }

    public final int hashCode() {
        long j = this.a;
        return (((((int) (j ^ (j >>> 32))) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "IncomingSms(xMessageId=" + this.a + ", persistenceId=" + this.b + ", rawSmsData=" + this.c + ")";
    }
}
