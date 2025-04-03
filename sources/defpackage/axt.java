package defpackage;

import android.util.Range;
import android.util.Size;
import android.view.Surface;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class axt {
    public static final Range a = bgr.g;
    public final Size c;
    public final aua d;
    public final Range e;
    public final bct f;
    final ListenableFuture h;
    public final bdy i;
    public axr j;
    public axs k;
    public Executor l;
    private final kfb m;
    private final ListenableFuture n;
    private final kfb o;
    private final kfb p;
    public final Object b = new Object();
    public final boolean g = true;

    public axt(Size size, bct bctVar, boolean z, aua auaVar, Range range, Runnable runnable) {
        this.c = size;
        this.f = bctVar;
        ksw.b(auaVar.b(), "SurfaceRequest's DynamicRange must always be fully specified.");
        this.d = auaVar;
        this.e = range;
        final String str = "SurfaceRequest[size: " + size + ", id: " + hashCode() + "]";
        final AtomicReference atomicReference = new AtomicReference(null);
        ListenableFuture a2 = kfg.a(new kfd() { // from class: axg
            @Override // defpackage.kfd
            public final Object a(kfb kfbVar) {
                Range range2 = axt.a;
                atomicReference.set(kfbVar);
                return str.concat("-cancellation");
            }
        });
        kfb kfbVar = (kfb) atomicReference.get();
        ksw.h(kfbVar);
        this.p = kfbVar;
        final AtomicReference atomicReference2 = new AtomicReference(null);
        ListenableFuture a3 = kfg.a(new kfd() { // from class: axh
            @Override // defpackage.kfd
            public final Object a(kfb kfbVar2) {
                Range range2 = axt.a;
                atomicReference2.set(kfbVar2);
                return str.concat("-status");
            }
        });
        this.n = a3;
        bkj.i(a3, new axk(kfbVar, a2), bjb.a());
        kfb kfbVar2 = (kfb) atomicReference2.get();
        ksw.h(kfbVar2);
        final AtomicReference atomicReference3 = new AtomicReference(null);
        ListenableFuture a4 = kfg.a(new kfd() { // from class: axi
            @Override // defpackage.kfd
            public final Object a(kfb kfbVar3) {
                Range range2 = axt.a;
                atomicReference3.set(kfbVar3);
                return str.concat("-Surface");
            }
        });
        this.h = a4;
        kfb kfbVar3 = (kfb) atomicReference3.get();
        ksw.h(kfbVar3);
        this.m = kfbVar3;
        axl axlVar = new axl(this, size);
        this.i = axlVar;
        ListenableFuture c = axlVar.c();
        bkj.i(a4, new axm(c, kfbVar2, str), bjb.a());
        c.b(new Runnable() { // from class: axj
            @Override // java.lang.Runnable
            public final void run() {
                axt.this.h.cancel(true);
            }
        }, bjb.a());
        Executor a5 = bjb.a();
        final AtomicReference atomicReference4 = new AtomicReference(null);
        bkj.i(kfg.a(new kfd() { // from class: axf
            @Override // defpackage.kfd
            public final Object a(kfb kfbVar4) {
                atomicReference4.set(kfbVar4);
                return "SurfaceRequest-surface-recreation(" + axt.this.hashCode() + ")";
            }
        }), new axo(runnable), a5);
        kfb kfbVar4 = (kfb) atomicReference4.get();
        ksw.h(kfbVar4);
        this.o = kfbVar4;
    }

    public final void a(Executor executor, Runnable runnable) {
        this.p.a(runnable, executor);
    }

    public final void b(final Surface surface, Executor executor, final ksp kspVar) {
        if (!surface.isValid()) {
            executor.execute(new Runnable() { // from class: axc
                @Override // java.lang.Runnable
                public final void run() {
                    Range range = axt.a;
                    ksp.this.accept(new asy(2, surface));
                }
            });
            return;
        }
        if (this.m.b(surface) || this.h.isCancelled()) {
            bkj.i(this.n, new axn(kspVar, surface), executor);
            return;
        }
        ksw.c(this.h.isDone());
        try {
            this.h.get();
            executor.execute(new Runnable() { // from class: axd
                @Override // java.lang.Runnable
                public final void run() {
                    Range range = axt.a;
                    ksp.this.accept(new asy(3, surface));
                }
            });
        } catch (InterruptedException | ExecutionException unused) {
            executor.execute(new Runnable() { // from class: axe
                @Override // java.lang.Runnable
                public final void run() {
                    Range range = axt.a;
                    ksp.this.accept(new asy(4, surface));
                }
            });
        }
    }

    public final void c(Executor executor, final axs axsVar) {
        final axr axrVar;
        synchronized (this.b) {
            this.k = axsVar;
            this.l = executor;
            axrVar = this.j;
        }
        if (axrVar != null) {
            executor.execute(new Runnable() { // from class: axb
                @Override // java.lang.Runnable
                public final void run() {
                    Range range = axt.a;
                    axs.this.a(axrVar);
                }
            });
        }
    }

    public final boolean d() {
        return this.h.isDone();
    }

    public final void e() {
        f();
        this.o.b(null);
    }

    public final void f() {
        this.m.c(new bdx());
    }
}
