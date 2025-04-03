package androidx.media3.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.media3.ui.DefaultTimeBar;
import defpackage.lti;
import defpackage.lvf;
import defpackage.nwc;
import defpackage.nwi;
import defpackage.nwj;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: PG */
/* loaded from: classes.dex */
public class DefaultTimeBar extends View implements nwj {
    private final CopyOnWriteArraySet A;
    private final Point B;
    private final float C;
    private int D;
    private long E;
    private int F;
    private Rect G;
    private boolean H;
    private long I;
    private long J;
    private long K;
    private long L;
    private int M;
    private long[] N;
    private boolean[] O;
    public final Rect a;
    public ValueAnimator b;
    public float c;
    public boolean d;
    private final Rect e;
    private final Rect f;
    private final Rect g;
    private final Paint h;
    private final Paint i;
    private final Paint j;
    private final Paint k;
    private final Paint l;
    private final Paint m;
    private final Drawable n;
    private final int o;
    private final int p;
    private final int q;
    private final int r;
    private final int s;
    private final int t;
    private final int u;
    private final int v;
    private final int w;
    private final StringBuilder x;
    private final Formatter y;
    private final Runnable z;

    public DefaultTimeBar(Context context) {
        this(context, null);
    }

    private static int i(float f, int i) {
        return (int) ((i * f) + 0.5f);
    }

    private final long j() {
        long j = this.E;
        if (j != -9223372036854775807L) {
            return j;
        }
        long j2 = this.J;
        if (j2 == -9223372036854775807L) {
            return 0L;
        }
        return j2 / this.D;
    }

    private final long k() {
        if (this.e.width() <= 0 || this.J == -9223372036854775807L) {
            return 0L;
        }
        return (this.g.width() * this.J) / this.e.width();
    }

    private final String l() {
        return lvf.J(this.x, this.y, this.K);
    }

    private final void m(float f) {
        Rect rect = this.e;
        this.g.right = lvf.d((int) f, rect.left, rect.right);
    }

    private final void n(long j) {
        this.I = j;
        this.H = true;
        setPressed(true);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        Iterator it = this.A.iterator();
        while (it.hasNext()) {
            ((nwi) it.next()).F(j);
        }
    }

    private final void o() {
        this.f.set(this.e);
        this.g.set(this.e);
        long j = this.H ? this.I : this.K;
        if (this.J > 0) {
            this.f.right = Math.min(this.e.left + ((int) ((this.e.width() * this.L) / this.J)), this.e.right);
            this.g.right = Math.min(this.e.left + ((int) ((this.e.width() * j) / this.J)), this.e.right);
        } else {
            this.f.right = this.e.left;
            this.g.right = this.e.left;
        }
        invalidate(this.a);
    }

    private final void p() {
        Drawable drawable = this.n;
        if (drawable != null && drawable.isStateful() && this.n.setState(getDrawableState())) {
            invalidate();
        }
    }

    private final void q(long j) {
        if (this.I == j) {
            return;
        }
        this.I = j;
        Iterator it = this.A.iterator();
        while (it.hasNext()) {
            ((nwi) it.next()).E(j);
        }
    }

    private final boolean r(long j) {
        long j2 = this.J;
        if (j2 <= 0) {
            return false;
        }
        long j3 = this.H ? this.I : this.K;
        long q = lvf.q(j3 + j, 0L, j2);
        if (q == j3) {
            return false;
        }
        if (this.H) {
            q(q);
        } else {
            n(q);
        }
        o();
        return true;
    }

    private static boolean s(Drawable drawable, int i) {
        int i2 = lvf.a;
        return drawable.setLayoutDirection(i);
    }

    @Override // defpackage.nwj
    public final long a() {
        int width = (int) (this.e.width() / this.C);
        if (width == 0) {
            return Long.MAX_VALUE;
        }
        long j = this.J;
        if (j == 0 || j == -9223372036854775807L) {
            return Long.MAX_VALUE;
        }
        return j / width;
    }

    @Override // defpackage.nwj
    public final void b(nwi nwiVar) {
        lti.f(nwiVar);
        this.A.add(nwiVar);
    }

    public final void c(boolean z) {
        if (this.b.isStarted()) {
            this.b.cancel();
        }
        this.d = z;
        this.c = 0.0f;
        invalidate(this.a);
    }

    @Override // defpackage.nwj
    public final void d(long[] jArr, boolean[] zArr, int i) {
        boolean z = true;
        if (i != 0 && (jArr == null || zArr == null)) {
            z = false;
        }
        lti.a(z);
        this.M = i;
        this.N = jArr;
        this.O = zArr;
        o();
    }

