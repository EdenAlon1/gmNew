package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ecmc extends ecmn {
    public final ecmx a;
    public final fgmh b;
    public final emxc c;
    public final emxc d;

    public ecmc(ecmx ecmxVar, fgmh fgmhVar, emxc emxcVar, emxc emxcVar2) {
        this.a = ecmxVar;
        this.b = fgmhVar;
        this.c = emxcVar;
        this.d = emxcVar2;
    }

    @Override // defpackage.ecmn
    public final ecmx a() {
        return this.a;
    }

    @Override // defpackage.ecmn
    public final emxc b() {
        return this.d;
    }

    @Override // defpackage.ecmn
    public final emxc c() {
        return this.c;
    }

    @Override // defpackage.ecmn
    public final fgmh d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        fgmh fgmhVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ecmn) {
            ecmn ecmnVar = (ecmn) obj;
            if (this.a.equals(ecmnVar.a()) && ((fgmhVar = this.b) != null ? fgmhVar.equals(ecmnVar.d()) : ecmnVar.d() == null)) {
                ecmnVar.e();
                if (this.c.equals(ecmnVar.c()) && this.d.equals(ecmnVar.b())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() ^ 1000003;
        fgmh fgmhVar = this.b;
        return (((((((hashCode * 1000003) ^ (fgmhVar == null ? 0 : fgmhVar.hashCode())) * 1000003) ^ 1237) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332;
    }

    public final String toString() {
        return "InternalJankEventCollectionParameters{measurementKey=" + this.a.toString() + ", metricExtension=" + String.valueOf(this.b) + ", enablePerfettoTraceCollection=false, perfettoTimeoutOverride=Optional.absent(), perfettoBucketOverride=Optional.absent()}";
    }

    @Override // defpackage.ecmn
    public final void e() {
    }
}
