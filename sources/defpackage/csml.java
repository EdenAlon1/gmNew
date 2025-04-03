package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class csml extends csnz {
    private final int a;
    private final csmy b;

    public csml(int i, csmy csmyVar) {
        this.a = i;
        if (csmyVar == null) {
            throw new NullPointerException("Null networkTransport");
        }
        this.b = csmyVar;
    }

    @Override // defpackage.csnz
    public final int a() {
        return this.a;
    }

    @Override // defpackage.csnz
    public final csmy b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof csnz) {
            csnz csnzVar = (csnz) obj;
            if (this.a == csnzVar.a() && this.b.equals(csnzVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "NetworkTypePair{networkCapabilities=" + this.a + ", networkTransport=" + this.b.toString() + "}";
    }
}
