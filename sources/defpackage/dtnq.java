package defpackage;

import android.os.Binder;
import android.os.Process;
import android.os.StrictMode;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtnq {
    public static final /* synthetic */ int a = 0;
    private static final enru b = enru.c("com/google/android/libraries/concurrent/blockable/BlockableFutures");
    private static final ThreadLocal c = new dtnp();

    public static Object a(Future future) {
        c();
        return future.get();
    }

    public static Object b(Future future, long j, TimeUnit timeUnit) {
        c();
        return future.get(j, timeUnit);
    }

    public static void c() {
        if (((Boolean) c.get()).booleanValue()) {
            return;
        }
        if (Binder.getCallingPid() != Process.myPid()) {
            Thread currentThread = Thread.currentThread();
            if (!currentThread.getName().startsWith("Binder:")) {
                StackTraceElement[] stackTrace = currentThread.getStackTrace();
                int length = stackTrace.length;
                while (true) {
                    length--;
                    if (length < 0) {
                        break;
                    }
                    StackTraceElement stackTraceElement = stackTrace[length];
                    if (Binder.class.getName().equals(stackTraceElement.getClassName()) && "execTransact".equals(stackTraceElement.getMethodName())) {
                        d();
                        return;
                    }
                }
            } else {
                d();
                return;
            }
        }
        final IllegalStateException illegalStateException = new IllegalStateException("Cannot block on non-blocking thread: ".concat(String.valueOf(Thread.currentThread().getName())));
        int ordinal = dtns.d.ordinal();
        if (ordinal == 0) {
            ((enrr) ((enrr) ((enrr) b.i()).g(illegalStateException)).h("com/google/android/libraries/concurrent/blockable/BlockableFutures", "validateThreadIsBlockable", (char) 132, "BlockableFutures.java")).q("Cannot block on non-blocking thread");
        } else if (ordinal == 1) {
            StrictMode.noteSlowCall(illegalStateException.getMessage());
        } else {
            if (ordinal != 2) {
                return;
            }
            efbd.e(new Runnable() { // from class: dtno
                @Override // java.lang.Runnable
                public final void run() {
                    int i = dtnq.a;
                    throw illegalStateException;
                }
            });
            throw illegalStateException;
        }
    }

    public static void d() {
        c.set(true);
    }
}
