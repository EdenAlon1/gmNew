package defpackage;

import androidx.car.app.model.Alert;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhhs {
    private final ThreadPoolExecutor a;

    public fhhs(ThreadFactory threadFactory) {
        this.a = new ThreadPoolExecutor(0, Alert.DURATION_SHOW_INDEFINITELY, 60L, TimeUnit.SECONDS, new SynchronousQueue(), threadFactory);
    }

    public final void a(Runnable runnable) {
        runnable.getClass();
        this.a.execute(runnable);
    }
}
