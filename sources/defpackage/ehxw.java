package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehxw extends ehyc {
    private final ehzu a;

    public ehxw(ehzu ehzuVar) {
        this.a = ehzuVar;
    }

    @Override // defpackage.ehyc, defpackage.eibk
    public final ehzu a() {
        return this.a;
    }

    @Override // defpackage.eibk
    public final int b() {
        return 6;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof eibk) {
            eibk eibkVar = (eibk) obj;
            if (eibkVar.b() == 6 && this.a.equals(eibkVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "MessageContent{basicTextMessage=" + this.a.toString() + "}";
    }
}
