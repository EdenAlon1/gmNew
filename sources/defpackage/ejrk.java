package defpackage;

import java.lang.Thread;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejrk extends ffgo implements CoroutineExceptionHandler {
    public static final ejrk a = new ejrk();

    private ejrk() {
        super(CoroutineExceptionHandler.c);
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void handleException(ffhd ffhdVar, Throwable th) {
        ffhdVar.getClass();
        th.getClass();
        Thread currentThread = Thread.currentThread();
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = currentThread.getUncaughtExceptionHandler();
        uncaughtExceptionHandler.getClass();
        uncaughtExceptionHandler.uncaughtException(currentThread, th);
    }
}
