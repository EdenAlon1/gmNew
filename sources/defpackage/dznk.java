package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dznk extends dzqf {
    private final int a;
    private final int b;

    public dznk(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.dzqf
    public final int a() {
        return this.a;
    }

    @Override // defpackage.dzqf
    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dzqf) {
            dzqf dzqfVar = (dzqf) obj;
            if (this.a == dzqfVar.a() && this.b == dzqfVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        return "LighterUiConfigurations{badge=" + this.a + ", profileLabelStyle=" + this.b + "}";
    }
}
