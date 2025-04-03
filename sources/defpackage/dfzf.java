package defpackage;

import android.os.Process;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dfzf implements Runnable {
    private final Runnable a;

    public dfzf(Runnable runnable) {
        this.a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(0);
        this.a.run();
    }
}
