package defpackage;

import kotlinx.coroutines.CoroutineExceptionHandler;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffsf {
    public static final Throwable a(Throwable th, Throwable th2) {
        if (th == th2) {
            return th;
        }
        RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
        ffbt.a(runtimeException, th);
        return runtimeException;
    }

    public static final void b(ffhd ffhdVar, Throwable th) {
        try {
            CoroutineExceptionHandler coroutineExceptionHandler = (CoroutineExceptionHandler) ffhdVar.get(CoroutineExceptionHandler.c);
            if (coroutineExceptionHandler != null) {
                coroutineExceptionHandler.handleException(ffhdVar, th);
            } else {
                fggh.a(ffhdVar, th);
            }
        } catch (Throwable th2) {
            fggh.a(ffhdVar, a(th, th2));
        }
    }
}
