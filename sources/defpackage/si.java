package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class si {
    public View d;
    public final vi e;
    public int c = 0;
    public final sh a = new sh();
    public final List b = new ArrayList();

    public si(vi viVar) {
        this.e = viVar;
    }

    private final int m(int i) {
        if (i < 0) {
            return -1;
        }
        int a = this.e.a();
        int i2 = i;
        while (i2 < a) {
            int a2 = i - (i2 - this.a.a(i2));
            if (a2 == 0) {
                while (this.a.f(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += a2;
        }
        return -1;
    }

    public final int a() {
        return this.e.a() - this.b.size();
    }

    public final int b() {
        return this.e.a();
    }

    final int c(View view) {
        int b = this.e.b(view);
        if (b == -1 || this.a.f(b)) {
            return -1;
        }
        return b - this.a.a(b);
    }

    public final View d(int i) {
        return this.e.c(m(i));
    }

    public final View e(int i) {
        return this.e.c(i);
    }

    public final void f(View view, int i, boolean z) {
        int a = i < 0 ? this.e.a() : m(i);
        this.a.c(a, z);
        if (z) {
            i(view);
        }
        vi viVar = this.e;
        viVar.a.addView(view, a);
        wr l = RecyclerView.l(view);
        RecyclerView recyclerView = viVar.a;
        vk vkVar = recyclerView.n;
        if (vkVar != null && l != null) {
            vkVar.i(l);
        }
        List list = recyclerView.x;
        if (list == null) {
            return;
        }
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((vz) recyclerView.x.get(size)).c(view);
            }
        }
    }

    public final void g(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        int a = i < 0 ? this.e.a() : m(i);
        this.a.c(a, z);
        if (z) {
            i(view);
        }
        vi viVar = this.e;
        wr l = RecyclerView.l(view);
        if (l != null) {
            if (!l.x() && !l.A()) {
                throw new IllegalArgumentException("Called attach on a child which is not detached: " + l + viVar.a.p());
            }
            l.j();
        }
        viVar.a.attachViewToParent(view, a, layoutParams);
    }

    final void h(int i) {
        sh shVar = this.a;
        int m = m(i);
        shVar.g(m);
        vi viVar = this.e;
        View c = viVar.c(m);
        if (c != null) {
            wr l = RecyclerView.l(c);
            if (l != null) {
                if (l.x() && !l.A()) {
                    throw new IllegalArgumentException("called detach on an already detached child " + l + viVar.a.p());
                }
                l.f(256);
            }
        } else {
            int i2 = RecyclerView.ab;
        }
        viVar.a.detachViewFromParent(m);
    }

    public final void i(View view) {
        this.b.add(view);
        wr l = RecyclerView.l(view);
        if (l != null) {
            vi viVar = this.e;
            int i = l.p;
            if (i != -1) {
                l.o = i;
            } else {
                l.o = l.a.getImportantForAccessibility();
            }
            viVar.a.aK(l, 4);
        }
    }

    final void j(int i) {
        int i2 = this.c;
        if (i2 == 1) {
            throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
        }
        if (i2 == 2) {
            throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
        try {
            int m = m(i);
            View c = this.e.c(m);
            if (c != null) {
                this.c = 1;
                this.d = c;
                if (this.a.g(m)) {
                    l(c);
                }
                this.e.e(m);
            }
        } finally {
            this.c = 0;
            this.d = null;
        }
    }

    public final boolean k(View view) {
        return this.b.contains(view);
    }

    public final void l(View view) {
        if (this.b.remove(view)) {
            this.e.d(view);
        }
    }

    public final String toString() {
        return this.a.toString() + ", hidden list:" + this.b.size();
    }
}
