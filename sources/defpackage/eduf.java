package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eduf extends edvm {
    private final long a;
    private final engw b;

    public eduf(long j, engw engwVar) {
        this.a = j;
        if (engwVar == null) {
            throw new NullPointerException("Null reportIds");
        }
        this.b = engwVar;
    }

    @Override // defpackage.edvm
    public final long a() {
        return this.a;
    }

    @Override // defpackage.edvm
    public final engw b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof edvm) {
            edvm edvmVar = (edvm) obj;
            if (this.a == edvmVar.a() && enkr.h(this.b, edvmVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        return ((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "MetricAndReportIds{metricId=" + this.a + ", reportIds=" + this.b.toString() + "}";
    }
}
