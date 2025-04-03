package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ecjo extends ecjp {
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ecjp) {
            ecjp ecjpVar = (ecjp) obj;
            ecjpVar.d();
            ecjpVar.e();
            ecjpVar.f();
            ecjpVar.g();
            ecjpVar.h();
            long doubleToLongBits = Double.doubleToLongBits(5.0d);
            ecjpVar.i();
            if (doubleToLongBits == Double.doubleToLongBits(5.0d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((int) (Double.doubleToLongBits(5.0d) ^ (Double.doubleToLongBits(5.0d) >>> 32))) ^ 388790310;
    }

    public final String toString() {
        return "CpuProfilingConfigurations{enablement=DEFAULT, maxBufferSizeBytes=2097152, sampleDurationMs=30000, sampleDurationSkewMs=5000, sampleFrequencyMicro=1000, samplesPerEpoch=5.0}";
    }

    @Override // defpackage.ecjp
    public final void d() {
    }

    @Override // defpackage.ecjp
    public final void e() {
    }

    @Override // defpackage.ecjp
    public final void f() {
    }

    @Override // defpackage.ecjp
    public final void g() {
    }

    @Override // defpackage.ecjp
    public final void h() {
    }

    @Override // defpackage.ecjp
    public final void i() {
    }
}
