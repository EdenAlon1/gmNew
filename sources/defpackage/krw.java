package defpackage;

import android.os.Process;

/* compiled from: PG */
/* loaded from: classes.dex */
final class krw extends Thread {
    private final int a;

    public krw(Runnable runnable) {
        super(runnable, "fonts-androidx");
        this.a = 10;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(this.a);
        super.run();
    }
}
