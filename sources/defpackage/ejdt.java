package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ejdt extends ejdq {
    private final Object a;
    private final ejdx b;

    public ejdt(Object obj, ejdx ejdxVar) {
        this.a = obj;
        if (ejdxVar == null) {
            throw new NullPointerException("Null accountData");
        }
        this.b = ejdxVar;
    }

    @Override // defpackage.ejdq
    public final ejdx a() {
        return this.b;
    }

    @Override // defpackage.ejdq
    public final Object b() {
        return this.a;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ejdq) {
            ejdq ejdqVar = (ejdq) obj;
            if (ennc.m(this.a, ejdqVar.b()) && this.b.equals(ejdqVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public final String toString() {
        return "ResultAndAccountData{result=" + ennc.g(this.a) + ", accountData=" + this.b.toString() + "}";
    }
}
