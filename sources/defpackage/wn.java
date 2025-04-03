package defpackage;

import android.graphics.PointF;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class wn {
    public RecyclerView h;
    public vx i;
    public boolean j;
    public boolean k;
    public View l;
    public boolean m;
    public int g = -1;
    private final wl a = new wl();

    protected static final void p(PointF pointF) {
        float sqrt = (float) Math.sqrt((pointF.x * pointF.x) + (pointF.y * pointF.y));
        pointF.x /= sqrt;
        pointF.y /= sqrt;
    }

    protected abstract void g();

    protected abstract void i(int i, int i2, wl wlVar);

    protected abstract void j(View view, wl wlVar);

    public final int k() {
        return this.h.o.at();
    }

    public final int l(View view) {
        return this.h.gq(view);
    }

    public PointF m(int i) {
        Object obj = this.i;
        if (obj instanceof wm) {
            return ((wm) obj).Q(i);
        }
        Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement ".concat(String.valueOf(wm.class.getCanonicalName())));
        return null;
    }

    final void n(int i, int i2) {
        PointF m;
        RecyclerView recyclerView = this.h;
        if (this.g == -1 || recyclerView == null) {
            o();
        }
        if (this.j && this.l == null && this.i != null && (m = m(this.g)) != null && (m.x != 0.0f || m.y != 0.0f)) {
            recyclerView.aj((int) Math.signum(m.x), (int) Math.signum(m.y), null);
        }
        this.j = false;
        View view = this.l;
        if (view != null) {
            if (l(view) == this.g) {
                View view2 = this.l;
                wo woVar = recyclerView.O;
                j(view2, this.a);
                this.a.a(recyclerView);
                o();
            } else {
                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                this.l = null;
            }
        }
        if (this.k) {
            wo woVar2 = recyclerView.O;
            i(i, i2, this.a);
            wl wlVar = this.a;
            int i3 = wlVar.a;
            wlVar.a(recyclerView);
            if (i3 < 0 || !this.k) {
                return;
            }
            this.j = true;
            recyclerView.L.b();
        }
    }

    public final void o() {
        if (this.k) {
            this.k = false;
            g();
            this.h.O.a = -1;
            this.l = null;
            this.g = -1;
            this.j = false;
            vx vxVar = this.i;
            if (vxVar.x == this) {
                vxVar.x = null;
            }
            this.i = null;
            this.h = null;
        }
    }
}
