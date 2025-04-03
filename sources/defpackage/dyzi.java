package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyzi extends dyzk {
    private final dzbb a;

    public dyzi(dzbb dzbbVar) {
        this.a = dzbbVar;
    }

    @Override // defpackage.dzbf
    public final int b() {
        return 3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dzbf) {
            dzbf dzbfVar = (dzbf) obj;
            if (dzbfVar.b() == 3 && this.a.equals(dzbfVar.f())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.dyzk, defpackage.dzbf
    public final dzbb f() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OneOfType{receipt=" + this.a.toString() + "}";
    }
}
