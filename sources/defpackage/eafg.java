package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eafg extends eafp {
    public final Long a;
    public final long b;

    public eafg(Long l, long j) {
        this.a = l;
        this.b = j;
    }

    @Override // defpackage.eafp
    public final long a() {
        return this.b;
    }

    @Override // defpackage.eafp
    public final Long b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eafp) {
            eafp eafpVar = (eafp) obj;
            Long l = this.a;
            if (l != null ? l.equals(eafpVar.b()) : eafpVar.b() == null) {
                if (this.b == eafpVar.a()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Long l = this.a;
        int hashCode = l == null ? 0 : l.hashCode();
        long j = this.b;
        return ((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "Timeout{value=" + this.a + ", startTime=" + this.b + "}";
    }
}
