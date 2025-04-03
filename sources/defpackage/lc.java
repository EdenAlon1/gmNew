package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lc extends lp {
    private final int a;
    private final String b;

    public lc(int i, String str) {
        this.a = i;
        this.b = str;
    }

    @Override // defpackage.lp
    public final int a() {
        return this.a;
    }

    @Override // defpackage.lp
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lp) {
            lp lpVar = (lp) obj;
            if (this.a == lpVar.a() && this.b.equals(lpVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "PduHeaderValue{value=" + this.a + ", valueName=" + this.b + "}";
    }
}
