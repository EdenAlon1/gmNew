package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ebkb extends ebkn {
    public final ebwa a;
    public final emyl b;
    public final boolean c;
    public final enip d;
    public final boolean e;
    public final adjj f;
    public final int g;
    private final eave h;
    private final eayo i;
    private final emxc j;
    private final int k;
    private final int l;
    private final emyl m;
    private final dwch n;
    private final emxc o;
    private final Runnable p;
    private final ebkk q;

    public ebkb(eave eaveVar, eayo eayoVar, emxc emxcVar, ebkk ebkkVar, adjj adjjVar, ebwa ebwaVar, int i, int i2, int i3, emyl emylVar, emyl emylVar2, boolean z, enip enipVar, boolean z2, dwch dwchVar, emxc emxcVar2, Runnable runnable) {
        this.h = eaveVar;
        this.i = eayoVar;
        this.j = emxcVar;
        this.q = ebkkVar;
        this.f = adjjVar;
        this.a = ebwaVar;
        this.g = i;
        this.k = i2;
        this.l = i3;
        this.b = emylVar;
        this.m = emylVar2;
        this.c = z;
        this.d = enipVar;
        this.e = z2;
        this.n = dwchVar;
        this.o = emxcVar2;
        this.p = runnable;
    }

    @Override // defpackage.ebkn
    @Deprecated
    public final int a() {
        return this.l;
    }

    @Override // defpackage.ebkn
    @Deprecated
    public final int b() {
        return this.k;
    }

    @Override // defpackage.ebkn
    public final dwch c() {
        return this.n;
    }

    @Override // defpackage.ebkn
    public final eave d() {
        return this.h;
    }

    @Override // defpackage.ebkn
    public final eayo e() {
        return this.i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ebkn) {
            ebkn ebknVar = (ebkn) obj;
            if (this.h.equals(ebknVar.d()) && this.i.equals(ebknVar.e()) && this.j.equals(ebknVar.h()) && equals(ebknVar.o()) && this.f.equals(ebknVar.p()) && this.a.equals(ebknVar.f()) && this.g == ebknVar.q() && this.k == ebknVar.b() && this.l == ebknVar.a() && this.b.equals(ebknVar.i()) && this.m.equals(ebknVar.j()) && this.c == ebknVar.n() && this.d.equals(ebknVar.k()) && this.e == ebknVar.m()) {
                ebknVar.r();
                if (this.n.equals(ebknVar.c()) && this.o.equals(ebknVar.g()) && this.p.equals(ebknVar.l())) {
                    ebknVar.s();
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.ebkn
    public final ebwa f() {
        return this.a;
    }

    @Override // defpackage.ebkn
    public final emxc g() {
        return this.o;
    }

    @Override // defpackage.ebkn
    public final emxc h() {
        return this.j;
    }

    public final int hashCode() {
        return ((((((((((((((((((((((((((((((((((((this.h.hashCode() ^ 1000003) * 1000003) ^ this.i.hashCode()) * 1000003) ^ 2040732332) * 1000003) ^ hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.a.hashCode()) * 1000003) ^ this.g) * 1000003) ^ this.k) * 1000003) ^ this.l) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.m.hashCode()) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ ((enpd) this.d).c) * 1000003) ^ (true == this.e ? 1231 : 1237)) * 1000003) ^ 1) * 1000003) ^ this.n.hashCode()) * 1000003) ^ 2040732332) * 1000003) ^ this.p.hashCode()) * 1000003) ^ 1;
    }

    @Override // defpackage.ebkn
    public final emyl i() {
        return this.b;
    }

    @Override // defpackage.ebkn
    public final emyl j() {
        return this.m;
    }

    @Override // defpackage.ebkn
    public final enip k() {
        return this.d;
    }

    @Override // defpackage.ebkn
    public final Runnable l() {
        return this.p;
    }

    @Override // defpackage.ebkn
    public final boolean m() {
        return this.e;
    }

    @Override // defpackage.ebkn
    public final boolean n() {
        return this.c;
    }

    @Override // defpackage.ebkn
    public final ebkk o() {
        return this.q;
    }

    @Override // defpackage.ebkn
    public final adjj p() {
        return this.f;
    }

    @Override // defpackage.ebkn
    public final int q() {
        return this.g;
    }

    public final String toString() {
        int i = this.g;
        dwch dwchVar = this.n;
        emyl emylVar = this.b;
        return "SlimCardEducationModel{accountConverter=" + this.h.toString() + ", accountsModel=" + this.i.toString() + ", incognitoModel=Optional.absent(), shouldShowEducationAndHighlightChecker=" + toString() + ", callbacks=" + this.f.toString() + ", simpleVeLogger=" + this.a.toString() + ", id=" + Integer.toString(i - 1) + ", impressionCap=" + this.k + ", highlightImpressionCap=" + this.l + ", shouldConsumeEducation=" + emylVar.toString() + ", shouldConsumeHighlight=" + this.m.toString() + ", withScrim=" + this.c + ", highlightIds=" + this.d.toString() + ", shouldClickAnchorOnInteraction=" + this.e + ", a11yLevel=VISIBLE_AS_DIALOG, vePrimitives=" + dwchVar.toString() + ", appIdentifier=Optional.absent(), onEducationShown=" + this.p.toString() + ", placement=BELOW}";
    }

    @Override // defpackage.ebkn
    public final void r() {
    }

    @Override // defpackage.ebkn
    public final void s() {
    }
}
