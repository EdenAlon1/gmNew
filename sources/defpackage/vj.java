package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class vj {
    final /* synthetic */ RecyclerView a;

    public vj(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    public final wr a(int i) {
        wr j = this.a.j(i, true);
        if (j == null || this.a.h.k(j.a)) {
            return null;
        }
        return j;
    }

    final void b(ql qlVar) {
        int i = qlVar.a;
        if (i == 1) {
            this.a.o.x(qlVar.b, qlVar.d);
            return;
        }
        if (i == 2) {
            this.a.o.A(qlVar.b, qlVar.d);
            return;
        }
        if (i != 4) {
            if (i != 8) {
                return;
            }
            this.a.o.z(qlVar.b, qlVar.d);
        } else {
            vx vxVar = this.a.o;
            int i2 = qlVar.b;
            int i3 = qlVar.d;
            Object obj = qlVar.c;
            vxVar.B(i2, i3);
        }
    }

    public final void c(int i, int i2, Object obj) {
        int i3;
        int i4;
        int i5;
        RecyclerView recyclerView = this.a;
        int b = recyclerView.h.b();
        int i6 = 0;
        while (true) {
            i3 = i + i2;
            if (i6 >= b) {
                break;
            }
            View e = recyclerView.h.e(i6);
            wr l = RecyclerView.l(e);
            if (l != null && !l.A() && (i5 = l.c) >= i && i5 < i3) {
                l.f(2);
                l.e(obj);
                ((vy) e.getLayoutParams()).e = true;
            }
            i6++;
        }
        wf wfVar = recyclerView.e;
        int size = wfVar.c.size();
        while (true) {
            size--;
            if (size < 0) {
                this.a.Q = true;
                return;
            }
            wr wrVar = (wr) wfVar.c.get(size);
            if (wrVar != null && (i4 = wrVar.c) >= i && i4 < i3) {
                wrVar.f(2);
                wfVar.k(size);
            }
        }
    }

    public final void d(int i, int i2) {
        RecyclerView recyclerView = this.a;
        int b = recyclerView.h.b();
        for (int i3 = 0; i3 < b; i3++) {
            wr l = RecyclerView.l(recyclerView.h.e(i3));
            if (l != null && !l.A() && l.c >= i) {
                l.k(i2, false);
                recyclerView.O.f = true;
            }
        }
        wf wfVar = recyclerView.e;
        int size = wfVar.c.size();
        for (int i4 = 0; i4 < size; i4++) {
            wr wrVar = (wr) wfVar.c.get(i4);
            if (wrVar != null && wrVar.c >= i) {
                wrVar.k(i2, false);
            }
        }
        recyclerView.requestLayout();
        this.a.P = true;
    }

    public final void e(int i, int i2) {
        int i3;
        RecyclerView recyclerView = this.a;
        int b = recyclerView.h.b();
        int i4 = 0;
        while (true) {
            if (i4 >= b) {
                break;
            }
            wr l = RecyclerView.l(recyclerView.h.e(i4));
            if (l != null) {
                int i5 = i < i2 ? i : i2;
                int i6 = l.c;
                if (i6 >= i5) {
                    if (i6 <= (i < i2 ? i2 : i)) {
                        if (i6 == i) {
                            l.k(i2 - i, false);
                        } else {
                            l.k(i >= i2 ? 1 : -1, false);
                        }
                        recyclerView.O.f = true;
                    }
                }
            }
            i4++;
        }
        wf wfVar = recyclerView.e;
        int i7 = i < i2 ? i2 : i;
        int i8 = i < i2 ? i : i2;
        int size = wfVar.c.size();
        for (int i9 = 0; i9 < size; i9++) {
            wr wrVar = (wr) wfVar.c.get(i9);
            if (wrVar != null && (i3 = wrVar.c) >= i8 && i3 <= i7) {
                if (i3 == i) {
                    wrVar.k(i2 - i, false);
                } else {
                    wrVar.k(i < i2 ? -1 : 1, false);
                }
            }
        }
        recyclerView.requestLayout();
        this.a.P = true;
    }

    public final void f(int i, int i2) {
        this.a.V(i, i2, true);
        RecyclerView recyclerView = this.a;
        recyclerView.P = true;
        recyclerView.O.c += i2;
    }
}