    @Override // android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        p();
    }

    @Override // defpackage.nwj
    public final void e(long j) {
        if (this.L == j) {
            return;
        }
        this.L = j;
        o();
    }

    @Override // defpackage.nwj
    public final void f(long j) {
        if (this.J == j) {
            return;
        }
        this.J = j;
        if (this.H && j == -9223372036854775807L) {
            h(true);
        }
        o();
    }

    @Override // defpackage.nwj
    public final void g(long j) {
        if (this.K == j) {
            return;
        }
        this.K = j;
        setContentDescription(l());
        o();
    }

    public final void h(boolean z) {
        removeCallbacks(this.z);
        this.H = false;
        setPressed(false);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        invalidate();
        Iterator it = this.A.iterator();
        while (it.hasNext()) {
            ((nwi) it.next()).G(this.I, z);
        }
    }

    @Override // android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.n;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        canvas.save();
        int height = this.e.height();
        int centerY = this.e.centerY() - (height / 2);
        int i = centerY + height;
        long j = 0;
        if (this.J <= 0) {
            canvas2 = canvas;
            canvas2.drawRect(this.e.left, centerY, this.e.right, i, this.j);
        } else {
            Rect rect = this.f;
            Rect rect2 = this.e;
            int i2 = rect.left;
            int i3 = rect.right;
            int max = Math.max(Math.max(rect2.left, i3), this.g.right);
            if (max < this.e.right) {
                canvas.drawRect(max, centerY, this.e.right, i, this.j);
            }
            int max2 = Math.max(i2, this.g.right);
            if (i3 > max2) {
                canvas.drawRect(max2, centerY, i3, i, this.i);
            }
            if (this.g.width() > 0) {
                canvas.drawRect(this.g.left, centerY, this.g.right, i, this.h);
            }
            if (this.M != 0) {
                long[] jArr = this.N;
                lti.f(jArr);
                boolean[] zArr = this.O;
                lti.f(zArr);
                int i4 = this.r / 2;
                int i5 = 0;
                while (i5 < this.M) {
                    float f = i;
                    float f2 = centerY;
                    long j2 = j;
                    int width = ((int) ((this.e.width() * lvf.q(jArr[i5], 0L, this.J)) / this.J)) - i4;
                    Rect rect3 = this.e;
                    canvas.drawRect(rect3.left + Math.min(rect3.width() - this.r, Math.max(0, width)), f2, r6 + this.r, f, zArr[i5] ? this.l : this.k);
                    i5++;
                    j = j2;
                }
            }
            canvas2 = canvas;
        }
        if (this.J > j) {
            Rect rect4 = this.g;
            int d = lvf.d(rect4.right, rect4.left, this.e.right);
            Rect rect5 = this.g;
            Drawable drawable = this.n;
            int centerY2 = rect5.centerY();
            if (drawable == null) {
                canvas2.drawCircle(d, centerY2, (int) ((((this.H || isFocused()) ? this.u : isEnabled() ? this.s : this.t) * this.c) / 2.0f), this.m);
            } else {
                int intrinsicWidth = ((int) (this.n.getIntrinsicWidth() * this.c)) / 2;
                int intrinsicHeight = ((int) (this.n.getIntrinsicHeight() * this.c)) / 2;
                this.n.setBounds(d - intrinsicWidth, centerY2 - intrinsicHeight, d + intrinsicWidth, centerY2 + intrinsicHeight);
                this.n.draw(canvas2);
            }
        }
        canvas2.restore();
    }

    @Override // android.view.View
    protected final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (!this.H || z) {
            return;
        }
        h(false);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 4) {
            accessibilityEvent.getText().add(l());
        }
        accessibilityEvent.setClassName("android.widget.SeekBar");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.SeekBar");
        accessibilityNodeInfo.setContentDescription(l());
        if (this.J <= 0) {
            return;
        }
        accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
        accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001a  */
    @Override // android.view.View, android.view.KeyEvent.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onKeyDown(int r5, android.view.KeyEvent r6) {
        /*
            r4 = this;
            boolean r0 = r4.isEnabled()
            if (r0 == 0) goto L30
            long r0 = r4.j()
            r2 = 66
            r3 = 1
            if (r5 == r2) goto L27
            switch(r5) {
                case 21: goto L13;
                case 22: goto L14;
                case 23: goto L27;
                default: goto L12;
            }
        L12:
            goto L30
        L13:
            long r0 = -r0
        L14:
            boolean r0 = r4.r(r0)
            if (r0 == 0) goto L30
            java.lang.Runnable r5 = r4.z
            r4.removeCallbacks(r5)
            java.lang.Runnable r5 = r4.z
            r0 = 1000(0x3e8, double:4.94E-321)
            r4.postDelayed(r5, r0)
            return r3
        L27:
            boolean r0 = r4.H
            if (r0 == 0) goto L30
            r5 = 0
            r4.h(r5)
            return r3
        L30:
            boolean r5 = super.onKeyDown(r5, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.ui.DefaultTimeBar.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    @Override // android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        Rect rect;
        int paddingLeft = getPaddingLeft();
        int i7 = i3 - i;
        int paddingRight = i7 - getPaddingRight();
        int i8 = this.d ? 0 : this.v;
        int i9 = i4 - i2;
        if (this.q == 1) {
            int paddingBottom = i9 - getPaddingBottom();
            int i10 = this.p;
            int paddingBottom2 = i9 - getPaddingBottom();
            int i11 = this.o;
            i6 = (paddingBottom2 - i11) - Math.max(i8 - (i11 / 2), 0);
            i5 = paddingBottom - i10;
        } else {
            i5 = (i9 - this.p) / 2;
            i6 = (i9 - this.o) / 2;
        }
        this.a.set(paddingLeft, i5, paddingRight, this.p + i5);
        this.e.set(this.a.left + i8, i6, this.a.right - i8, this.o + i6);
        if (lvf.a >= 29 && ((rect = this.G) == null || rect.width() != i7 || this.G.height() != i9)) {
            Rect rect2 = new Rect(0, 0, i7, i9);
            this.G = rect2;
            setSystemGestureExclusionRects(Collections.singletonList(rect2));
        }
        o();
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == 0) {
            size = this.p;
        } else if (mode != 1073741824) {
            size = Math.min(this.p, size);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), size);
        p();
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        Drawable drawable = this.n;
        if (drawable == null || !s(drawable, i)) {
            return;
        }
        invalidate();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0033, code lost:
    
        if (r3 != 3) goto L34;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            boolean r0 = r7.isEnabled()
            r1 = 0
            if (r0 == 0) goto L88
            long r2 = r7.J
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 > 0) goto L11
            goto L88
        L11:
            android.graphics.Point r0 = r7.B
            float r2 = r8.getX()
            int r2 = (int) r2
            float r3 = r8.getY()
            int r3 = (int) r3
            r0.set(r2, r3)
            android.graphics.Point r0 = r7.B
            int r2 = r0.x
            int r0 = r0.y
            int r3 = r8.getAction()
            r4 = 1
            if (r3 == 0) goto L6b
            r5 = 3
            if (r3 == r4) goto L5c
            r6 = 2
            if (r3 == r6) goto L36
            if (r3 == r5) goto L5c
            goto L88
        L36:
            boolean r8 = r7.H
            if (r8 == 0) goto L88
            int r8 = r7.w
            if (r0 >= r8) goto L48
            int r8 = r7.F
            int r2 = r2 - r8
            int r2 = r2 / r5
            int r8 = r8 + r2
            float r8 = (float) r8
            r7.m(r8)
            goto L4e
        L48:
            float r8 = (float) r2
            r7.F = r2
            r7.m(r8)
        L4e:
            long r0 = r7.k()
            r7.q(r0)
            r7.o()
            r7.invalidate()
            return r4
        L5c:
            boolean r0 = r7.H
            if (r0 == 0) goto L88
            int r8 = r8.getAction()
            if (r8 != r5) goto L67
            r1 = r4
        L67:
            r7.h(r1)
            return r4
        L6b:
            float r8 = (float) r2
            float r0 = (float) r0
            android.graphics.Rect r2 = r7.a
            int r3 = (int) r8
            int r0 = (int) r0
            boolean r0 = r2.contains(r3, r0)
            if (r0 == 0) goto L88
            r7.m(r8)
            long r0 = r7.k()
            r7.n(r0)
            r7.o()
            r7.invalidate()
            return r4
        L88:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.ui.DefaultTimeBar.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        if (super.performAccessibilityAction(i, bundle)) {
            return true;
        }
        if (this.J <= 0) {
            return false;
        }
        if (i == 8192) {
            if (r(-j())) {
                h(false);
            }
        } else {
            if (i != 4096) {
                return false;
            }
            if (r(j())) {
                h(false);
            }
        }
        sendAccessibilityEvent(4);
        return true;
    }

    @Override // android.view.View, defpackage.nwj
    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        if (!this.H || z) {
            return;
        }
        h(true);
    }

    public DefaultTimeBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DefaultTimeBar(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, attributeSet);
    }

    public DefaultTimeBar(Context context, AttributeSet attributeSet, int i, AttributeSet attributeSet2) {
        this(context, attributeSet, i, attributeSet2, 0);
    }

    public DefaultTimeBar(Context context, AttributeSet attributeSet, int i, AttributeSet attributeSet2, int i2) {
        super(context, attributeSet, i);
        this.a = new Rect();
        this.e = new Rect();
        this.f = new Rect();
        this.g = new Rect();
        Paint paint = new Paint();
        this.h = paint;
        Paint paint2 = new Paint();
        this.i = paint2;
        Paint paint3 = new Paint();
        this.j = paint3;
        Paint paint4 = new Paint();
        this.k = paint4;
        Paint paint5 = new Paint();
        this.l = paint5;
        Paint paint6 = new Paint();
        this.m = paint6;
        paint6.setAntiAlias(true);
        this.A = new CopyOnWriteArraySet();
        this.B = new Point();
        float f = context.getResources().getDisplayMetrics().density;
        this.C = f;
        this.w = i(f, -50);
        int i3 = i(f, 4);
        int i4 = i(f, 26);
        int i5 = i(f, 4);
        int i6 = i(f, 12);
        int i7 = i(f, 0);
        int i8 = i(f, 16);
        if (attributeSet2 != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, nwc.b, i, i2);
            try {
                Drawable drawable = obtainStyledAttributes.getDrawable(10);
                this.n = drawable;
                if (drawable != null) {
                    int i9 = lvf.a;
                    s(drawable, getLayoutDirection());
                    i4 = Math.max(drawable.getMinimumHeight(), i4);
                }
                this.o = obtainStyledAttributes.getDimensionPixelSize(3, i3);
                this.p = obtainStyledAttributes.getDimensionPixelSize(12, i4);
                this.q = obtainStyledAttributes.getInt(2, 0);
                this.r = obtainStyledAttributes.getDimensionPixelSize(1, i5);
                this.s = obtainStyledAttributes.getDimensionPixelSize(11, i6);
                this.t = obtainStyledAttributes.getDimensionPixelSize(8, i7);
                this.u = obtainStyledAttributes.getDimensionPixelSize(9, i8);
                int i10 = obtainStyledAttributes.getInt(6, -1);
                int i11 = obtainStyledAttributes.getInt(7, -1);
                int i12 = obtainStyledAttributes.getInt(4, -855638017);
                int i13 = obtainStyledAttributes.getInt(13, 872415231);
                int i14 = obtainStyledAttributes.getInt(0, -1291845888);
                int i15 = obtainStyledAttributes.getInt(5, 872414976);
                paint.setColor(i10);
                paint6.setColor(i11);
                paint2.setColor(i12);
                paint3.setColor(i13);
                paint4.setColor(i14);
                paint5.setColor(i15);
            } finally {
                obtainStyledAttributes.recycle();
            }
        } else {
            this.o = i3;
            this.p = i4;
            this.q = 0;
            this.r = i5;
            this.s = i6;
            this.t = i7;
            this.u = i8;
            paint.setColor(-1);
            paint6.setColor(-1);
            paint2.setColor(-855638017);
            paint3.setColor(872415231);
            paint4.setColor(-1291845888);
            paint5.setColor(872414976);
            this.n = null;
        }
        StringBuilder sb = new StringBuilder();
        this.x = sb;
        this.y = new Formatter(sb, Locale.getDefault());
        this.z = new Runnable() { // from class: ntz
            @Override // java.lang.Runnable
            public final void run() {
                DefaultTimeBar.this.h(false);
            }
        };
        Drawable drawable2 = this.n;
        if (drawable2 != null) {
            this.v = (drawable2.getMinimumWidth() + 1) / 2;
        } else {
            this.v = (Math.max(this.t, Math.max(this.s, this.u)) + 1) / 2;
        }
        this.c = 1.0f;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.b = valueAnimator;
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: nua
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                DefaultTimeBar defaultTimeBar = DefaultTimeBar.this;
                defaultTimeBar.c = floatValue;
                defaultTimeBar.invalidate(defaultTimeBar.a);
            }
        });
        this.J = -9223372036854775807L;
        this.E = -9223372036854775807L;
        this.D = 20;
        setFocusable(true);
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }
}
