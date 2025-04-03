package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eggn extends egff {
    private final engw a;
    private final engw b;
    private final emxc c;
    private final exfw d;

    public eggn(engw engwVar, engw engwVar2, emxc emxcVar, exfw exfwVar) {
        this.a = engwVar;
        this.b = engwVar2;
        this.c = emxcVar;
        this.d = exfwVar;
    }

    @Override // defpackage.egff
    public final emxc a() {
        return this.c;
    }

    @Override // defpackage.egff
    public final engw b() {
        return this.b;
    }

    @Override // defpackage.egff
    public final engw c() {
        return this.a;
    }

    @Override // defpackage.egff
    public final exfw d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof egff) {
            egff egffVar = (egff) obj;
            if (enkr.h(this.a, egffVar.c()) && enkr.h(this.b, egffVar.b()) && this.c.equals(egffVar.a()) && this.d.equals(egffVar.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        exfw exfwVar = this.d;
        emxc emxcVar = this.c;
        engw engwVar = this.b;
        return "ArtHomeSuggestions{images=" + this.a.toString() + ", collections=" + engwVar.toString() + ", errorState=" + String.valueOf(emxcVar) + ", eventLog=" + exfwVar.toString() + "}";
    }
}
