package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtvb {
    public final dtuz a;
    private final kfb b;
    private final Runnable c;
    private final AtomicBoolean d = new AtomicBoolean(true);

    public dtvb(Runnable runnable, kfb kfbVar, dtuz dtuzVar) {
        this.c = runnable;
        this.b = kfbVar;
        this.a = dtuzVar;
    }

    public final void a() {
        if (this.d.getAndSet(false)) {
            this.b.d();
        }
    }

    public final void b() {
        if (this.d.getAndSet(false)) {
            this.c.run();
            this.b.b(null);
        }
    }
}
