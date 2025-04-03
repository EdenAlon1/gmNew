package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class eakx {
    public final String a;
    public final long b;
    public final Long c;

    public eakx(String str, long j, Long l) {
        this.a = str;
        this.b = j;
        this.c = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eakx)) {
            return false;
        }
        eakx eakxVar = (eakx) obj;
        return ffkj.e(this.a, eakxVar.a) && this.b == eakxVar.b && ffkj.e(this.c, eakxVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Long l = this.c;
        int hashCode2 = l == null ? 0 : l.hashCode();
        long j = this.b;
        return ((hashCode + ((int) (j ^ (j >>> 32)))) * 31) + hashCode2;
    }

    public final String toString() {
        return "AuthToken(token=" + this.a + ", authTimeMillis=" + this.b + ", expirationTimeSecs=" + this.c + ")";
    }
}
