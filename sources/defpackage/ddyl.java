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
/* loaded from: classes3.dex */
public final class ddyl extends ViewGroup {
    public final Paint a;
    public PopupWindow b;
    public boolean c;
    public boolean d;
    public View e;
    public int f;
    public View g;
    public int h;
    public int i;
    private final int[] j;
    private final Path k;
    private final RectF l;
    private final int m;
    private final int n;
    private final int o;
    private final int p;
    private final int q;
    private final int r;
    private final int s;
    private final int t;
    private Rect u;
    private int v;

    public ddyl(Context context) {
        super(context);
        this.v = 0;
        this.i = 0;
        this.j = new int[2];
        this.k = new Path();
        this.l = new RectF();
        Paint paint = new Paint();
        this.a = paint;
        this.m = context.getResources().getDimensionPixelSize(R.dimen.tooltip_container_padding_horizontal);
        this.n = context.getResources().getDimensionPixelSize(R.dimen.tooltip_container_padding_vertical);
        this.o = context.getResources().getDimensionPixelSize(R.dimen.tooltip_margin);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.tooltip_shadow_offset);
        this.p = dimensionPixelSize;
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.tooltip_shadow_radius);
        this.t = dimensionPixelSize2;
        this.q = context.getResources().getDimensionPixelSize(R.dimen.tooltip_arrow_length);
        this.r = context.getResources().getDimensionPixelSize(R.dimen.tooltip_arrow_base_width);
        this.s = context.getResources().getDimensionPixelSize(R.dimen.tooltip_container_corner_radius);
        int color = context.getColor(R.color.tooltip_background_color);
        int color2 = context.getColor(R.color.tooltip_shadow_color);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(color);
        paint.setAntiAlias(true);
        paint.setShadowLayer(dimensionPixelSize2, 0.0f, dimensionPixelSize, color2);
        this.c = true;
        this.d = false;
    }

    private final Point g() {
        return h(false);
    }

    private final Point h(boolean z) {
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

    private final void i(Canvas canvas) {
        getLocationOnScreen(this.j);
        canvas.save();
        canvas.translate(this.o - this.j[0], 0.0f);
        canvas.drawPath(this.k, this.a);
        canvas.restore();
    }

    private final void j(int i, int i2) {
        int i3 = this.m;
        int size = View.MeasureSpec.getSize(i) - (i3 + i3);
        int i4 = this.n;
        int size2 = View.MeasureSpec.getSize(i2) - (i4 + i4);
        int i5 = size - this.p;
        int min = Math.min(g().x, i5);
        View view = this.e;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(min, Integer.MIN_VALUE);
        int i6 = (size2 - this.p) - this.q;
        view.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(i6, 0));
        if (this.e.getMeasuredHeight() > i6) {
            this.e.measure(View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i6, Integer.MIN_VALUE));
        }
        int measuredWidth = this.e.getMeasuredWidth();
        int i7 = this.m;
        int i8 = measuredWidth + i7 + i7;
        int measuredHeight = this.e.getMeasuredHeight();
        int i9 = this.n;
        this.l.set(0.0f, 0.0f, i8, measuredHeight + i9 + i9);
        setMeasuredDimension(((int) this.l.width()) + this.p, ((int) this.l.height()) + this.p + this.q);
    }

    public final int a() {
        int i;
        int i2;
        int width;
        int measuredWidth = getMeasuredWidth();
        int[] iArr = kvo.a;
        int layoutDirection = getLayoutDirection();
        int i3 = this.h;
        if (i3 != 1) {
            if (i3 == 2) {
                i = this.u.left - ((measuredWidth - this.u.width()) / 2);
            } else {
                if (i3 != 3) {
                    throw new IllegalStateException();
                }
                if (layoutDirection == 1) {
                    i = this.u.left;
                } else {
                    i2 = this.u.left;
                    width = this.u.width();
                    i = (i2 + width) - measuredWidth;
                }
            }
        } else if (layoutDirection == 1) {
            i2 = this.u.left;
            width = this.u.width();
            i = (i2 + width) - measuredWidth;
        } else {
            i = this.u.left;
        }
        int i4 = this.o;
        WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
        return Math.min((h(windowManager != null && windowManager.getDefaultDisplay().getRotation() == 3).x - this.o) - measuredWidth, Math.max(i4, i));
    }

    public final int b() {
        int i = this.f;
        return this.u.top + (i == 1 ? -getMeasuredHeight() : i == 2 ? this.u.height() : 0);
    }

    public final void c() {
        PopupWindow popupWindow = this.b;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
    }

    public final void d() {
        View view = this.g;
        int[] iArr = this.j;
        view.getLocationInWindow(iArr);
        int measuredWidth = view.getWidth() == 0 ? view.getMeasuredWidth() : view.getWidth();
        int measuredHeight = view.getHeight() == 0 ? view.getMeasuredHeight() : view.getHeight();
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = this.v;
        this.u = new Rect(i, i2 + i3, measuredWidth + i, i2 + measuredHeight + i3);
    }

    public final void e() {
        this.b.update(a(), b(), getMeasuredWidth(), getMeasuredHeight(), true);
    }

    public final void f() {
        Point g = g();
        int i = g.x;
        int i2 = g.y;
        int i3 = this.i;
        if (i3 == 0) {
            int i4 = this.o;
            i3 = i - (i4 + i4);
        }
        if (this.f == 2) {
            i2 = ((i2 - this.u.top) - this.u.height()) - this.o;
        }
        j(View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE));
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        canvas.save();
        if (this.f == 2) {
            canvas.translate(0.0f, this.q);
            i(canvas);
        }
        RectF rectF = this.l;
        float f = this.s;
        canvas.drawRoundRect(rectF, f, f, this.a);
        if (this.f == 1) {
            i(canvas);
        }
        canvas.restore();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        View view = this.e;
        int i6 = this.f;
        int i7 = i6 == 2 ? this.q : 0;
        int i8 = this.n;
        int i9 = i3 - i;
        int i10 = this.m;
        view.layout(i10, i8 + i7, i9 - i10, ((i4 - i2) - i8) - (i6 == 1 ? this.q : 0));
        e();
        int i11 = this.h;
        if (i11 == 1) {
            int i12 = this.r / 2;
            int i13 = this.o;
            i5 = i12 + i13 + i13;
        } else if (i11 == 2) {
            i5 = this.u.width() / 2;
        } else {
            if (i11 != 3) {
                throw new IllegalStateException("Tooltip has invalid alignment.");
            }
            int width = this.u.width() - (this.r / 2);
            int i14 = this.o;
            i5 = width - (i14 + i14);
        }
        int[] iArr = kvo.a;
        if (getLayoutDirection() == 1) {
            i5 = this.u.width() - i5;
        }
        this.g.getLocationOnScreen(this.j);
        int i15 = i5 + this.j[0];
        this.k.reset();
        int i16 = this.f;
        if (i16 == 1) {
            this.k.moveTo((i15 - this.o) - (this.r / 2), this.l.bottom);
            this.k.rLineTo(this.r, 0.0f);
            this.k.rLineTo((-this.r) / 2, this.q);
            this.k.rLineTo((-this.r) / 2, -this.q);
            this.k.close();
            return;
        }
        if (i16 == 2) {
            this.k.moveTo((i15 - this.o) + (this.r / 2), this.l.top);
            this.k.rLineTo(-this.r, 0.0f);
            this.k.rLineTo(this.r / 2, -this.q);
            this.k.rLineTo(this.r / 2, this.q);
            this.k.close();
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        j(i, i2);
        if (this.g != null) {
            d();
            f();
        }
    }

    @Override // android.view.View
    public final void setTranslationY(float f) {
        this.v = (int) f;
        d();
    }
}
