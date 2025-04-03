package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ecqu extends ecqy {
    private final emxc a;
    private final int b;

    public ecqu(int i, emxc emxcVar) {
        this.b = i;
        this.a = emxcVar;
    }

    @Override // defpackage.ecqy, defpackage.echl
    public final ffbr b() {
        return null;
    }

    @Override // defpackage.ecqy
    public final emxc d() {
        return this.a;
    }

    @Override // defpackage.ecqy
    public final int e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ecqy) {
            ecqy ecqyVar = (ecqy) obj;
            if (this.b == ecqyVar.e()) {
                ecqyVar.f();
                if (this.a.equals(ecqyVar.d())) {
                    ecqyVar.b();
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.b ^ 1000003) * 1000003) ^ 1237) * 1000003) ^ 2040732332) * 1000003;
    }

    public final String toString() {
        return "StorageConfigurations{enablement=" + echm.a(this.b) + ", manualCapture=false, dirStatsConfigurations=" + String.valueOf(this.a) + ", generalConfigurationsMetricExtension=null}";
    }

    @Override // defpackage.ecqy
    public final void f() {
    }
}
