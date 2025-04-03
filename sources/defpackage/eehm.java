package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eehm extends eeib {
    private final String g;
    private final String h;
    private final String i;
    private final eejk j;
    private final eeig k;
    private final dktn l;
    private final engw m;
    private final eehk n;

    public eehm(String str, String str2, String str3, eejk eejkVar, eeig eeigVar, dktn dktnVar, engw engwVar, eehk eehkVar) {
        this.g = str;
        this.h = str2;
        this.i = str3;
        this.j = eejkVar;
        this.k = eeigVar;
        this.l = dktnVar;
        this.m = engwVar;
        this.n = eehkVar;
    }

    @Override // defpackage.eehy
    public final dktn a() {
        return this.l;
    }

    @Override // defpackage.eehy
    public final eehk b() {
        return this.n;
    }

    @Override // defpackage.eehy
    public final eeig c() {
        return this.k;
    }

    @Override // defpackage.eehy
    public final eejk d() {
        return this.j;
    }

    @Override // defpackage.eehy
    public final engw e() {
        return this.m;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eeib) {
            eeib eeibVar = (eeib) obj;
            if (this.g.equals(eeibVar.h()) && this.h.equals(eeibVar.f()) && this.i.equals(eeibVar.g()) && this.j.equals(eeibVar.d()) && this.k.equals(eeibVar.c()) && this.l.equals(eeibVar.a()) && enkr.h(this.m, eeibVar.e()) && this.n.equals(eeibVar.b())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.eehy
    public final String f() {
        return this.h;
    }

    @Override // defpackage.eehy
    public final String g() {
        return this.i;
    }

    @Override // defpackage.eehy
    public final String h() {
        return this.g;
    }

    public final int hashCode() {
        return ((((((((((((((this.g.hashCode() ^ 1000003) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.k.hashCode()) * 1000003) ^ this.l.hashCode()) * 1000003) ^ this.m.hashCode()) * 1000003) ^ this.n.hashCode();
    }

    public final String toString() {
        eehk eehkVar = this.n;
        engw engwVar = this.m;
        dktn dktnVar = this.l;
        eeig eeigVar = this.k;
        return "SipStackImpl{user=" + this.g + ", domain=" + this.h + ", sipInstance=" + this.i + ", transportProtocol=" + String.valueOf(this.j) + ", sipTransactionLayer=" + String.valueOf(eeigVar) + ", logTag=" + String.valueOf(dktnVar) + ", messageFilters=" + String.valueOf(engwVar) + ", addressFactory=" + String.valueOf(eehkVar) + "}";
    }
}
