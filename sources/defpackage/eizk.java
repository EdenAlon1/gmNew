package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eizk extends eiym {
    private final String a;
    private final eiyl b;

    public eizk(String str, eiyl eiylVar) {
        this.a = str;
        this.b = eiylVar;
    }

    @Override // defpackage.eiym
    public final eiyl a() {
        return this.b;
    }

    @Override // defpackage.eiym
    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eiym) {
            eiym eiymVar = (eiym) obj;
            if (this.a.equals(eiymVar.b()) && this.b.equals(eiymVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "AccountProviderConfig{type=" + this.a + ", provider=" + this.b.toString() + "}";
    }
}
