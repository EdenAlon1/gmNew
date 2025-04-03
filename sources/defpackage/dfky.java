package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dfky extends dfmg {
    public final double a;
    public final int b;

    public dfky(int i, double d) {
        this.b = i;
        this.a = d;
    }

    @Override // defpackage.dfmg
    public final double a() {
        return this.a;
    }

    @Override // defpackage.dfmg
    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dfmg) {
            dfmg dfmgVar = (dfmg) obj;
            if (this.b == dfmgVar.b() && Double.doubleToLongBits(this.a) == Double.doubleToLongBits(dfmgVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((int) ((Double.doubleToLongBits(this.a) >>> 32) ^ Double.doubleToLongBits(this.a))) ^ ((this.b ^ 1000003) * 1000003);
    }

    public final String toString() {
        int i = this.b;
        return "LogSamplerResult{samplingDecision=" + (i != 1 ? i != 2 ? i != 3 ? i != 4 ? "ALWAYS_UPLOAD_NO_SAMPLER" : "SAMPLING_NOT_SUPPORTED_FOR_LOG_EVENT" : "ALWAYS_UPLOAD_DUE_TO_ERROR" : "UPLOAD" : "NO_UPLOAD") + ", overallEffectiveSamplingRate=" + this.a + "}";
    }
}
