package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dfkx extends dfli {
    public final faxv a;
    private final int b;

    public dfkx(int i, faxv faxvVar) {
        this.b = i;
        this.a = faxvVar;
    }

    @Override // defpackage.dfli
    public final int a() {
        return this.b;
    }

    @Override // defpackage.dfli
    public final faxv b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dfli) {
            dfli dfliVar = (dfli) obj;
            if (this.b == dfliVar.a() && this.a.equals(dfliVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.b ^ 1000003) * 1000003) ^ this.a.hashCode();
    }

    public final String toString() {
        return "ComplianceProductData{productId=" + this.b + ", productIdOrigin=" + this.a.toString() + "}";
    }
}
