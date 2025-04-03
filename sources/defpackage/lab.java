package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lab {
    private static final Interpolator c = new kzx();
    public int a;
    public Interpolator b;
    private int d;
    private float[] f;
    private float[] g;
    private float[] h;
    private float[] i;
    private int[] j;
    private int[] k;
    private int[] l;
    private int m;
    private VelocityTracker n;
    private final float o;
    private float p;
    private int q;
    private final OverScroller r;
    private final laa s;
    private View t;
    private boolean u;
    private final ViewGroup v;
    private int e = -1;
    private final Runnable w = new kzy(this);

    private lab(Context context, ViewGroup viewGroup, laa laaVar) {
        if (laaVar == null) {
            throw new NullPointerException("Callback may not be null");
        }
        this.v = viewGroup;
        this.s = laaVar;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.q = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.a = viewConfiguration.getScaledTouchSlop();
        this.o = viewConfiguration.getScaledMaximumFlingVelocity();
        this.p = viewConfiguration.getScaledMinimumFlingVelocity();
        this.b = c;
        this.r = new OverScroller(context, new kzz(this));
    }

    public static lab b(ViewGroup viewGroup, laa laaVar) {
        return new lab(viewGroup.getContext(), viewGroup, laaVar);
    }

    private final int m(int i, int i2, int i3) {
        int abs;
        if (i == 0) {
            return 0;
        }
        int width = this.v.getWidth() / 2;
        float sin = (float) Math.sin((Math.min(1.0f, Math.abs(i) / r0) - 0.5f) * 0.47123894f);
        int abs2 = Math.abs(i2);
        if (abs2 > 0) {
            float f = width;
            abs = Math.round(Math.abs((f + (sin * f)) / abs2) * 1000.0f) * 4;
        } else {
            abs = (int) (((Math.abs(i) / i3) + 1.0f) * 256.0f);
        }
        return Math.min(abs, 600);
    }

    private final void n(int i) {
        float[] fArr = this.f;
        if (fArr == null || !g(i)) {
            return;
        }
        fArr[i] = 0.0f;
        this.g[i] = 0.0f;
        this.h[i] = 0.0f;
        this.i[i] = 0.0f;
        this.j[i] = 0;
        this.k[i] = 0;
        this.l[i] = 0;
        this.m = (~(1 << i)) & this.m;
    }

    private final void o(float f, float f2) {
        this.u = true;
        this.s.d(this.t, f, f2);
        this.u = false;
        if (this.d == 1) {
            f(0);
        }
    }

    private final void p() {
        this.n.computeCurrentVelocity(1000, this.o);
        o(w(this.n.getXVelocity(this.e), this.p, this.o), w(this.n.getYVelocity(this.e), this.p, this.o));
    }

    private final void q(float f, float f2, int i) {
        y(f, f2, i);
        y(f2, f, i);
        y(f, f2, i);
        y(f2, f, i);
    }

    private final void r(float f, float f2, int i) {
        float[] fArr = this.f;
        if (fArr == null || fArr.length <= i) {
            int i2 = i + 1;
            float[] fArr2 = new float[i2];
            float[] fArr3 = new float[i2];
            float[] fArr4 = new float[i2];
            float[] fArr5 = new float[i2];
            int[] iArr = new int[i2];
            int[] iArr2 = new int[i2];
            int[] iArr3 = new int[i2];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.g;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.h;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.i;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.j;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.k;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.l;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f = fArr2;
            this.g = fArr3;
            this.h = fArr4;
            this.i = fArr5;
            this.j = iArr;
            this.k = iArr2;
            this.l = iArr3;
        }
        float[] fArr9 = this.f;
        this.h[i] = f;
        fArr9[i] = f;
        float[] fArr10 = this.g;
        this.i[i] = f2;
        fArr10[i] = f2;
        int[] iArr7 = this.j;
        int i3 = (int) f;
        int i4 = (int) f2;
        int i5 = i3 < this.v.getLeft() + this.q ? 1 : 0;
        if (i4 < this.v.getTop() + this.q) {
            i5 |= 4;
        }
        if (i3 > this.v.getRight() - this.q) {
            i5 |= 2;
        }
        if (i4 > this.v.getBottom() - this.q) {
            i5 |= 8;
        }
        iArr7[i] = i5;
        this.m |= 1 << i;
    }

    private final void s(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (v(pointerId)) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.h[pointerId] = x;
                this.i[pointerId] = y;
            }
        }
    }

    private final boolean t(View view, float f, float f2) {
        if (view == null) {
            return false;
        }
        boolean z = this.s.a(view) > 0;
        boolean z2 = this.s.h() > 0;
        if (!z || !z2) {
            return z ? Math.abs(f) > ((float) this.a) : z2 && Math.abs(f2) > ((float) this.a);
        }
        int i = this.a;
        return (f * f) + (f2 * f2) > ((float) (i * i));
    }

    private final boolean u(int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        int left = this.t.getLeft();
        int top = this.t.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        if (i5 == 0) {
            i5 = 0;
            if (i6 == 0) {
                this.r.abortAnimation();
                f(0);
                return false;
            }
        }
        int i7 = i5;
        View view = this.t;
        int x = x(i3, (int) this.p, (int) this.o);
        int x2 = x(i4, (int) this.p, (int) this.o);
        int abs = Math.abs(i7);
        int abs2 = Math.abs(i6);
        int abs3 = Math.abs(x);
        int abs4 = Math.abs(x2);
        int i8 = abs3 + abs4;
        int i9 = abs + abs2;
        if (x != 0) {
            f = abs3 / i8;
        } else {
            f = abs / i9;
        }
        if (x2 != 0) {
            f2 = i8;
            f3 = abs4;
        } else {
            f2 = i9;
            f3 = abs2;
        }
        float m = m(i7, x, this.s.a(view)) * f;
        float m2 = m(i6, x2, this.s.h());
        this.b = c;
        this.r.startScroll(left, top, i7, i6, (int) (m + (m2 * (f3 / f2))));
        f(2);
        return true;
    }

    private final boolean v(int i) {
        return g(i);
    }

    private static final float w(float f, float f2, float f3) {
        float abs = Math.abs(f);
        if (abs < f2) {
            return 0.0f;
        }
        return abs > f3 ? f > 0.0f ? f3 : -f3 : f;
    }

    private static final int x(int i, int i2, int i3) {
        int abs = Math.abs(i);
        if (abs < i2) {
            return 0;
        }
        return abs > i3 ? i > 0 ? i3 : -i3 : i;
    }

    private final void y(float f, float f2, int i) {
        Math.abs(f);
        Math.abs(f2);
        int i2 = this.j[i];
    }

    public final View a(int i, int i2) {
        int childCount = this.v.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                return null;
            }
            View childAt = this.v.getChildAt(childCount);
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
    }

    public final void c() {
        this.e = -1;
        float[] fArr = this.f;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.g, 0.0f);
            Arrays.fill(this.h, 0.0f);
            Arrays.fill(this.i, 0.0f);
            Arrays.fill(this.j, 0);
            Arrays.fill(this.k, 0);
            Arrays.fill(this.l, 0);
            this.m = 0;
        }
        VelocityTracker velocityTracker = this.n;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.n = null;
        }
    }

    public final void d(View view, int i) {
        if (view.getParent() != this.v) {
            throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.v + ")");
        }
        this.t = view;
        this.e = i;
        this.s.b(view, i);
        f(1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0067, code lost:
    
        if (r9.e == (-1)) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x006d, code lost:
    
        p();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(android.view.MotionEvent r10) {
        /*
            Method dump skipped, instructions count: 424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lab.e(android.view.MotionEvent):void");
    }

    final void f(int i) {
        this.v.removeCallbacks(this.w);
        if (this.d != i) {
            this.d = i;
            this.s.c(i);
            if (this.d == 0) {
                this.t = null;
            }
        }
    }

    public final boolean g(int i) {
        return ((1 << i) & this.m) != 0;
    }

    public final boolean h(int i, int i2) {
        if (this.u) {
            return u(i, i2, (int) this.n.getXVelocity(this.e), (int) this.n.getYVelocity(this.e));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c9, code lost:
    
        if (r12 != r11) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean i(android.view.MotionEvent r18) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lab.i(android.view.MotionEvent):boolean");
    }

    public final boolean j(View view, int i, int i2) {
        this.t = view;
        this.e = -1;
        boolean u = u(i, i2, 0, 0);
        if (u || this.d != 0 || this.t == null) {
            return u;
        }
        this.t = null;
        return false;
    }

    final boolean k(View view, int i) {
        if (view == this.t && this.e == i) {
            return true;
        }
        if (view == null || !this.s.e(view, i)) {
            return false;
        }
        this.e = i;
        d(view, i);
        return true;
    }

    public final boolean l() {
        if (this.d == 2) {
            OverScroller overScroller = this.r;
            boolean computeScrollOffset = overScroller.computeScrollOffset();
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int left = currX - this.t.getLeft();
            int top = currY - this.t.getTop();
            if (left != 0) {
                View view = this.t;
                int[] iArr = kvo.a;
                view.offsetLeftAndRight(left);
            }
            if (top != 0) {
                View view2 = this.t;
                int[] iArr2 = kvo.a;
                view2.offsetTopAndBottom(top);
            }
            if (left != 0 || top != 0) {
                this.s.i(this.t, currX, currY);
            }
            if (computeScrollOffset) {
                if (currX == this.r.getFinalX() && currY == this.r.getFinalY()) {
                    this.r.abortAnimation();
                }
            }
            this.v.post(this.w);
        }
        return this.d == 2;
    }
}
