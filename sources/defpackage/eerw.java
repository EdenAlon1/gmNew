package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eerw implements Executor {
    public static final eerw a = new eerw(Looper.getMainLooper());
    private final Handler b;

    private eerw(Looper looper) {
        this.b = new Handler(looper);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.b.post(runnable);
    }
}
