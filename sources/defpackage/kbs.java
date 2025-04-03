package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.Region;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* compiled from: PG */
/* loaded from: classes.dex */
public class kbs extends ViewGroup implements kub, hez, iwy, kud {
    public static final ffji a = kaz.a;
    public final ijj b;
    public final View c;
    public final iwx d;
    public ffix e;
    public boolean f;
    public final ffix g;
    public ffix h;
    public hvi i;
    public final ffji j;
    public jzn k;
    public final ffji l;
    public lkr m;
    public owz n;
    public final int[] o;
    public long p;
    public final ffix q;
    public final ffji r;
    public int s;
    public int t;
    public boolean u;
    public final iui v;
    private final ffix w;
    private final int[] x;
    private final kuc y;

    public kbs(Context context, hfr hfrVar, ijj ijjVar, View view, iwx iwxVar) {
        super(context);
        this.b = ijjVar;
        this.c = view;
        this.d = iwxVar;
        jhe.b(this, hfrVar);
        setSaveFromParentEnabled(false);
        addView(view);
        kax kaxVar = new kax(this);
        int[] iArr = kvo.a;
        kwr.c(this, kaxVar);
        kvd.k(this, this);
        this.e = kbr.a;
        this.g = kbo.a;
        this.h = kbn.a;
        this.i = hvi.e;
        this.k = new jzo(1.0f);
        this.o = new int[2];
        this.p = 0L;
        this.q = new kbq(this);
        this.w = new kbp(this);
        this.x = new int[2];
        this.s = Integer.MIN_VALUE;
        this.t = Integer.MIN_VALUE;
        this.y = new kuc();
        iui iuiVar = new iui(false, 3, null);
        iuiVar.i = true;
        iuiVar.m = this;
        hvi c = jjs.c(ijk.a(hvi.e, kbu.a, ijjVar), true, kbh.a);
        ili iliVar = new ili();
        iliVar.a = new ilm(this);
        ils ilsVar = new ils();
        iliVar.e(ilsVar);
        this.r = ilsVar;
        hvi a2 = ipx.a(hxs.a(icf.b(c.a(iliVar), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, 0, 131071), new kbi(this, iuiVar, this)), new kbj(this, iuiVar));
        iuiVar.k(this.i.a(a2));
        this.j = new kba(iuiVar, a2);
        iuiVar.ah(this.k);
        this.l = new kbb(iuiVar);
        iuiVar.A = new kbc(this, iuiVar);
        iuiVar.B = new kbd(this);
        iuiVar.j(new kbg(this, iuiVar));
        this.v = iuiVar;
    }

    public static final kpt m(kpt kptVar, int i, int i2, int i3, int i4) {
        int i5 = kptVar.b - i;
        int i6 = kptVar.c - i2;
        int i7 = kptVar.d - i3;
        int i8 = kptVar.e - i4;
        if (i5 < 0) {
            i5 = 0;
        }
        if (i6 < 0) {
            i6 = 0;
        }
        if (i7 < 0) {
            i7 = 0;
        }
        if (i8 < 0) {
            i8 = 0;
        }
        return kpt.d(i5, i6, i7, i8);
    }

