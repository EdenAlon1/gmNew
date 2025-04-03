package defpackage;

import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class yj {
    public final ArrayList a = new ArrayList();
    public int b = Integer.MIN_VALUE;
    public int c = Integer.MIN_VALUE;
    public int d = 0;
    public final int e;
    public final /* synthetic */ StaggeredGridLayoutManager f;

    public yj(StaggeredGridLayoutManager staggeredGridLayoutManager, int i) {
        this.f = staggeredGridLayoutManager;
        this.e = i;
    }

    public static final yd r(View view) {
        return (yd) view.getLayoutParams();
    }

    public final int a() {
        return this.f.e ? q(this.a.size() - 1, -1) : q(0, this.a.size());
    }

    public final int b() {
        return this.f.e ? q(0, this.a.size()) : q(this.a.size() - 1, -1);
    }

    public final int c() {
        int i = this.c;
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        i();
        return this.c;
    }

    public final int d(int i) {
        int i2 = this.c;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (this.a.size() == 0) {
            return i;
        }
        i();
        return this.c;
    }

    public final int e() {
        int i = this.b;
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        j();
        return this.b;
    }

    public final int f(int i) {
        int i2 = this.b;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (this.a.size() == 0) {
            return i;
        }
        j();
        return this.b;
    }

    public final View g(int i, int i2) {
        View view = null;
        if (i2 != -1) {
            int size = this.a.size() - 1;
            while (size >= 0) {
                View view2 = (View) this.a.get(size);
                if ((this.f.e && StaggeredGridLayoutManager.bv(view2) >= i) || ((!this.f.e && StaggeredGridLayoutManager.bv(view2) <= i) || !view2.hasFocusable())) {
                    break;
                }
                size--;
                view = view2;
            }
            return view;
        }
        int size2 = this.a.size();
        int i3 = 0;
        while (i3 < size2) {
            View view3 = (View) this.a.get(i3);
            if ((this.f.e && StaggeredGridLayoutManager.bv(view3) <= i) || ((!this.f.e && StaggeredGridLayoutManager.bv(view3) >= i) || !view3.hasFocusable())) {
                break;
            }
            i3++;
            view = view3;
        }
        return view;
    }

    public final void h(View view) {
        yd r = r(view);
        r.a = this;
        this.a.add(view);
        this.c = Integer.MIN_VALUE;
        if (this.a.size() == 1) {
            this.b = Integer.MIN_VALUE;
        }
        if (r.c() || r.b()) {
            this.d += this.f.b.b(view);
        }
    }

    final void i() {
        View view = (View) this.a.get(r0.size() - 1);
        yd r = r(view);
        this.c = this.f.b.a(view);
        if (r.b) {
            yf a = this.f.i.a(r.a());
            if (a == null || a.b != 1) {
                return;
            }
            this.c += a.a(this.e);
        }
    }

    final void j() {
        View view = (View) this.a.get(0);
        yd r = r(view);
        this.b = this.f.b.d(view);
        if (r.b) {
            yf a = this.f.i.a(r.a());
            if (a == null || a.b != -1) {
                return;
            }
            this.b -= a.a(this.e);
        }
    }

    public final void k() {
        this.a.clear();
        this.b = Integer.MIN_VALUE;
        this.c = Integer.MIN_VALUE;
        this.d = 0;
    }

    public final void l(int i) {
        int i2 = this.b;
        if (i2 != Integer.MIN_VALUE) {
            this.b = i2 + i;
        }
        int i3 = this.c;
        if (i3 != Integer.MIN_VALUE) {
            this.c = i3 + i;
        }
    }

    public final void m() {
        int size = this.a.size();
        View view = (View) this.a.remove(size - 1);
        yd r = r(view);
        r.a = null;
        if (r.c() || r.b()) {
            this.d -= this.f.b.b(view);
        }
        if (size == 1) {
            this.b = Integer.MIN_VALUE;
        }
        this.c = Integer.MIN_VALUE;
    }

    public final void n() {
        View view = (View) this.a.remove(0);
        yd r = r(view);
        r.a = null;
        if (this.a.size() == 0) {
            this.c = Integer.MIN_VALUE;
        }
        if (r.c() || r.b()) {
            this.d -= this.f.b.b(view);
        }
        this.b = Integer.MIN_VALUE;
    }

    public final void o(View view) {
        yd r = r(view);
        r.a = this;
        this.a.add(0, view);
        this.b = Integer.MIN_VALUE;
        if (this.a.size() == 1) {
            this.c = Integer.MIN_VALUE;
        }
        if (r.c() || r.b()) {
            this.d += this.f.b.b(view);
        }
    }

    public final void p(int i) {
        this.b = i;
        this.c = i;
    }

    final int q(int i, int i2) {
        View view;
        int j = this.f.b.j();
        int f = this.f.b.f();
        int i3 = i;
        while (true) {
            int i4 = -1;
            if (i3 == i2) {
                return -1;
            }
            view = (View) this.a.get(i3);
            int d = this.f.b.d(view);
            int a = this.f.b.a(view);
            boolean z = d <= f;
            boolean z2 = a >= j;
            if (!z || !z2 || (d >= j && a <= f)) {
                if (i2 > i) {
                    i4 = 1;
                }
                i3 += i4;
            }
        }
        return StaggeredGridLayoutManager.bv(view);
    }
}
