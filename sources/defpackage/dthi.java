package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dthi implements dtik {
    public static final Duration a = ernk.e(2);
    public final dtgp b;
    public final fgjb c;
    public final dtiz d;
    private final ffsk e;

    public dthi(dtgp dtgpVar, final dtfv dtfvVar, ffsk ffskVar, cteg ctegVar) {
        dtfvVar.getClass();
        this.b = dtgpVar;
        this.e = ffskVar;
        this.c = new fgjf();
        fgdj fgdjVar = dtgpVar.l;
        dthh dthhVar = new dthh(fgdjVar);
        int i = fgcz.a;
        this.d = new dtiz(fgbn.b(dthhVar, ffskVar, fgcy.a, e((dtga) fgdjVar.c())), new ffix() { // from class: dtgq
            @Override // defpackage.ffix
            public final Object invoke() {
                fgdj fgdjVar2 = ((yvf) dtfv.this.b).f;
                Duration duration = dthi.a;
                Duration duration2 = (Duration) fgdjVar2.c();
                return duration2 == null ? dthi.a : duration2;
            }
        }, this, fgbn.b(new dthb(dtgpVar.l), ffskVar, fgcy.a, Duration.ZERO), dtgpVar.m, fgbn.b(new dthe(dtgpVar.l), ffskVar, fgcy.a, null), fgbn.b(new dtgy(dtgpVar.l), ffskVar, fgcy.a, null), null, ctegVar, false, 7808);
    }

    public static final dtjb e(dtga dtgaVar) {
        if ((dtgaVar instanceof dtfx) || (dtgaVar instanceof dtfw)) {
            return dtjb.a;
        }
        if (dtgaVar instanceof dtfy) {
            return dtjb.b;
        }
        if (dtgaVar instanceof dtfz) {
            return dtjb.c;
        }
        throw new ffcd();
    }

    private final void f(ffjm ffjmVar) {
        ffqy.d(this.e, null, null, new dtgr(this, ffjmVar, null), 3);
    }

    @Override // defpackage.dtik
    public final void a(boolean z, boolean z2, dteh dtehVar) {
        f(new dtgs(z, dtehVar, null));
    }

    @Override // defpackage.dtik
    public final void b() {
        f(new dtgt(null));
    }

    @Override // defpackage.dtik
    public final void c() {
        f(new dtgu(null));
    }

    @Override // defpackage.dtik
    public final void d(dteh dtehVar) {
        f(new dtgv(dtehVar, null));
    }
}