    public static final int n(int i, int i2, int i3) {
        if (i3 >= 0 || i == i2) {
            return View.MeasureSpec.makeMeasureSpec(ffmk.i(i3, i, i2), 1073741824);
        }
        if (i3 == -2) {
            if (i2 != Integer.MAX_VALUE) {
                return View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE);
            }
        } else if (i3 == -1 && i2 != Integer.MAX_VALUE) {
            return View.MeasureSpec.makeMeasureSpec(i2, 1073741824);
        }
        return View.MeasureSpec.makeMeasureSpec(0, 0);
    }

    @Override // defpackage.iwy
    public final boolean A() {
        return isAttachedToWindow();
    }

    @Override // defpackage.hez
    public final void b() {
        if (!hasFocus()) {
            removeAllViewsInLayout();
            return;
        }
        View findFocus = findFocus();
        if (findFocus == null) {
            removeAllViewsInLayout();
            return;
        }
        View view = new View(getContext());
        Rect rect = new Rect(0, 0, findFocus.getWidth(), findFocus.getHeight());
        offsetDescendantRectToMyCoords(findFocus, rect);
        addView(view);
        view.setFocusable(true);
        view.setFocusableInTouchMode(true);
        view.setNextFocusUpId(findFocus.getNextFocusUpId());
        view.setNextFocusDownId(findFocus.getNextFocusDownId());
        view.setNextFocusLeftId(findFocus.getNextFocusLeftId());
        view.setNextFocusRightId(findFocus.getNextFocusRightId());
        view.setNextFocusForwardId(findFocus.getNextFocusForwardId());
        view.layout(rect.left, rect.top, rect.right, rect.bottom);
        view.requestFocus();
        int childCount = getChildCount() - 1;
        for (int i = 0; i < childCount; i++) {
            removeViewAt(0);
        }
        this.d.y(new kbk(this, view));
    }

    @Override // defpackage.hez
    public final void c() {
        this.h.invoke();
    }

    @Override // defpackage.hez
    public final void d() {
        if (this.c.getParent() != this) {
            addView(this.c);
        }
    }

    @Override // defpackage.kua
    public final void e(View view, int i, int i2, int[] iArr, int i3) {
        if (isNestedScrollingEnabled()) {
            ijj ijjVar = this.b;
            float a2 = kbu.a(i);
            float a3 = kbu.a(i2);
            long b = ijjVar.b((Float.floatToRawIntBits(a3) & 4294967295L) | (Float.floatToRawIntBits(a2) << 32), kbu.c(i3));
            iArr[0] = jfc.a(Float.intBitsToFloat((int) (b >> 32)));
            iArr[1] = jfc.a(Float.intBitsToFloat((int) (b & 4294967295L)));
        }
    }

    @Override // defpackage.kud
    public final kxh ey(View view, kxh kxhVar) {
        return k(kxhVar);
    }

    @Override // defpackage.kua
    public final void f(View view, int i, int i2, int i3, int i4, int i5) {
        if (isNestedScrollingEnabled()) {
            ijj ijjVar = this.b;
            float a2 = kbu.a(i);
            float a3 = kbu.a(i2);
            long floatToRawIntBits = Float.floatToRawIntBits(a2);
            long floatToRawIntBits2 = Float.floatToRawIntBits(a3);
            float a4 = kbu.a(i3);
            float a5 = kbu.a(i4);
            ijjVar.a((floatToRawIntBits << 32) | (floatToRawIntBits2 & 4294967295L), (Float.floatToRawIntBits(a4) << 32) | (Float.floatToRawIntBits(a5) & 4294967295L), kbu.c(i5));
        }
    }

    @Override // defpackage.kub
    public final void g(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (isNestedScrollingEnabled()) {
            ijj ijjVar = this.b;
            float a2 = kbu.a(i);
            float a3 = kbu.a(i2);
            long floatToRawIntBits = Float.floatToRawIntBits(a2);
            long floatToRawIntBits2 = Float.floatToRawIntBits(a3);
            float a4 = kbu.a(i3);
            float a5 = kbu.a(i4);
            long a6 = ijjVar.a((floatToRawIntBits << 32) | (floatToRawIntBits2 & 4294967295L), (Float.floatToRawIntBits(a4) << 32) | (Float.floatToRawIntBits(a5) & 4294967295L), kbu.c(i5));
            iArr[0] = jfc.a(Float.intBitsToFloat((int) (a6 >> 32)));
            iArr[1] = jfc.a(Float.intBitsToFloat((int) (a6 & 4294967295L)));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean gatherTransparentRegion(Region region) {
        if (region == null) {
            return true;
        }
        getLocationInWindow(this.x);
        int[] iArr = this.x;
        int i = iArr[0];
        region.op(i, iArr[1], i + getWidth(), this.x[1] + getHeight(), Region.Op.DIFFERENCE);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final CharSequence getAccessibilityClassName() {
        return getClass().getName();
    }

    @Override // android.view.View
    public final ViewGroup.LayoutParams getLayoutParams() {
        ViewGroup.LayoutParams layoutParams = this.c.getLayoutParams();
        return layoutParams == null ? new ViewGroup.LayoutParams(-1, -1) : layoutParams;
    }

    @Override // android.view.ViewGroup
    public final int getNestedScrollAxes() {
        return this.y.a();
    }

    @Override // defpackage.kua
    public final void h(View view, View view2, int i, int i2) {
        this.y.b(i, i2);
    }

    @Override // defpackage.kua
    public final void i(View view, int i) {
        this.y.c(i);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        super.invalidateChildInParent(iArr, rect);
        l();
        return null;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.c.isNestedScrollingEnabled();
    }

    public final ixh j() {
        if (!isAttachedToWindow()) {
            imn.c("Expected AndroidViewHolder to be attached when observing reads.");
        }
        return this.d.k();
    }

    public final kxh k(kxh kxhVar) {
        if (kxhVar.f(-1).equals(kpt.a) && kxhVar.g(-9).equals(kpt.a) && kxhVar.j() == null) {
            return kxhVar;
        }
        iwi y = this.v.y();
        if (!y.t()) {
            return kxhVar;
        }
        long c = kab.c(iod.a(y));
        int a2 = kaa.a(c);
        if (a2 < 0) {
            a2 = 0;
        }
        int b = kaa.b(c);
        if (b < 0) {
            b = 0;
        }
        long g = iod.f(y).g();
        long j = g >> 32;
        long j2 = g & 4294967295L;
        long j3 = y.c;
        long c2 = kab.c(y.i((Float.floatToRawIntBits((int) (j3 >> 32)) << 32) | (Float.floatToRawIntBits((int) (j3 & 4294967295L)) & 4294967295L)));
        int a3 = ((int) j) - kaa.a(c2);
        if (a3 < 0) {
            a3 = 0;
        }
        int b2 = ((int) j2) - kaa.b(c2);
        int i = b2 >= 0 ? b2 : 0;
        return (a2 == 0 && b == 0 && a3 == 0 && i == 0) ? kxhVar : kxhVar.n(a2, b, a3, i);
    }

    public final void l() {
        if (!this.u) {
            this.v.Q();
            return;
        }
        View view = this.c;
        final ffix ffixVar = this.w;
        view.postOnAnimation(new Runnable() { // from class: kaw
            @Override // java.lang.Runnable
            public final void run() {
                ffix.this.invoke();
            }
        });
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.q.invoke();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
        super.onDescendantInvalidated(view, view2);
        l();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        j().a.b(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.c.layout(0, 0, i3 - i, i4 - i2);
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        if (this.c.getParent() != this) {
            setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
            return;
        }
        if (this.c.getVisibility() == 8) {
            setMeasuredDimension(0, 0);
            return;
        }
        this.c.measure(i, i2);
        View view = this.c;
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
        this.s = i;
        this.t = i2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!isNestedScrollingEnabled()) {
            return false;
        }
        float b = kbu.b(f);
        float b2 = kbu.b(f2);
        ffqy.d(this.b.f(), null, null, new kbl(z, this, kao.a(b, b2), null), 3);
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        if (!isNestedScrollingEnabled()) {
            return false;
        }
        float b = kbu.b(f);
        float b2 = kbu.b(f2);
        ffqy.d(this.b.f(), null, null, new kbm(this, kao.a(b, b2), null), 3);
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        ffji ffjiVar = this.r;
        if (ffjiVar != null) {
            ffjiVar.invoke(Boolean.valueOf(z));
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // defpackage.kua
    public final boolean u(View view, View view2, int i, int i2) {
        return ((i & 2) == 0 && (i & 1) == 0) ? false : true;
    }
}
