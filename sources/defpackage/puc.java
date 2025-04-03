package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class puc {
    public static final String a = ppt.d("WorkerWrapper");

    public static final Object a(ListenableFuture listenableFuture, ppr pprVar, ffgu ffguVar) {
        try {
            if (listenableFuture.isDone()) {
                return b(listenableFuture);
            }
            ffrh ffrhVar = new ffrh(ffhi.c(ffguVar), 1);
            ffrhVar.B();
            listenableFuture.b(new psh(listenableFuture, ffrhVar), poy.a);
            ffrhVar.d(new pub(pprVar, listenableFuture));
            return ffrhVar.m();
        } catch (ExecutionException e) {
            throw c(e);
        }
    }

    public static final Object b(Future future) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public static final Throwable c(ExecutionException executionException) {
        Throwable cause = executionException.getCause();
        cause.getClass();
        return cause;
    }
}
