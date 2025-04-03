package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvgh extends dvgm {
    private final evub a;
    private final dvdp b;
    private final enhk c;
    private final enhk d;
    private final enhk e;
    private final enhk f;

    public dvgh(evub evubVar, dvdp dvdpVar, enhk enhkVar, enhk enhkVar2, enhk enhkVar3, enhk enhkVar4) {
        if (evubVar == null) {
            throw new NullPointerException("Null promoId");
        }
        this.a = evubVar;
        if (dvdpVar == null) {
            throw new NullPointerException("Null clearcutLogContext");
        }
        this.b = dvdpVar;
        if (enhkVar == null) {
            throw new NullPointerException("Null clearcutCounts");
        }
        this.c = enhkVar;
        if (enhkVar2 == null) {
            throw new NullPointerException("Null veCounts");
        }
        this.d = enhkVar2;
        if (enhkVar3 == null) {
            throw new NullPointerException("Null appStates");
        }
        this.e = enhkVar3;
        if (enhkVar4 == null) {
            throw new NullPointerException("Null permissionRequestCounts");
        }
        this.f = enhkVar4;
    }

    @Override // defpackage.dvgm
    public final dvdp a() {
        return this.b;
    }

    @Override // defpackage.dvgm
    public final enhk b() {
        return this.e;
    }

    @Override // defpackage.dvgm
    public final enhk c() {
        return this.c;
    }

    @Override // defpackage.dvgm
    public final enhk d() {
        return this.f;
    }

    @Override // defpackage.dvgm
    public final enhk e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dvgm) {
            dvgm dvgmVar = (dvgm) obj;
            dvgmVar.g();
            if (this.a.equals(dvgmVar.f()) && this.b.equals(dvgmVar.a()) && this.c.equals(dvgmVar.c()) && this.d.equals(dvgmVar.e()) && this.e.equals(dvgmVar.b()) && this.f.equals(dvgmVar.d())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.dvgm
    public final evub f() {
        return this.a;
    }

    public final int hashCode() {
        return ((((((((((this.a.hashCode() ^ (-721379959)) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode();
    }

    public final String toString() {
        enhk enhkVar = this.f;
        enhk enhkVar2 = this.e;
        enhk enhkVar3 = this.d;
        enhk enhkVar4 = this.c;
        dvdp dvdpVar = this.b;
        return "TargetingRuleEvalContext{accountName=null, promoId=" + this.a.toString() + ", clearcutLogContext=" + dvdpVar.toString() + ", clearcutCounts=" + enhkVar4.toString() + ", veCounts=" + enhkVar3.toString() + ", appStates=" + enhkVar2.toString() + ", permissionRequestCounts=" + enhkVar.toString() + "}";
    }

    @Override // defpackage.dvgm
    public final void g() {
    }
}
