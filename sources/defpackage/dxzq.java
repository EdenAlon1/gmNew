package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dxzq extends dyah {
    private final dwpj a;
    private final enhk b;

    public dxzq(dwpj dwpjVar, enhk enhkVar) {
        this.a = dwpjVar;
        this.b = enhkVar;
    }

    @Override // defpackage.dyah
    public final dwpj a() {
        return this.a;
    }

    @Override // defpackage.dyah
    public final enhk b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dyah) {
            dyah dyahVar = (dyah) obj;
            if (this.a.equals(dyahVar.a()) && ennc.m(this.b, dyahVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "GroupAndInlineFileMap{group=" + this.a.toString() + ", inlineFileMap=" + ennc.g(this.b) + "}";
    }
}
