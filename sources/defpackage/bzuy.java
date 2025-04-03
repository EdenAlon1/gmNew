package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bzuy extends bzva {
    private final avui a;

    public bzuy(avui avuiVar) {
        this.a = avuiVar;
    }

    @Override // defpackage.bzva, defpackage.caep
    public final avui a() {
        return this.a;
    }

    @Override // defpackage.caep
    public final int b() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof caep) {
            caep caepVar = (caep) obj;
            if (caepVar.b() == 1 && this.a.equals(caepVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ResultOrSkipped{result=" + this.a.toString() + "}";
    }
}
