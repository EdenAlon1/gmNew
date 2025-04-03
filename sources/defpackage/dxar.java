package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dxar extends dxba {
    private final boolean d;
    private final enip e;

    public dxar(boolean z, enip enipVar) {
        this.d = z;
        this.e = enipVar;
    }

    @Override // defpackage.dxba
    public final enip a() {
        return this.e;
    }

    @Override // defpackage.dxba
    public final boolean b() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dxba) {
            dxba dxbaVar = (dxba) obj;
            if (this.d == dxbaVar.b() && this.e.equals(dxbaVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((true != this.d ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        return "DownloadConstraints{requireUnmeteredNetwork=" + this.d + ", requiredNetworkTypes=" + String.valueOf(this.e) + "}";
    }
}
