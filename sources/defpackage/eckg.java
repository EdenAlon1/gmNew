package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class eckg extends ecki {
    public final float a;
    private final int b;
    private final ffbr c;
    private final emxc d;
    private final int e;

    public eckg(int i, float f, int i2, ffbr ffbrVar, emxc emxcVar) {
        this.e = i;
        this.a = f;
        this.b = i2;
        this.c = ffbrVar;
        this.d = emxcVar;
    }

    @Override // defpackage.ecki, defpackage.echl
    public final ffbr b() {
        return this.c;
    }

    @Override // defpackage.ecki
    public final float d() {
        return this.a;
    }

    @Override // defpackage.ecki
    public final int e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        ffbr ffbrVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ecki) {
            ecki eckiVar = (ecki) obj;
            if (this.e == eckiVar.g() && Float.floatToIntBits(this.a) == Float.floatToIntBits(eckiVar.d()) && this.b == eckiVar.e() && ((ffbrVar = this.c) != null ? ffbrVar.equals(eckiVar.b()) : eckiVar.b() == null) && this.d.equals(eckiVar.f())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ecki
    public final emxc f() {
        return this.d;
    }

    @Override // defpackage.ecki
    public final int g() {
        return this.e;
    }

    public final int hashCode() {
        int floatToIntBits = ((this.e ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.a);
        ffbr ffbrVar = this.c;
        return (((((floatToIntBits * 1000003) ^ this.b) * 1000003) ^ (ffbrVar == null ? 0 : ffbrVar.hashCode())) * 1000003) ^ 2040732332;
    }

    public final String toString() {
        return "CrashConfigurations{enablement=" + echm.a(this.e) + ", startupSamplePercentage=" + this.a + ", debugLogsSize=" + this.b + ", generalConfigurationsMetricExtension=" + String.valueOf(this.c) + ", crashLoopListener=Optional.absent()}";
    }
}
