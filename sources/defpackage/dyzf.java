package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyzf extends dyzk {
    private final dzqs a;

    public dyzf(dzqs dzqsVar) {
        this.a = dzqsVar;
    }

    @Override // defpackage.dzbf
    public final int b() {
        return 1;
    }

    @Override // defpackage.dyzk, defpackage.dzbf
    public final dzqs c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dzbf) {
            dzbf dzbfVar = (dzbf) obj;
            if (dzbfVar.b() == 1 && this.a.equals(dzbfVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OneOfType{message=" + this.a.toString() + "}";
    }
}
