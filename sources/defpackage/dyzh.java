package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dyzh extends dyzk {
    private final dzaz a;

    public dyzh(dzaz dzazVar) {
        this.a = dzazVar;
    }

    @Override // defpackage.dzbf
    public final int b() {
        return 2;
    }

    @Override // defpackage.dyzk, defpackage.dzbf
    public final dzaz e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dzbf) {
            dzbf dzbfVar = (dzbf) obj;
            if (dzbfVar.b() == 2 && this.a.equals(dzbfVar.e())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OneOfType{push=" + this.a.toString() + "}";
    }
}
