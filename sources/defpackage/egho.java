package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class egho extends eghw {
    private final engw a;
    private final emxc b;
    private final boolean c;
    private final engw d;

    public egho(engw engwVar, emxc emxcVar, boolean z, engw engwVar2) {
        if (engwVar == null) {
            throw new NullPointerException("Null clusters");
        }
        this.a = engwVar;
        this.b = emxcVar;
        this.c = z;
        if (engwVar2 == null) {
            throw new NullPointerException("Null eventLogs");
        }
        this.d = engwVar2;
    }

    @Override // defpackage.eghw
    public final emxc a() {
        return this.b;
    }

    @Override // defpackage.eghw
    public final engw b() {
        return this.a;
    }

    @Override // defpackage.eghw
    public final engw c() {
        return this.d;
    }

    @Override // defpackage.eghw
    public final boolean d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eghw) {
            eghw eghwVar = (eghw) obj;
            if (enkr.h(this.a, eghwVar.b()) && this.b.equals(eghwVar.a()) && this.c == eghwVar.d() && enkr.h(this.d, eghwVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        engw engwVar = this.d;
        emxc emxcVar = this.b;
        return "ClustersResource{clusters=" + this.a.toString() + ", errorState=" + emxcVar.toString() + ", hasAdditionalResults=" + this.c + ", eventLogs=" + engwVar.toString() + "}";
    }
}
