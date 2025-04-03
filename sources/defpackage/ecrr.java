package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ecrr extends ecrz {
    private final int a;
    private final boolean b;
    private final int c;
    private final ecry d;

    public ecrr(int i, int i2, ecry ecryVar, boolean z) {
        this.c = i;
        this.a = i2;
        this.d = ecryVar;
        this.b = z;
    }

    @Override // defpackage.ecrz, defpackage.echl
    public final int a() {
        return this.a;
    }

    @Override // defpackage.ecrz
    public final boolean d() {
        return this.b;
    }

    @Override // defpackage.ecrz
    public final int e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ecrz) {
            ecrz ecrzVar = (ecrz) obj;
            if (this.c == ecrzVar.e() && this.a == ecrzVar.a() && this.d.equals(ecrzVar.f()) && this.b == ecrzVar.d()) {
                ecrzVar.g();
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ecrz
    public final ecry f() {
        return this.d;
    }

    public final int hashCode() {
        return ((((((((this.c ^ 1000003) * 1000003) ^ this.a) * 1000003) ^ this.d.hashCode()) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ 1237;
    }

    public final String toString() {
        return "TikTokTraceConfigurations{enablement=" + echm.a(this.c) + ", rateLimitPerSecond=" + this.a + ", dynamicSampler=" + this.d.toString() + ", recordTimerDuration=" + this.b + ", sendEmptyTraces=false}";
    }

    @Override // defpackage.ecrz
    public final void g() {
    }
}
