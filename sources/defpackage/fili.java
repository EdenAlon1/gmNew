package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fili {
    private final AtomicInteger a = new AtomicInteger(1);
    private final Runnable b;

    public fili(Runnable runnable) {
        this.b = runnable;
    }

    public final void a() {
        if (this.a.decrementAndGet() == 0) {
            this.b.run();
        }
    }

    public final void b() {
        this.a.incrementAndGet();
    }
}
