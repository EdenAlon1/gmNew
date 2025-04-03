package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csvb implements ekmg, cfug, cssw {
    public final ffbr a;
    public final cfuu e;
    private final errl f;
    private final AtomicBoolean g = new AtomicBoolean(false);
    public final AtomicInteger b = new AtomicInteger(((Integer) ((cfun) csvd.b).c).intValue());
    public final AtomicInteger c = new AtomicInteger(((Integer) ((cfun) csvd.c).c).intValue());
    public final AtomicInteger d = new AtomicInteger(((Integer) ((cfun) csvd.d).c).intValue());

    public csvb(errl errlVar, ffbr ffbrVar, cfuu cfuuVar) {
        this.e = cfuuVar;
        this.a = ffbrVar;
        this.f = errlVar;
    }

    private final void j() {
        elfo.g(new Callable() { // from class: csva
            @Override // java.util.concurrent.Callable
            public final Object call() {
                csvb csvbVar = csvb.this;
                csvbVar.e.a();
                csvbVar.b.set(((Integer) csvd.b.e()).intValue());
                csvbVar.c.set(((Integer) csvd.c.e()).intValue());
                int intValue = ((Integer) csvd.d.e()).intValue();
                if (((cssv) csvbVar.a.b()).a()) {
                    intValue = Math.min(intValue, Level.FINE.intValue());
                }
                csvbVar.d.set(intValue);
                return null;
            }
        }, this.f).k(axnw.b(), erpp.a);
    }

    @Override // defpackage.cssw
    public final void c() {
        j();
    }

    @Override // defpackage.ekmg
    public final int d() {
        return this.b.get();
    }

    @Override // defpackage.ekmg
    public final int e() {
        return this.c.get();
    }

    @Override // defpackage.ekmg
    public final String f() {
        return "logs";
    }

    @Override // defpackage.ekmg
    public final String g() {
        return "flogger_bugle.log";
    }

    @Override // defpackage.cfug
    public final boolean ge() {
        return false;
    }

    @Override // defpackage.cfug
    public final void gg() {
        j();
    }

    @Override // defpackage.ekmg
    public final boolean h() {
        return true;
    }

    @Override // defpackage.ekmg
    public final boolean i(Level level) {
        if (this.g.compareAndSet(false, true)) {
            j();
        }
        return level.intValue() >= this.d.get();
    }
}
