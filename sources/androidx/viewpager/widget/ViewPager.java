package androidx.viewpager.widget;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import com.google.android.material.tabs.TabLayout;
import defpackage.ehrn;
import defpackage.kvd;
import defpackage.kvo;
import defpackage.kyv;
import defpackage.pco;
import defpackage.pcp;
import defpackage.pcq;
import defpackage.pcr;
import defpackage.pcs;
import defpackage.pct;
import defpackage.pcu;
import defpackage.pcv;
import defpackage.pcw;
import defpackage.pcx;
import defpackage.pcy;
import defpackage.pda;
import defpackage.pdc;
import defpackage.qmd;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ViewPager extends ViewGroup {
    public static final int[] a = {R.attr.layout_gravity};
    private static final Comparator l = new pcp();
    private static final Interpolator m = new pcq();
    private static final pdc n = new pdc();
    private boolean A;
    private boolean B;
    private boolean C;
    private boolean D;
    private boolean E;
    private int F;
    private int G;
    private int H;
    private final boolean I;
    private float J;
    private float K;
    private float L;
    private float M;
    private int N;
    private VelocityTracker O;
    private int P;
    private int Q;
    private int R;
    private int S;
    private boolean T;
    private boolean U;
    private int V;
    private List W;
    private ArrayList aa;
    private final Runnable ab;
    private int ac;
    public pco b;
    public int c;
    public int d;
    public int e;
    public EdgeEffect f;
    public EdgeEffect g;
    public List h;
    public int i;
    public int j;
    public qmd k;
    private int o;
    private final ArrayList p;
    private final pcu q;
    private final Rect r;
    private int s;
    private Parcelable t;
    private ClassLoader u;
    private Scroller v;
    private boolean w;
    private pcy x;
    private float y;
    private float z;

    public ViewPager(Context context) {
        super(context);
        this.p = new ArrayList();
        this.q = new pcu();
        this.r = new Rect();
        this.s = -1;
        this.t = null;
        this.u = null;
        this.y = -3.4028235E38f;
        this.z = Float.MAX_VALUE;
        this.e = 1;
        this.I = true;
        this.N = -1;
        this.T = true;
        this.ab = new pcr(this);
        this.ac = 0;
        t(context);
    }

    private final void A(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.N) {
            int i = actionIndex == 0 ? 1 : 0;
            this.J = motionEvent.getX(i);
            this.N = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.O;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    private final void B(int i, boolean z, int i2, boolean z2) {
        int scrollX;
        int i3;
        int abs;
        pcu c = c(i);
        int v = c != null ? (int) (v() * Math.max(this.y, Math.min(c.e, this.z))) : 0;
        if (!z) {
            if (z2) {
                z(i);
            }
            y(false);
            scrollTo(v, 0);
            E(v);
            return;
        }
        if (getChildCount() == 0) {
            C(false);
        } else {
            Scroller scroller = this.v;
            if (scroller == null || scroller.isFinished()) {
                scrollX = getScrollX();
            } else {
                scrollX = this.w ? this.v.getCurrX() : this.v.getStartX();
                this.v.abortAnimation();
                C(false);
            }
            int i4 = scrollX;
            int scrollY = getScrollY();
            int i5 = v - i4;
            int i6 = -scrollY;
            if (i5 != 0) {
                i3 = i5;
            } else if (i6 == 0) {
                y(false);
                f();
                o(0);
            } else {
                i3 = 0;
            }
            C(true);
            o(2);
            int v2 = v();
            int i7 = v2 / 2;
            float f = v2;
            float sin = (float) Math.sin((Math.min(1.0f, Math.abs(i3) / f) - 0.5f) * 0.47123894f);
            int abs2 = Math.abs(i2);
            if (abs2 > 0) {
                float f2 = i7;
                abs = Math.round(Math.abs((f2 + (sin * f2)) / abs2) * 1000.0f) * 4;
            } else {
                abs = (int) (((Math.abs(i3) / (f + this.d)) + 1.0f) * 100.0f);
            }
            int min = Math.min(abs, 600);
            this.w = false;
            this.v.startScroll(i4, scrollY, i3, i6, min);
            postInvalidateOnAnimation();
        }
        if (z2) {
            z(i);
        }
    }

    private final void C(boolean z) {
        if (this.B != z) {
            this.B = z;
        }
    }

    private final void D() {
        if (this.j != 0) {
            ArrayList arrayList = this.aa;
            if (arrayList == null) {
                this.aa = new ArrayList();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                this.aa.add(getChildAt(i));
            }
            Collections.sort(this.aa, n);
        }
    }

    private final boolean E(int i) {
        if (this.p.size() == 0) {
            if (this.T) {
                return false;
            }
            this.U = false;
            u(0, 0.0f);
            if (this.U) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        pcu x = x();
        int v = v();
        float f = this.d;
        float f2 = v;
        int i2 = x.b;
        float f3 = (i / f2) - x.e;
        float f4 = x.d + (f / f2);
        this.U = false;
        u(i2, f3 / f4);
        if (this.U) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    private final boolean F(float f, float f2) {
        boolean z;
        float f3 = this.J - f;
        this.J = f;
        float width = f3 / getWidth();
        float height = f2 / getHeight();
        float b = (kyv.a(this.f) != 0.0f ? -kyv.b(this.f, -width, 1.0f - height) : kyv.a(this.g) != 0.0f ? kyv.b(this.g, width, height) : 0.0f) * getWidth();
        float f4 = f3 - b;
        boolean z2 = false;
        boolean z3 = true;
        boolean z4 = b != 0.0f;
        if (Math.abs(f4) < 1.0E-4f) {
            return z4;
        }
        float scrollX = getScrollX() + f4;
        float v = v();
        float f5 = this.y * v;
        float f6 = this.z * v;
        pcu pcuVar = (pcu) this.p.get(0);
        pcu pcuVar2 = (pcu) this.p.get(r8.size() - 1);
        if (pcuVar.b != 0) {
            f5 = pcuVar.e * v;
            z = false;
        } else {
            z = true;
        }
        if (pcuVar2.b != this.b.j() - 1) {
            f6 = pcuVar2.e * v;
        } else {
            z2 = true;
        }
        if (scrollX < f5) {
            if (z) {
                kyv.b(this.f, (f5 - scrollX) / v, 1.0f - (f2 / getHeight()));
            } else {
                z3 = z4;
            }
            scrollX = f5;
        } else if (scrollX > f6) {
            if (z2) {
                kyv.b(this.g, (scrollX - f6) / v, f2 / getHeight());
            } else {
                z3 = z4;
            }
            scrollX = f6;
        } else {
            z3 = z4;
        }
        int i = (int) scrollX;
        this.J += scrollX - i;
        scrollTo(i, getScrollY());
        E(i);
        return z3;
    }

    private final boolean G() {
        this.N = -1;
        this.D = false;
        this.E = false;
        VelocityTracker velocityTracker = this.O;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.O = null;
        }
        this.f.onRelease();
        this.g.onRelease();
        return (this.f.isFinished() && this.g.isFinished()) ? false : true;
    }

    private final void H() {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }

    private final int v() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private final Rect w(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left += viewGroup.getLeft();
            rect.right += viewGroup.getRight();
            rect.top += viewGroup.getTop();
            rect.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect;
    }

    private final pcu x() {
        int i;
        int v = v();
        float f = 0.0f;
        float scrollX = v > 0 ? getScrollX() / v : 0.0f;
        float f2 = v > 0 ? this.d / v : 0.0f;
        int i2 = 0;
        int i3 = -1;
        boolean z = true;
        pcu pcuVar = null;
        float f3 = 0.0f;
        while (i2 < this.p.size()) {
            pcu pcuVar2 = (pcu) this.p.get(i2);
            if (!z && pcuVar2.b != (i = i3 + 1)) {
                pcuVar2 = this.q;
                pcuVar2.e = f + f3 + f2;
                pcuVar2.b = i;
                pcuVar2.d = 1.0f;
                i2--;
            }
            pcu pcuVar3 = pcuVar2;
            f = pcuVar3.e;
            float f4 = pcuVar3.d + f + f2;
            if (!z && scrollX < f) {
                break;
            }
            if (scrollX < f4 || i2 == this.p.size() - 1) {
                return pcuVar3;
            }
            i3 = pcuVar3.b;
            i2++;
            pcuVar = pcuVar3;
            f3 = pcuVar3.d;
            z = false;
        }
        return pcuVar;
    }

    private final void y(boolean z) {
        boolean z2 = this.ac == 2;
        if (z2) {
            C(false);
            if (!this.v.isFinished()) {
                this.v.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.v.getCurrX();
                int currY = this.v.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        E(currX);
                    }
                }
            }
        }
        this.C = false;
        for (int i = 0; i < this.p.size(); i++) {
            pcu pcuVar = (pcu) this.p.get(i);
            if (pcuVar.c) {
                pcuVar.c = false;
                z2 = true;
            }
        }
        if (z2) {
            if (!z) {
                this.ab.run();
                return;
            }
            Runnable runnable = this.ab;
            int[] iArr = kvo.a;
            postOnAnimation(runnable);
        }
    }

    private final void z(int i) {
        List list = this.W;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                pcx pcxVar = (pcx) this.W.get(i2);
                if (pcxVar != null) {
                    pcxVar.b(i);
                }
            }
        }
    }

    final pcu a(int i, int i2) {
        pcu pcuVar = new pcu();
        pcuVar.b = i;
        pcuVar.a = this.b.c(this, i);
        pcuVar.d = 1.0f;
        if (i2 < 0 || i2 >= this.p.size()) {
            this.p.add(pcuVar);
            return pcuVar;
        }
        this.p.add(i2, pcuVar);
        return pcuVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        pcu b;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0 && (b = b(childAt)) != null && b.b == this.c) {
                    childAt.addFocusables(arrayList, i, i2);
                }
            }
            if (descendantFocusability == 262144 && size != arrayList.size()) {
                return;
            }
        }
        if (isFocusable()) {
            if (((i2 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) || arrayList == null) {
                return;
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addTouchables(ArrayList arrayList) {
        pcu b;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (b = b(childAt)) != null && b.b == this.c) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = new pcv();
        }
        pcv pcvVar = (pcv) layoutParams;
        boolean z = pcvVar.a | (view.getClass().getAnnotation(pct.class) != null);
        pcvVar.a = z;
        if (!this.A) {
            super.addView(view, i, layoutParams);
        } else {
            if (pcvVar != null && z) {
                throw new IllegalStateException("Cannot add pager decor view during layout");
            }
            pcvVar.d = true;
            addViewInLayout(view, i, layoutParams);
        }
    }

    final pcu b(View view) {
        for (int i = 0; i < this.p.size(); i++) {
            pcu pcuVar = (pcu) this.p.get(i);
            if (this.b.h(view, pcuVar.a)) {
                return pcuVar;
            }
        }
        return null;
    }

    final pcu c(int i) {
        for (int i2 = 0; i2 < this.p.size(); i2++) {
            pcu pcuVar = (pcu) this.p.get(i2);
            if (pcuVar.b == i) {
                return pcuVar;
            }
        }
        return null;
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        if (this.b == null) {
            return false;
        }
        int v = v();
        int scrollX = getScrollX();
        return i < 0 ? scrollX > ((int) (((float) v) * this.y)) : i > 0 && scrollX < ((int) (((float) v) * this.z));
    }

    @Override // android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof pcv) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public final void computeScroll() {
        this.w = true;
        if (this.v.isFinished() || !this.v.computeScrollOffset()) {
            y(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.v.getCurrX();
        int currY = this.v.getCurrY();
        if (scrollX != currX || scrollY != currY) {
            scrollTo(currX, currY);
            if (!E(currX)) {
                this.v.abortAnimation();
                scrollTo(0, currY);
            }
        }
        postInvalidateOnAnimation();
    }

    public final void d(pcx pcxVar) {
        if (this.W == null) {
            this.W = new ArrayList();
        }
        this.W.add(pcxVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005e A[RETURN] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean dispatchKeyEvent(android.view.KeyEvent r6) {
        /*
            r5 = this;
            boolean r0 = super.dispatchKeyEvent(r6)
            r1 = 1
            if (r0 != 0) goto L5f
            int r0 = r6.getAction()
            r2 = 0
            if (r0 != 0) goto L5a
            int r0 = r6.getKeyCode()
            r3 = 21
            r4 = 2
            if (r0 == r3) goto L48
            r3 = 22
            if (r0 == r3) goto L36
            r3 = 61
            if (r0 == r3) goto L20
            goto L5a
        L20:
            boolean r0 = r6.hasNoModifiers()
            if (r0 == 0) goto L2b
            boolean r6 = r5.p(r4)
            goto L5b
        L2b:
            boolean r6 = r6.hasModifiers(r1)
            if (r6 == 0) goto L5a
            boolean r6 = r5.p(r1)
            goto L5b
        L36:
            boolean r6 = r6.hasModifiers(r4)
            if (r6 == 0) goto L41
            boolean r6 = r5.s()
            goto L5b
        L41:
            r6 = 66
            boolean r6 = r5.p(r6)
            goto L5b
        L48:
            boolean r6 = r6.hasModifiers(r4)
            if (r6 == 0) goto L53
            boolean r6 = r5.r()
            goto L5b
        L53:
            r6 = 17
            boolean r6 = r5.p(r6)
            goto L5b
        L5a:
            r6 = r2
        L5b:
            if (r6 == 0) goto L5e
            goto L5f
        L5e:
            return r2
        L5f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        pcu b;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (b = b(childAt)) != null && b.b == this.c && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean z;
        pco pcoVar;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        if (overScrollMode != 0 && (overScrollMode != 1 || (pcoVar = this.b) == null || pcoVar.j() <= 1)) {
            this.f.finish();
            this.g.finish();
            return;
        }
        if (this.f.isFinished()) {
            z = false;
        } else {
            int save = canvas.save();
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int width = getWidth();
            canvas.rotate(270.0f);
            canvas.translate((-height) + getPaddingTop(), this.y * width);
            this.f.setSize(height, width);
            z = this.f.draw(canvas);
            canvas.restoreToCount(save);
        }
        if (!this.g.isFinished()) {
            int save2 = canvas.save();
            int width2 = getWidth();
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            canvas.rotate(90.0f);
            canvas.translate(-getPaddingTop(), (-(this.z + 1.0f)) * width2);
            this.g.setSize(height2, width2);
            z |= this.g.draw(canvas);
            canvas.restoreToCount(save2);
        }
        if (z) {
            postInvalidateOnAnimation();
        }
    }

    public final void e() {
        int j = this.b.j();
        this.o = j;
        int size = this.p.size();
        int i = this.e;
        boolean z = size < (i + i) + 1 && this.p.size() < j;
        int i2 = this.c;
        for (int i3 = 0; i3 < this.p.size(); i3++) {
            Object obj = ((pcu) this.p.get(i3)).a;
        }
        Collections.sort(this.p, l);
        if (z) {
            int childCount = getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                pcv pcvVar = (pcv) getChildAt(i4).getLayoutParams();
                if (!pcvVar.a) {
                    pcvVar.c = 0.0f;
                }
            }
            m(i2, false, true);
            requestLayout();
        }
    }

    public final void f() {
        g(this.c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0061, code lost:
    
        if (r9 != r10) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final void g(int r18) {
        /*
            Method dump skipped, instructions count: 931
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.g(int):void");
    }

    @Override // android.view.ViewGroup
    protected final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new pcv();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new pcv(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    protected final int getChildDrawingOrder(int i, int i2) {
        if (this.j == 2) {
            i2 = (i - 1) - i2;
        }
        return ((pcv) ((View) this.aa.get(i2)).getLayoutParams()).f;
    }

    public final void h(int i, int i2, int i3, int i4) {
        if (i2 > 0 && !this.p.isEmpty()) {
            if (!this.v.isFinished()) {
                this.v.setFinalX(this.c * v());
                return;
            }
            scrollTo((int) ((getScrollX() / (((i2 - getPaddingLeft()) - getPaddingRight()) + i4)) * (((i - getPaddingLeft()) - getPaddingRight()) + i3)), getScrollY());
            return;
        }
        pcu c = c(this.c);
        int min = (int) ((c != null ? Math.min(c.e, this.z) : 0.0f) * ((i - getPaddingLeft()) - getPaddingRight()));
        if (min != getScrollX()) {
            y(false);
            scrollTo(min, getScrollY());
        }
    }

    public final void i(pcx pcxVar) {
        List list = this.W;
        if (list != null) {
            list.remove(pcxVar);
        }
    }

    public final void j(pco pcoVar) {
        pco pcoVar2 = this.b;
        if (pcoVar2 != null) {
            pcoVar2.l(null);
            this.b.g(this);
            for (int i = 0; i < this.p.size(); i++) {
                pcu pcuVar = (pcu) this.p.get(i);
                this.b.d(this, pcuVar.b, pcuVar.a);
            }
            this.b.i();
            this.p.clear();
            int i2 = 0;
            while (i2 < getChildCount()) {
                if (!((pcv) getChildAt(i2).getLayoutParams()).a) {
                    removeViewAt(i2);
                    i2--;
                }
                i2++;
            }
            this.c = 0;
            scrollTo(0, 0);
        }
        this.b = pcoVar;
        this.o = 0;
        if (pcoVar != null) {
            if (this.x == null) {
                this.x = new pcy(this);
            }
            this.b.l(this.x);
            this.C = false;
            boolean z = this.T;
            this.T = true;
            this.o = this.b.j();
            if (this.s >= 0) {
                this.b.e(this.t, this.u);
                m(this.s, false, true);
                this.s = -1;
                this.t = null;
                this.u = null;
            } else if (z) {
                requestLayout();
            } else {
                f();
            }
        }
        List list = this.h;
        if (list == null || list.isEmpty()) {
            return;
        }
        int size = this.h.size();
        for (int i3 = 0; i3 < size; i3++) {
            ehrn ehrnVar = (ehrn) this.h.get(i3);
            TabLayout tabLayout = ehrnVar.b;
            if (tabLayout.F == this) {
                tabLayout.o(pcoVar, ehrnVar.a);
            }
        }
    }

    public final void k(int i) {
        this.C = false;
        m(i, !this.T, false);
    }

    public final void l(int i, boolean z) {
        this.C = false;
        m(i, z, false);
    }

    final void m(int i, boolean z, boolean z2) {
        n(i, z, z2, 0);
    }

    final void n(int i, boolean z, boolean z2, int i2) {
        pco pcoVar = this.b;
        if (pcoVar == null || pcoVar.j() <= 0) {
            C(false);
            return;
        }
        if (!z2 && this.c == i && this.p.size() != 0) {
            C(false);
            return;
        }
        if (i < 0) {
            i = 0;
        } else if (i >= this.b.j()) {
            i = this.b.j() - 1;
        }
        int i3 = this.e;
        int i4 = this.c;
        if (i > i4 + i3 || i < i4 - i3) {
            for (int i5 = 0; i5 < this.p.size(); i5++) {
                ((pcu) this.p.get(i5)).c = true;
            }
        }
        boolean z3 = this.c != i;
        if (!this.T) {
            g(i);
            B(i, z, i2, z3);
        } else {
            this.c = i;
            if (z3) {
                z(i);
            }
            requestLayout();
        }
    }

    public final void o(int i) {
        if (this.ac == i) {
            return;
        }
        this.ac = i;
        if (this.k != null) {
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                getChildAt(i2).setLayerType(i != 0 ? this.i : 0, null);
            }
        }
        List list = this.W;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                pcx pcxVar = (pcx) this.W.get(i3);
                if (pcxVar != null) {
                    pcxVar.a(i);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.T = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        removeCallbacks(this.ab);
        Scroller scroller = this.v;
        if (scroller != null && !scroller.isFinished()) {
            this.v.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & PrivateKeyType.INVALID;
        if (action == 3 || action == 1) {
            G();
            return false;
        }
        if (action == 0) {
            float x = motionEvent.getX();
            this.L = x;
            this.J = x;
            float y = motionEvent.getY();
            this.M = y;
            this.K = y;
            this.N = motionEvent.getPointerId(0);
            this.E = false;
            this.w = true;
            this.v.computeScrollOffset();
            if (this.ac == 2 && Math.abs(this.v.getFinalX() - this.v.getCurrX()) > this.S) {
                this.v.abortAnimation();
                this.C = false;
                f();
                this.D = true;
                H();
                o(1);
            } else if (kyv.a(this.f) == 0.0f && kyv.a(this.g) == 0.0f) {
                y(false);
                this.D = false;
            } else {
                this.D = true;
                o(1);
                if (kyv.a(this.f) != 0.0f) {
                    kyv.b(this.f, 0.0f, 1.0f - (this.K / getHeight()));
                }
                if (kyv.a(this.g) != 0.0f) {
                    kyv.b(this.g, 0.0f, this.K / getHeight());
                }
            }
        } else {
            if (this.D) {
                return true;
            }
            if (this.E) {
                return false;
            }
            if (action == 2) {
                int i = this.N;
                if (i != -1) {
                    int findPointerIndex = motionEvent.findPointerIndex(i);
                    float x2 = motionEvent.getX(findPointerIndex);
                    float f = x2 - this.J;
                    float abs = Math.abs(f);
                    float y2 = motionEvent.getY(findPointerIndex);
                    float abs2 = Math.abs(y2 - this.M);
                    if (f != 0.0f) {
                        float f2 = this.J;
                        if ((this.I || ((f2 >= this.G || f <= 0.0f) && (f2 <= getWidth() - this.G || f >= 0.0f))) && q(this, false, (int) f, (int) x2, (int) y2)) {
                            this.J = x2;
                            this.K = y2;
                            this.E = true;
                            return false;
                        }
                    }
                    float f3 = this.H;
                    if (abs > f3 && abs * 0.5f > abs2) {
                        this.D = true;
                        H();
                        o(1);
                        this.J = f > 0.0f ? this.L + this.H : this.L - this.H;
                        this.K = y2;
                        C(true);
                    } else if (abs2 > f3) {
                        this.E = true;
                    }
                    if (this.D && F(x2, y2)) {
                        postInvalidateOnAnimation();
                    }
                }
            } else if (action == 6) {
                A(motionEvent);
            }
        }
        if (this.O == null) {
            this.O = VelocityTracker.obtain();
        }
        this.O.addMovement(motionEvent);
        return this.D;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008c  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void onLayout(boolean r18, int r19, int r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        pcv pcvVar;
        pcv pcvVar2;
        int i3;
        int i4;
        int i5;
        boolean z = false;
        setMeasuredDimension(getDefaultSize(0, i), getDefaultSize(0, i2));
        int measuredWidth = getMeasuredWidth();
        this.G = Math.min(measuredWidth / 10, this.F);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i6 = 0;
        while (true) {
            boolean z2 = true;
            int i7 = 1073741824;
            if (i6 >= childCount) {
                break;
            }
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8 && (pcvVar2 = (pcv) childAt.getLayoutParams()) != null && pcvVar2.a) {
                int i8 = pcvVar2.b;
                int i9 = i8 & 7;
                int i10 = i8 & 112;
                boolean z3 = (i10 == 48 || i10 == 80) ? true : z;
                if (i9 != 3 && i9 != 5) {
                    z2 = z;
                }
                int i11 = Integer.MIN_VALUE;
                if (z3) {
                    i3 = Integer.MIN_VALUE;
                    i11 = 1073741824;
                } else {
                    i3 = z2 ? 1073741824 : Integer.MIN_VALUE;
                }
                if (pcvVar2.width != -2) {
                    i4 = pcvVar2.width != -1 ? pcvVar2.width : paddingLeft;
                    i11 = 1073741824;
                } else {
                    i4 = paddingLeft;
                }
                if (pcvVar2.height != -2) {
                    i5 = pcvVar2.height != -1 ? pcvVar2.height : measuredHeight;
                } else {
                    i5 = measuredHeight;
                    i7 = i3;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i4, i11), View.MeasureSpec.makeMeasureSpec(i5, i7));
                if (z3) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z2) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i6++;
            z = false;
        }
        View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.A = true;
        f();
        this.A = false;
        int childCount2 = getChildCount();
        for (int i12 = 0; i12 < childCount2; i12++) {
            View childAt2 = getChildAt(i12);
            if (childAt2.getVisibility() != 8 && ((pcvVar = (pcv) childAt2.getLayoutParams()) == null || !pcvVar.a)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * pcvVar.c), 1073741824), makeMeasureSpec);
            }
        }
    }

    @Override // android.view.ViewGroup
    protected final boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2;
        int i3;
        int i4;
        pcu b;
        int i5 = i & 2;
        int childCount = getChildCount();
        if (i5 != 0) {
            i4 = childCount;
            i2 = 0;
            i3 = 1;
        } else {
            i2 = childCount - 1;
            i3 = -1;
            i4 = -1;
        }
        while (i2 != i4) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (b = b(childAt)) != null && b.b == this.c && childAt.requestFocus(i, rect)) {
                return true;
            }
            i2 += i3;
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof pda)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        pda pdaVar = (pda) parcelable;
        super.onRestoreInstanceState(pdaVar.d);
        pco pcoVar = this.b;
        if (pcoVar != null) {
            pcoVar.e(pdaVar.b, pdaVar.e);
            m(pdaVar.a, false, true);
        } else {
            this.s = pdaVar.a;
            this.t = pdaVar.b;
            this.u = pdaVar.e;
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        pda pdaVar = new pda(super.onSaveInstanceState());
        pdaVar.a = this.c;
        pco pcoVar = this.b;
        if (pcoVar != null) {
            pdaVar.b = pcoVar.a();
        }
        return pdaVar;
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            int i5 = this.d;
            h(i, i3, i5, i5);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x01bd  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r12) {
        /*
            Method dump skipped, instructions count: 483
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean p(int r6) {
        /*
            r5 = this;
            android.view.View r0 = r5.findFocus()
            r1 = 0
            if (r0 != r5) goto L9
        L7:
            r0 = r1
            goto L58
        L9:
            if (r0 == 0) goto L58
            android.view.ViewParent r2 = r0.getParent()
        Lf:
            boolean r3 = r2 instanceof android.view.ViewGroup
            if (r3 == 0) goto L1b
            if (r2 != r5) goto L16
            goto L58
        L16:
            android.view.ViewParent r2 = r2.getParent()
            goto Lf
        L1b:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.Class r3 = r0.getClass()
            java.lang.String r3 = r3.getSimpleName()
            r2.append(r3)
            android.view.ViewParent r0 = r0.getParent()
        L2f:
            boolean r3 = r0 instanceof android.view.ViewGroup
            if (r3 == 0) goto L48
            java.lang.String r3 = " => "
            r2.append(r3)
            java.lang.Class r3 = r0.getClass()
            java.lang.String r3 = r3.getSimpleName()
            r2.append(r3)
            android.view.ViewParent r0 = r0.getParent()
            goto L2f
        L48:
            java.lang.String r0 = r2.toString()
            java.lang.String r2 = "arrowScroll tried to find focus based on non-child current focused view "
            java.lang.String r0 = r2.concat(r0)
            java.lang.String r2 = "ViewPager"
            android.util.Log.e(r2, r0)
            goto L7
        L58:
            android.view.FocusFinder r1 = android.view.FocusFinder.getInstance()
            android.view.View r1 = r1.findNextFocus(r5, r0, r6)
            r2 = 0
            r3 = 66
            r4 = 17
            if (r1 == 0) goto La9
            if (r1 == r0) goto La9
            if (r6 != r4) goto L89
            android.graphics.Rect r2 = r5.r
            android.graphics.Rect r2 = r5.w(r2, r1)
            int r2 = r2.left
            android.graphics.Rect r3 = r5.r
            android.graphics.Rect r3 = r5.w(r3, r0)
            int r3 = r3.left
            if (r0 == 0) goto L84
            if (r2 < r3) goto L84
            boolean r2 = r5.r()
            goto Lbd
        L84:
            boolean r2 = r1.requestFocus()
            goto Lbd
        L89:
            if (r6 != r3) goto Lbd
            android.graphics.Rect r2 = r5.r
            android.graphics.Rect r2 = r5.w(r2, r1)
            int r2 = r2.left
            android.graphics.Rect r3 = r5.r
            android.graphics.Rect r3 = r5.w(r3, r0)
            int r3 = r3.left
            if (r0 == 0) goto La4
            if (r2 > r3) goto La4
            boolean r2 = r5.s()
            goto Lbd
        La4:
            boolean r2 = r1.requestFocus()
            goto Lbd
        La9:
            if (r6 == r4) goto Lb9
            r0 = 1
            if (r6 != r0) goto Laf
            goto Lb9
        Laf:
            if (r6 == r3) goto Lb4
            r0 = 2
            if (r6 != r0) goto Lbd
        Lb4:
            boolean r2 = r5.s()
            goto Lbd
        Lb9:
            boolean r2 = r5.r()
        Lbd:
            if (r2 == 0) goto Lc6
            int r6 = android.view.SoundEffectConstants.getContantForFocusDirection(r6)
            r5.playSoundEffect(r6)
        Lc6:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.p(int):boolean");
    }

    protected boolean q(View view, boolean z, int i, int i2, int i3) {
        int i4;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            int childCount = viewGroup.getChildCount();
            while (true) {
                childCount--;
                if (childCount < 0) {
                    break;
                }
                View childAt = viewGroup.getChildAt(childCount);
                int i5 = i2 + scrollX;
                if (i5 >= childAt.getLeft() && i5 < childAt.getRight() && (i4 = i3 + scrollY) >= childAt.getTop() && i4 < childAt.getBottom() && q(childAt, true, i, i5 - childAt.getLeft(), i4 - childAt.getTop())) {
                    return true;
                }
            }
        }
        return z && view.canScrollHorizontally(-i);
    }

    final boolean r() {
        int i = this.c;
        if (i <= 0) {
            return false;
        }
        l(i - 1, true);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (this.A) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    final boolean s() {
        if (this.b == null || this.c >= r0.j() - 1) {
            return false;
        }
        l(this.c + 1, true);
        return true;
    }

    final void t(Context context) {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        this.v = new Scroller(context, m);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f = context.getResources().getDisplayMetrics().density;
        this.H = viewConfiguration.getScaledPagingTouchSlop();
        this.P = (int) (400.0f * f);
        this.Q = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f = new EdgeEffect(context);
        this.g = new EdgeEffect(context);
        this.R = (int) (25.0f * f);
        this.S = (int) (f + f);
        this.F = (int) (f * 16.0f);
        kvo.p(this, new pcw(this));
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        kvd.k(this, new pcs(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void u(int r13, float r14) {
        /*
            Method dump skipped, instructions count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.u(int, float):void");
    }

    @Override // android.view.View
    protected final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == null;
    }

    @Override // android.view.ViewGroup
    protected final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new pcv();
    }

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.p = new ArrayList();
        this.q = new pcu();
        this.r = new Rect();
        this.s = -1;
        this.t = null;
        this.u = null;
        this.y = -3.4028235E38f;
        this.z = Float.MAX_VALUE;
        this.e = 1;
        this.I = true;
        this.N = -1;
        this.T = true;
        this.ab = new pcr(this);
        this.ac = 0;
        t(context);
    }
}
