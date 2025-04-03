package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cfbs implements cevg {
    public final ffss a;
    public kfb b;
    public final elfl c = elfl.g(kfg.a(new kfd() { // from class: cfbq
        @Override // defpackage.kfd
        public final Object a(kfb kfbVar) {
            cfbs.this.b = kfbVar;
            return ffcu.a;
        }
    }));
    private final ffsk d;

    public cfbs(ffss ffssVar, ffsk ffskVar) {
        this.a = ffssVar;
        this.d = ffskVar;
    }

    @Override // defpackage.cevg
    public final elfl a() {
        return this.c;
    }

    @Override // defpackage.cevg
    public final elfl b() {
        elfl c;
        c = axol.c(this.d, ffhe.a, ffsm.a, new cfbr(this, null));
        return c;
    }

    public final kfb c() {
        kfb kfbVar = this.b;
        if (kfbVar != null) {
            return kfbVar;
        }
        ffkj.c("completerForFirstAttempt");
        return null;
    }
}
