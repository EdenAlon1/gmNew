package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehya extends ehyc {
    private final eibj a;

    public ehya(eibj eibjVar) {
        this.a = eibjVar;
    }

    @Override // defpackage.eibk
    public final int b() {
        return 5;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof eibk) {
            eibk eibkVar = (eibk) obj;
            if (eibkVar.b() == 5 && this.a.equals(eibkVar.f())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ehyc, defpackage.eibk
    public final eibj f() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "MessageContent{locationInformation=" + this.a.toString() + "}";
    }
}
