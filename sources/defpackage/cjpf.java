package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjpf extends cjpg {
    public final long a;
    public final UUID b;
    public final cjow c;

    public cjpf(long j, UUID uuid, cjow cjowVar) {
        this.a = j;
        this.b = uuid;
        this.c = cjowVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cjpf)) {
            return false;
        }
        cjpf cjpfVar = (cjpf) obj;
        return this.a == cjpfVar.a && ffkj.e(this.b, cjpfVar.b) && ffkj.e(this.c, cjpfVar.c);
    }

    public final int hashCode() {
        long j = this.a;
        return (((((int) (j ^ (j >>> 32))) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "ParseSms(xMessageId=" + this.a + ", persistenceId=" + this.b + ", parsedSmsData=" + this.c + ")";
    }
}
