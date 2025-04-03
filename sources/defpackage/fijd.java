package defpackage;

import android.os.Process;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fijd implements Runnable {
    final /* synthetic */ Runnable a;
    final /* synthetic */ fije b;

    public fijd(fije fijeVar, Runnable runnable) {
        this.b = fijeVar;
        this.a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Thread.currentThread().setName("JavaCronetEngine");
        Process.setThreadPriority(this.b.a);
        this.a.run();
    }
}
