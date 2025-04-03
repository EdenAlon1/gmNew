package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewPropertyAnimator;
import com.google.android.apps.messaging.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eacu extends xv {
    private final int q;
    private final long r;
    private final ArrayList e = new ArrayList();
    private final ArrayList f = new ArrayList();
    private final ArrayList g = new ArrayList();
    private final ArrayList m = new ArrayList();
    private final ArrayList n = new ArrayList();
    private final ArrayList o = new ArrayList();
    private final ArrayList p = new ArrayList();
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();

    public eacu(Context context) {
        y();
        x();
        w();
        this.q = context.getResources().getDimensionPixelSize(R.dimen.message_bubble_initial_offset);
        dyhj.a();
        this.r = System.currentTimeMillis();
    }

    private final void A(eacs eacsVar) {
        wr wrVar = eacsVar.a;
        if (wrVar != null) {
            B(eacsVar, wrVar);
        }
        wr wrVar2 = eacsVar.b;
        if (wrVar2 != null) {
            B(eacsVar, wrVar2);
        }
    }

    private final boolean B(eacs eacsVar, wr wrVar) {
        if (eacsVar.b == wrVar) {
            eacsVar.b = null;
        } else {
            if (eacsVar.a != wrVar) {
                return false;
            }
            eacsVar.a = null;
        }
        wrVar.a.setAlpha(1.0f);
        wrVar.a.setTranslationX(0.0f);
        wrVar.a.setTranslationY(0.0f);
        p(wrVar);
        return true;
    }

    private final boolean C(wr wrVar) {
        dyhj.a();
        if (System.currentTimeMillis() - this.r >= 1000) {
            return false;
        }
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
                try {
                    ((wr) list.get(size)).a.animate().cancel();
                } catch (IndexOutOfBoundsException unused) {
                }
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
            eacs eacsVar = (eacs) list.get(size);
            if (B(eacsVar, wrVar) && eacsVar.a == null && eacsVar.b == null) {
                list.remove(eacsVar);
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
        int size = this.g.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((eact) this.g.get(size)).a == wrVar) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                p(wrVar);
                this.g.remove(size);
            }
        }
        z(this.m, wrVar);
        if (this.e.remove(wrVar)) {
            view.setAlpha(1.0f);
            p(wrVar);
        }
        if (this.f.remove(wrVar)) {
            view.setAlpha(1.0f);
            p(wrVar);
        }
        int size2 = this.p.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            ArrayList arrayList = (ArrayList) this.p.get(size2);
            z(arrayList, wrVar);
            if (arrayList.isEmpty()) {
                this.p.remove(size2);
            }
        }
        int size3 = this.o.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            ArrayList arrayList2 = (ArrayList) this.o.get(size3);
            int size4 = arrayList2.size();
            while (true) {
                size4--;
                if (size4 < 0) {
                    break;
                }
                if (((eact) arrayList2.get(size4)).a == wrVar) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    p(wrVar);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.o.remove(size3);
                    }
                }
            }
        }
        int size5 = this.n.size();
        while (true) {
            size5--;
            if (size5 < 0) {
                a();
                return;
            }
            ArrayList arrayList3 = (ArrayList) this.n.get(size5);
            if (arrayList3.remove(wrVar)) {
                view.setAlpha(1.0f);
                p(wrVar);
                if (arrayList3.isEmpty()) {
                    this.n.remove(size5);
                }
            }
        }
    }

    @Override // defpackage.vr
    public final void c() {
        int size = this.g.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            eact eactVar = (eact) this.g.get(size);
            View view = eactVar.a.a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            p(eactVar.a);
            this.g.remove(size);
        }
        int size2 = this.e.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            p((wr) this.e.get(size2));
            this.e.remove(size2);
        }
        int size3 = this.f.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            wr wrVar = (wr) this.f.get(size3);
            wrVar.a.setAlpha(1.0f);
            p(wrVar);
            this.f.remove(size3);
        }
        int size4 = this.m.size();
        while (true) {
            size4--;
            if (size4 < 0) {
                break;
            } else {
                A((eacs) this.m.get(size4));
            }
        }
        this.m.clear();
        if (!i()) {
            return;
        }
        int size5 = this.o.size();
        while (true) {
            size5--;
            if (size5 < 0) {
                break;
            }
            ArrayList arrayList = (ArrayList) this.o.get(size5);
            int size6 = arrayList.size();
            while (true) {
                size6--;
                if (size6 >= 0) {
                    eact eactVar2 = (eact) arrayList.get(size6);
                    View view2 = eactVar2.a.a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    p(eactVar2.a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.o.remove(arrayList);
                    }
                }
            }
        }
        int size7 = this.n.size();
        while (true) {
            size7--;
            if (size7 < 0) {
                break;
            }
            ArrayList arrayList2 = (ArrayList) this.n.get(size7);
            int size8 = arrayList2.size();
            while (true) {
                size8--;
                if (size8 >= 0) {
                    wr wrVar2 = (wr) arrayList2.get(size8);
                    wrVar2.a.setAlpha(1.0f);
                    p(wrVar2);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.n.remove(arrayList2);
                    }
                }
            }
        }
        int size9 = this.p.size();
        while (true) {
            size9--;
            if (size9 < 0) {
                k(this.c);
                k(this.b);
                k(this.a);
                k(this.d);
                q();
                return;
            }
            ArrayList arrayList3 = (ArrayList) this.p.get(size9);
            int size10 = arrayList3.size();
            while (true) {
                size10--;
                if (size10 >= 0) {
                    A((eacs) arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.p.remove(arrayList3);
                    }
                }
            }
        }
    }

    @Override // defpackage.vr
    public final void d() {
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            wr wrVar = (wr) arrayList.get(i);
            View view = wrVar.a;
            ViewPropertyAnimator animate = view.animate();
            this.c.add(wrVar);
            animate.setDuration(this.i).alpha(0.0f).setListener(new eacn(this, wrVar, animate, view)).start();
        }
        ArrayList arrayList2 = this.g;
        int size2 = arrayList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            eact eactVar = (eact) arrayList2.get(i2);
            wr wrVar2 = eactVar.a;
            int i3 = eactVar.b;
            int i4 = eactVar.c;
            int i5 = eactVar.d;
            int i6 = eactVar.e;
            View view2 = wrVar2.a;
            int i7 = i5 - i3;
            int i8 = i6 - i4;
            if (i7 != 0) {
                view2.animate().translationX(0.0f);
            }
            if (i8 != 0) {
                view2.animate().translationY(0.0f);
            }
            ViewPropertyAnimator animate2 = view2.animate();
            if (i7 != 0) {
                animate2.translationX(0.0f);
            }
            if (i8 != 0) {
                animate2.translationY(0.0f);
            }
            this.b.add(wrVar2);
            animate2.setDuration(m()).setInterpolator(new ljm()).setListener(new eacp(this, wrVar2, i7, view2, i8, animate2)).start();
        }
        ArrayList arrayList3 = this.m;
        int size3 = arrayList3.size();
        for (int i9 = 0; i9 < size3; i9++) {
            eacs eacsVar = (eacs) arrayList3.get(i9);
            wr wrVar3 = eacsVar.a;
            View view3 = wrVar3 == null ? null : wrVar3.a;
            wr wrVar4 = eacsVar.b;
            View view4 = wrVar4 != null ? wrVar4.a : null;
            if (view3 != null) {
                ViewPropertyAnimator duration = view3.animate().setDuration(250L);
                this.d.add(eacsVar.a);
                duration.translationX(eacsVar.e - eacsVar.c);
                duration.translationY(eacsVar.f - eacsVar.d);
                duration.alpha(0.0f).setListener(new eacq(this, eacsVar, duration, view3)).start();
            }
            if (view4 != null) {
                ArrayList arrayList4 = this.d;
                ViewPropertyAnimator animate3 = view4.animate();
                arrayList4.add(eacsVar.b);
                animate3.translationX(0.0f).translationY(0.0f).setDuration(250L).alpha(1.0f).setListener(new eacr(this, eacsVar, animate3, view4)).start();
            }
        }
        ArrayList arrayList5 = this.f;
        int size4 = arrayList5.size();
        for (int i10 = 0; i10 < size4; i10++) {
            wr wrVar5 = (wr) arrayList5.get(i10);
            View view5 = wrVar5.a;
            ViewPropertyAnimator animate4 = view5.animate();
            this.a.add(wrVar5);
            animate4.setInterpolator(new ljm()).translationX(0.0f).translationY(0.0f).setDuration(this.h).setListener(new eaco(this, wrVar5, view5, animate4)).start();
        }
        this.e.clear();
        this.g.clear();
        this.m.clear();
        this.f.clear();
    }

    @Override // defpackage.xv
    public final boolean e(wr wrVar) {
        b(wrVar);
        if (C(wrVar)) {
            return false;
        }
        wrVar.a.setTranslationY(r0.getHeight());
        View view = wrVar.a;
        if (view instanceof eabr) {
            view.setTranslationX(-this.q);
        }
        this.f.add(wrVar);
        return true;
    }

    @Override // defpackage.xv
    public final boolean f(wr wrVar, wr wrVar2, int i, int i2, int i3, int i4) {
        if (wrVar == wrVar2) {
            return g(wrVar, i, i2, i3, i4);
        }
        float translationX = wrVar.a.getTranslationX();
        float translationY = wrVar.a.getTranslationY();
        float alpha = wrVar.a.getAlpha();
        b(wrVar);
        float f = (i3 - i) - translationX;
        float f2 = (i4 - i2) - translationY;
        wrVar.a.setTranslationX(translationX);
        wrVar.a.setTranslationY(translationY);
        wrVar.a.setAlpha(alpha);
        if (wrVar2 != null) {
            b(wrVar2);
            wrVar2.a.setTranslationX(-((int) f));
            wrVar2.a.setTranslationY(-((int) f2));
            wrVar2.a.setAlpha(0.0f);
        }
        this.m.add(new eacs(wrVar, wrVar2, i, i2, i3, i4));
        return true;
    }

    @Override // defpackage.xv
    public final boolean g(wr wrVar, int i, int i2, int i3, int i4) {
        int i5 = 0;
        if (C(wrVar)) {
            return false;
        }
        View view = wrVar.a;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) wrVar.a.getTranslationY());
        b(wrVar);
        int i6 = i3 - translationX;
        int i7 = i4 - translationY;
        if (i6 != 0) {
            i5 = i6;
        } else if (i7 == 0) {
            p(wrVar);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX(-i5);
        }
        if (i7 != 0) {
            view.setTranslationY(-i7);
        }
        this.g.add(new eact(wrVar, translationX, translationY, i3, i4));
        return true;
    }

    @Override // defpackage.vr
    public final boolean h(wr wrVar, List list) {
        return !list.isEmpty() || v(wrVar);
    }

    @Override // defpackage.vr
    public final boolean i() {
        return (this.f.isEmpty() && this.m.isEmpty() && this.g.isEmpty() && this.e.isEmpty() && this.b.isEmpty() && this.c.isEmpty() && this.a.isEmpty() && this.d.isEmpty() && this.o.isEmpty() && this.n.isEmpty() && this.p.isEmpty()) ? false : true;
    }

    @Override // defpackage.xv
    public final void j(wr wrVar) {
        b(wrVar);
        this.e.add(wrVar);
    }

    @Override // defpackage.vr
    public final long m() {
        if (this.j != 0 || (this.e.isEmpty() && this.f.isEmpty())) {
            return this.j;
        }
        return 217L;
    }

    @Override // defpackage.xv, defpackage.vr
    public final boolean u(wr wrVar, vq vqVar, vq vqVar2) {
        int i = vqVar.a;
        int i2 = vqVar2.a;
        if (i != i2 || vqVar.b != vqVar2.b) {
            return g(wrVar, i, vqVar.b, i2, vqVar2.b);
        }
        p(wrVar);
        return false;
    }
}
