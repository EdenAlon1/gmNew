package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class edvv extends edvw {
    private final enjc a;

    public edvv(enjc enjcVar) {
        this.a = enjcVar;
    }

    @Override // defpackage.edwa
    public final int a() {
        return 1;
    }

    @Override // defpackage.edvw, defpackage.edwa
    public final enjc b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof edwa) {
            edwa edwaVar = (edwa) obj;
            if (edwaVar.a() == 1 && this.a.equals(edwaVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return enpw.a(this.a);
    }

    public final String toString() {
        return "ExperimentIdsOrError{experimentIds=" + this.a.toString() + "}";
    }
}
