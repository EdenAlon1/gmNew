package defpackage;

import android.os.Trace;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import defpackage.wr;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class vk<VH extends wr> {
    private final vl sA = new vl();
    public boolean b = false;
    public int c = 1;

    public void A(vm vmVar) {
        this.sA.registerObserver(vmVar);
    }

    public final void B(boolean z) {
        if (this.sA.h()) {
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }
        this.b = z;
    }

    public void C(vm vmVar) {
        this.sA.unregisterObserver(vmVar);
    }

    public final boolean D() {
        int i = this.c;
        int i2 = i - 1;
        if (i != 0) {
            return i2 != 1 ? i2 != 2 : a() > 0;
        }
        throw null;
    }

    public final void E(int i) {
        this.c = i;
        this.sA.g();
    }

    public abstract int a();

    public int dD(vk vkVar, wr wrVar, int i) {
        if (vkVar == this) {
            return i;
        }
        return -1;
    }

    public int dE(int i) {
        return 0;
    }

    public abstract wr e(ViewGroup viewGroup, int i);

    public abstract void g(wr wrVar, int i);

    public long hb(int i) {
        return -1L;
    }

    public boolean l(wr wrVar) {
        return false;
    }

    public final wr n(ViewGroup viewGroup, int i) {
        try {
            if (kra.a()) {
                Trace.beginSection(String.format("RV onCreateViewHolder type=0x%X", Integer.valueOf(i)));
            }
            wr e = e(viewGroup, i);
            if (e.a.getParent() != null) {
                throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
            }
            e.f = i;
            return e;
        } finally {
            Trace.endSection();
        }
    }

    public final void o(wr wrVar, int i) {
        boolean z = wrVar.r == null;
        if (z) {
            wrVar.c = i;
            if (this.b) {
                wrVar.e = hb(i);
            }
            wrVar.m(1, 519);
            if (kra.a()) {
                Trace.beginSection(String.format("RV onBindViewHolder type=0x%X", Integer.valueOf(wrVar.f)));
            }
        }
        wrVar.r = this;
        int i2 = RecyclerView.ab;
        z(wrVar, i, wrVar.gA());
        if (z) {
            wrVar.h();
            ViewGroup.LayoutParams layoutParams = wrVar.a.getLayoutParams();
            if (layoutParams instanceof vy) {
                ((vy) layoutParams).e = true;
            }
            Trace.endSection();
        }
    }

    public final void p() {
        this.sA.a();
    }

    public final void q(int i) {
        this.sA.c(i, 1);
    }

    public final void r(int i, Object obj) {
        this.sA.d(i, 1, obj);
    }

    public final void s(int i) {
        this.sA.e(i, 1);
    }

    public final void t(int i, int i2) {
        this.sA.b(i, i2);
    }

    public final void u(int i, int i2) {
        this.sA.c(i, i2);
    }

    public final void v(int i, int i2, Object obj) {
        this.sA.d(i, i2, obj);
    }

    public final void w(int i, int i2) {
        this.sA.e(i, i2);
    }

    public final void x(int i, int i2) {
        this.sA.f(i, i2);
    }

    public final void y(int i) {
        this.sA.f(i, 1);
    }

    public void z(wr wrVar, int i, List list) {
        g(wrVar, i);
    }

    public void h(RecyclerView recyclerView) {
    }

    public void hc(RecyclerView recyclerView) {
    }

    public void i(wr wrVar) {
    }

    public void j(wr wrVar) {
    }

    public void k(wr wrVar) {
    }
}
