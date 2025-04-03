package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyzg extends dyzk {
    private final dzbc a;

    public dyzg(dzbc dzbcVar) {
        this.a = dzbcVar;
    }

    @Override // defpackage.dzbf
    public final int b() {
        return 6;
    }

    @Override // defpackage.dyzk, defpackage.dzbf
    public final dzbc d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dzbf) {
            dzbf dzbfVar = (dzbf) obj;
            if (dzbfVar.b() == 6 && this.a.equals(dzbfVar.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OneOfType{profileUpdate=" + this.a.toString() + "}";
    }
}
