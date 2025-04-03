package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dhqz implements Runnable {
    final /* synthetic */ dhre a;
    final /* synthetic */ dhra b;

    public dhqz(dhra dhraVar, dhre dhreVar) {
        this.a = dhreVar;
        this.b = dhraVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            dhre a = this.b.a.a(this.a.i());
            a.q(dhrl.b, this.b);
            a.p(dhrl.b, this.b);
            a.n(dhrl.b, this.b);
        } catch (dhrc e) {
            if (e.getCause() instanceof Exception) {
                this.b.d((Exception) e.getCause());
            } else {
                this.b.d(e);
            }
        } catch (CancellationException unused) {
            this.b.a();
        } catch (Exception e2) {
            this.b.d(e2);
        }
    }
}
