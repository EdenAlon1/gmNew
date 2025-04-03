package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eggh extends egeb {
    private final engw a;
    private final emxc b;
    private final exfw c;

    public eggh(engw engwVar, emxc emxcVar, exfw exfwVar) {
        if (engwVar == null) {
            throw new NullPointerException("Null categories");
        }
        this.a = engwVar;
        this.b = emxcVar;
        if (exfwVar == null) {
            throw new NullPointerException("Null eventLog");
        }
        this.c = exfwVar;
    }

    @Override // defpackage.egeb
    public final emxc a() {
        return this.b;
    }

    @Override // defpackage.egeb
    public final engw b() {
        return this.a;
    }

    @Override // defpackage.egeb
    public final exfw c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof egeb) {
            egeb egebVar = (egeb) obj;
            if (enkr.h(this.a, egebVar.b()) && this.b.equals(egebVar.a()) && this.c.equals(egebVar.c())) {
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
        return "ArtCategoriesResource{categories=" + this.a.toString() + ", errorState=" + emxcVar.toString() + ", eventLog=" + exfwVar.toString() + "}";
    }
}
