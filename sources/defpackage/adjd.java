package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class adjd implements ljv {
    elfl a;
    final /* synthetic */ adjf b;

    public adjd(adjf adjfVar) {
        this.b = adjfVar;
    }

    @Override // defpackage.ljv
    public final void d(lkr lkrVar) {
        ensk e = adjf.c.e();
        e.Y(ente.a, "BugleCms");
        ((enrr) ((enrr) e).h("com/google/android/apps/messaging/gaia/apd/BugleNonAccountScopedOGParticleDiscActionFragmentPeer$2", "onResume", 292, "BugleNonAccountScopedOGParticleDiscActionFragmentPeer.java")).q("Account menu card onResume.");
        this.a = elfl.g(emuu.a((Runnable) this.b.q.b(), ((Long) adjf.b.e()).longValue(), TimeUnit.MILLISECONDS, (dlpw) this.b.p.b(), (errm) this.b.o.b()));
    }

    @Override // defpackage.ljv
    public final void f(lkr lkrVar) {
        ensk e = adjf.c.e();
        e.Y(ente.a, "BugleCms");
        ((enrr) ((enrr) e).h("com/google/android/apps/messaging/gaia/apd/BugleNonAccountScopedOGParticleDiscActionFragmentPeer$2", "onStop", 306, "BugleNonAccountScopedOGParticleDiscActionFragmentPeer.java")).q("Account menu card onStop.");
        elfl elflVar = this.a;
        if (elflVar != null) {
            elflVar.cancel(false);
            this.a = null;
        }
    }

    @Override // defpackage.ljv
    public final /* synthetic */ void c(lkr lkrVar) {
    }

    @Override // defpackage.ljv
    public final /* synthetic */ void ff(lkr lkrVar) {
    }

    @Override // defpackage.ljv
    public final /* synthetic */ void gZ(lkr lkrVar) {
    }

    @Override // defpackage.ljv
    public final /* synthetic */ void ha(lkr lkrVar) {
    }
}
