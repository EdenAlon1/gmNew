package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dzxp extends dzxs {
    public final int a;
    private final dzpg b;

    public dzxp(dzpg dzpgVar, int i) {
        this.b = dzpgVar;
        this.a = i;
    }

    @Override // defpackage.dzxs
    public final int a() {
        return this.a;
    }

    @Override // defpackage.dzxs
    public final dzpg b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dzxs) {
            dzxs dzxsVar = (dzxs) obj;
            if (this.b.equals(dzxsVar.b()) && this.a == dzxsVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.b.hashCode() ^ 1000003) * 1000003) ^ this.a;
    }

    public final String toString() {
        return "CacheKey{contactId=" + this.b.toString() + ", sizeInPx=" + this.a + "}";
    }
}
