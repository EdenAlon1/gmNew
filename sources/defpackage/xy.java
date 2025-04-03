package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class xy extends wa {
    RecyclerView a;
    public Scroller b;
    private final wc c = new xw(this);

    public abstract int a(vx vxVar, int i, int i2);

    public abstract View b(vx vxVar);

    public abstract int[] c(vx vxVar, View view);

    protected wn d(vx vxVar) {
        if (vxVar instanceof wm) {
            return new xx(this, this.a.getContext());
        }
        return null;
    }

    @Override // defpackage.wa
    public final boolean e(int i, int i2) {
        wn d;
        int a;
        RecyclerView recyclerView = this.a;
        vx vxVar = recyclerView.o;
        if (vxVar == null || recyclerView.n == null) {
            return false;
        }
        int i3 = recyclerView.I;
        if ((Math.abs(i2) <= i3 && Math.abs(i) <= i3) || !(vxVar instanceof wm) || (d = d(vxVar)) == null || (a = a(vxVar, i, i2)) == -1) {
            return false;
        }
        d.g = a;
        vxVar.bl(d);
        return true;
    }

    public final void f(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.a;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            recyclerView2.ai(this.c);
            this.a.H = null;
        }
        this.a = recyclerView;
        if (recyclerView != null) {
            if (recyclerView.H != null) {
                throw new IllegalStateException("An instance of OnFlingListener already set.");
            }
            recyclerView.z(this.c);
            RecyclerView recyclerView3 = this.a;
            recyclerView3.H = this;
            this.b = new Scroller(recyclerView3.getContext(), new DecelerateInterpolator());
            g();
        }
    }

    final void g() {
        vx vxVar;
        View b;
        RecyclerView recyclerView = this.a;
        if (recyclerView == null || (vxVar = recyclerView.o) == null || (b = b(vxVar)) == null) {
            return;
        }
        int[] c = c(vxVar, b);
        int i = 0;
        int i2 = c[0];
        if (i2 != 0) {
            i = i2;
        } else if (c[1] == 0) {
            return;
        }
        this.a.as(i, c[1]);
    }
}
