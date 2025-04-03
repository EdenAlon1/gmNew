package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aqwp extends aqwq {
    private final bxtp a;
    private final boolean b;

    public aqwp(bxtp bxtpVar, boolean z) {
        this.a = bxtpVar;
        this.b = z;
    }

    @Override // defpackage.aqwq
    public final bxtp a() {
        return this.a;
    }

    @Override // defpackage.aqwq
    public final boolean b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aqwq) {
            aqwq aqwqVar = (aqwq) obj;
            bxtp bxtpVar = this.a;
            if (bxtpVar != null ? bxtpVar.equals(aqwqVar.a()) : aqwqVar.a() == null) {
                if (this.b == aqwqVar.b()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        bxtp bxtpVar = this.a;
        return (((bxtpVar == null ? 0 : bxtpVar.hashCode()) ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231);
    }

    public final String toString() {
        return "CreateSelfProfileResult{profile=" + String.valueOf(this.a) + ", newlyCreated=" + this.b + "}";
    }
}
