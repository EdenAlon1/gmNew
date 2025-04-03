package defpackage;

import android.R;
import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvxv implements View.OnAttachStateChangeListener, View.OnLayoutChangeListener, dvzb {
    private static final enru e = enru.c("com/google/android/libraries/logging/ve/ViewNode");
    public ViewGroup a;
    public final dwde c;
    private final View f;
    private final dvxe g;
    private final dvzc h;
    private dvxe i;
    private List j;
    private final ViewTreeObserver.OnDrawListener q;
    private boolean k = false;
    private boolean l = false;
    private boolean m = false;
    private dvxe n = null;
    public boolean b = false;
    private int r = 2;
    private final Rect o = new Rect();
    public Runnable d = null;
    private boolean p = false;

    private dvxv(View view, dvxe dvxeVar) {
        eyfw checkIsLite;
        this.f = view;
        this.g = dvxeVar;
        this.h = dvxeVar.e;
        dvxq dvxqVar = dvxeVar.c;
        eyfw eyfwVar = dwda.a;
        eyft eyftVar = (eyft) dvxqVar.instance;
        checkIsLite = eyfy.checkIsLite(eyfwVar);
        eyftVar.b(checkIsLite);
        Object l = eyftVar.r.l(checkIsLite.d);
        dwde dwdeVar = (dwde) (l == null ? checkIsLite.b : checkIsLite.c(l));
        this.c = dwdeVar;
        int a = dwdd.a(dwdeVar.b);
        if (a != 0 && a == 3) {
            this.q = new ViewTreeObserver.OnDrawListener() { // from class: dvxt
                @Override // android.view.ViewTreeObserver.OnDrawListener
                public final void onDraw() {
                    final dvxv dvxvVar = dvxv.this;
                    if (!dvxvVar.b && dvxvVar.a.isDirty() && dvxvVar.d == null) {
                        dvxvVar.d = new Runnable() { // from class: dvxu
                            @Override // java.lang.Runnable
                            public final void run() {
                                dvxv.this.m();
                            }
                        };
                        efbd.d(dvxvVar.d, dvxvVar.c.c);
                    }
                }
            };
        } else {
            this.q = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0083, code lost:
    
        if (r8.f.getBottom() < r8.o.bottom) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int A() {
        /*
            r8 = this;
            android.view.View r0 = r8.f
            int r0 = r0.getVisibility()
            r1 = 2
            if (r0 == 0) goto La
            return r1
        La:
            boolean r0 = r8.m
            if (r0 == 0) goto L18
            android.view.View r0 = r8.f
            boolean r0 = r0.isShown()
            if (r0 == 0) goto L17
            goto L18
        L17:
            return r1
        L18:
            dwde r0 = r8.c
            int r0 = r0.b
            int r0 = defpackage.dwdd.a(r0)
            r2 = 1
            if (r0 != 0) goto L25
            goto Ld6
        L25:
            if (r0 == r2) goto Ld6
            android.view.ViewGroup r0 = r8.a
            if (r0 != 0) goto L2c
            return r1
        L2c:
            android.graphics.Rect r3 = r8.o
            int r0 = r0.getScrollX()
            android.view.ViewGroup r4 = r8.a
            int r4 = r4.getScrollY()
            android.view.ViewGroup r5 = r8.a
            int r5 = r5.getWidth()
            android.view.ViewGroup r6 = r8.a
            int r6 = r6.getScrollX()
            int r5 = r5 + r6
            android.view.ViewGroup r6 = r8.a
            int r6 = r6.getHeight()
            android.view.ViewGroup r7 = r8.a
            int r7 = r7.getScrollY()
            int r6 = r6 + r7
            r3.set(r0, r4, r5, r6)
            android.view.View r0 = r8.f
            android.graphics.Rect r3 = r8.o
            int r0 = r0.getLeft()
            int r3 = r3.left
            if (r0 > r3) goto L85
            android.view.View r0 = r8.f
            android.graphics.Rect r3 = r8.o
            int r0 = r0.getTop()
            int r3 = r3.top
            if (r0 > r3) goto L85
            android.view.View r0 = r8.f
            android.graphics.Rect r3 = r8.o
            int r0 = r0.getRight()
            int r3 = r3.right
            if (r0 < r3) goto L85
            android.view.View r0 = r8.f
            android.graphics.Rect r3 = r8.o
            int r0 = r0.getBottom()
            int r3 = r3.bottom
            if (r0 >= r3) goto Ld6
        L85:
            android.graphics.Rect r0 = r8.o
            android.view.View r3 = r8.f
            int r4 = r3.getLeft()
            int r5 = r3.getTop()
            int r6 = r3.getRight()
            int r3 = r3.getBottom()
            boolean r0 = r0.intersect(r4, r5, r6, r3)
            if (r0 == 0) goto Ld5
            android.graphics.Rect r0 = r8.o
            java.lang.String r3 = "V="
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r3.concat(r0)
            java.lang.String r3 = "GIL"
            android.util.Log.d(r3, r0)
            android.graphics.Rect r0 = r8.o
            int r3 = r0.width()
            int r0 = r0.height()
            int r3 = r3 * r0
            android.view.View r0 = r8.f
            int r4 = r0.getWidth()
            int r0 = r0.getHeight()
            int r4 = r4 * r0
            dwde r0 = r8.c
            int r3 = r3 * 100
            int r3 = r3 / r4
            dwcz r0 = r0.d
            if (r0 != 0) goto Ld1
            dwcz r0 = defpackage.dwcz.a
        Ld1:
            int r0 = r0.b
            if (r3 >= r0) goto Ld6
        Ld5:
            return r1
        Ld6:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dvxv.A():int");
    }

    private final boolean B(int i) {
        int i2 = this.r;
        if (i == i2) {
            return false;
        }
        this.r = i;
        if (!this.l) {
            return true;
        }
        this.h.f(this.g, i2, i);
        return true;
    }

    public static View a(Activity activity) {
        return activity.findViewById(R.id.content);
    }

    public static View b(dvxe dvxeVar) {
        dvzb dvzbVar = dvxeVar.f;
        if (dvzbVar instanceof dvxv) {
            return ((dvxv) dvzbVar).f;
        }
        return null;
    }

    public static dvxe c(View view) {
        return (dvxe) view.getTag(com.google.android.apps.messaging.R.id.ve_tag);
    }

    public static boolean q(View view) {
        return view.getId() == 16908290;
    }

    static void s(View view, dvxe dvxeVar) {
        dvxv dvxvVar = new dvxv(view, dvxeVar);
        dvxeVar.f = dvxvVar;
        dvxvVar.f.setTag(com.google.android.apps.messaging.R.id.ve_tag, dvxvVar.g);
        if (dvxvVar.h.e()) {
            dvxvVar.f.addOnAttachStateChangeListener(dvxvVar);
            View view2 = dvxvVar.f;
            int[] iArr = kvo.a;
            if (view2.isAttachedToWindow()) {
                dvxvVar.onViewAttachedToWindow(dvxvVar.f);
            }
        }
    }

    private static String v(View view) {
        if (view.getId() != -1) {
            try {
                return view.getResources().getResourceEntryName(view.getId());
            } catch (Resources.NotFoundException unused) {
                return String.valueOf(view.getClass().getSimpleName()).concat("#ResourceNotFoundException");
            }
        }
        return view.getClass().getSimpleName() + "#" + String.valueOf(view.getTag());
    }

    private final void w() {
        Runnable runnable = this.d;
        if (runnable != null) {
            efbd.f(runnable);
            this.d = null;
        }
    }

    private final void x() {
        int a;
        w();
        int a2 = dwdd.a(this.c.b);
        if (a2 != 0 && a2 == 3) {
            this.f.getViewTreeObserver().removeOnDrawListener(this.q);
        }
        if (this.a == null || ((a = dwdd.a(this.c.b)) != 0 && a == 2)) {
            this.f.removeOnLayoutChangeListener(this);
        }
        ViewGroup viewGroup = this.a;
        if (viewGroup != null) {
            viewGroup.removeOnLayoutChangeListener(this);
            this.a = null;
        }
    }

    private final void y() {
        boolean isTemporarilyDetached;
        int a;
        emxf.l(this.k);
        if (this.m) {
            ViewGroup viewGroup = (ViewGroup) this.f.getRootView().findViewById(R.id.content);
            viewGroup.getClass();
            this.a = viewGroup;
        } else {
            this.a = (ViewGroup) this.f.getParent();
        }
        ViewGroup viewGroup2 = this.a;
        if (viewGroup2 != null) {
            viewGroup2.addOnLayoutChangeListener(this);
        } else if (Log.isLoggable("GIL", 3)) {
            isTemporarilyDetached = this.f.isTemporarilyDetached();
            if (!isTemporarilyDetached) {
                Log.d("GIL", "Unexpected null parent: ".concat(String.valueOf(String.valueOf(this.g))));
            }
        }
        if (this.a == null || ((a = dwdd.a(this.c.b)) != 0 && a == 2)) {
            this.f.addOnLayoutChangeListener(this);
        }
        int a2 = dwdd.a(this.c.b);
        if (a2 != 0 && a2 == 3) {
            this.f.getViewTreeObserver().addOnDrawListener(this.q);
        }
    }

    private static void z(View view, dvza dvzaVar) {
        dvxe c = c(view);
        if (c != null) {
            dvzb dvzbVar = c.f;
            if (dvzbVar instanceof dvxv) {
                dvxv dvxvVar = (dvxv) dvzbVar;
                if (dvxvVar.i != null || dvxvVar.m) {
                    return;
                }
            }
            dvzaVar.b(c);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                z(viewGroup.getChildAt(i), dvzaVar);
            }
        }
    }

    @Override // defpackage.dvzb
    public final /* bridge */ /* synthetic */ Object d() {
        if (p() || this.m) {
            return null;
        }
        dvxe dvxeVar = this.i;
        if (dvxeVar != null) {
            return dvxeVar;
        }
        dvxe dvxeVar2 = this.n;
        if (dvxeVar2 != null) {
            return dvxeVar2;
        }
        for (ViewParent parent = this.f.getParent(); parent != null && (parent instanceof View); parent = parent.getParent()) {
            View view = (View) parent;
            dvxe c = c(view);
            if (c != null) {
                if (!this.k) {
                    return c;
                }
                this.n = c;
                return c;
            }
            if (q(view)) {
                return null;
            }
        }
        return null;
    }

    @Override // defpackage.dvzb
    public final /* bridge */ /* synthetic */ void e(Object obj) {
        if (this.j == null) {
            this.j = new ArrayList();
        }
        dvzb dvzbVar = ((dvxe) obj).f;
        emxf.a(this.j.add(obj));
        dvzbVar.k(this.g);
        if (this.k) {
            dvzbVar.h();
        }
    }

    @Override // defpackage.dvzb
    public final void f() {
        emxf.m(this.i != null, "No parent override to unset");
        this.i = null;
        if (this.k) {
            h();
        }
    }

    @Override // defpackage.dvzb
    public final void g() {
        if (this.h.e()) {
            this.f.removeOnAttachStateChangeListener(this);
            View view = this.f;
            int[] iArr = kvo.a;
            if (view.isAttachedToWindow()) {
                onViewDetachedFromWindow(this.f);
            }
        }
        dvxe dvxeVar = this.i;
        if (dvxeVar != null) {
            dvxeVar.f.j(this.g);
        }
        List<dvxe> list = this.j;
        if (list != null) {
            for (dvxe dvxeVar2 : list) {
                if (this.k) {
                    dvxeVar2.f.i();
                }
                dvxeVar2.f.f();
            }
            this.j.clear();
            this.j = null;
        }
        this.n = null;
        this.f.setTag(com.google.android.apps.messaging.R.id.ve_tag, null);
    }

    @Override // defpackage.dvzb
    public final void h() {
        if (!this.k || this.l) {
            return;
        }
        this.l = true;
        this.h.b(this.g);
        List list = this.j;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((dvxe) it.next()).f.h();
            }
        }
    }

    @Override // defpackage.dvzb
    public final void i() {
        if (this.l) {
            this.l = false;
            List list = this.j;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((dvxe) it.next()).f.i();
                }
            }
            this.h.c(this.g);
            this.n = null;
        }
    }

    @Override // defpackage.dvzb
    public final /* bridge */ /* synthetic */ void j(Object obj) {
        emxf.a(this.j.remove(obj));
        dvzb dvzbVar = ((dvxe) obj).f;
        if (this.k) {
            dvzbVar.i();
        }
        dvzbVar.f();
    }

    @Override // defpackage.dvzb
    public final /* bridge */ /* synthetic */ void k(Object obj) {
        obj.getClass();
        dvxe dvxeVar = this.i;
        emxf.r(dvxeVar == null, "CVE (%s) has a parent override (%s). Swapping prohibited.", this.g, dvxeVar);
        emxf.m(!this.m, "Isolated trees cannot have parents.");
        if (this.k) {
            emxf.i(((dvxe) obj).f.o(), "Attached CVE (%s) cannot be a child of a detached CVE (%s).", this.g, obj);
            i();
        }
        this.i = (dvxe) obj;
    }

    @Override // defpackage.dvzb
    public final void l() {
        throw null;
    }

    public final void m() {
        w();
        if (B(A()) && this.a != null && Log.isLoggable("GIL", 2)) {
            Log.v("GIL", String.format(Locale.US, "Visibility: %s v=%s\tpbb=%d,%d,%d,%d cbb=%d,%d,%d,%d", this.g, v(this.f), Integer.valueOf(this.a.getScrollX()), Integer.valueOf(this.a.getScrollY()), Integer.valueOf(this.a.getWidth() + this.a.getScrollX()), Integer.valueOf(this.a.getHeight() + this.a.getScrollY()), Integer.valueOf(this.f.getLeft()), Integer.valueOf(this.f.getTop()), Integer.valueOf(this.f.getRight()), Integer.valueOf(this.f.getBottom())));
        }
        this.d = null;
    }

    @Override // defpackage.dvzb
    public final void n(dvza dvzaVar) {
        View view = this.f;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                z(viewGroup.getChildAt(i), dvzaVar);
            }
        }
        List list = this.j;
        if (list == null) {
            return;
        }
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                dvzaVar.b((dvxe) this.j.get(size));
            }
        }
    }

    @Override // defpackage.dvzb
    public final boolean o() {
        return this.l;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int a = dwdd.a(this.c.b);
        if (a != 0 && a == 2) {
            if (this.p && view == this.a) {
                this.p = false;
                if (Log.isLoggable("GIL", 2)) {
                    Log.v("GIL", String.format(Locale.US, "LayoutChange: %s (Skipped)", this.g));
                    return;
                }
                return;
            }
            View view2 = this.f;
            boolean z = view != view2;
            if (view == view2) {
                this.p = true;
            } else {
                this.p = false;
            }
            if (this.a == null) {
                emxf.l(!z);
                ViewGroup viewGroup = (ViewGroup) this.f.getParent();
                this.a = viewGroup;
                viewGroup.addOnLayoutChangeListener(this);
            }
        } else if (view == this.f) {
            emxf.l(this.a == null);
            ViewGroup viewGroup2 = (ViewGroup) this.f.getParent();
            this.a = viewGroup2;
            viewGroup2.addOnLayoutChangeListener(this);
            this.f.removeOnLayoutChangeListener(this);
        }
        if (Log.isLoggable("GIL", 2)) {
            if (this.a == null) {
                Throwable th = new Throwable();
                th.fillInStackTrace();
                Locale locale = Locale.US;
                dvxe dvxeVar = this.g;
                View view3 = this.f;
                Log.w("GIL", String.format(locale, "You have a bug in your layout code. %s Expected [%s] Got [%s] Parent [%s]", dvxeVar, view3, view, view3.getParent()), th);
                return;
            }
            Log.v("GIL", String.format(Locale.US, "LayoutChange: %s v=%s p=%d d=%d lr=%d pd=%d plr=%d\tl=%d,%d t=%d,%d r=%d,%d b=%d,%d\tpbb=%d,%d,%d,%d cbb=%d,%d,%d,%d", this.g, v(this.f), Integer.valueOf(view == this.a ? 1 : 0), Integer.valueOf(this.f.isDirty() ? 1 : 0), Integer.valueOf(this.f.isLayoutRequested() ? 1 : 0), Integer.valueOf(view.isDirty() ? 1 : 0), Integer.valueOf(view.isLayoutRequested() ? 1 : 0), Integer.valueOf(i5), Integer.valueOf(i), Integer.valueOf(i6), Integer.valueOf(i2), Integer.valueOf(i7), Integer.valueOf(i3), Integer.valueOf(i8), Integer.valueOf(i4), Integer.valueOf(this.a.getScrollX()), Integer.valueOf(this.a.getScrollY()), Integer.valueOf(this.a.getWidth() + this.a.getScrollX()), Integer.valueOf(this.a.getHeight() + this.a.getScrollY()), Integer.valueOf(this.f.getLeft()), Integer.valueOf(this.f.getTop()), Integer.valueOf(this.f.getRight()), Integer.valueOf(this.f.getBottom())));
        }
        if (this.b) {
            return;
        }
        m();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        ((enrr) ((enrr) e.h()).h("com/google/android/libraries/logging/ve/ViewNode", "onViewAttachedToWindow", 389, "ViewNode.java")).D("onViewAttachedToWindow self=%s, view=%s", this.f, view);
        this.h.a(!this.k);
        if (Log.isLoggable("GIL", 2) && view.getParent() == null) {
            Log.v("GIL", "Attached View had no parent: ".concat(String.valueOf(v(view))));
        }
        this.k = true;
        y();
        h();
        if (this.b) {
            return;
        }
        m();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ((enrr) ((enrr) e.h()).h("com/google/android/libraries/logging/ve/ViewNode", "onViewDetachedFromWindow", 405, "ViewNode.java")).D("onViewDetachedToWindow self=%s, view=%s", this.f, view);
        this.h.a(this.k);
        if (Log.isLoggable("GIL", 2) && view.getParent() == null) {
            Log.v("GIL", "Detached View had no parent: ".concat(String.valueOf(v(view))));
        }
        this.k = false;
        x();
        dvxe dvxeVar = this.i;
        if (dvxeVar == null) {
            i();
            return;
        }
        dvxeVar.f.j(this.g);
        dvzc dvzcVar = this.h;
        boolean z = this.l;
        Object[] objArr = {this.g, this.i};
        if (z) {
            dvzcVar.d(new IllegalStateException(emyk.a("CVE (%s) was child of detached CVE (%s).", objArr)));
        }
    }

    @Override // defpackage.dvzb
    public final boolean p() {
        return (this.i == null && q(this.f)) || this.m;
    }

    public final void r(boolean z) {
        if (this.m == z) {
            return;
        }
        emxf.l(this.i == null);
        emxf.a((z && q(this.f)) ? false : true);
        ((enrr) ((enrr) e.h()).h("com/google/android/libraries/logging/ve/ViewNode", "setIsolated", 152, "ViewNode.java")).t("setIsolated %s", this.f);
        if (this.k) {
            x();
        }
        this.m = z;
        if (this.k) {
            y();
        }
    }

    @Override // defpackage.dvzb
    public final int t() {
        return this.b ? this.r : A();
    }

    @Override // defpackage.dvzb
    public final void u(int i) {
        if (i == 1) {
            this.b = false;
            m();
        } else {
            this.b = true;
            B(2);
        }
    }
}
