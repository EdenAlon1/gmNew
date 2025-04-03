package defpackage;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qyq implements ThreadFactory {
    final boolean a;
    private final String b;
    private final AtomicInteger c = new AtomicInteger();

    public qyq(String str, boolean z) {
        this.b = str;
        this.a = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        qyo qyoVar = new qyo(new qyp(this, runnable));
        qyoVar.setName("glide-" + this.b + "-thread-" + this.c.getAndIncrement());
        return qyoVar;
    }
}
