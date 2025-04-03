package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eiww extends eiwz {
    public final boolean a;
    public final engw b;
    public final engw c;

    public eiww(boolean z, engw engwVar, engw engwVar2) {
        this.a = z;
        this.b = engwVar;
        this.c = engwVar2;
    }

    @Override // defpackage.eiwz
    public final engw a() {
        return this.b;
    }

    @Override // defpackage.eiwz
    public final engw b() {
        return this.c;
    }

    @Override // defpackage.eiwz
    public final boolean c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        engw engwVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof eiwz) {
            eiwz eiwzVar = (eiwz) obj;
            if (this.a == eiwzVar.c() && enkr.h(this.b, eiwzVar.a()) && ((engwVar = this.c) != null ? enkr.h(engwVar, eiwzVar.b()) : eiwzVar.b() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.b.hashCode();
        engw engwVar = this.c;
        return (hashCode * 1000003) ^ (engwVar == null ? 0 : engwVar.hashCode());
    }

    public final String toString() {
        engw engwVar = this.c;
        return "Config{canSwitchAccounts=" + this.a + ", initialSelectors=" + String.valueOf(this.b) + ", overrideRequirements=" + String.valueOf(engwVar) + "}";
    }
}
