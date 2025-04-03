package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class clxo extends cmam {
    private final int a;
    private final int b;

    public clxo(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.cmam
    public final int a() {
        return this.b;
    }

    @Override // defpackage.cmam
    public final int b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cmam) {
            cmam cmamVar = (cmam) obj;
            if (this.a == cmamVar.b() && this.b == cmamVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        return "ImpressionsCountHolder{repromptCount=" + this.a + ", impressionsCount=" + this.b + "}";
    }
}
