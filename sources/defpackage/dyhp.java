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
public final class dyhp extends dyhi {
    public static final /* synthetic */ int b = 0;
    private static Reference c = new WeakReference(null);

    public static synchronized dyhp b() {
        synchronized (dyhp.class) {
            dyhp dyhpVar = (dyhp) c.get();
            if (dyhpVar != null) {
                return dyhpVar;
            }
            dyhp dyhpVar2 = new dyhp();
            c = new WeakReference(dyhpVar2);
            return dyhpVar2;
        }
    }

    @Override // defpackage.dyhi
    protected final errl a(ScheduledExecutorService scheduledExecutorService) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        LinkedBlockingDeque linkedBlockingDeque = new LinkedBlockingDeque();
        ersf ersfVar = new ersf();
        ersfVar.c(true);
        ersfVar.d("LIT-LimitedExecutor #%d");
        ersfVar.a = new ThreadFactory() { // from class: dyho
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(final Runnable runnable) {
                int i = dyhp.b;
                return new Thread(new Runnable() { // from class: dyhn
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i2 = dyhp.b;
                        Process.setThreadPriority(10);
                        runnable.run();
                    }
                });
            }
        };
        return errs.a(new dyhh(scheduledExecutorService, "LimitedThrExecutor", 0, 10, timeUnit, linkedBlockingDeque, ersf.b(ersfVar)));
    }
}
