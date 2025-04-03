package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class alqq extends alsd {
    private final ecda a;
    private final int b;

    public alqq(ecda ecdaVar, int i) {
        if (ecdaVar == null) {
            throw new NullPointerException("Null eventName");
        }
        this.a = ecdaVar;
        this.b = i;
    }

    @Override // defpackage.alsd
    public final int a() {
        return this.b;
    }

    @Override // defpackage.alsd
    public final ecda b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof alsd) {
            alsd alsdVar = (alsd) obj;
            if (this.a.equals(alsdVar.b()) && this.b == alsdVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        return "TraceSectionKey{eventName=" + this.a.a + ", cookie=" + this.b + "}";
    }
}
