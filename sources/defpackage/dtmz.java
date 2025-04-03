package defpackage;

import android.util.Log;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dtmz implements Runnable {
    private static final emyl a = emys.a(new emyl() { // from class: dtmy
        @Override // defpackage.emyl
        public final Object get() {
            return enru.c("com/google/android/libraries/concurrent/ExceptionHandlingExecutorFactory$ExceptionHandlingOrLoggingRunnable");
        }
    });
    private static final Logger b = Logger.getLogger("ErrorLoggingExecutor");
    private final Runnable c;
    private final ffbr d;

    public dtmz(Runnable runnable, ffbr ffbrVar) {
        this.c = runnable;
        this.d = ffbrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Throwable th;
        try {
            this.c.run();
        } catch (Throwable th2) {
            if (((Boolean) ((emxc) ((fbbb) this.d).a).e(false)).booleanValue()) {
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th2);
                return;
            }
            try {
                th = th2;
                try {
                    ((enrr) ((enrr) ((enrr) ((enru) a.get()).i()).g(th)).h("com/google/android/libraries/concurrent/ExceptionHandlingExecutorFactory$ExceptionHandlingOrLoggingRunnable", "run", '_', "ExceptionHandlingExecutorFactory.java")).q("Uncaught exception from runnable");
                } catch (Throwable th3) {
                    th = th3;
                    Throwable th4 = th;
                    Logger logger = b;
                    logger.logp(Level.SEVERE, "com.google.android.libraries.concurrent.ExceptionHandlingExecutorFactory$ExceptionHandlingOrLoggingRunnable", "run", "GoogleLogger failed to log", th4);
                    Log.e("ErrorLoggingExecutor", "GoogleLogger failed to log", th4);
                    logger.logp(Level.SEVERE, "com.google.android.libraries.concurrent.ExceptionHandlingExecutorFactory$ExceptionHandlingOrLoggingRunnable", "run", "Uncaught exception from runnable", th);
                    Log.e("ErrorLoggingExecutor", "Uncaught exception from runnable", th);
                }
            } catch (Throwable th5) {
                th = th5;
                th = th2;
            }
        }
    }

    public final String toString() {
        return this.c.toString();
    }
}
