package defpackage;

import android.support.v7.widget.RecyclerView;
import android.util.SparseArray;
import android.view.View;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class wf {
    public final ArrayList a;
    public ArrayList b;
    public final ArrayList c;
    public final List d;
    public int e;
    int f;
    public we g;
    public final /* synthetic */ RecyclerView h;

    public wf(RecyclerView recyclerView) {
        this.h = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        this.b = null;
        this.c = new ArrayList();
        this.d = DesugarCollections.unmodifiableList(arrayList);
        this.e = 2;
        this.f = 2;
    }

    public final int a(int i) {
        if (i >= 0 && i < this.h.O.a()) {
            RecyclerView recyclerView = this.h;
            return !recyclerView.O.g ? i : recyclerView.g.a(i);
        }
        throw new IndexOutOfBoundsException("invalid position " + i + ". State item count is " + this.h.O.a() + this.h.p());
    }

    public final we b() {
        if (this.g == null) {
            this.g = new we();
            f();
        }
        return this.g;
    }

    public final View c(int i) {
        return q(i, Long.MAX_VALUE).a;
    }

    final void d(wr wrVar, boolean z) {
        RecyclerView.gC(wrVar);
        RecyclerView recyclerView = this.h;
        View view = wrVar.a;
        wt wtVar = recyclerView.S;
        if (wtVar != null) {
            ktb j = wtVar.j();
            kvo.p(view, j instanceof ws ? (ktb) ((ws) j).b.remove(view) : null);
        }
        if (z) {
            int size = this.h.p.size();
            for (int i = 0; i < size; i++) {
                ((wg) this.h.p.get(i)).a();
            }
            vk vkVar = this.h.n;
            if (vkVar != null) {
                vkVar.k(wrVar);
            }
            RecyclerView recyclerView2 = this.h;
            if (recyclerView2.O != null) {
                recyclerView2.i.h(wrVar);
            }
        }
        wrVar.r = null;
        wrVar.q = null;
        b().e(wrVar);
    }

    public final void e() {
        this.a.clear();
        j();
    }

    public final void f() {
        RecyclerView recyclerView;
        vk vkVar;
        we weVar = this.g;
        if (weVar == null || (vkVar = (recyclerView = this.h).n) == null || !recyclerView.r) {
            return;
        }
        weVar.c.add(vkVar);
    }

    public final void g(vk vkVar) {
        h(vkVar, false);
    }

    public final void h(vk vkVar, boolean z) {
        we weVar = this.g;
        if (weVar != null) {
            weVar.c.remove(vkVar);
            if (weVar.c.size() != 0 || z) {
                return;
            }
            for (int i = 0; i < weVar.a.size(); i++) {
                SparseArray sparseArray = weVar.a;
                ArrayList arrayList = ((wd) sparseArray.get(sparseArray.keyAt(i))).a;
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    kzq.b(((wr) arrayList.get(i2)).a);
                }
            }
        }
    }

    final void i(View view) {
        wr l = RecyclerView.l(view);
        l.m = null;
        l.n = false;
        l.i();
        m(l);
    }

    public final void j() {
        int size = this.c.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else {
                k(size);
            }
        }
        this.c.clear();
        if (RecyclerView.b) {
            this.h.N.b();
        }
    }

    public final void k(int i) {
        int i2 = RecyclerView.ab;
        d((wr) this.c.get(i), true);
        this.c.remove(i);
    }

    public final void l(View view) {
        wr l = RecyclerView.l(view);
        if (l.x()) {
            this.h.removeDetachedView(view, false);
        }
        if (l.w()) {
            l.p();
        } else if (l.B()) {
            l.i();
        }
        m(l);
        if (this.h.E == null || l.u()) {
            return;
        }
        this.h.E.b(l);
    }

    final void m(wr wrVar) {
        boolean z;
        vk vkVar;
        boolean z2;
        boolean z3 = false;
        if (wrVar.w() || wrVar.a.getParent() != null) {
            StringBuilder sb = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:");
            sb.append(wrVar.w());
            sb.append(" isAttached:");
            sb.append(wrVar.a.getParent() != null);
            sb.append(this.h.p());
            throw new IllegalArgumentException(sb.toString());
        }
        if (wrVar.x()) {
            throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + wrVar + this.h.p());
        }
        if (wrVar.A()) {
            throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.".concat(this.h.p()));
        }
        if ((wrVar.j & 16) == 0) {
            View view = wrVar.a;
            int[] iArr = kvo.a;
            if (view.hasTransientState()) {
                z = true;
                vkVar = this.h.n;
                if ((vkVar == null && z && vkVar.l(wrVar)) || wrVar.u()) {
                    if (this.f <= 0 || wrVar.q(526)) {
                        z2 = false;
                    } else {
                        int size = this.c.size();
                        if (size >= this.f && size > 0) {
                            k(0);
                            size--;
                        }
                        if (RecyclerView.b && size > 0 && !this.h.N.d(wrVar.c)) {
                            do {
                                size--;
                                if (size < 0) {
                                    break;
                                }
                            } while (this.h.N.d(((wr) this.c.get(size)).c));
                            size++;
                        }
                        this.c.add(size, wrVar);
                        z2 = true;
                    }
                    if (z2) {
                        r1 = false;
                    } else {
                        d(wrVar, true);
                    }
                    z3 = z2;
                } else {
                    r1 = false;
                }
                this.h.i.h(wrVar);
                if (z3 && !r1 && z) {
                    kzq.b(wrVar.a);
                    wrVar.r = null;
                    wrVar.q = null;
                    return;
                }
                return;
            }
        }
        z = false;
        vkVar = this.h.n;
        if (vkVar == null) {
        }
        r1 = false;
        this.h.i.h(wrVar);
        if (z3) {
        }
    }

    final void n(View view) {
        vr vrVar;
        wr l = RecyclerView.l(view);
        if (!l.q(12) && l.y() && (vrVar = this.h.E) != null && !vrVar.h(l, l.gA())) {
            if (this.b == null) {
                this.b = new ArrayList();
            }
            l.o(this, true);
            this.b.add(l);
            return;
        }
        if (l.t() && !l.v()) {
            RecyclerView recyclerView = this.h;
            if (!recyclerView.n.b) {
                throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.".concat(recyclerView.p()));
            }
        }
        l.o(this, false);
        this.a.add(l);
    }

    public final void o(wr wrVar) {
        if (wrVar.n) {
            this.b.remove(wrVar);
        } else {
            this.a.remove(wrVar);
        }
        wrVar.m = null;
        wrVar.n = false;
        wrVar.i();
    }

    public final void p() {
        vx vxVar = this.h.o;
        this.f = this.e + (vxVar != null ? vxVar.D : 0);
        int size = this.c.size();
        while (true) {
            size--;
            if (size < 0 || this.c.size() <= this.f) {
                return;
            } else {
                k(size);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:142:0x02a2, code lost:
    
        r8 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x0417, code lost:
    
        if ((r11 + r9) >= r23) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01b9, code lost:
    
        if (r21.h.O.g == false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01f3, code lost:
    
        if (r8.e != r9.hb(r8.c)) goto L113;
     */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x04a0  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x04c8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x04ac  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0460  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0495  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x038e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final defpackage.wr q(int r22, long r23) {
        /*
            Method dump skipped, instructions count: 1284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wf.q(int, long):wr");
    }
}
