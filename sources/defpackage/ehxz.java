package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehxz extends ehyc {
    private final eibe a;

    public ehxz(eibe eibeVar) {
        this.a = eibeVar;
    }

    @Override // defpackage.eibk
    public final int b() {
        return 2;
    }

    @Override // defpackage.ehyc, defpackage.eibk
    public final eibe e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof eibk) {
            eibk eibkVar = (eibk) obj;
            if (eibkVar.b() == 2 && this.a.equals(eibkVar.e())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "MessageContent{isComposing=" + this.a.toString() + "}";
    }
}
