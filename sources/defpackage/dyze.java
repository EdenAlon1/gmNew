package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyze extends dyzk {
    private final dzao a;

    public dyze(dzao dzaoVar) {
        this.a = dzaoVar;
    }

    @Override // defpackage.dyzk, defpackage.dzbf
    public final dzao a() {
        return this.a;
    }

    @Override // defpackage.dzbf
    public final int b() {
        return 5;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dzbf) {
            dzbf dzbfVar = (dzbf) obj;
            if (dzbfVar.b() == 5 && this.a.equals(dzbfVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OneOfType{cloudUpdate=" + this.a.toString() + "}";
    }
}
