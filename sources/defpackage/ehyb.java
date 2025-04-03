package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehyb extends ehyc {
    private final eibs a;

    public ehyb(eibs eibsVar) {
        this.a = eibsVar;
    }

    @Override // defpackage.eibk
    public final int b() {
        return 3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof eibk) {
            eibk eibkVar = (eibk) obj;
            if (eibkVar.b() == 3 && this.a.equals(eibkVar.g())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ehyc, defpackage.eibk
    public final eibs g() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "MessageContent{messageReceipt=" + this.a.toString() + "}";
    }
}
