package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ecni extends ecnn {
    private final int a;
    private final boolean b;
    private final emxc c;
    private final boolean d;
    private final boolean e;
    private final int f;

    public ecni(int i, int i2, boolean z, emxc emxcVar, boolean z2, boolean z3) {
        this.f = i;
        this.a = i2;
        this.b = z;
        this.c = emxcVar;
        this.d = z2;
        this.e = z3;
    }

    @Override // defpackage.ecnn, defpackage.echl
    public final int a() {
        return this.a;
    }

    @Override // defpackage.ecnn
    public final emxc d() {
        return this.c;
    }

    @Override // defpackage.ecnn
    public final boolean e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ecnn) {
            ecnn ecnnVar = (ecnn) obj;
            if (this.f == ecnnVar.h() && this.a == ecnnVar.a() && this.b == ecnnVar.g() && this.c.equals(ecnnVar.d()) && this.d == ecnnVar.f()) {
                ecnnVar.k();
                if (this.e == ecnnVar.e()) {
                    ecnnVar.j();
                    ecnnVar.i();
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.ecnn
    public final boolean f() {
        return this.d;
    }

    @Override // defpackage.ecnn
    public final boolean g() {
        return this.b;
    }

    @Override // defpackage.ecnn
    public final int h() {
        return this.f;
    }

    public final int hashCode() {
        int i = true != this.b ? 1237 : 1231;
        int i2 = this.f;
        return ((((((((((((i ^ ((((i2 ^ 1000003) * 1000003) ^ this.a) * 1000003)) * 1000003) ^ 2040732332) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ 1237) * 1000003) ^ (true != this.e ? 1237 : 1231)) * 1000003) ^ 1237) * 1000003) ^ 1237;
    }

    public final String toString() {
        return "MemoryConfigurations{enablement=" + echm.a(this.f) + ", rateLimitPerSecond=" + this.a + ", recordMetricPerProcess=" + this.b + ", metricExtensionProvider=" + String.valueOf(this.c) + ", forceGcBeforeRecordMemory=" + this.d + ", captureDebugMetrics=false, captureMemoryInfo=" + this.e + ", recordMemoryPeriodically=false, randomizePeriodicMemoryMetricStartTime=false}";
    }

    @Override // defpackage.ecnn
    public final void i() {
    }

    @Override // defpackage.ecnn
    public final void j() {
    }

    @Override // defpackage.ecnn
    public final void k() {
    }
}
