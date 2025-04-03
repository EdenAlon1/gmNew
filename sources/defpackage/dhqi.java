package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dhqi implements Runnable {
    final /* synthetic */ dhre a;
    final /* synthetic */ dhqj b;

    public dhqi(dhqj dhqjVar, dhre dhreVar) {
        this.a = dhreVar;
        this.b = dhqjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (((dhrm) this.a).d) {
            this.b.b.x();
            return;
        }
        try {
            this.b.b.v(this.b.a.a(this.a));
        } catch (dhrc e) {
            if (!(e.getCause() instanceof Exception)) {
                this.b.b.u(e);
                return;
            }
            dhqj dhqjVar = this.b;
            dhqjVar.b.u((Exception) e.getCause());
        } catch (Exception e2) {
            this.b.b.u(e2);
        }
    }
}
