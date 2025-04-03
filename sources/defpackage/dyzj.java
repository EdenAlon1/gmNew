package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyzj extends dyzk {
    private final dzbi a;

    public dyzj(dzbi dzbiVar) {
        this.a = dzbiVar;
    }

    @Override // defpackage.dzbf
    public final int b() {
        return 4;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dzbf) {
            dzbf dzbfVar = (dzbf) obj;
            if (dzbfVar.b() == 4 && this.a.equals(dzbfVar.g())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.dyzk, defpackage.dzbf
    public final dzbi g() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OneOfType{typingIndicator=" + this.a.toString() + "}";
    }
}
