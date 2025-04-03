package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class espo extends esqf {
    private final eyee a;
    private final espr b;

    public espo(eyee eyeeVar, espr esprVar) {
        this.a = eyeeVar;
        this.b = esprVar;
    }

    @Override // defpackage.esqf
    public final espr a() {
        return this.b;
    }

    @Override // defpackage.esqf
    public final eyee b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof esqf) {
            esqf esqfVar = (esqf) obj;
            if (this.a.equals(esqfVar.b()) && this.b.equals(esqfVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        espr esprVar = this.b;
        return "TransportMessage{content=" + this.a.toString() + ", contentType=" + esprVar.toString() + "}";
    }
}
