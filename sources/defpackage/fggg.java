package defpackage;

import java.util.Collection;
import java.util.Collections;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.android.AndroidExceptionPreHandler;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fggg {
    public static final Collection a;

    static {
        CoroutineExceptionHandler.class.getClassLoader();
        a = ffno.g(ffno.b(Collections.singletonList(AndroidExceptionPreHandler.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0])).iterator()));
    }

    public static final void a(Throwable th) {
        Thread currentThread = Thread.currentThread();
        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
    }
}
