package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fesi implements Runnable {
    final /* synthetic */ fesk a;

    public fesi(fesk feskVar) {
        this.a = feskVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fesk feskVar = this.a;
        if (!feskVar.e) {
            feskVar.f = null;
            return;
        }
        long a = feskVar.a();
        fesk feskVar2 = this.a;
        long j = feskVar2.d - a;
        if (j > 0) {
            feskVar2.f = feskVar2.a.schedule(new fesj(feskVar2), j, TimeUnit.NANOSECONDS);
            return;
        }
        feskVar2.e = false;
        feskVar2.f = null;
        feskVar2.c.run();
    }
}
