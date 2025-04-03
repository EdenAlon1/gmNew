package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dhqk implements Runnable {
    final /* synthetic */ dhre a;
    final /* synthetic */ dhql b;

    public dhqk(dhql dhqlVar, dhre dhreVar) {
        this.a = dhreVar;
        this.b = dhqlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            dhre dhreVar = (dhre) this.b.a.a(this.a);
            if (dhreVar == null) {
                this.b.d(new NullPointerException("Continuation returned null"));
                return;
            }
            dhreVar.q(dhrl.b, this.b);
            dhreVar.p(dhrl.b, this.b);
            dhreVar.n(dhrl.b, this.b);
        } catch (dhrc e) {
            if (!(e.getCause() instanceof Exception)) {
                this.b.b.u(e);
                return;
            }
            dhql dhqlVar = this.b;
            dhqlVar.b.u((Exception) e.getCause());
        } catch (Exception e2) {
            this.b.b.u(e2);
        }
    }
}
