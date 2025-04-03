package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvgi extends dvgn {
    private final evub a;
    private final dvdp b;
    private final boolean c;

    public dvgi(evub evubVar, dvdp dvdpVar, boolean z) {
        if (evubVar == null) {
            throw new NullPointerException("Null promoId");
        }
        this.a = evubVar;
        this.b = dvdpVar;
        this.c = z;
    }

    @Override // defpackage.dvgn
    public final dvdp a() {
        return this.b;
    }

    @Override // defpackage.dvgn
    public final evub b() {
        return this.a;
    }

    @Override // defpackage.dvgn
    public final boolean c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dvgn) {
            dvgn dvgnVar = (dvgn) obj;
            dvgnVar.d();
            if (this.a.equals(dvgnVar.b()) && this.b.equals(dvgnVar.a()) && this.c == dvgnVar.c()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ (-721379959)) * 1000003) ^ this.b.hashCode()) * 1000003) ^ (true != this.c ? 1237 : 1231);
    }

    public final String toString() {
        dvdp dvdpVar = this.b;
        return "TriggeringConditionsEvalContext{accountName=null, promoId=" + this.a.toString() + ", clearcutLogContext=" + dvdpVar.toString() + ", hasPresentedPromos=" + this.c + "}";
    }

    @Override // defpackage.dvgn
    public final void d() {
    }
}
