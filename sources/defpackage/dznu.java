package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dznu extends dzra {
    public final long a;
    public final engw b;

    public dznu(long j, engw engwVar) {
        this.a = j;
        this.b = engwVar;
    }

    @Override // defpackage.dzra
    public final long a() {
        return this.a;
    }

    @Override // defpackage.dzra
    public final engw b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dzra) {
            dzra dzraVar = (dzra) obj;
            if (this.a == dzraVar.a() && enkr.h(this.b, dzraVar.b())) {
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
        return "RegistrationProperties{lastCapabilitiesReportTimeMs=" + this.a + ", lastReportedCapabilities=" + this.b.toString() + "}";
    }
}
