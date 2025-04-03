package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eggv extends egfn {
    private final engw a;
    private final emxc b;
    private final exfw c;

    public eggv(engw engwVar, emxc emxcVar, exfw exfwVar) {
        this.a = engwVar;
        this.b = emxcVar;
        this.c = exfwVar;
    }

    @Override // defpackage.egfn
    public final emxc a() {
        return this.b;
    }

    @Override // defpackage.egfn
    public final engw b() {
        return this.a;
    }

    @Override // defpackage.egfn
    public final exfw c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof egfn) {
            egfn egfnVar = (egfn) obj;
            if (enkr.h(this.a, egfnVar.b()) && this.b.equals(egfnVar.a()) && this.c.equals(egfnVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        exfw exfwVar = this.c;
        emxc emxcVar = this.b;
        return "ArtSearchInterests{interests=" + this.a.toString() + ", errorState=" + String.valueOf(emxcVar) + ", eventLog=" + exfwVar.toString() + "}";
    }
}
