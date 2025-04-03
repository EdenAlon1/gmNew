package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehxy extends ehyc {
    private final eiah a;

    public ehxy(eiah eiahVar) {
        this.a = eiahVar;
    }

    @Override // defpackage.eibk
    public final int b() {
        return 4;
    }

    @Override // defpackage.ehyc, defpackage.eibk
    public final eiah d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof eibk) {
            eibk eibkVar = (eibk) obj;
            if (eibkVar.b() == 4 && this.a.equals(eibkVar.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "MessageContent{fileTransferInformation=" + this.a.toString() + "}";
    }
}
