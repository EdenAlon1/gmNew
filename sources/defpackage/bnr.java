package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Range;
import android.view.Surface;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bnr {
    public final int a;
    public final Matrix b;
    public final boolean c;
    public final Rect d;
    public final boolean e;
    public final int f;
    public final bgr g;
    public int h;
    public int i;
    public bnq j;
    private axt n;
    private boolean m = false;
    private final Set o = new HashSet();
    public boolean k = false;
    public final List l = new ArrayList();

    public bnr(int i, int i2, bgr bgrVar, Matrix matrix, boolean z, Rect rect, int i3, int i4, boolean z2) {
        this.f = i;
        this.a = i2;
        this.g = bgrVar;
        this.b = matrix;
        this.c = z;
        this.d = rect;
        this.i = i3;
        this.h = i4;
        this.e = z2;
        this.j = new bnq(bgrVar.c(), i2);
    }

    private final void l() {
        ksw.d(!this.m, "Consumer can only be linked once.");
        this.m = true;
    }

    public final axt a(bct bctVar) {
        return b(bctVar, true);
    }

    public final axt b(bct bctVar, boolean z) {
        biw.b();
        f();
        bgr bgrVar = this.g;
        axt axtVar = new axt(bgrVar.c(), bctVar, true, bgrVar.d(), bgrVar.a(), new Runnable() { // from class: bnh
            @Override // java.lang.Runnable
            public final void run() {
                ScheduledExecutorService a = bjm.a();
                final bnr bnrVar = bnr.this;
                a.execute(new Runnable() { // from class: bnm
                    @Override // java.lang.Runnable
                    public final void run() {
                        bnr bnrVar2 = bnr.this;
                        if (bnrVar2.k) {
                            return;
                        }
                        bnrVar2.i();
                    }
                });
            }
        });
        try {
            final bdy bdyVar = axtVar.i;
            bnq bnqVar = this.j;
            bnqVar.getClass();
            if (bnqVar.i(bdyVar, new bni(bnqVar))) {
                ListenableFuture c = bnqVar.c();
                bdyVar.getClass();
                c.b(new Runnable() { // from class: bnj
                    @Override // java.lang.Runnable
                    public final void run() {
                        bdy.this.d();
                    }
                }, bjb.a());
            }
            this.n = axtVar;
            j();
            return axtVar;
        } catch (bdw e) {
            throw new AssertionError("Surface is somehow already closed", e);
        } catch (RuntimeException e2) {
            axtVar.f();
            throw e2;
        }
    }

    public final bdy c() {
        biw.b();
        f();
        l();
        return this.j;
    }

    public final ListenableFuture d(final int i, final aww awwVar, aww awwVar2) {
        biw.b();
        f();
        l();
        final bnq bnqVar = this.j;
        final aww awwVar3 = null;
        return bkj.g(bnqVar.b(), new bjq(bnqVar, i, awwVar, awwVar3) { // from class: bng
            public final /* synthetic */ bnq b;
            public final /* synthetic */ int c;
            public final /* synthetic */ aww d;
            public final /* synthetic */ aww e = null;

            @Override // defpackage.bjq
            public final ListenableFuture a(Object obj) {
                Surface surface = (Surface) obj;
                ksw.h(surface);
                final bnq bnqVar2 = this.b;
                try {
                    bnqVar2.f();
                    bnu bnuVar = new bnu(surface, this.c, bnr.this.g.c(), this.d, null);
                    ListenableFuture listenableFuture = bnuVar.a;
                    bnqVar2.getClass();
                    listenableFuture.b(new Runnable() { // from class: bnl
                        @Override // java.lang.Runnable
                        public final void run() {
                            bnq.this.e();
                        }
                    }, bjb.a());
                    ksw.d(bnqVar2.q == null, "Consumer can only be linked once.");
                    bnqVar2.q = bnuVar;
                    return bkj.b(bnuVar);
                } catch (bdw e) {
                    return new bkk(e);
                }
            }
        }, bjm.a());
    }

    public final void e(Runnable runnable) {
        biw.b();
        f();
        this.o.add(runnable);
    }

    public final void f() {
        ksw.d(!this.k, "Edge is already closed.");
    }

    public final void g() {
        biw.b();
        this.j.d();
        this.k = true;
    }

    public final void h() {
        biw.b();
        f();
        this.j.d();
    }

    public final void i() {
        biw.b();
        f();
        bnq bnqVar = this.j;
        biw.b();
        if (bnqVar.p != null || bnqVar.h()) {
            this.m = false;
            this.j.d();
            bgr bgrVar = this.g;
            this.j = new bnq(bgrVar.c(), this.a);
            Iterator it = this.o.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }
    }

    public final void j() {
        final axs axsVar;
        Executor executor;
        biw.b();
        final asz aszVar = new asz(this.d, this.i, this.h, this.c, this.b, this.e);
        axt axtVar = this.n;
        if (axtVar != null) {
            synchronized (axtVar.b) {
                axtVar.j = aszVar;
                axsVar = axtVar.k;
                executor = axtVar.l;
            }
            if (axsVar != null && executor != null) {
                executor.execute(new Runnable() { // from class: axa
                    @Override // java.lang.Runnable
                    public final void run() {
                        Range range = axt.a;
                        axs.this.a(aszVar);
                    }
                });
            }
        }
        Iterator it = this.l.iterator();
        while (it.hasNext()) {
            ((ksp) it.next()).accept(aszVar);
        }
    }

    public final void k(final int i, final int i2) {
        biw.c(new Runnable() { // from class: bnk
            @Override // java.lang.Runnable
            public final void run() {
                boolean z;
                bnr bnrVar = bnr.this;
                int i3 = bnrVar.i;
                int i4 = i;
                if (i3 != i4) {
                    bnrVar.i = i4;
                    z = true;
                } else {
                    z = false;
                }
                int i5 = i2;
                if (bnrVar.h != i5) {
                    bnrVar.h = i5;
                } else if (!z) {
                    return;
                }
                bnrVar.j();
            }
        });
    }
}
