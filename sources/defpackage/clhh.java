package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clhh implements avkj {
    public final clie a;
    private final clgs b;
    private final clhp c;
    private final club d;
    private final clhx e;
    private final clue f;
    private final cles g;
    private final clti h;
    private final clhl i;
    private final clty j;
    private final clev k;
    private final cltm l;
    private final clid m;
    private final clun n;
    private final clia o;
    private final cluk p;
    private final errl q;

    public clhh(clgs clgsVar, clhp clhpVar, club clubVar, clhx clhxVar, clue clueVar, cles clesVar, clti cltiVar, clev clevVar, cltm cltmVar, clhl clhlVar, clty cltyVar, clid clidVar, clun clunVar, clia cliaVar, cluk clukVar, clie clieVar, errl errlVar) {
        this.b = clgsVar;
        this.c = clhpVar;
        this.d = clubVar;
        this.e = clhxVar;
        this.f = clueVar;
        this.g = clesVar;
        this.h = cltiVar;
        this.i = clhlVar;
        this.j = cltyVar;
        this.k = clevVar;
        this.l = cltmVar;
        this.m = clidVar;
        this.n = clunVar;
        this.o = cliaVar;
        this.p = clukVar;
        this.a = clieVar;
        this.q = errlVar;
    }

    @Override // defpackage.avkj
    public final elfl a(awtv awtvVar) {
        return this.b.a() ? this.h.a.a(awtvVar) : this.g.a.a(awtvVar);
    }

    @Override // defpackage.avkj
    public final elfl b(awuw awuwVar) {
        return this.b.a() ? this.l.a.a(awuwVar) : this.k.a.a(awuwVar);
    }

    @Override // defpackage.avkj
    public final elfl c(awyl awylVar) {
        return this.b.a() ? this.j.a.a(awylVar) : this.i.a.a(awylVar);
    }

    @Override // defpackage.avkj
    public final elfl d(awyr awyrVar) {
        return this.b.a() ? this.d.a.a(awyrVar) : this.c.a.a(awyrVar);
    }

    @Override // defpackage.avkj
    public final elfl e(final awyz awyzVar) {
        final bdhg a = bdhg.a(awyzVar.h);
        if (((Boolean) ((cfup) clie.b.get()).e()).booleanValue()) {
            clie clieVar = this.a;
            axad axadVar = awyzVar.n;
            if (axadVar == null) {
                axadVar = axad.a;
            }
            clieVar.c(axadVar, a, 5, 15);
        }
        return (this.b.a() ? this.f.a.a(awyzVar) : this.e.a.a(awyzVar)).h(new emwl() { // from class: clhg
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                awzd awzdVar = (awzd) obj;
                if (((Boolean) ((cfup) clie.b.get()).e()).booleanValue()) {
                    awyz awyzVar2 = awyzVar;
                    clhh clhhVar = clhh.this;
                    axad axadVar2 = awyzVar2.n;
                    if (axadVar2 == null) {
                        axadVar2 = axad.a;
                    }
                    clhhVar.a.c(axadVar2, a, 6, 15);
                }
                return awzdVar;
            }
        }, this.q);
    }

    @Override // defpackage.avkj
    public final elfl f(axaj axajVar) {
        return this.b.a() ? this.p.a.a(axajVar) : this.o.a.a(axajVar);
    }

    @Override // defpackage.avkj
    public final elfl g(axaq axaqVar) {
        return this.b.a() ? this.n.a.a(axaqVar) : this.m.a.a(axaqVar);
    }
}
