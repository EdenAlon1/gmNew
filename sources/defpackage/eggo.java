package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eggo extends egfg {
    private final long a;
    private final String b;

    public eggo(long j, String str) {
        this.a = j;
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        this.b = str;
    }

    @Override // defpackage.egfg
    public final long a() {
        return this.a;
    }

    @Override // defpackage.egfg
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof egfg) {
            egfg egfgVar = (egfg) obj;
            if (this.a == egfgVar.a() && this.b.equals(egfgVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        return ((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "ArtInterest{id=" + this.a + ", name=" + this.b + "}";
    }
}
