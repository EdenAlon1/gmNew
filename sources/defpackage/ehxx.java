package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehxx extends ehyc {
    private final ehzv a;

    public ehxx(ehzv ehzvVar) {
        this.a = ehzvVar;
    }

    @Override // defpackage.eibk
    public final int b() {
        return 1;
    }

    @Override // defpackage.ehyc, defpackage.eibk
    public final ehzv c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof eibk) {
            eibk eibkVar = (eibk) obj;
            if (eibkVar.b() == 1 && this.a.equals(eibkVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "MessageContent{chat=" + this.a.toString() + "}";
    }
}
