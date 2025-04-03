package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class edre extends edse {
    public final edqc a;
    public final String b;
    public final long c;
    public final dhqd d;

    public edre(edqc edqcVar, String str, long j, dhqd dhqdVar) {
        this.a = edqcVar;
        this.b = str;
        this.c = j;
        this.d = dhqdVar;
    }

    @Override // defpackage.edse, defpackage.edkr
    public final dhqd a() {
        return this.d;
    }

    @Override // defpackage.edse
    public final long b() {
        return this.c;
    }

    @Override // defpackage.edse
    public final edqc c() {
        return this.a;
    }

    @Override // defpackage.edse
    public final String d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        dhqd dhqdVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof edse) {
            edse edseVar = (edse) obj;
            edqc edqcVar = this.a;
            if (edqcVar != null ? edqcVar.equals(edseVar.c()) : edseVar.c() == null) {
                String str = this.b;
                if (str != null ? str.equals(edseVar.d()) : edseVar.d() == null) {
                    if (this.c == edseVar.b() && ((dhqdVar = this.d) != null ? dhqdVar.equals(edseVar.a()) : edseVar.a() == null)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        edqc edqcVar = this.a;
        int hashCode = edqcVar == null ? 0 : edqcVar.hashCode();
        String str = this.b;
        int hashCode2 = str == null ? 0 : str.hashCode();
        int i = hashCode ^ 1000003;
        long j = this.c;
        dhqd dhqdVar = this.d;
        return (((((i * 1000003) ^ hashCode2) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ (dhqdVar != null ? dhqdVar.hashCode() : 0);
    }

    public final String toString() {
        dhqd dhqdVar = this.d;
        return "IsOpenRequest{place=" + String.valueOf(this.a) + ", placeId=" + this.b + ", utcTimeMillis=" + this.c + ", cancellationToken=" + String.valueOf(dhqdVar) + "}";
    }
}
