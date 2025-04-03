package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzxb extends dzxd {
    private final dzpn a;

    public dzxb(dzpn dzpnVar) {
        this.a = dzpnVar;
    }

    @Override // defpackage.dzxd, defpackage.dzxf
    public final dzpn a() {
        return this.a;
    }

    @Override // defpackage.dzxf
    public final dzpq b() {
        return dzpq.GROUP;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dzxf) {
            dzxf dzxfVar = (dzxf) obj;
            if (dzpq.GROUP == dzxfVar.b() && this.a.equals(dzxfVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "BlockId{group=" + this.a.toString() + "}";
    }
}
