package defpackage;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dunn implements ThreadFactory {
    public static final enru a = enru.c("com/google/android/libraries/inputmethod/concurrent/ImeThreadFactory");
    public final int b;
    public final dunu c;
    private final String d;
    private final AtomicInteger e = new AtomicInteger(0);

    public dunn(String str, int i, dunu dunuVar) {
        this.d = str;
        this.b = i;
        this.c = dunuVar;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        dunm dunmVar = new dunm(this, runnable, this.d + "-" + this.e.incrementAndGet());
        dunmVar.setDaemon(false);
        return dunmVar;
    }
}
