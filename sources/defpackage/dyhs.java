package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyhs implements Executor {
    private static Reference a = new WeakReference(null);
    private final Handler b = new Handler(Looper.getMainLooper());

    private dyhs() {
    }

    public static synchronized Executor a() {
        synchronized (dyhs.class) {
            Executor executor = (Executor) a.get();
            if (executor != null) {
                return executor;
            }
            dyhs dyhsVar = new dyhs();
            a = new WeakReference(dyhsVar);
            return dyhsVar;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.b.post(runnable);
    }
}
