package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ersg implements Runnable {
    ersi a;

    public ersg(ersi ersiVar) {
        this.a = ersiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ListenableFuture listenableFuture;
        ersi ersiVar = this.a;
        if (ersiVar == null || (listenableFuture = ersiVar.a) == null) {
            return;
        }
        this.a = null;
        if (listenableFuture.isDone()) {
            ersiVar.m(listenableFuture);
            return;
        }
        try {
            ScheduledFuture scheduledFuture = ersiVar.b;
            ersiVar.b = null;
            String str = "Timed out";
            if (scheduledFuture != null) {
                try {
                    long abs = Math.abs(scheduledFuture.getDelay(TimeUnit.MILLISECONDS));
                    if (abs > 10) {
                        str = "Timed out (timeout delayed by " + abs + " ms after scheduled time)";
                    }
                } catch (Throwable th) {
                    ersiVar.setException(new ersh(str));
                    throw th;
                }
            }
            ersiVar.setException(new ersh(str + ": " + listenableFuture.toString()));
        } finally {
            listenableFuture.cancel(true);
        }
    }
}
