package defpackage;

import android.os.Process;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyia extends dyhi {
    public static final /* synthetic */ int b = 0;
    private static Reference c = new WeakReference(null);

    public static synchronized dyia b() {
        synchronized (dyia.class) {
            dyia dyiaVar = (dyia) c.get();
            if (dyiaVar != null) {
                return dyiaVar;
            }
            dyia dyiaVar2 = new dyia();
            c = new WeakReference(dyiaVar2);
            return dyiaVar2;
        }
    }

    @Override // defpackage.dyhi
    protected final errl a(ScheduledExecutorService scheduledExecutorService) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        LinkedBlockingDeque linkedBlockingDeque = new LinkedBlockingDeque();
        ersf ersfVar = new ersf();
        ersfVar.c(true);
        ersfVar.d("LIT-UnlimitedExecutor #%d");
        ersfVar.a = new ThreadFactory() { // from class: dyhy
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(final Runnable runnable) {
                int i = dyia.b;
                return new Thread(new Runnable() { // from class: dyhz
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i2 = dyia.b;
                        Process.setThreadPriority(10);
                        runnable.run();
                    }
                });
            }
        };
        dyhh dyhhVar = new dyhh(scheduledExecutorService, "UnlimitedThrExecutor", 50, 50, timeUnit, linkedBlockingDeque, ersf.b(ersfVar));
        dyhhVar.allowCoreThreadTimeOut(true);
        return errs.a(dyhhVar);
    }
}
