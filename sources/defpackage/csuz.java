package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csuz implements evho, cfug {
    public final cfuu b;
    private final errl c;
    public final AtomicInteger a = new AtomicInteger(((Integer) ((cfun) csvd.a).c).intValue());
    private final AtomicBoolean d = new AtomicBoolean(false);

    public csuz(errl errlVar, cfuu cfuuVar) {
        this.b = cfuuVar;
        this.c = errlVar;
    }

    private final void g() {
        elfo.g(new Callable() { // from class: csuy
            @Override // java.util.concurrent.Callable
            public final Object call() {
                csuz csuzVar = csuz.this;
                csuzVar.b.a();
                csuzVar.a.set(((Integer) csvd.a.e()).intValue());
                return null;
            }
        }, this.c).k(axnw.b(), erpp.a);
    }

    @Override // defpackage.evho
    public final boolean c(Level level) {
        if (this.d.compareAndSet(false, true)) {
            g();
        }
        return level.intValue() >= this.a.get();
    }

    @Override // defpackage.cfug
    public final boolean ge() {
        return false;
    }

    @Override // defpackage.cfug
    public final void gg() {
        ekzz f = eleg.f("FloggerClientLoggingOptions");
        try {
            g();
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

    @Override // defpackage.evho
    public final /* synthetic */ void d() {
    }

    @Override // defpackage.evho
    public final /* synthetic */ void e() {
    }

    @Override // defpackage.evho
    public final /* synthetic */ void f() {
    }
}
