package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cttm implements ctta {
    public final ffsk a;
    public final comc b;
    public final ffbr c;
    private final errl d;
    private final ffsk e;
    private final ffbr f;
    private final ffbr g;
    private final ffbr h;

    public cttm(errl errlVar, ffsk ffskVar, ffsk ffskVar2, ffbr ffbrVar, comc comcVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4) {
        errlVar.getClass();
        ffskVar.getClass();
        ffskVar2.getClass();
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffbrVar4.getClass();
        this.d = errlVar;
        this.e = ffskVar;
        this.a = ffskVar2;
        this.f = ffbrVar;
        this.b = comcVar;
        this.g = ffbrVar2;
        this.h = ffbrVar3;
        this.c = ffbrVar4;
    }

    private final void g(elfl elflVar) {
        ((ejvp) this.h.b()).a(elflVar, "nudge_preference_key");
    }

    @Override // defpackage.ctta
    public final ejuh a() {
        return new ejuy((ejvb) this.g.b(), new eros() { // from class: cttc
            @Override // defpackage.eros
            public final erph a(erpc erpcVar) {
                elfl c;
                cttm cttmVar = cttm.this;
                c = axol.c(cttmVar.a, ffhe.a, ffsm.a, new cttf(cttmVar, null));
                return new erph(c);
            }
        }, "nudge_preference_key");
    }

    @Override // defpackage.ctta
    public final elfl b() {
        elfl c;
        c = axol.c(this.a, ffhe.a, ffsm.a, new ctte(this, null));
        return c;
    }

    @Override // defpackage.ctta
    public final elfl c(boolean z) {
        elfl c;
        if (stl.a() && ((Boolean) ((cfup) stl.c.get()).e()).booleanValue()) {
            c = axol.c(this.a, ffhe.a, ffsm.a, new ctth(this, z, null));
            g(c);
            return c;
        }
        elfl e = elfo.e(null);
        e.getClass();
        return e;
    }

    @Override // defpackage.ctta
    public final elfl d(final boolean z) {
        return (!((Optional) this.c.b()).isPresent() || z) ? e(new ffji() { // from class: cttd
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                ctsx ctsxVar = (ctsx) obj;
                ctsxVar.getClass();
                ctsw builder = ctsxVar.toBuilder();
                builder.copyOnWrite();
                ctsx ctsxVar2 = (ctsx) builder.instance;
                ctsxVar2.b |= 1;
                ctsxVar2.c = z;
                ctsx build = builder.build();
                build.getClass();
                return build;
            }
        }) : axol.i(this.a, new cttj(this, null));
    }

    public final elfl e(ffji ffjiVar) {
        elfl c;
        if (ctjd.f()) {
            c = axol.c(this.e, ffhe.a, ffsm.a, new cttk(this, ffjiVar, null));
            g(c);
            return c;
        }
        elfl e = elfo.e(null);
        e.getClass();
        return e;
    }

    public final Object f(final ffji ffjiVar, ffgu ffguVar) {
        Object b = ffqv.b(new ffss[]{axol.e(((effy) this.f.b()).b(new emwl() { // from class: cttb
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return (ctsx) ffji.this.invoke(obj);
            }
        }, this.d)), ffra.b(this.e, ekxi.a(ffhe.a), ffsm.a, new cttl(null, this, ffjiVar))}, ffguVar);
        return b == ffhh.a ? b : ffcu.a;
    }
}
