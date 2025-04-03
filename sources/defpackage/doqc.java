package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class doqc implements doqd, dnmw {
    public final doqa a;
    private final String b;

    public doqc(String str, doqa doqaVar) {
        str.getClass();
        this.b = str;
        this.a = doqaVar;
    }

    @Override // defpackage.dnmw
    public final String b() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof doqc)) {
            return false;
        }
        doqc doqcVar = (doqc) obj;
        return ffkj.e(this.b, doqcVar.b) && ffkj.e(this.a, doqcVar.a);
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public final String toString() {
        return "SingleLine(id=" + this.b + ", line=" + this.a + ")";
    }
}
