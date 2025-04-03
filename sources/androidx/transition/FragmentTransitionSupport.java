package androidx.transition;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import defpackage.a;
import defpackage.gp;
import defpackage.kqs;
import defpackage.ozt;
import defpackage.ozu;
import defpackage.ozv;
import defpackage.ozw;
import defpackage.ozx;
import defpackage.ozy;
import defpackage.pab;
import defpackage.pai;
import defpackage.par;
import defpackage.pav;
import defpackage.paz;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public class FragmentTransitionSupport extends gp {
    private static boolean A(par parVar) {
        return (x(parVar.d) && x(null) && x(null)) ? false : true;
    }

    @Override // defpackage.gp
    public final Object a(Object obj) {
        if (obj != null) {
            return ((par) obj).clone();
        }
        return null;
    }

    @Override // defpackage.gp
    public final Object b(Object obj) {
        if (obj == null) {
            return null;
        }
        paz pazVar = new paz();
        pazVar.O((par) obj);
        return pazVar;
    }

    @Override // defpackage.gp
    public final void c(Object obj, View view) {
        ((par) obj).G(view);
    }

    @Override // defpackage.gp
    public final void d(Object obj, ArrayList arrayList) {
        par parVar = (par) obj;
        if (parVar == null) {
            return;
        }
        int i = 0;
        if (parVar instanceof paz) {
            paz pazVar = (paz) parVar;
            int f = pazVar.f();
            while (i < f) {
                d(pazVar.g(i), arrayList);
                i++;
            }
            return;
        }
        if (A(parVar) || !x(parVar.e)) {
            return;
        }
        int size = arrayList.size();
        while (i < size) {
            parVar.G((View) arrayList.get(i));
            i++;
        }
    }

    @Override // defpackage.gp
    public final void e(ViewGroup viewGroup, Object obj) {
        pav.b(viewGroup, (par) obj);
    }

    public final void f(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        par parVar = (par) obj;
        int i = 0;
        if (parVar instanceof paz) {
            paz pazVar = (paz) parVar;
            int f = pazVar.f();
            while (i < f) {
                f(pazVar.g(i), arrayList, arrayList2);
                i++;
            }
            return;
        }
        if (A(parVar)) {
            return;
        }
        ArrayList arrayList3 = parVar.e;
        if (arrayList3.size() != arrayList.size() || !arrayList3.containsAll(arrayList)) {
            return;
        }
        int size = arrayList2 == null ? 0 : arrayList2.size();
        while (i < size) {
            parVar.G((View) arrayList2.get(i));
            i++;
        }
        int size2 = arrayList.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                return;
            } else {
                parVar.J((View) arrayList.get(size2));
            }
        }
    }

    @Override // defpackage.gp
    public final void g(Object obj, View view, ArrayList arrayList) {
        ((par) obj).F(new ozv(view, arrayList));
    }

    @Override // defpackage.gp
    public final void h(Object obj, Rect rect) {
        ((par) obj).z(new ozy());
    }

    @Override // defpackage.gp
    public final void i(Object obj, View view) {
        if (view != null) {
            y(view, new Rect());
            ((par) obj).z(new ozu());
        }
    }

    @Override // defpackage.gp
    public final void j(Object obj, View view, ArrayList arrayList) {
        paz pazVar = (paz) obj;
        ArrayList arrayList2 = pazVar.e;
        arrayList2.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            v(arrayList2, (View) arrayList.get(i));
        }
        arrayList2.add(view);
        arrayList.add(view);
        d(pazVar, arrayList);
    }

    @Override // defpackage.gp
    public final void k(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        paz pazVar = (paz) obj;
        if (pazVar != null) {
            pazVar.e.clear();
            pazVar.e.addAll(arrayList2);
            f(pazVar, arrayList, arrayList2);
        }
    }

    @Override // defpackage.gp
    public final boolean l(Object obj) {
        return obj instanceof par;
    }

    @Override // defpackage.gp
    public final boolean m() {
        return true;
    }

    @Override // defpackage.gp
    public final boolean n(Object obj) {
        boolean d = ((par) obj).d();
        if (!d) {
            Log.v("FragmentManager", a.i(obj, "Predictive back not available for AndroidX Transition ", ". Please enable seeking support for the designated transition by overriding isSeekingSupported()."));
        }
        return d;
    }

    @Override // defpackage.gp
    public final Object o(Object obj, Object obj2) {
        paz pazVar = new paz();
        if (obj != null) {
            pazVar.O((par) obj);
        }
        pazVar.O((par) obj2);
        return pazVar;
    }

    @Override // defpackage.gp
    public final void p(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2) {
        ((par) obj).F(new ozw(this, obj2, arrayList, obj3, arrayList2));
    }

    @Override // defpackage.gp
    public final void q(Object obj, kqs kqsVar, Runnable runnable) {
        z(obj, kqsVar, null, runnable);
    }

    @Override // defpackage.gp
    public final Object r(Object obj, Object obj2) {
        par parVar = (par) obj;
        par parVar2 = (par) obj2;
        if (parVar == null) {
            parVar = null;
        }
        if (parVar2 == null) {
            return parVar;
        }
        paz pazVar = new paz();
        if (parVar != null) {
            pazVar.O(parVar);
        }
        pazVar.O(parVar2);
        return pazVar;
    }

    @Override // defpackage.gp
    public final Object s(ViewGroup viewGroup, Object obj) {
        par parVar = (par) obj;
        if (pav.a.contains(viewGroup) || !viewGroup.isLaidOut() || Build.VERSION.SDK_INT < 34) {
            return null;
        }
        if (!parVar.d()) {
            throw new IllegalArgumentException("The Transition must support seeking.");
        }
        pav.a.add(viewGroup);
        par clone = parVar.clone();
        paz pazVar = new paz();
        pazVar.O(clone);
        pav.d(viewGroup, pazVar);
        pab.a(viewGroup);
        pav.c(viewGroup, pazVar);
        viewGroup.invalidate();
        pazVar.t = new pai(pazVar);
        pazVar.F(pazVar.t);
        return pazVar.t;
    }

    @Override // defpackage.gp
    public final void t(Object obj) {
        ((pai) obj).i();
    }

    @Override // defpackage.gp
    public final void u(Object obj, Runnable runnable) {
        ((pai) obj).j(runnable);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0039, code lost:
    
        if (r8 > 0) goto L28;
     */
    @Override // defpackage.gp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void w(java.lang.Object r11, float r12) {
        /*
            r10 = this;
            pai r11 = (defpackage.pai) r11
            boolean r0 = r11.b
            if (r0 == 0) goto L6c
            long r0 = r11.h()
            float r0 = (float) r0
            float r12 = r12 * r0
            long r0 = (long) r12
            r2 = 0
            int r12 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r4 = 1
            if (r12 != 0) goto L16
            r0 = r4
        L16:
            long r6 = r11.h()
            int r12 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            r6 = -1
            if (r12 != 0) goto L25
            long r0 = r11.h()
            long r0 = r0 + r6
        L25:
            lel r12 = r11.e
            if (r12 != 0) goto L64
            long r8 = r11.a
            int r12 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r12 == 0) goto L6c
            boolean r12 = r11.c
            if (r12 != 0) goto L59
            int r12 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r12 != 0) goto L3c
            int r12 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r12 <= 0) goto L3d
            goto L4d
        L3c:
            r2 = r0
        L3d:
            long r0 = r11.h()
            int r12 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r12 != 0) goto L4c
            int r12 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r12 >= 0) goto L4c
            long r6 = r0 + r4
            goto L4d
        L4c:
            r6 = r2
        L4d:
            int r12 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r12 == 0) goto L58
            par r12 = r11.h
            r12.y(r6, r8)
            r11.a = r6
        L58:
            r0 = r6
        L59:
            pbd r11 = r11.f
            long r2 = android.view.animation.AnimationUtils.currentAnimationTimeMillis()
            float r12 = (float) r0
            r11.a(r2, r12)
            return
        L64:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "setCurrentPlayTimeMillis() called after animation has been started"
            r11.<init>(r12)
            throw r11
        L6c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.FragmentTransitionSupport.w(java.lang.Object, float):void");
    }

    @Override // defpackage.gp
    public final void z(Object obj, kqs kqsVar, Runnable runnable, Runnable runnable2) {
        par parVar = (par) obj;
        ozt oztVar = new ozt(runnable, parVar, runnable2);
        synchronized (kqsVar) {
            while (kqsVar.b) {
                try {
                    kqsVar.wait();
                } catch (InterruptedException unused) {
                }
            }
            if (kqsVar.c != oztVar) {
                kqsVar.c = oztVar;
                if (kqsVar.a) {
                    oztVar.a();
                }
            }
        }
        parVar.F(new ozx(runnable2));
    }
}
