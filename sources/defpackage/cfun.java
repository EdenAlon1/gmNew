package defpackage;

import android.os.Looper;
import j$.time.Instant;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class cfun implements cfup {
    public static final AtomicBoolean a = new AtomicBoolean(false);
    protected final ecwj b;
    public final Object c;
    protected final AtomicReference d = new AtomicReference();

    /* compiled from: PG */
    public interface a {
        ejvp ev();

        cfuu iy();

        cqoh v();

        errl x();
    }

    public cfun(ecwj ecwjVar, Object obj) {
        this.b = ecwjVar;
        this.c = obj;
    }

    public static boolean n() {
        return a.get() || csjc.a.equals(eovw.ROBOLECTRIC_BUILD);
    }

    @Override // defpackage.ejuh
    public final erph a() {
        long a2 = ((a) ctba.a(a.class)).v().a();
        Object obj = this.d.get();
        return obj != null ? new erph(elfo.e(ejug.a(obj, Instant.ofEpochMilli(a2)))) : new erph(elfo.e(ejug.a));
    }

    @Override // defpackage.ejuh
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final elfl b() {
        Object obj = this.d.get();
        if (obj != null) {
            return elfo.e(obj);
        }
        return elfo.g(new Callable() { // from class: cfum
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return cfun.this.h();
            }
        }, ((a) ctba.a(a.class)).x());
    }

    @Override // defpackage.cfva
    public final Object e() {
        if (Looper.myLooper() == Looper.getMainLooper() && !n()) {
            throw new IllegalThreadStateException(String.valueOf(this.b.d()).concat(" read blocked UI thread at startup"));
        }
        Object obj = this.d.get();
        return obj != null ? obj : h();
    }

    @Override // defpackage.cfva
    public final Object f() {
        return this.c;
    }

    protected final Object g() {
        try {
            return this.b.b();
        } catch (IllegalStateException | NullPointerException e) {
            ensk g = cfuo.a.g();
            g.Y(ente.a, "BuglePhenotype");
            ((enrr) ((enrr) ((enrr) g).g(e)).h("com/google/android/apps/messaging/shared/experiments/flags/CachedFlag", "readPhenotypeFlag", 'l', "CachedFlag.java")).q("Phenotype Flags not initialized. Initializing now.");
            ((a) ctba.a(a.class)).iy().a();
            return this.b.b();
        }
    }

    protected Object h() {
        Object g;
        synchronized (this.b) {
            g = g();
            this.d.set(g);
        }
        return g;
    }

    @Override // defpackage.ejuh
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public String c() {
        return this.b.d();
    }

    @Override // defpackage.cfva
    public String j() {
        return this.b.d();
    }

    @Override // defpackage.cfva
    public void k(Object obj) {
        synchronized (this.b) {
            this.b.g(obj);
            this.d.set(obj);
        }
    }

    @Override // defpackage.cfva
    public void l() {
        this.d.set(null);
        ((a) ctba.a(a.class)).ev().b(elfo.e(null), c());
    }

    @Override // defpackage.cfva
    public final void m() {
        synchronized (this.b) {
            this.b.d = -1;
            this.d.set(null);
        }
    }
}
