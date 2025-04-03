package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class egmu extends egni {
    private final engw a;
    private final emxc b;
    private final int c;

    public egmu(engw engwVar, int i, emxc emxcVar) {
        if (engwVar == null) {
            throw new NullPointerException("Null sections");
        }
        this.a = engwVar;
        this.c = i;
        this.b = emxcVar;
    }

    @Override // defpackage.egni
    public final emxc a() {
        return this.b;
    }

    @Override // defpackage.egni
    public final engw b() {
        return this.a;
    }

    @Override // defpackage.egni
    public final int c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof egni) {
            egni egniVar = (egni) obj;
            if (enkr.h(this.a, egniVar.b()) && this.c == egniVar.c() && this.b.equals(egniVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.c) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        emxc emxcVar = this.b;
        return "GooglePhotosResult{sections=" + this.a.toString() + ", state=" + egdy.a(this.c) + ", errorState=" + emxcVar.toString() + "}";
    }
}
