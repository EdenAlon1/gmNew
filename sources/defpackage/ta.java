package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ta extends xv {
    private static TimeInterpolator m;
    private final ArrayList n = new ArrayList();
    private final ArrayList o = new ArrayList();
    private final ArrayList p = new ArrayList();
    private final ArrayList q = new ArrayList();
    final ArrayList a = new ArrayList();
    final ArrayList b = new ArrayList();
    final ArrayList c = new ArrayList();
    final ArrayList d = new ArrayList();
    final ArrayList e = new ArrayList();
    final ArrayList f = new ArrayList();
    final ArrayList g = new ArrayList();

    private final void A(sy syVar) {
        wr wrVar = syVar.a;
        if (wrVar != null) {
            C(syVar, wrVar);
        }
        wr wrVar2 = syVar.b;
        if (wrVar2 != null) {
            C(syVar, wrVar2);
        }
    }

    private final void B(wr wrVar) {
        if (m == null) {
            m = new ValueAnimator().getInterpolator();
        }
        wrVar.a.animate().setInterpolator(m);
        b(wrVar);
    }

    private final boolean C(sy syVar, wr wrVar) {
        if (syVar.b == wrVar) {
            syVar.b = null;
        } else {
            if (syVar.a != wrVar) {
                return false;
            }
            syVar.a = null;
        }
        wrVar.a.setAlpha(1.0f);
        wrVar.a.setTranslationX(0.0f);
        wrVar.a.setTranslationY(0.0f);
        p(wrVar);
        return true;
    }

    static final void k(List list) {
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((wr) list.get(size)).a.animate().cancel();
            }
        }
    }

    private final void z(List list, wr wrVar) {
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            sy syVar = (sy) list.get(size);
            if (C(syVar, wrVar) && syVar.a == null && syVar.b == null) {
                list.remove(syVar);
            }
        }
    }

    final void a() {
        if (i()) {
            return;
        }
        q();
    }

    @Override // defpackage.vr
    public final void b(wr wrVar) {
        View view = wrVar.a;
        view.animate().cancel();
        int size = this.p.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((sz) this.p.get(size)).a == wrVar) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                p(wrVar);
                this.p.remove(size);
            }
        }
        z(this.q, wrVar);
        if (this.n.remove(wrVar)) {
            view.setAlpha(1.0f);
            p(wrVar);
        }
        if (this.o.remove(wrVar)) {
            view.setAlpha(1.0f);
            p(wrVar);
        }
        int size2 = this.c.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            ArrayList arrayList = (ArrayList) this.c.get(size2);
            z(arrayList, wrVar);
            if (arrayList.isEmpty()) {
                this.c.remove(size2);
            }
        }
        int size3 = this.b.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            ArrayList arrayList2 = (ArrayList) this.b.get(size3);
            int size4 = arrayList2.size();
            while (true) {
                size4--;
                if (size4 < 0) {
                    break;
                }
                if (((sz) arrayList2.get(size4)).a == wrVar) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    p(wrVar);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.b.remove(size3);
                    }
                }
            }
        }
        int size5 = this.a.size();
        while (true) {
            size5--;
            if (size5 < 0) {
                this.f.remove(wrVar);
                this.d.remove(wrVar);
                this.g.remove(wrVar);
                this.e.remove(wrVar);
                a();
                return;
            }
            ArrayList arrayList3 = (ArrayList) this.a.get(size5);
            if (arrayList3.remove(wrVar)) {
                view.setAlpha(1.0f);
                p(wrVar);
                if (arrayList3.isEmpty()) {
                    this.a.remove(size5);
                }
            }
        }
    }

    @Override // defpackage.vr
    public final void c() {
        int size = this.p.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            sz szVar = (sz) this.p.get(size);
            View view = szVar.a.a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            p(szVar.a);
            this.p.remove(size);
        }
        int size2 = this.n.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            p((wr) this.n.get(size2));
            this.n.remove(size2);
        }
        int size3 = this.o.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            wr wrVar = (wr) this.o.get(size3);
            wrVar.a.setAlpha(1.0f);
            p(wrVar);
            this.o.remove(size3);
        }
        int size4 = this.q.size();
        while (true) {
            size4--;
            if (size4 < 0) {
                break;
            } else {
                A((sy) this.q.get(size4));
            }
        }
        this.q.clear();
        if (!i()) {
            return;
        }
        int size5 = this.b.size();
        while (true) {
            size5--;
            if (size5 < 0) {
                break;
            }
            ArrayList arrayList = (ArrayList) this.b.get(size5);
            int size6 = arrayList.size();
            while (true) {
                size6--;
                if (size6 >= 0) {
                    sz szVar2 = (sz) arrayList.get(size6);
                    View view2 = szVar2.a.a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    p(szVar2.a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.b.remove(arrayList);
                    }
                }
            }
        }
        int size7 = this.a.size();
        while (true) {
            size7--;
            if (size7 < 0) {
                break;
            }
            ArrayList arrayList2 = (ArrayList) this.a.get(size7);
            int size8 = arrayList2.size();
            while (true) {
                size8--;
                if (size8 >= 0) {
                    wr wrVar2 = (wr) arrayList2.get(size8);
                    wrVar2.a.setAlpha(1.0f);
                    p(wrVar2);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.a.remove(arrayList2);
                    }
                }
            }
        }
        int size9 = this.c.size();
        while (true) {
            size9--;
            if (size9 < 0) {
                k(this.f);
                k(this.e);
                k(this.d);
                k(this.g);
                q();
                return;
            }
            ArrayList arrayList3 = (ArrayList) this.c.get(size9);
            int size10 = arrayList3.size();
            while (true) {
                size10--;
                if (size10 >= 0) {
                    A((sy) arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.c.remove(arrayList3);
                    }
                }
            }
        }
    }

    @Override // defpackage.vr
    public final void d() {
        boolean isEmpty = this.n.isEmpty();
        boolean isEmpty2 = this.p.isEmpty();
        boolean isEmpty3 = this.q.isEmpty();
        boolean z = !isEmpty3;
        boolean isEmpty4 = this.o.isEmpty();
        if (isEmpty && isEmpty2 && isEmpty4) {
            if (isEmpty3) {
                return;
            } else {
                z = true;
            }
        }
        ArrayList arrayList = this.n;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            wr wrVar = (wr) arrayList.get(i);
            View view = wrVar.a;
            ViewPropertyAnimator animate = view.animate();
            this.f.add(wrVar);
            animate.setDuration(this.i).alpha(0.0f).setListener(new st(this, wrVar, animate, view)).start();
        }
        this.n.clear();
        if (!isEmpty2) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(this.p);
            this.b.add(arrayList2);
            this.p.clear();
            sq sqVar = new sq(this, arrayList2);
            if (isEmpty) {
                sqVar.run();
            } else {
                View view2 = ((sz) arrayList2.get(0)).a.a;
                long j = this.i;
                int[] iArr = kvo.a;
                view2.postOnAnimationDelayed(sqVar, j);
            }
        }
        if (z) {
            ArrayList arrayList3 = new ArrayList();
            arrayList3.addAll(this.q);
            this.c.add(arrayList3);
            this.q.clear();
            sr srVar = new sr(this, arrayList3);
            if (isEmpty) {
                srVar.run();
            } else {
                View view3 = ((sy) arrayList3.get(0)).a.a;
                long j2 = this.i;
                int[] iArr2 = kvo.a;
                view3.postOnAnimationDelayed(srVar, j2);
            }
        }
        if (isEmpty4) {
            return;
        }
        ArrayList arrayList4 = new ArrayList();
        arrayList4.addAll(this.o);
        this.a.add(arrayList4);
        this.o.clear();
        ss ssVar = new ss(this, arrayList4);
        if (isEmpty && isEmpty2 && !z) {
            ssVar.run();
            return;
        }
        long max = (!isEmpty ? this.i : 0L) + Math.max(!isEmpty2 ? m() : 0L, z ? 250L : 0L);
        View view4 = ((wr) arrayList4.get(0)).a;
        int[] iArr3 = kvo.a;
        view4.postOnAnimationDelayed(ssVar, max);
    }

    @Override // defpackage.xv
    public final boolean e(wr wrVar) {
        B(wrVar);
        wrVar.a.setAlpha(0.0f);
        this.o.add(wrVar);
        return true;
    }

    @Override // defpackage.xv
    public boolean f(wr wrVar, wr wrVar2, int i, int i2, int i3, int i4) {
        if (wrVar == wrVar2) {
            return g(wrVar, i, i2, i3, i4);
        }
        float translationX = wrVar.a.getTranslationX();
        float translationY = wrVar.a.getTranslationY();
        float alpha = wrVar.a.getAlpha();
        B(wrVar);
        float f = (i3 - i) - translationX;
        float f2 = (i4 - i2) - translationY;
        wrVar.a.setTranslationX(translationX);
        wrVar.a.setTranslationY(translationY);
        wrVar.a.setAlpha(alpha);
        if (wrVar2 != null) {
            B(wrVar2);
            wrVar2.a.setTranslationX(-((int) f));
            wrVar2.a.setTranslationY(-((int) f2));
            wrVar2.a.setAlpha(0.0f);
        }
        this.q.add(new sy(wrVar, wrVar2, i, i2, i3, i4));
        return true;
    }

    @Override // defpackage.xv
    public final boolean g(wr wrVar, int i, int i2, int i3, int i4) {
        View view = wrVar.a;
        int translationX = (int) view.getTranslationX();
        int translationY = (int) wrVar.a.getTranslationY();
        B(wrVar);
        int i5 = i + translationX;
        int i6 = i3 - i5;
        int i7 = i2 + translationY;
        int i8 = i4 - i7;
        if (i6 == 0) {
            i6 = 0;
            if (i8 == 0) {
                p(wrVar);
                return false;
            }
        }
        if (i6 != 0) {
            view.setTranslationX(-i6);
        }
        if (i8 != 0) {
            view.setTranslationY(-i8);
        }
        this.p.add(new sz(wrVar, i5, i7, i3, i4));
        return true;
    }

    @Override // defpackage.vr
    public boolean h(wr wrVar, List list) {
        return !list.isEmpty() || v(wrVar);
    }

    @Override // defpackage.vr
    public final boolean i() {
        return (this.o.isEmpty() && this.q.isEmpty() && this.p.isEmpty() && this.n.isEmpty() && this.e.isEmpty() && this.f.isEmpty() && this.d.isEmpty() && this.g.isEmpty() && this.b.isEmpty() && this.a.isEmpty() && this.c.isEmpty()) ? false : true;
    }

    @Override // defpackage.xv
    public final void j(wr wrVar) {
        B(wrVar);
        this.n.add(wrVar);
    }
}
