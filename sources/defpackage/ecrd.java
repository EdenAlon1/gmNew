package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ecrd extends ecrg {
    public final int a;
    public final float b;
    private final emxc c;
    private final int d;

    public ecrd(int i, int i2, float f, emxc emxcVar) {
        this.d = i;
        this.a = i2;
        this.b = f;
        this.c = emxcVar;
    }

    @Override // defpackage.ecrg, defpackage.echl
    public final int a() {
        return this.a;
    }

    @Override // defpackage.ecrg
    public final float d() {
        return this.b;
    }

    @Override // defpackage.ecrg
    public final emxc e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ecrg) {
            ecrg ecrgVar = (ecrg) obj;
            if (this.d == ecrgVar.f() && this.a == ecrgVar.a() && Float.floatToIntBits(this.b) == Float.floatToIntBits(ecrgVar.d()) && this.c.equals(ecrgVar.e())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ecrg
    public final int f() {
        return this.d;
    }

    public final int hashCode() {
        return ((((((this.d ^ 1000003) * 1000003) ^ this.a) * 1000003) ^ Float.floatToIntBits(this.b)) * 1000003) ^ 2040732332;
    }

    public final String toString() {
        return "TimerConfigurations{enablement=" + echm.a(this.d) + ", rateLimitPerSecond=" + this.a + ", samplingProbability=" + this.b + ", perEventConfigurationFlags=" + String.valueOf(this.c) + "}";
    }
}
