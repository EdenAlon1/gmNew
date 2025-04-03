package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dzkm extends dzko {
    private static final long serialVersionUID = 0;
    private final dzpn a;

    public dzkm(dzpn dzpnVar) {
        this.a = dzpnVar;
    }

    @Override // defpackage.dzko, defpackage.dzps
    public final dzpn a() {
        return this.a;
    }

    @Override // defpackage.dzps
    public final dzpq b() {
        return dzpq.GROUP;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dzps) {
            dzps dzpsVar = (dzps) obj;
            if (dzpq.GROUP == dzpsVar.b() && this.a.equals(dzpsVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OneOfId{group=" + this.a.toString() + "}";
    }
}
