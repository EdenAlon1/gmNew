package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eizj extends eiyc {
    public final eisx a;
    public final eixz b;

    public eizj(eisx eisxVar, eixz eixzVar) {
        if (eisxVar == null) {
            throw new NullPointerException("Null id");
        }
        this.a = eisxVar;
        this.b = eixzVar;
    }

    @Override // defpackage.eiyc
    public final eisx a() {
        return this.a;
    }

    @Override // defpackage.eiyc
    public final eixz b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eiyc) {
            eiyc eiycVar = (eiyc) obj;
            if (this.a.equals(eiycVar.a()) && this.b.equals(eiycVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        eixz eixzVar = this.b;
        return "AccountContext{id=" + this.a.toString() + ", info=" + eixzVar.toString() + "}";
    }
}
