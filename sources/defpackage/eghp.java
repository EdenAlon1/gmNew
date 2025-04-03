package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eghp extends egih {
    private final engw a;
    private final emxc b;
    private final boolean c;
    private final engw d;

    public eghp(engw engwVar, emxc emxcVar, boolean z, engw engwVar2) {
        if (engwVar == null) {
            throw new NullPointerException("Null photos");
        }
        this.a = engwVar;
        this.b = emxcVar;
        this.c = z;
        if (engwVar2 == null) {
            throw new NullPointerException("Null eventLogs");
        }
        this.d = engwVar2;
    }

    @Override // defpackage.egih
    public final emxc a() {
        return this.b;
    }

    @Override // defpackage.egih
    public final engw b() {
        return this.d;
    }

    @Override // defpackage.egih
    public final engw c() {
        return this.a;
    }

    @Override // defpackage.egih
    public final boolean d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof egih) {
            egih egihVar = (egih) obj;
            if (enkr.h(this.a, egihVar.c()) && this.b.equals(egihVar.a()) && this.c == egihVar.d() && enkr.h(this.d, egihVar.b())) {
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
        return "SuggestedPhotosResource{photos=" + this.a.toString() + ", errorState=" + emxcVar.toString() + ", hasAdditionalResults=" + this.c + ", eventLogs=" + engwVar.toString() + "}";
    }
}
