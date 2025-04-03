package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class duoc extends dumw {
    public static final duoc a = new duoc(false);
    public static final duoc b = new duoc(true);
    private final Handler c = new Handler(Looper.getMainLooper());
    private final boolean d;

    private duoc(boolean z) {
        this.d = z;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (this.d || !dumg.b()) {
            this.c.post(runnable);
        } else {
            runnable.run();
        }
    }

    @Override // defpackage.dumw
    protected final void h(Runnable runnable, long j, TimeUnit timeUnit) {
        this.c.postDelayed(runnable, timeUnit.toMillis(j));
    }

    @Override // defpackage.dumw, java.util.concurrent.ExecutorService
    public final void shutdown() {
        throw new UnsupportedOperationException("UiThreadExecutor cannot be terminated.");
    }

    @Override // defpackage.dumw, java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        throw new UnsupportedOperationException("UiThreadExecutor cannot be terminated.");
    }
}
