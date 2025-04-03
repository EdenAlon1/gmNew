package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ecbb extends ecbh {
    public final ecbn a;
    public final ecba b;

    public ecbb(ecbn ecbnVar, ecba ecbaVar) {
        this.a = ecbnVar;
        this.b = ecbaVar;
    }

    @Override // defpackage.ecbh
    public final ecba a() {
        return this.b;
    }

    @Override // defpackage.ecbh
    public final ecbn b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ecbh) {
            ecbh ecbhVar = (ecbh) obj;
            if (this.a.equals(ecbhVar.b()) && this.b.equals(ecbhVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        ecba ecbaVar = this.b;
        return "Configuration{tooltipModel=" + this.a.toString() + ", anchorViewProvider=" + ecbaVar.toString() + "}";
    }
}
