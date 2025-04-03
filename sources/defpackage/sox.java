package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sox {
    public final boolean a;
    public final eqom b;
    public final sos c;

    public sox(boolean z, eqom eqomVar, sos sosVar) {
        this.a = z;
        this.b = eqomVar;
        this.c = sosVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sox)) {
            return false;
        }
        sox soxVar = (sox) obj;
        return this.a == soxVar.a && this.b == soxVar.b && ffkj.e(this.c, soxVar.c);
    }

    public final int hashCode() {
        eqom eqomVar = this.b;
        return ((((true != this.a ? 1237 : 1231) * 31) + (eqomVar == null ? 0 : eqomVar.hashCode())) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "HandshakeResult(isSuccess=" + this.a + ", failureReason=" + this.b + ", result=" + this.c + ")";
    }
}
