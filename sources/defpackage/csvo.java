package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csvo implements cfug {
    public final cfuu b;
    private final errl c;
    private final AtomicBoolean d = new AtomicBoolean(false);
    public final AtomicLong a = new AtomicLong(0);

    public csvo(errl errlVar, cfuu cfuuVar) {
        this.b = cfuuVar;
        this.c = errlVar;
    }

    public final void c() {
        if (this.d.compareAndSet(false, true)) {
            elfo.g(new Callable() { // from class: csvn
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    csvo csvoVar = csvo.this;
                    csvoVar.b.a();
                    csvoVar.a.incrementAndGet();
                    return null;
                }
            }, this.c).k(axnw.b(), erpp.a);
        }
    }

    @Override // defpackage.cfug
    public final boolean ge() {
        return false;
    }

    @Override // defpackage.cfug
    public final void gg() {
        ekzz f = eleg.f("PhenotypeFlagsInitializer#onBuglePhenotypeFlagChanged");
        try {
            this.a.incrementAndGet();
            f.close();
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
