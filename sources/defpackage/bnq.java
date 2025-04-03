package defpackage;

import android.util.Size;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bnq extends bdy {
    final ListenableFuture a;
    kfb o;
    public bdy p;
    public bnu q;

    public bnq(Size size, int i) {
        super(size, i);
        this.a = kfg.a(new kfd() { // from class: bnp
            @Override // defpackage.kfd
            public final Object a(kfb kfbVar) {
                bnq bnqVar = bnq.this;
                bnqVar.o = kfbVar;
                return "SettableFuture hashCode: " + bnqVar.hashCode();
            }
        });
    }

    @Override // defpackage.bdy
    protected final ListenableFuture a() {
        return this.a;
    }

    @Override // defpackage.bdy
    public final void d() {
        super.d();
        biw.c(new Runnable() { // from class: bnn
            @Override // java.lang.Runnable
            public final void run() {
                bnq bnqVar = bnq.this;
                bnu bnuVar = bnqVar.q;
                if (bnuVar != null) {
                    bnuVar.e();
                }
                if (bnqVar.p == null) {
                    bnqVar.o.d();
                }
            }
        });
    }

    public final boolean i(final bdy bdyVar, Runnable runnable) {
        biw.b();
        ksw.h(bdyVar);
        bdy bdyVar2 = this.p;
        if (bdyVar2 == bdyVar) {
            return false;
        }
        ksw.d(bdyVar2 == null, "A different provider has been set. To change the provider, call SurfaceEdge#invalidate before calling SurfaceEdge#setProvider");
        ksw.b(this.l.equals(bdyVar.l), String.format("The provider's size(%s) must match the parent(%s)", this.l, bdyVar.l));
        int i = this.m;
        ksw.b(i == bdyVar.m, String.format("The provider's format(%s) must match the parent(%s)", Integer.valueOf(i), Integer.valueOf(bdyVar.m)));
        ksw.d(!h(), "The parent is closed. Call SurfaceEdge#invalidate() before setting a new provider.");
        this.p = bdyVar;
        bkj.j(bdyVar.b(), this.o);
        bdyVar.f();
        ListenableFuture c = c();
        bdyVar.getClass();
        c.b(new Runnable() { // from class: bno
            @Override // java.lang.Runnable
            public final void run() {
                bdy.this.e();
            }
        }, bjb.a());
        bkj.d(bdyVar.k).b(runnable, bjm.a());
        return true;
    }
}
