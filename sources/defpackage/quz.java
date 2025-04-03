package defpackage;

import android.os.Process;

/* compiled from: PG */
/* loaded from: classes.dex */
final class quz implements Runnable {
    final /* synthetic */ Runnable a;

    public quz(Runnable runnable) {
        this.a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        this.a.run();
    }
}
