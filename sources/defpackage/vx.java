package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class vx {
    boolean A;
    public final boolean B;
    public final boolean C;
    public int D;
    public boolean E;
    public int F;
    public int G;
    public int H;
    public int I;
    private final zk a;
    private final zk b;
    si t;
    public RecyclerView u;
    public final zl v;
    public final zl w;
    public wn x;
    public boolean y;
    public boolean z;

    public vx() {
        vu vuVar = new vu(this);
        this.a = vuVar;
        vv vvVar = new vv(this);
        this.b = vvVar;
        this.v = new zl(vuVar);
        this.w = new zl(vvVar);
        this.y = false;
        this.z = false;
        this.A = false;
        this.B = true;
        this.C = true;
    }

    public static vw aF(Context context, AttributeSet attributeSet, int i, int i2) {
        vw vwVar = new vw();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ma.a, i, i2);
        vwVar.a = obtainStyledAttributes.getInt(0, 1);
        vwVar.b = obtainStyledAttributes.getInt(10, 1);
        vwVar.c = obtainStyledAttributes.getBoolean(9, false);
        vwVar.d = obtainStyledAttributes.getBoolean(11, false);
        obtainStyledAttributes.recycle();
        return vwVar;
    }

    public static int as(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i2, i3) : size : Math.min(size, Math.max(i2, i3));
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r4 == 1073741824) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int au(int r3, int r4, int r5, int r6, boolean r7) {
        /*
            int r3 = r3 - r5
            r5 = 0
            int r3 = java.lang.Math.max(r5, r3)
            r0 = -1
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r7 == 0) goto L19
            if (r6 < 0) goto L10
            goto L1b
        L10:
            if (r6 != r0) goto L2f
            if (r4 == r1) goto L1f
            if (r4 == 0) goto L2f
            if (r4 == r2) goto L1f
            goto L2f
        L19:
            if (r6 < 0) goto L1d
        L1b:
            r4 = r2
            goto L31
        L1d:
            if (r6 != r0) goto L21
        L1f:
            r6 = r3
            goto L31
        L21:
            r7 = -2
            if (r6 != r7) goto L2f
            if (r4 == r1) goto L2c
            if (r4 != r2) goto L29
            goto L2c
        L29:
            r6 = r3
            r4 = r5
            goto L31
        L2c:
            r6 = r3
            r4 = r1
            goto L31
        L2f:
            r4 = r5
            r6 = r4
        L31:
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vx.au(int, int, int, int, boolean):int");
    }

    public static final void bA(View view, int i, int i2, int i3, int i4) {
        vy vyVar = (vy) view.getLayoutParams();
        Rect rect = vyVar.d;
        view.layout(i + rect.left + vyVar.leftMargin, i2 + rect.top + vyVar.topMargin, (i3 - rect.right) - vyVar.rightMargin, (i4 - rect.bottom) - vyVar.bottomMargin);
    }

    public static final int bH(View view) {
        return view.getBottom() + br(view);
    }

    public static final int bI(View view) {
        return view.getLeft() - bu(view);
    }

    public static final int bJ(View view) {
        return view.getRight() + bw(view);
    }

    public static final int bK(View view) {
        return view.getTop() - bx(view);
    }

    public static boolean bn(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (i3 > 0 && i != i3) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i;
        }
        return true;
    }

    public static final int br(View view) {
        return ((vy) view.getLayoutParams()).d.bottom;
    }

    public static final int bs(View view) {
        Rect rect = ((vy) view.getLayoutParams()).d;
        return view.getMeasuredHeight() + rect.top + rect.bottom;
    }

    public static final int bt(View view) {
        Rect rect = ((vy) view.getLayoutParams()).d;
        return view.getMeasuredWidth() + rect.left + rect.right;
    }

    public static final int bu(View view) {
        return ((vy) view.getLayoutParams()).d.left;
    }

    public static final int bv(View view) {
        return ((vy) view.getLayoutParams()).a();
    }

    public static final int bw(View view) {
        return ((vy) view.getLayoutParams()).d.right;
    }

    public static final int bx(View view) {
        return ((vy) view.getLayoutParams()).d.top;
    }

    public static final void bz(View view, int i, int i2, int i3, int i4) {
        Rect rect = ((vy) view.getLayoutParams()).d;
        view.layout(i + rect.left, i2 + rect.top, i3 - rect.right, i4 - rect.bottom);
    }

    private final void c(View view, int i, boolean z) {
        wr l = RecyclerView.l(view);
        if (z || l.v()) {
            this.u.i.b(l);
        } else {
            this.u.i.g(l);
        }
        vy vyVar = (vy) view.getLayoutParams();
        if (l.B() || l.w()) {
            if (l.w()) {
                l.p();
            } else {
                l.i();
            }
            this.t.g(view, i, view.getLayoutParams(), false);
        } else if (view.getParent() == this.u) {
            int c = this.t.c(view);
            if (i == -1) {
                i = this.t.a();
            }
            if (c == -1) {
                throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.u.indexOfChild(view) + this.u.p());
            }
            if (c != i) {
                vx vxVar = this.u.o;
                View aH = vxVar.aH(c);
                if (aH == null) {
                    throw new IllegalArgumentException("Cannot move a child from non-existing index:" + c + vxVar.u.toString());
                }
                vxVar.aP(c);
                vy vyVar2 = (vy) aH.getLayoutParams();
                wr l2 = RecyclerView.l(aH);
                if (l2.v()) {
                    vxVar.u.i.b(l2);
                } else {
                    vxVar.u.i.g(l2);
                }
                vxVar.t.g(aH, i, vyVar2, l2.v());
            }
        } else {
            this.t.f(view, i, false);
            vyVar.e = true;
            wn wnVar = this.x;
            if (wnVar != null && wnVar.k && wnVar.l(view) == wnVar.g) {
                wnVar.l = view;
            }
        }
        if (vyVar.f) {
            l.a.invalidate();
            vyVar.f = false;
        }
    }

    public void B(int i, int i2) {
        bD(i);
    }

    public int C(wo woVar) {
        return 0;
    }

    public int D(wo woVar) {
        return 0;
    }

    public int E(wo woVar) {
        return 0;
    }

    public int F(wo woVar) {
        return 0;
    }

    public int G(wo woVar) {
        return 0;
    }

    public int H(wo woVar) {
        return 0;
    }

    public Parcelable R() {
        return null;
    }

    public View U(int i) {
        int at = at();
        for (int i2 = 0; i2 < at; i2++) {
            View aH = aH(i2);
            wr l = RecyclerView.l(aH);
            if (l != null && l.gz() == i && !l.A() && (this.u.O.g || !l.v())) {
                return aH;
            }
        }
        return null;
    }

    public void V(String str) {
        RecyclerView recyclerView = this.u;
        if (recyclerView != null) {
            recyclerView.A(str);
        }
    }

    public void Z(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.u;
        wf wfVar = recyclerView.e;
        wo woVar = recyclerView.O;
        if (recyclerView == null || accessibilityEvent == null) {
            return;
        }
        boolean z = true;
        if (!recyclerView.canScrollVertically(1) && !this.u.canScrollVertically(-1) && !this.u.canScrollHorizontally(-1) && !this.u.canScrollHorizontally(1)) {
            z = false;
        }
        accessibilityEvent.setScrollable(z);
        vk vkVar = this.u.n;
        if (vkVar != null) {
            accessibilityEvent.setItemCount(vkVar.a());
        }
    }

    public final int aA() {
        RecyclerView recyclerView = this.u;
        if (recyclerView == null) {
            return 0;
        }
        int[] iArr = kvo.a;
        return recyclerView.getPaddingEnd();
    }

    public final int aB() {
        RecyclerView recyclerView = this.u;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public final int aC() {
        RecyclerView recyclerView = this.u;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public final int aD() {
        RecyclerView recyclerView = this.u;
        if (recyclerView == null) {
            return 0;
        }
        int[] iArr = kvo.a;
        return recyclerView.getPaddingStart();
    }

    public final int aE() {
        RecyclerView recyclerView = this.u;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public final View aG(View view) {
        View o;
        RecyclerView recyclerView = this.u;
        if (recyclerView == null || (o = recyclerView.o(view)) == null || this.t.k(o)) {
            return null;
        }
        return o;
    }

    public final View aH(int i) {
        si siVar = this.t;
        if (siVar != null) {
            return siVar.d(i);
        }
        return null;
    }

    public final View aI() {
        View focusedChild;
        RecyclerView recyclerView = this.u;
        if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.t.k(focusedChild)) {
            return null;
        }
        return focusedChild;
    }

    public final void aJ(View view) {
        aK(view, -1);
    }

    public final void aK(View view, int i) {
        c(view, i, true);
    }

    public final void aL(View view) {
        aM(view, -1);
    }

    public final void aM(View view, int i) {
        c(view, i, false);
    }

    public final void aN(View view, Rect rect) {
        RecyclerView recyclerView = this.u;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.g(view));
        }
    }

    public final void aO(wf wfVar) {
        int at = at();
        while (true) {
            at--;
            if (at < 0) {
                return;
            }
            View aH = aH(at);
            wr l = RecyclerView.l(aH);
            if (!l.A()) {
                if (!l.t() || l.v() || this.u.n.b) {
                    aP(at);
                    wfVar.n(aH);
                    this.u.i.g(l);
                } else {
                    bd(at);
                    wfVar.m(l);
                }
            }
        }
    }

    public final void aP(int i) {
        aH(i);
        this.t.h(i);
    }

    public final void aQ(RecyclerView recyclerView) {
        this.z = true;
        aV(recyclerView);
    }

    public final void aR(RecyclerView recyclerView, wf wfVar) {
        this.z = false;
        Y(recyclerView, wfVar);
    }

    public void aS(View view, Rect rect) {
        RecyclerView.Q(view, rect);
    }

    public void aT(int i) {
        RecyclerView recyclerView = this.u;
        if (recyclerView != null) {
            int a = recyclerView.h.a();
            for (int i2 = 0; i2 < a; i2++) {
                recyclerView.h.d(i2).offsetLeftAndRight(i);
            }
        }
    }

    public void aU(int i) {
        RecyclerView recyclerView = this.u;
        if (recyclerView != null) {
            int a = recyclerView.h.a();
            for (int i2 = 0; i2 < a; i2++) {
                recyclerView.h.d(i2).offsetTopAndBottom(i);
            }
        }
    }

    public final void aW(View view, kxu kxuVar) {
        wr l = RecyclerView.l(view);
        if (l == null || l.v() || this.t.k(l.a)) {
            return;
        }
        RecyclerView recyclerView = this.u;
        cg(recyclerView.e, recyclerView.O, view, kxuVar);
    }

    public final void aY() {
        int at = at();
        while (true) {
            at--;
            if (at < 0) {
                return;
            } else {
                this.t.j(at);
            }
        }
    }

    public final void aZ(wf wfVar) {
        int at = at();
        while (true) {
            at--;
            if (at < 0) {
                return;
            }
            if (!RecyclerView.l(aH(at)).A()) {
                bc(at, wfVar);
            }
        }
    }

    public void ab(int i) {
        int i2 = RecyclerView.ab;
    }

    public boolean af() {
        return false;
    }

    public boolean ag() {
        throw null;
    }

    public boolean ah() {
        return this.A;
    }

    public boolean aj() {
        return false;
    }

    public boolean al() {
        return false;
    }

    public void ar(RecyclerView recyclerView, int i) {
        Log.e("RecyclerView", "You must override smoothScrollToPosition to support smooth scrolling");
    }

    public final int at() {
        si siVar = this.t;
        if (siVar != null) {
            return siVar.a();
        }
        return 0;
    }

    public final int av() {
        RecyclerView recyclerView = this.u;
        vk vkVar = recyclerView != null ? recyclerView.n : null;
        if (vkVar != null) {
            return vkVar.a();
        }
        return 0;
    }

    public final int aw() {
        return this.u.getLayoutDirection();
    }

    public final int ax() {
        RecyclerView recyclerView = this.u;
        int[] iArr = kvo.a;
        return recyclerView.getMinimumHeight();
    }

    public final int ay() {
        RecyclerView recyclerView = this.u;
        int[] iArr = kvo.a;
        return recyclerView.getMinimumWidth();
    }

    public final int az() {
        RecyclerView recyclerView = this.u;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public void bB(View view) {
        vy vyVar = (vy) view.getLayoutParams();
        Rect g = this.u.g(view);
        int i = g.left + g.right;
        int i2 = g.top + g.bottom;
        int au = au(this.H, this.F, aB() + aC() + vyVar.leftMargin + vyVar.rightMargin + i, vyVar.width, af());
        int au2 = au(this.I, this.G, aE() + az() + vyVar.topMargin + vyVar.bottomMargin + i2, vyVar.height, ag());
        if (bq(view, au, au2, vyVar)) {
            view.measure(au, au2);
        }
    }

    public final void bE(int i, int i2) {
        this.u.G(i, i2);
    }

    public final void bF(Runnable runnable) {
        RecyclerView recyclerView = this.u;
        if (recyclerView != null) {
            recyclerView.removeCallbacks(runnable);
        }
    }

    @Deprecated
    public final void bG() {
        this.A = true;
    }

    public final boolean bL(int i, Bundle bundle) {
        int aE;
        int aB;
        float f;
        if (this.u == null) {
            return false;
        }
        int i2 = this.I;
        int i3 = this.H;
        Rect rect = new Rect();
        if (this.u.getMatrix().isIdentity() && this.u.getGlobalVisibleRect(rect)) {
            i2 = rect.height();
            i3 = rect.width();
        }
        if (i == 4096) {
            aE = this.u.canScrollVertically(1) ? (i2 - aE()) - az() : 0;
            if (this.u.canScrollHorizontally(1)) {
                aB = (i3 - aB()) - aC();
            }
            aB = 0;
        } else if (i != 8192) {
            aE = 0;
            aB = 0;
        } else {
            aE = this.u.canScrollVertically(-1) ? -((i2 - aE()) - az()) : 0;
            if (this.u.canScrollHorizontally(-1)) {
                aB = -((i3 - aB()) - aC());
            }
            aB = 0;
        }
        if (aE == 0) {
            if (aB == 0) {
                return false;
            }
            aE = 0;
        }
        if (bundle != null) {
            f = bundle.getFloat("androidx.core.view.accessibility.action.ARGUMENT_SCROLL_AMOUNT_FLOAT", 1.0f);
            if (f < 0.0f) {
                return false;
            }
        } else {
            f = 1.0f;
        }
        if (Float.compare(f, Float.POSITIVE_INFINITY) != 0) {
            if (Float.compare(1.0f, f) != 0 && Float.compare(0.0f, f) != 0) {
                aE = (int) (aE * f);
                aB = (int) (aB * f);
            }
            this.u.aN(aB, aE, null, true);
            return true;
        }
        RecyclerView recyclerView = this.u;
        if (recyclerView.n == null) {
            return false;
        }
        if (i == 4096) {
            recyclerView.au(r0.a() - 1);
        } else if (i == 8192) {
            recyclerView.au(0);
        }
        return true;
    }

    public final void ba(wf wfVar) {
        int size = wfVar.a.size();
        for (int i = size - 1; i >= 0; i--) {
            View view = ((wr) wfVar.a.get(i)).a;
            wr l = RecyclerView.l(view);
            if (!l.A()) {
                l.n(false);
                if (l.x()) {
                    this.u.removeDetachedView(view, false);
                }
                vr vrVar = this.u.E;
                if (vrVar != null) {
                    vrVar.b(l);
                }
                l.n(true);
                wfVar.i(view);
            }
        }
        wfVar.a.clear();
        ArrayList arrayList = wfVar.b;
        if (arrayList != null) {
            arrayList.clear();
        }
        if (size > 0) {
            this.u.invalidate();
        }
    }

    public final void bb(View view, wf wfVar) {
        si siVar = this.t;
        int i = siVar.c;
        if (i == 1) {
            throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
        }
        if (i == 2) {
            throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
        try {
            siVar.c = 1;
            siVar.d = view;
            int b = siVar.e.b(view);
            if (b >= 0) {
                if (siVar.a.g(b)) {
                    siVar.l(view);
                }
                siVar.e.e(b);
            }
            siVar.c = 0;
            siVar.d = null;
            wfVar.l(view);
        } catch (Throwable th) {
            siVar.c = 0;
            siVar.d = null;
            throw th;
        }
    }

    public final void bc(int i, wf wfVar) {
        View aH = aH(i);
        bd(i);
        wfVar.l(aH);
    }

    public final void bd(int i) {
        if (aH(i) != null) {
            this.t.j(i);
        }
    }

    public final void be() {
        RecyclerView recyclerView = this.u;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public final void bf() {
        this.y = true;
    }

    public final void bg(RecyclerView recyclerView) {
        bh(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    public final void bh(int i, int i2) {
        this.H = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        this.F = mode;
        if (mode == 0 && !RecyclerView.a) {
            this.H = 0;
        }
        this.I = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        this.G = mode2;
        if (mode2 != 0 || RecyclerView.a) {
            return;
        }
        this.I = 0;
    }

    public final void bi(int i, int i2) {
        this.u.setMeasuredDimension(i, i2);
    }

    public final void bj(int i, int i2) {
        int at = at();
        if (at == 0) {
            this.u.G(i, i2);
            return;
        }
        int i3 = Integer.MIN_VALUE;
        int i4 = Integer.MAX_VALUE;
        int i5 = Integer.MAX_VALUE;
        int i6 = Integer.MIN_VALUE;
        for (int i7 = 0; i7 < at; i7++) {
            View aH = aH(i7);
            Rect rect = this.u.l;
            aS(aH, rect);
            if (rect.left < i4) {
                i4 = rect.left;
            }
            if (rect.right > i3) {
                i3 = rect.right;
            }
            if (rect.top < i5) {
                i5 = rect.top;
            }
            if (rect.bottom > i6) {
                i6 = rect.bottom;
            }
        }
        this.u.l.set(i4, i5, i3, i6);
        ch(this.u.l, i, i2);
    }

    public final void bk(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.u = null;
            this.t = null;
            this.H = 0;
            this.I = 0;
        } else {
            this.u = recyclerView;
            this.t = recyclerView.h;
            this.H = recyclerView.getWidth();
            this.I = recyclerView.getHeight();
        }
        this.F = 1073741824;
        this.G = 1073741824;
    }

    public final void bl(wn wnVar) {
        wn wnVar2 = this.x;
        if (wnVar2 != null && wnVar != wnVar2 && wnVar2.k) {
            wnVar2.o();
        }
        this.x = wnVar;
        RecyclerView recyclerView = this.u;
        recyclerView.L.d();
        if (wnVar.m) {
            Log.w("RecyclerView", "An instance of " + wnVar.getClass().getSimpleName() + " was started more than once. Each instance of" + wnVar.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
        }
        wnVar.h = recyclerView;
        wnVar.i = this;
        int i = wnVar.g;
        if (i == -1) {
            throw new IllegalArgumentException("Invalid target position");
        }
        RecyclerView recyclerView2 = wnVar.h;
        recyclerView2.O.a = i;
        wnVar.k = true;
        wnVar.j = true;
        wnVar.l = recyclerView2.o.U(wnVar.g);
        wnVar.h.L.b();
        wnVar.m = true;
    }

    public final boolean bm() {
        RecyclerView recyclerView = this.u;
        return recyclerView != null && recyclerView.j;
    }

    public final boolean bo() {
        wn wnVar = this.x;
        return wnVar != null && wnVar.k;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a8, code lost:
    
        if ((r5.bottom - r2) > r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00ac, code lost:
    
        if (r2 != 0) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean bp(android.support.v7.widget.RecyclerView r9, android.view.View r10, android.graphics.Rect r11, boolean r12, boolean r13) {
        /*
            r8 = this;
            int r0 = r8.aB()
            int r1 = r8.aE()
            int r2 = r8.H
            int r3 = r8.aC()
            int r2 = r2 - r3
            int r3 = r8.I
            int r4 = r8.az()
            int r3 = r3 - r4
            int r4 = r10.getLeft()
            int r5 = r11.left
            int r4 = r4 + r5
            int r5 = r10.getScrollX()
            int r4 = r4 - r5
            int r5 = r10.getTop()
            int r6 = r11.top
            int r5 = r5 + r6
            int r10 = r10.getScrollY()
            int r5 = r5 - r10
            int r10 = r11.width()
            int r10 = r10 + r4
            int r11 = r11.height()
            int r11 = r11 + r5
            int r4 = r4 - r0
            int r5 = r5 - r1
            int r11 = r11 - r3
            r0 = 0
            int r1 = java.lang.Math.min(r0, r4)
            int r10 = r10 - r2
            int r2 = java.lang.Math.min(r0, r5)
            int r3 = java.lang.Math.max(r0, r10)
            int r11 = java.lang.Math.max(r0, r11)
            int r6 = r8.aw()
            r7 = 1
            if (r6 != r7) goto L5d
            if (r3 == 0) goto L58
            r1 = r3
            goto L63
        L58:
            int r1 = java.lang.Math.max(r1, r10)
            goto L63
        L5d:
            if (r1 != 0) goto L63
            int r1 = java.lang.Math.min(r4, r3)
        L63:
            if (r2 == 0) goto L66
            goto L6a
        L66:
            int r2 = java.lang.Math.min(r5, r11)
        L6a:
            int[] r10 = new int[]{r1, r2}
            r10 = r10[r0]
            if (r13 == 0) goto Laa
            android.view.View r11 = r9.getFocusedChild()
            if (r11 != 0) goto L79
            goto Laf
        L79:
            int r13 = r8.aB()
            int r1 = r8.aE()
            int r3 = r8.H
            int r4 = r8.aC()
            int r3 = r3 - r4
            int r4 = r8.I
            int r5 = r8.az()
            int r4 = r4 - r5
            android.support.v7.widget.RecyclerView r5 = r8.u
            android.graphics.Rect r5 = r5.l
            r8.aS(r11, r5)
            int r11 = r5.left
            int r11 = r11 - r10
            if (r11 >= r3) goto Laf
            int r11 = r5.right
            int r11 = r11 - r10
            if (r11 <= r13) goto Laf
            int r11 = r5.top
            int r11 = r11 - r2
            if (r11 >= r4) goto Laf
            int r11 = r5.bottom
            int r11 = r11 - r2
            if (r11 <= r1) goto Laf
        Laa:
            if (r10 != 0) goto Lb0
            if (r2 == 0) goto Laf
            goto Lb1
        Laf:
            return r0
        Lb0:
            r0 = r10
        Lb1:
            if (r12 == 0) goto Lb7
            r9.scrollBy(r0, r2)
            goto Lba
        Lb7:
            r9.as(r0, r2)
        Lba:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vx.bp(android.support.v7.widget.RecyclerView, android.view.View, android.graphics.Rect, boolean, boolean):boolean");
    }

    public boolean bq(View view, int i, int i2, vy vyVar) {
        return (!view.isLayoutRequested() && this.B && bn(view.getWidth(), i, vyVar.width) && bn(view.getHeight(), i2, vyVar.height)) ? false : true;
    }

    public final void by(View view, Rect rect) {
        Matrix matrix;
        Rect rect2 = ((vy) view.getLayoutParams()).d;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (this.u != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.u.m;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public int cb(wf wfVar, wo woVar) {
        RecyclerView recyclerView = this.u;
        if (recyclerView == null || recyclerView.n == null || !af()) {
            return 1;
        }
        return this.u.n.a();
    }

    public int cc(wf wfVar, wo woVar) {
        RecyclerView recyclerView = this.u;
        if (recyclerView == null || recyclerView.n == null || !ag()) {
            return 1;
        }
        return this.u.n.a();
    }

    public vy cd(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof vy ? new vy((vy) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new vy((ViewGroup.MarginLayoutParams) layoutParams) : new vy(layoutParams);
    }

    public View ce(View view, int i, wf wfVar, wo woVar) {
        return null;
    }

    public void cf(wf wfVar, wo woVar, kxu kxuVar) {
        if (this.u.canScrollVertically(-1) || this.u.canScrollHorizontally(-1)) {
            kxuVar.h(8192);
            kxuVar.N(true);
            kxuVar.af();
        }
        if (this.u.canScrollVertically(1) || this.u.canScrollHorizontally(1)) {
            kxuVar.h(4096);
            kxuVar.N(true);
            kxuVar.af();
        }
        kxuVar.t(kxs.a(cc(wfVar, woVar), cb(wfVar, woVar), 0));
    }

    public void cg(wf wfVar, wo woVar, View view, kxu kxuVar) {
        kxuVar.u(kxt.a(ag() ? bv(view) : 0, 1, af() ? bv(view) : 0, 1, false));
    }

    public void ch(Rect rect, int i, int i2) {
        bi(as(i, rect.width() + aB() + aC(), ay()), as(i2, rect.height() + aE() + az(), ax()));
    }

    public boolean ci(int i, Bundle bundle) {
        RecyclerView recyclerView = this.u;
        wf wfVar = recyclerView.e;
        wo woVar = recyclerView.O;
        return bL(i, bundle);
    }

    public boolean cj() {
        return false;
    }

    public int d(int i, wf wfVar, wo woVar) {
        return 0;
    }

    public int e(int i, wf wfVar, wo woVar) {
        return 0;
    }

    public abstract vy f();

    public vy h(Context context, AttributeSet attributeSet) {
        return new vy(context, attributeSet);
    }

    public void o(wf wfVar, wo woVar) {
        throw null;
    }

    public boolean t(vy vyVar) {
        return vyVar != null;
    }

    public void bC() {
    }

    public void y() {
    }

    public void aV(RecyclerView recyclerView) {
    }

    public void aX(int i) {
    }

    public void aa(Parcelable parcelable) {
    }

    public void bD(int i) {
    }

    public void p(wo woVar) {
    }

    public void A(int i, int i2) {
    }

    public void Y(RecyclerView recyclerView, wf wfVar) {
    }

    public void an(int i, ts tsVar) {
    }

    public void x(int i, int i2) {
    }

    public void z(int i, int i2) {
    }

    public void am(int i, int i2, wo woVar, ts tsVar) {
    }
}
