package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxap extends dxax {
    private final boolean a;
    private final emxc b;

    public dxap(boolean z, emxc emxcVar) {
        this.a = z;
        this.b = emxcVar;
    }

    @Override // defpackage.dxax
    public final emxc a() {
        return this.b;
    }

    @Override // defpackage.dxax
    public final boolean b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dxax) {
            dxax dxaxVar = (dxax) obj;
            if (this.a == dxaxVar.b() && this.b.equals(dxaxVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "CheckContentChangeResponse{contentChanged=" + this.a + ", freshETagOptional=" + this.b.toString() + "}";
    }
}
