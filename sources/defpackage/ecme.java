package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ecme extends ecmp {
    private final int a;
    private final int b;

    public ecme(int i, int i2) {
        this.b = i;
        this.a = i2;
    }

    @Override // defpackage.ecmp, defpackage.echl
    public final int a() {
        return this.a;
    }

    @Override // defpackage.ecmp
    public final int d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ecmp) {
            ecmp ecmpVar = (ecmp) obj;
            if (this.b == ecmpVar.d() && this.a == ecmpVar.a()) {
                ecmpVar.e();
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.b ^ 1000003) * 1000003) ^ this.a) * 1000003) ^ 1237;
    }

    public final String toString() {
        return "JankConfigurations{enablement=" + echm.a(this.b) + ", rateLimitPerSecond=" + this.a + ", perfettoMustBeExplicitlyTriggered=false}";
    }

    @Override // defpackage.ecmp
    public final void e() {
    }
}
