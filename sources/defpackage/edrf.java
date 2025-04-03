package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class edrf extends edsf {
    private final Boolean a;

    public edrf(Boolean bool) {
        this.a = bool;
    }

    @Override // defpackage.edsf
    public final Boolean a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof edsf)) {
            return false;
        }
        edsf edsfVar = (edsf) obj;
        Boolean bool = this.a;
        return bool == null ? edsfVar.a() == null : bool.equals(edsfVar.a());
    }

    public final int hashCode() {
        Boolean bool = this.a;
        return (bool == null ? 0 : bool.hashCode()) ^ 1000003;
    }

    public final String toString() {
        return "IsOpenResponse{isOpen=" + this.a + "}";
    }
}
