package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eggz extends egfz {
    private final engw a;
    private final emxc b;
    private final exfw c;

    public eggz(engw engwVar, emxc emxcVar, exfw exfwVar) {
        this.a = engwVar;
        this.b = emxcVar;
        this.c = exfwVar;
    }

    @Override // defpackage.egfz
    public final emxc a() {
        return this.b;
    }

    @Override // defpackage.egfz
    public final engw b() {
        return this.a;
    }

    @Override // defpackage.egfz
    public final exfw c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof egfz) {
            egfz egfzVar = (egfz) obj;
            if (enkr.h(this.a, egfzVar.b()) && this.b.equals(egfzVar.a()) && this.c.equals(egfzVar.c())) {
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
        return "ArtSearchSuggestions{suggestions=" + this.a.toString() + ", errorState=" + String.valueOf(emxcVar) + ", eventLog=" + exfwVar.toString() + "}";
    }
}
