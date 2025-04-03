package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvgj extends dvgp {
    public final dvdt a;
    private final evub b;

    public dvgj(evub evubVar, dvdt dvdtVar) {
        if (evubVar == null) {
            throw new NullPointerException("Null promoId");
        }
        this.b = evubVar;
        this.a = dvdtVar;
    }

    @Override // defpackage.dvgp
    public final dvdt a() {
        return this.a;
    }

    @Override // defpackage.dvgp
    public final evub b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dvgp) {
            dvgp dvgpVar = (dvgp) obj;
            dvgpVar.c();
            if (this.b.equals(dvgpVar.b()) && this.a.equals(dvgpVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.b.hashCode() ^ (-721379959)) * 1000003) ^ this.a.hashCode();
    }

    public final String toString() {
        dvdt dvdtVar = this.a;
        return "TriggeringRuleEvalContext{accountName=null, promoId=" + this.b.toString() + ", triggeringEvent=" + dvdtVar.toString() + "}";
    }

    @Override // defpackage.dvgp
    public final void c() {
    }
}
