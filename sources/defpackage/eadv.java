package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.PopupWindow;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eadv extends ViewGroup {
    public final Paint a;
    public PopupWindow b;
    public final boolean c;
    public View d;
    public int e;
    public View f;
    public int g;
    private final int[] h;
    private final Path i;
    private final RectF j;
    private final int k;
    private final int l;
    private final int m;
    private final int n;
    private final int o;
    private final int p;
    private final int q;
    private final int r;
    private Rect s;
    private int t;

    public eadv(Context context) {
        super(context);
        this.t = 0;
        this.h = new int[2];
        this.i = new Path();
        this.j = new RectF();
        Paint paint = new Paint();
        this.a = paint;
        this.k = context.getResources().getDimensionPixelSize(R.dimen.lt_tooltip_container_padding_horizontal);
        this.l = context.getResources().getDimensionPixelSize(R.dimen.lt_tooltip_container_padding_vertical);
        this.m = context.getResources().getDimensionPixelSize(R.dimen.lt_tooltip_margin);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.lt_tooltip_shadow_offset);
        this.n = dimensionPixelSize;
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.lt_tooltip_shadow_radius);
        this.r = dimensionPixelSize2;
        this.o = context.getResources().getDimensionPixelSize(R.dimen.lt_tooltip_arrow_length);
        this.p = context.getResources().getDimensionPixelSize(R.dimen.lt_tooltip_arrow_base_width);
        this.q = context.getResources().getDimensionPixelSize(R.dimen.lt_tooltip_container_corner_radius);
        int b = ehdr.b(this, R.attr.colorPrimaryContainer);
        int a = ehga.a(R.dimen.m3_sys_elevation_level5, context);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(b);
        paint.setAntiAlias(true);
        paint.setShadowLayer(dimensionPixelSize2, 0.0f, dimensionPixelSize, a);
        this.c = true;
    }

    private final Point f() {
        return g(false);
    }

    private final Point g(boolean z) {
        WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
        Point point = new Point();
        if (windowManager == null) {
            return point;
        }
        Display defaultDisplay = windowManager.getDefaultDisplay();
        if (z) {
            defaultDisplay.getRealSize(point);
            return point;
        }
        defaultDisplay.getSize(point);
        return point;
    }

    private final void h(int i, int i2) {
        int i3 = this.k;
        int size = View.MeasureSpec.getSize(i) - (i3 + i3);
        int i4 = this.l;
        int size2 = View.MeasureSpec.getSize(i2) - (i4 + i4);
        int i5 = size - this.n;
        int min = Math.min(f().x, i5);
        View view = this.d;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(min, Integer.MIN_VALUE);
        int i6 = (size2 - this.n) - this.o;
        view.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(i6, 0));
        if (this.d.getMeasuredHeight() > i6) {
            this.d.measure(View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i6, Integer.MIN_VALUE));
        }
        int measuredWidth = this.d.getMeasuredWidth();
        int i7 = this.k;
        int i8 = measuredWidth + i7 + i7;
        int measuredHeight = this.d.getMeasuredHeight();
        int i9 = this.l;
        this.j.set(0.0f, 0.0f, i8, measuredHeight + i9 + i9);
        setMeasuredDimension(((int) this.j.width()) + this.n, ((int) this.j.height()) + this.n + this.o);
    }

    public final int a() {
        int width;
        int measuredWidth = getMeasuredWidth();
        int[] iArr = kvo.a;
        int layoutDirection = getLayoutDirection();
        int i = this.g;
        if (i == 1) {
            width = layoutDirection == 1 ? (this.s.left + this.s.width()) - measuredWidth : this.s.left;
        } else {
            if (i != 2) {
                throw new IllegalStateException();
            }
            width = this.s.left - ((measuredWidth - this.s.width()) / 2);
        }
        int i2 = this.m;
        WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
        return Math.min((g(windowManager != null && windowManager.getDefaultDisplay().getRotation() == 3).x - this.m) - measuredWidth, Math.max(i2, width));
    }

    public final int b() {
        return this.s.top + (this.e == 1 ? -getMeasuredHeight() : 0);
    }

    public final void c() {
        PopupWindow popupWindow = this.b;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
    }

    public final void d() {
        View view = this.f;
        int[] iArr = this.h;
        view.getLocationInWindow(iArr);
        int measuredWidth = view.getWidth() == 0 ? view.getMeasuredWidth() : view.getWidth();
        int measuredHeight = view.getHeight() == 0 ? view.getMeasuredHeight() : view.getHeight();
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = this.t;
        this.s = new Rect(i, i2 + i3, measuredWidth + i, i2 + measuredHeight + i3);
    }

    public final void e() {
        Point f = f();
        int i = f.x;
        int i2 = f.y;
        int i3 = this.m;
        h(View.MeasureSpec.makeMeasureSpec(i - (i3 + i3), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE));
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        canvas.save();
        Paint paint = this.a;
        float f = this.q;
        canvas.drawRoundRect(this.j, f, f, paint);
        if (this.e == 1) {
            getLocationOnScreen(this.h);
            canvas.save();
            canvas.translate(this.m - this.h[0], 0.0f);
            canvas.drawPath(this.i, this.a);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        View view = this.d;
        int i6 = this.e == 1 ? this.o : 0;
        int i7 = this.l;
        int i8 = i4 - i2;
        int i9 = this.k;
        view.layout(i9, i7, (i3 - i) - i9, (i8 - i7) - i6);
        this.b.update(a(), b(), getMeasuredWidth(), getMeasuredHeight(), true);
        int i10 = this.g;
        if (i10 == 1) {
            int width = this.s.width() - (this.p / 2);
            int i11 = this.m;
            i5 = width - (i11 + i11);
        } else {
            if (i10 != 2) {
                throw new IllegalStateException("Tooltip has invalid alignment.");
            }
            i5 = this.s.width() / 2;
        }
        int[] iArr = kvo.a;
        if (getLayoutDirection() == 1) {
            i5 = this.s.width() - i5;
        }
        this.f.getLocationOnScreen(this.h);
        int i12 = i5 + this.h[0];
        this.i.reset();
        if (this.e == 1) {
            this.i.moveTo((i12 - this.m) - (this.p / 2), this.j.bottom);
            this.i.rLineTo(this.p, 0.0f);
            this.i.rLineTo((-this.p) / 2.0f, this.o);
            this.i.rLineTo((-this.p) / 2.0f, -this.o);
            this.i.close();
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        h(i, i2);
        if (this.f != null) {
            d();
            e();
        }
    }

    @Override // android.view.View
    public final void setTranslationY(float f) {
        this.t = (int) f;
        d();
    }
}
