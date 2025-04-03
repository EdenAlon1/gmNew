package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dzkn extends dzko {
    private static final long serialVersionUID = 0;
    private final dzpg a;

    public dzkn(dzpg dzpgVar) {
        this.a = dzpgVar;
    }

    @Override // defpackage.dzps
    public final dzpq b() {
        return dzpq.ONE_TO_ONE;
    }

    @Override // defpackage.dzko, defpackage.dzps
    public final dzpg c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dzps) {
            dzps dzpsVar = (dzps) obj;
            if (dzpq.ONE_TO_ONE == dzpsVar.b() && this.a.equals(dzpsVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OneOfId{oneToOne=" + this.a.toString() + "}";
    }
}
