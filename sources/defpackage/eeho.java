package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eeho extends eeid {
    private final String f;
    private final String g;
    private final String h;
    private final eejk i;
    private final eeig j;
    private final dktn k;
    private final engw l;
    private final eehk m;

    public eeho(String str, String str2, String str3, eejk eejkVar, eeig eeigVar, dktn dktnVar, engw engwVar, eehk eehkVar) {
        this.f = str;
        this.g = str2;
        this.h = str3;
        this.i = eejkVar;
        this.j = eeigVar;
        this.k = dktnVar;
        this.l = engwVar;
        this.m = eehkVar;
    }

    @Override // defpackage.eehy
    public final dktn a() {
        return this.k;
    }

    @Override // defpackage.eehy
    public final eehk b() {
        return this.m;
    }

    @Override // defpackage.eehy
    public final eeig c() {
        return this.j;
    }

    @Override // defpackage.eehy
    public final eejk d() {
        return this.i;
    }

    @Override // defpackage.eehy
    public final engw e() {
        return this.l;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eeid) {
            eeid eeidVar = (eeid) obj;
            if (this.f.equals(eeidVar.h()) && this.g.equals(eeidVar.f()) && this.h.equals(eeidVar.g()) && this.i.equals(eeidVar.d()) && this.j.equals(eeidVar.c()) && this.k.equals(eeidVar.a()) && enkr.h(this.l, eeidVar.e()) && this.m.equals(eeidVar.b())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.eehy
    public final String f() {
        return this.g;
    }

    @Override // defpackage.eehy
    public final String g() {
        return this.h;
    }

    @Override // defpackage.eehy
    public final String h() {
        return this.f;
    }

    public final int hashCode() {
        return ((((((((((((((this.f.hashCode() ^ 1000003) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.k.hashCode()) * 1000003) ^ this.l.hashCode()) * 1000003) ^ this.m.hashCode();
    }

    public final String toString() {
        eehk eehkVar = this.m;
        engw engwVar = this.l;
        dktn dktnVar = this.k;
        eeig eeigVar = this.j;
        return "SipStackStub{user=" + this.f + ", domain=" + this.g + ", sipInstance=" + this.h + ", transportProtocol=" + String.valueOf(this.i) + ", sipTransactionLayer=" + String.valueOf(eeigVar) + ", logTag=" + String.valueOf(dktnVar) + ", messageFilters=" + String.valueOf(engwVar) + ", addressFactory=" + String.valueOf(eehkVar) + "}";
    }
}
