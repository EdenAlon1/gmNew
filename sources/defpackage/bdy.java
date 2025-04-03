package defpackage;

import android.util.Log;
import android.util.Size;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class bdy {
    public final Object e;
    public int f;
    public boolean g;
    public kfb h;
    public final ListenableFuture i;
    public kfb j;
    public final ListenableFuture k;
    public final Size l;
    public final int m;
    public Class n;
    public static final Size b = new Size(0, 0);
    private static final boolean a = avw.h("DeferrableSurface");
    public static final AtomicInteger c = new AtomicInteger(0);
    public static final AtomicInteger d = new AtomicInteger(0);

    public bdy() {
        this(b, 0);
    }

    protected abstract ListenableFuture a();

    public final ListenableFuture b() {
        synchronized (this.e) {
            if (this.g) {
                return new bkk(new bdw("DeferrableSurface already closed.", this));
            }
            return a();
        }
    }

    public final ListenableFuture c() {
        return bkj.d(this.i);
    }

    public void d() {
        kfb kfbVar;
        synchronized (this.e) {
            if (this.g) {
                kfbVar = null;
            } else {
                this.g = true;
                this.j.b(null);
                if (this.f == 0) {
                    kfbVar = this.h;
                    this.h = null;
                } else {
                    kfbVar = null;
                }
                if (avw.h("DeferrableSurface")) {
                    avw.a("DeferrableSurface", "surface closed,  useCount=" + this.f + " closed=true " + this);
                }
            }
        }
        if (kfbVar != null) {
            kfbVar.b(null);
        }
    }

    public final void e() {
        kfb kfbVar;
        synchronized (this.e) {
            int i = this.f;
            if (i == 0) {
                throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
            }
            int i2 = i - 1;
            this.f = i2;
            if (i2 == 0 && this.g) {
                kfbVar = this.h;
                this.h = null;
            } else {
                kfbVar = null;
            }
            if (avw.h("DeferrableSurface")) {
                avw.a("DeferrableSurface", "use count-1,  useCount=" + this.f + " closed=" + this.g + " " + this);
                if (this.f == 0) {
                    g("Surface no longer in use", d.get(), c.decrementAndGet());
                }
            }
        }
        if (kfbVar != null) {
            kfbVar.b(null);
        }
    }

    public final void f() {
        synchronized (this.e) {
            int i = this.f;
            if (i == 0) {
                if (this.g) {
                    throw new bdw("Cannot begin use on a closed surface.", this);
                }
                i = 0;
            }
            this.f = i + 1;
            if (avw.h("DeferrableSurface")) {
                if (this.f == 1) {
                    g("New surface in use", d.get(), c.incrementAndGet());
                }
                avw.a("DeferrableSurface", "use count+1, useCount=" + this.f + " " + this);
            }
        }
    }

    public final void g(String str, int i, int i2) {
        if (!a && avw.h("DeferrableSurface")) {
            avw.a("DeferrableSurface", "DeferrableSurface usage statistics may be inaccurate since debug logging was not enabled at static initialization time. App restart may be required to enable accurate usage statistics.");
        }
        avw.a("DeferrableSurface", str + "[total_surfaces=" + i + ", used_surfaces=" + i2 + "](" + this + "}");
    }

    public final boolean h() {
        boolean z;
        synchronized (this.e) {
            z = this.g;
        }
        return z;
    }

    public bdy(Size size, int i) {
        this.e = new Object();
        this.f = 0;
        this.g = false;
        this.l = size;
        this.m = i;
        ListenableFuture a2 = kfg.a(new kfd() { // from class: bdt
            @Override // defpackage.kfd
            public final Object a(kfb kfbVar) {
                bdy bdyVar = bdy.this;
                synchronized (bdyVar.e) {
                    bdyVar.h = kfbVar;
                }
                return a.i(bdyVar, "DeferrableSurface-termination(", ")");
            }
        });
        this.i = a2;
        this.k = kfg.a(new kfd() { // from class: bdu
            @Override // defpackage.kfd
            public final Object a(kfb kfbVar) {
                bdy bdyVar = bdy.this;
                synchronized (bdyVar.e) {
                    bdyVar.j = kfbVar;
                }
                return a.i(bdyVar, "DeferrableSurface-close(", ")");
            }
        });
        if (avw.h("DeferrableSurface")) {
            g("Surface created", d.incrementAndGet(), c.get());
            final String stackTraceString = Log.getStackTraceString(new Exception());
            a2.b(new Runnable() { // from class: bdv
                @Override // java.lang.Runnable
                public final void run() {
                    bdy bdyVar = bdy.this;
                    try {
                        bdyVar.i.get();
                        bdyVar.g("Surface terminated", bdy.d.decrementAndGet(), bdy.c.get());
                    } catch (Exception e) {
                        avw.c("DeferrableSurface", "Unexpected surface termination for " + bdyVar + "\nStack Trace:\n" + stackTraceString);
                        synchronized (bdyVar.e) {
                            throw new IllegalArgumentException(String.format("DeferrableSurface %s [closed: %b, use_count: %s] terminated with unexpected exception.", bdyVar, Boolean.valueOf(bdyVar.g), Integer.valueOf(bdyVar.f)), e);
                        }
                    }
                }
            }, bjb.a());
        }
    }
}
