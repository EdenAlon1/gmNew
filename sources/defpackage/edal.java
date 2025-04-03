package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class edal implements Runnable {
    final /* synthetic */ Runnable a;
    final /* synthetic */ errm b;
    final /* synthetic */ long c;
    final /* synthetic */ TimeUnit d;

    public edal(Runnable runnable, errm errmVar, long j, TimeUnit timeUnit) {
        this.a = runnable;
        this.b = errmVar;
        this.c = j;
        this.d = timeUnit;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.run();
        edae.a(this.b.schedule(this, this.c, this.d));
    }
}
