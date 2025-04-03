package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kfj {
    public static final Object a(ListenableFuture listenableFuture, ffgu ffguVar) {
        try {
            if (listenableFuture.isDone()) {
                return kez.c(listenableFuture);
            }
            ffrh ffrhVar = new ffrh(ffhi.c(ffguVar), 1);
            ffrhVar.B();
            listenableFuture.b(new kfl(listenableFuture, ffrhVar), kfh.a);
            ffrhVar.d(new kfi(listenableFuture));
            return ffrhVar.m();
        } catch (ExecutionException e) {
            throw b(e);
        }
    }

    public static final Throwable b(ExecutionException executionException) {
        Throwable cause = executionException.getCause();
        cause.getClass();
        return cause;
    }
}
