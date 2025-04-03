package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import defpackage.kkq;
import defpackage.kkr;
import defpackage.kks;
import defpackage.kkt;
import defpackage.kku;
import defpackage.kkv;
import defpackage.kkw;
import defpackage.kkx;
import defpackage.kkz;
import defpackage.kla;
import defpackage.klb;
import defpackage.klc;
import defpackage.kst;
import defpackage.ksv;
import defpackage.kua;
import defpackage.kub;
import defpackage.kuc;
import defpackage.kud;
import defpackage.kvb;
import defpackage.kvd;
import defpackage.kvo;
import defpackage.kxh;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements kua, kub {
    public static final String a;
    public static final Class[] b;
    public static final ThreadLocal c;
    static final Comparator d;
    public static final /* synthetic */ int i = 0;
    private static final kst j;
    public final klb e;
    public kxh f;
    public boolean g;
    public ViewGroup.OnHierarchyChangeListener h;
    private final List k;
    private final List l;
    private final int[] m;
    private final int[] n;
    private final int[] o;
    private boolean p;
    private boolean q;
    private int[] r;
    private View s;
    private View t;
    private kkx u;
    private boolean v;
    private Drawable w;
    private kud x;
    private final kuc y;

    static {
        Package r0 = CoordinatorLayout.class.getPackage();
        a = r0 != null ? r0.getName() : null;
        d = new kla();
        b = new Class[]{Context.class, AttributeSet.class};
        c = new ThreadLocal();
        j = new ksv(12);
    }

    public CoordinatorLayout(Context context) {
        this(context, null);
    }

    private final boolean A(int i2) {
        View view;
        View view2 = this;
        while (true) {
            if (view2 == null) {
                view = null;
                break;
            }
            if (view2.isFocused()) {
                view = view2;
                break;
            }
            view2 = view2 instanceof ViewGroup ? ((ViewGroup) view2).getFocusedChild() : null;
        }
        u(this, view, 2, 1);
        e(view, 0, i2, this.o, 1);
        int[] iArr = this.o;
        int i3 = iArr[1];
        iArr[0] = 0;
        iArr[1] = 0;
        g(view, 0, i3, 0, i2, 1, iArr);
        i(view, 1);
        return this.o[1] > 0;
    }

    private final boolean B(kkt kktVar, View view, MotionEvent motionEvent, int i2) {
        return i2 != 0 ? kktVar.j(this, view, motionEvent) : kktVar.f(this, view, motionEvent);
    }

    private final boolean C(MotionEvent motionEvent, int i2) {
        int actionMasked = motionEvent.getActionMasked();
        List list = this.l;
        list.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i3 = childCount - 1; i3 >= 0; i3--) {
            list.add(getChildAt(isChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i3) : i3));
        }
        Comparator comparator = d;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
        int size = list.size();
        MotionEvent motionEvent2 = null;
        boolean z = false;
        for (int i4 = 0; i4 < size; i4++) {
            View view = (View) list.get(i4);
            kkw kkwVar = (kkw) view.getLayoutParams();
            kkt kktVar = kkwVar.a;
            if (!z || actionMasked == 0) {
                if (!z && kktVar != null && (z = B(kktVar, view, motionEvent, i2))) {
                    this.s = view;
                    if (actionMasked != 3 && actionMasked != 1) {
                        for (int i5 = 0; i5 < i4; i5++) {
                            View view2 = (View) list.get(i5);
                            kkt kktVar2 = ((kkw) view2.getLayoutParams()).a;
                            if (kktVar2 != null) {
                                if (motionEvent2 == null) {
                                    motionEvent2 = E(motionEvent);
                                }
                                B(kktVar2, view2, motionEvent2, i2);
                            }
                        }
                    }
                }
                if (kkwVar.a == null) {
                    kkwVar.m = false;
                }
                boolean z2 = kkwVar.m;
            } else if (kktVar != null) {
                if (motionEvent2 == null) {
                    motionEvent2 = E(motionEvent);
                }
                B(kktVar, view, motionEvent2, i2);
            }
        }
        list.clear();
        if (motionEvent2 != null) {
            motionEvent2.recycle();
        }
        return z;
    }

    private static final void D(int i2, Rect rect, Rect rect2, kkw kkwVar, int i3, int i4) {
        int i5 = kkwVar.c;
        if (i5 == 0) {
            i5 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i5, i2);
        int i6 = absoluteGravity & 7;
        int i7 = absoluteGravity & 112;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(s(kkwVar.d), i2);
        int i8 = absoluteGravity2 & 7;
        int i9 = absoluteGravity2 & 112;
        int width = i8 != 1 ? i8 != 5 ? rect.left : rect.right : rect.left + (rect.width() / 2);
        int height = i9 != 16 ? i9 != 80 ? rect.top : rect.bottom : rect.top + (rect.height() / 2);
        if (i6 == 1) {
            width -= i3 / 2;
        } else if (i6 != 5) {
            width -= i3;
        }
        if (i7 == 16) {
            height -= i4 / 2;
        } else if (i7 != 80) {
            height -= i4;
        }
        rect2.set(width, height, i3 + width, i4 + height);
    }

    private static final MotionEvent E(MotionEvent motionEvent) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setAction(3);
        return obtain;
    }

    private static final void F(View view, int i2) {
        kkw kkwVar = (kkw) view.getLayoutParams();
        int i3 = kkwVar.i;
        if (i3 != i2) {
            int[] iArr = kvo.a;
            view.offsetLeftAndRight(i2 - i3);
            kkwVar.i = i2;
        }
    }

    private static final void G(View view, int i2) {
        kkw kkwVar = (kkw) view.getLayoutParams();
        int i3 = kkwVar.j;
        if (i3 != i2) {
            int[] iArr = kvo.a;
            view.offsetTopAndBottom(i2 - i3);
            kkwVar.j = i2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static final kkw l(View view) {
        kkw kkwVar = (kkw) view.getLayoutParams();
        if (!kkwVar.b) {
            if (view instanceof kks) {
                kkt a2 = ((kks) view).a();
                if (a2 == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                kkwVar.b(a2);
                kkwVar.b = true;
                return kkwVar;
            }
            kku kkuVar = null;
            for (Class<?> cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                kkuVar = (kku) cls.getAnnotation(kku.class);
                if (kkuVar != null) {
                    break;
                }
            }
            if (kkuVar != null) {
                try {
                    kkwVar.b((kkt) kkuVar.a().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                } catch (Exception e) {
                    Log.e("CoordinatorLayout", "Default behavior class " + kkuVar.a().getName() + " could not be instantiated. Did you forget a default constructor?", e);
                }
            }
            kkwVar.b = true;
        }
        return kkwVar;
    }

    private final int n() {
        return p() - getHeight();
    }

    private final int o() {
        return -p();
    }

    private final int p() {
        int i2 = 0;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt = getChildAt(i3);
            kkw kkwVar = (kkw) childAt.getLayoutParams();
            i2 += childAt.getHeight() + kkwVar.topMargin + kkwVar.bottomMargin;
        }
        return i2;
    }

    private final int q(int i2) {
        int[] iArr = this.r;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i2);
            return 0;
        }
        if (i2 >= 0 && i2 < iArr.length) {
            return iArr[i2];
        }
        Log.e("CoordinatorLayout", "Keyline index " + i2 + " out of range for " + this);
        return 0;
    }

    private final int r() {
        return (int) (getHeight() * 0.2f);
    }

    private static int s(int i2) {
        if ((i2 & 7) == 0) {
            i2 |= 8388611;
        }
        return (i2 & 112) == 0 ? i2 | 48 : i2;
    }

    private static int t(int i2) {
        if (i2 == 0) {
            return 8388661;
        }
        return i2;
    }

    private static Rect v() {
        Rect rect = (Rect) j.a();
        return rect == null ? new Rect() : rect;
    }

    private final void w(kkw kkwVar, Rect rect, int i2, int i3) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + kkwVar.leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i2) - kkwVar.rightMargin));
        int max2 = Math.max(getPaddingTop() + kkwVar.topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i3) - kkwVar.bottomMargin));
        rect.set(max, max2, i2 + max, i3 + max2);
    }

    private static void x(Rect rect) {
        rect.setEmpty();
        j.b(rect);
    }

    private final void y() {
        View view = this.s;
        if (view != null) {
            kkt kktVar = ((kkw) view.getLayoutParams()).a;
            if (kktVar != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                kktVar.j(this, this.s, obtain);
                obtain.recycle();
            }
            this.s = null;
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            ((kkw) getChildAt(i2).getLayoutParams()).m = false;
        }
        this.p = false;
    }

    private final void z() {
        int[] iArr = kvo.a;
        if (!getFitsSystemWindows()) {
            kvd.k(this, null);
            return;
        }
        if (this.x == null) {
            this.x = new kkr(this);
        }
        kvd.k(this, this.x);
        setSystemUiVisibility(1280);
    }

    public final List a(View view) {
        klb klbVar = this.e;
        int i2 = klbVar.b.d;
        ArrayList arrayList = null;
        for (int i3 = 0; i3 < i2; i3++) {
            ArrayList arrayList2 = (ArrayList) klbVar.b.g(i3);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(klbVar.b.d(i3));
            }
        }
        return arrayList == null ? Collections.EMPTY_LIST : arrayList;
    }

    public final void b(View view) {
        ArrayList a2 = this.e.a(view);
        if (a2 == null || a2.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < a2.size(); i2++) {
            View view2 = (View) a2.get(i2);
            kkt kktVar = ((kkw) view2.getLayoutParams()).a;
            if (kktVar != null) {
                kktVar.l(this, view2, view);
            }
        }
    }

    final void c(View view, boolean z, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z) {
            klc.a(this, view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    @Override // android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof kkw) && super.checkLayoutParams(layoutParams);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0246  */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v40 */
    /* JADX WARN: Type inference failed for: r3v5, types: [int] */
    /* JADX WARN: Type inference failed for: r5v23, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(int r21) {
        /*
            Method dump skipped, instructions count: 682
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.d(int):void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean dispatchKeyEvent = super.dispatchKeyEvent(keyEvent);
        if (!dispatchKeyEvent && keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 19) {
                return keyEvent.isAltPressed() ? A(-getHeight()) : A(-r());
            }
            if (keyCode == 20) {
                return keyEvent.isAltPressed() ? A(getHeight()) : A(r());
            }
            if (keyCode == 62) {
                return keyEvent.isShiftPressed() ? A(o()) : A(n());
            }
            if (keyCode == 92) {
                return A(-getHeight());
            }
            if (keyCode == 93) {
                return A(getHeight());
            }
            if (keyCode == 122) {
                return A(o());
            }
            if (keyCode == 123) {
                return A(n());
            }
        }
        return dispatchKeyEvent;
    }

    @Override // android.view.ViewGroup
    protected final boolean drawChild(Canvas canvas, View view, long j2) {
        kkt kktVar = ((kkw) view.getLayoutParams()).a;
        return super.drawChild(canvas, view, j2);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.w;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidate();
        }
    }

    @Override // defpackage.kua
    public final void e(View view, int i2, int i3, int[] iArr, int i4) {
        kkt kktVar;
        int childCount = getChildCount();
        boolean z = false;
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                kkw kkwVar = (kkw) childAt.getLayoutParams();
                if (kkwVar.d(i4) && (kktVar = kkwVar.a) != null) {
                    int[] iArr2 = this.m;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    kktVar.c(this, childAt, view, i2, i3, iArr2, i4);
                    i5 = i2 > 0 ? Math.max(i5, this.m[0]) : Math.min(i5, this.m[0]);
                    i6 = i3 > 0 ? Math.max(i6, this.m[1]) : Math.min(i6, this.m[1]);
                    z = true;
                }
            }
        }
        iArr[0] = i5;
        iArr[1] = i6;
        if (z) {
            d(1);
        }
    }

    @Override // defpackage.kua
    public final void f(View view, int i2, int i3, int i4, int i5, int i6) {
        g(view, i2, i3, i4, i5, 0, this.n);
    }

    @Override // defpackage.kub
    public final void g(View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        kkt kktVar;
        int childCount = getChildCount();
        boolean z = false;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                kkw kkwVar = (kkw) childAt.getLayoutParams();
                if (kkwVar.d(i6) && (kktVar = kkwVar.a) != null) {
                    int[] iArr2 = this.m;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    kktVar.d(this, childAt, view, i2, i3, i4, i5, i6, iArr2);
                    i7 = i4 > 0 ? Math.max(i7, this.m[0]) : Math.min(i7, this.m[0]);
                    i8 = i5 > 0 ? Math.max(i8, this.m[1]) : Math.min(i8, this.m[1]);
                    z = true;
                }
            }
        }
        iArr[0] = iArr[0] + i7;
        iArr[1] = iArr[1] + i8;
        if (z) {
            d(1);
        }
    }

    @Override // android.view.ViewGroup
    protected final /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new kkw(-2, -2);
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new kkw(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public final int getNestedScrollAxes() {
        return this.y.a();
    }

    @Override // android.view.View
    protected final int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    @Override // android.view.View
    protected final int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    @Override // defpackage.kua
    public final void h(View view, View view2, int i2, int i3) {
        this.y.b(i2, i3);
        this.t = view2;
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            kkw kkwVar = (kkw) getChildAt(i4).getLayoutParams();
            if (kkwVar.d(i3)) {
                kkt kktVar = kkwVar.a;
            }
        }
    }

    @Override // defpackage.kua
    public final void i(View view, int i2) {
        this.y.c(i2);
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            kkw kkwVar = (kkw) childAt.getLayoutParams();
            if (kkwVar.d(i2)) {
                kkt kktVar = kkwVar.a;
                if (kktVar != null) {
                    kktVar.e(this, childAt, view, i2);
                }
                kkwVar.c(i2, false);
                kkwVar.a();
            }
        }
        this.t = null;
    }

    public final void j(View view, int i2) {
        Rect v;
        Rect v2;
        kkw kkwVar = (kkw) view.getLayoutParams();
        View view2 = kkwVar.k;
        if (view2 == null && kkwVar.f != -1) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        if (view2 != null) {
            v = v();
            v2 = v();
            try {
                klc.a(this, view2, v);
                kkw kkwVar2 = (kkw) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                D(i2, v, v2, kkwVar2, measuredWidth, measuredHeight);
                w(kkwVar2, v2, measuredWidth, measuredHeight);
                view.layout(v2.left, v2.top, v2.right, v2.bottom);
                return;
            } finally {
                x(v);
                x(v2);
            }
        }
        int i3 = kkwVar.e;
        if (i3 < 0) {
            kkw kkwVar3 = (kkw) view.getLayoutParams();
            v = v();
            v.set(getPaddingLeft() + kkwVar3.leftMargin, getPaddingTop() + kkwVar3.topMargin, (getWidth() - getPaddingRight()) - kkwVar3.rightMargin, (getHeight() - getPaddingBottom()) - kkwVar3.bottomMargin);
            if (this.f != null) {
                int[] iArr = kvo.a;
                if (getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                    v.left += this.f.b();
                    v.top += this.f.d();
                    v.right -= this.f.c();
                    v.bottom -= this.f.a();
                }
            }
            v2 = v();
            Gravity.apply(s(kkwVar3.c), view.getMeasuredWidth(), view.getMeasuredHeight(), v, v2, i2);
            view.layout(v2.left, v2.top, v2.right, v2.bottom);
            return;
        }
        kkw kkwVar4 = (kkw) view.getLayoutParams();
        int absoluteGravity = Gravity.getAbsoluteGravity(t(kkwVar4.c), i2);
        int i4 = absoluteGravity & 7;
        int i5 = absoluteGravity & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth2 = view.getMeasuredWidth();
        int measuredHeight2 = view.getMeasuredHeight();
        if (i2 == 1) {
            i3 = width - i3;
        }
        int q = q(i3) - measuredWidth2;
        if (i4 == 1) {
            q += measuredWidth2 / 2;
        } else if (i4 == 5) {
            q += measuredWidth2;
        }
        int i6 = i5 != 16 ? i5 != 80 ? 0 : measuredHeight2 : measuredHeight2 / 2;
        int max = Math.max(getPaddingLeft() + kkwVar4.leftMargin, Math.min(q, ((width - getPaddingRight()) - measuredWidth2) - kkwVar4.rightMargin));
        int max2 = Math.max(getPaddingTop() + kkwVar4.topMargin, Math.min(i6, ((height - getPaddingBottom()) - measuredHeight2) - kkwVar4.bottomMargin));
        view.layout(max, max2, measuredWidth2 + max, measuredHeight2 + max2);
    }

    public final boolean k(View view, int i2, int i3) {
        Rect v = v();
        klc.a(this, view, v);
        try {
            return v.contains(i2, i3);
        } finally {
            x(v);
        }
    }

    public final void m(View view, int i2, int i3, int i4) {
        measureChildWithMargins(view, i2, i3, i4, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        y();
        if (this.v) {
            if (this.u == null) {
                this.u = new kkx(this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.u);
        }
        if (this.f == null) {
            int[] iArr = kvo.a;
            if (getFitsSystemWindows()) {
                kvb.c(this);
            }
        }
        this.q = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        y();
        if (this.v && this.u != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.u);
        }
        View view = this.t;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.q = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.g || this.w == null) {
            return;
        }
        kxh kxhVar = this.f;
        int d2 = kxhVar != null ? kxhVar.d() : 0;
        if (d2 > 0) {
            this.w.setBounds(0, 0, getWidth(), d2);
            this.w.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            y();
            actionMasked = 0;
        }
        boolean C = C(motionEvent, 0);
        if (actionMasked != 1 && actionMasked != 3) {
            return C;
        }
        this.s = null;
        y();
        return C;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        kkt kktVar;
        int layoutDirection = getLayoutDirection();
        int size = this.k.size();
        for (int i6 = 0; i6 < size; i6++) {
            View view = (View) this.k.get(i6);
            if (view.getVisibility() != 8 && ((kktVar = ((kkw) view.getLayoutParams()).a) == null || !kktVar.g(this, view, layoutDirection))) {
                j(view, layoutDirection);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:151:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0320  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void onMeasure(int r26, int r27) {
        /*
            Method dump skipped, instructions count: 904
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                kkw kkwVar = (kkw) childAt.getLayoutParams();
                if (kkwVar.n) {
                    kkt kktVar = kkwVar.a;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        kkt kktVar;
        int childCount = getChildCount();
        boolean z = false;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                kkw kkwVar = (kkw) childAt.getLayoutParams();
                if (kkwVar.n && (kktVar = kkwVar.a) != null) {
                    z |= kktVar.o(childAt, view, f2);
                }
            }
        }
        return z;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
        e(view, i2, i3, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        f(view, i2, i3, i4, i5, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i2) {
        h(view, view2, i2, 0);
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof kkz)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        kkz kkzVar = (kkz) parcelable;
        super.onRestoreInstanceState(kkzVar.d);
        SparseArray sparseArray = kkzVar.a;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            int id = childAt.getId();
            kkt kktVar = l(childAt).a;
            if (id != -1 && kktVar != null && (parcelable2 = (Parcelable) sparseArray.get(id)) != null) {
                kktVar.q(childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        Parcelable r;
        kkz kkzVar = new kkz(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            int id = childAt.getId();
            kkt kktVar = ((kkw) childAt.getLayoutParams()).a;
            if (id != -1 && kktVar != null && (r = kktVar.r(childAt)) != null) {
                sparseArray.append(id, r);
            }
        }
        kkzVar.a = sparseArray;
        return kkzVar;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i2) {
        return u(view, view2, i2, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        i(view, 0);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean C;
        int actionMasked = motionEvent.getActionMasked();
        View view = this.s;
        boolean z = false;
        if (view != null) {
            kkt kktVar = ((kkw) view.getLayoutParams()).a;
            C = kktVar != null ? kktVar.j(this, this.s, motionEvent) : false;
        } else {
            C = C(motionEvent, 1);
            if (actionMasked != 0 && C) {
                z = true;
            }
        }
        if (this.s == null || actionMasked == 3) {
            C |= super.onTouchEvent(motionEvent);
        } else if (z) {
            MotionEvent E = E(motionEvent);
            super.onTouchEvent(E);
            E.recycle();
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return C;
        }
        this.s = null;
        y();
        return C;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        kkt kktVar = ((kkw) view.getLayoutParams()).a;
        if (kktVar == null || !kktVar.h(this, view, rect, z)) {
            return super.requestChildRectangleOnScreen(view, rect, z);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (!z || this.p) {
            return;
        }
        if (this.s == null) {
            int childCount = getChildCount();
            MotionEvent motionEvent = null;
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                kkt kktVar = ((kkw) childAt.getLayoutParams()).a;
                if (kktVar != null) {
                    if (motionEvent == null) {
                        long uptimeMillis = SystemClock.uptimeMillis();
                        motionEvent = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    }
                    kktVar.f(this, childAt, motionEvent);
                }
            }
            if (motionEvent != null) {
                motionEvent.recycle();
            }
        }
        y();
        this.p = true;
    }

    @Override // android.view.View
    public final void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        z();
    }

    @Override // android.view.ViewGroup
    public final void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.h = onHierarchyChangeListener;
    }

    @Override // android.view.View
    public final void setVisibility(int i2) {
        super.setVisibility(i2);
        Drawable drawable = this.w;
        if (drawable != null) {
            boolean z = i2 == 0;
            if (drawable.isVisible() != z) {
                this.w.setVisible(z, false);
            }
        }
    }

    @Override // defpackage.kua
    public final boolean u(View view, View view2, int i2, int i3) {
        int childCount = getChildCount();
        boolean z = false;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                kkw kkwVar = (kkw) childAt.getLayoutParams();
                kkt kktVar = kkwVar.a;
                if (kktVar != null) {
                    boolean i5 = kktVar.i(this, childAt, view, view2, i2, i3);
                    z |= i5;
                    kkwVar.c(i3, i5);
                } else {
                    kkwVar.c(i3, false);
                }
            }
        }
        return z;
    }

    @Override // android.view.View
    protected final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.w;
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.coordinatorLayoutStyle);
    }

    @Override // android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof kkw ? new kkw((kkw) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new kkw((ViewGroup.MarginLayoutParams) layoutParams) : new kkw(layoutParams);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        TypedArray obtainStyledAttributes;
        Context context2;
        CoordinatorLayout coordinatorLayout;
        this.k = new ArrayList();
        this.e = new klb();
        this.l = new ArrayList();
        this.m = new int[2];
        this.n = new int[2];
        this.o = new int[2];
        this.y = new kuc();
        if (i2 == 0) {
            obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, kkq.a, 0, 2132151587);
        } else {
            obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, kkq.a, i2, 0);
        }
        TypedArray typedArray = obtainStyledAttributes;
        if (i2 == 0) {
            coordinatorLayout = this;
            context2 = context;
            kvo.o(coordinatorLayout, context2, kkq.a, attributeSet, typedArray, 0, 2132151587);
        } else {
            context2 = context;
            coordinatorLayout = this;
            kvo.o(coordinatorLayout, context2, kkq.a, attributeSet, typedArray, i2, 0);
        }
        int resourceId = typedArray.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context2.getResources();
            coordinatorLayout.r = resources.getIntArray(resourceId);
            float f = resources.getDisplayMetrics().density;
            int length = coordinatorLayout.r.length;
            for (int i3 = 0; i3 < length; i3++) {
                coordinatorLayout.r[i3] = (int) (r12[i3] * f);
            }
        }
        coordinatorLayout.w = typedArray.getDrawable(1);
        typedArray.recycle();
        z();
        super.setOnHierarchyChangeListener(new kkv(this));
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }
}
