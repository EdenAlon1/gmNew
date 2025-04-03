package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzxc extends dzxd {
    private final dzpg a;

    public dzxc(dzpg dzpgVar) {
        this.a = dzpgVar;
    }

    @Override // defpackage.dzxf
    public final dzpq b() {
        return dzpq.ONE_TO_ONE;
    }

    @Override // defpackage.dzxd, defpackage.dzxf
    public final dzpg c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dzxf) {
            dzxf dzxfVar = (dzxf) obj;
            if (dzpq.ONE_TO_ONE == dzxfVar.b() && this.a.equals(dzxfVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "BlockId{oneToOne=" + this.a.toString() + "}";
    }
}
