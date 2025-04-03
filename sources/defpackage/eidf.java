package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eidf extends eido {
    public final engf a;
    public final engw b;
    public final eidr c;

    public eidf(engf engfVar, engw engwVar, eidr eidrVar) {
        this.a = engfVar;
        this.b = engwVar;
        this.c = eidrVar;
    }

    @Override // defpackage.eido
    public final eidr a() {
        return this.c;
    }

    @Override // defpackage.eido
    public final engf b() {
        return this.a;
    }

    @Override // defpackage.eido
    public final engw e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eido) {
            eido eidoVar = (eido) obj;
            if (ennc.m(this.a, eidoVar.b()) && enkr.h(this.b, eidoVar.e()) && this.c.equals(eidoVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        eidr eidrVar = this.c;
        engw engwVar = this.b;
        return "CpimMessage{namespaces=" + String.valueOf(this.a) + ", headers=" + String.valueOf(engwVar) + ", content=" + eidrVar.toString() + "}";
    }
}
