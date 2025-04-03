package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ecrt extends ecsc {
    public final float a;
    private final int b;

    public ecrt(int i, float f) {
        this.b = i;
        this.a = f;
    }

    @Override // defpackage.ecsc
    public final float d() {
        return this.a;
    }

    @Override // defpackage.ecsc
    public final int e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ecsc) {
            ecsc ecscVar = (ecsc) obj;
            if (this.b == ecscVar.e() && Float.floatToIntBits(this.a) == Float.floatToIntBits(ecscVar.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.b ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.a);
    }

    public final String toString() {
        return "TraceConfigurations{enablement=" + echm.a(this.b) + ", samplingProbability=" + this.a + "}";
    }
}
