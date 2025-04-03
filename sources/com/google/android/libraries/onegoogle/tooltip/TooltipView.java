package com.google.android.libraries.onegoogle.tooltip;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
import com.google.android.libraries.onegoogle.accountmenu.SelectedAccountDisc;
import defpackage.ebkg;
import defpackage.ebnr;
import defpackage.ebow;
import defpackage.ecay;
import defpackage.ecba;
import defpackage.ecbo;
import defpackage.ecbw;
import defpackage.kvo;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class TooltipView extends ViewGroup {
    private final int A;
    private final int B;
    private final int C;
    private float D;
    private float E;
    private float F;
    private final int G;
    private final int H;
    private final int I;
    private int J;
    public final ecba a;
    public final ViewGroup b;
    public final ecbw c;
    public final View d;
    public int e;
    public int f;
    public int g;
    public int h;
    public final ecbo i;
    public final ebkg j;
    private final RectF k;
    private final Path l;
    private final RectF m;
    private final Rect n;
    private final Paint o;
    private final Point p;
    private final int[] q;
    private final int r;
    private final int s;
    private final int t;
    private final int u;
    private final int v;
    private final int w;
    private final int x;
    private final int y;
    private final int z;

    /* compiled from: PG */
    public static class ScaleAnimatable implements ecay {
        private final View a;

        public ScaleAnimatable(View view) {
            this.a = view;
        }

        public void setScale(float f) {
            this.a.setScaleX(f);
            this.a.setScaleY(f);
        }
    }

    public TooltipView(View view, ecba ecbaVar, ebkg ebkgVar) {
        super(view.getContext());
        this.k = new RectF();
        this.l = new Path();
        this.m = new RectF();
        this.n = new Rect();
        Paint paint = new Paint();
        this.o = paint;
        this.p = new Point();
        this.q = new int[2];
        this.J = 5;
        this.e = 0;
        this.f = 0;
        this.D = 1.0f;
        this.a = ecbaVar;
        this.I = 2;
        this.j = ebkgVar;
        Context context = getContext();
        setId(R.id.content);
        setWillNotDraw(false);
        Resources resources = getResources();
        this.r = resources.getDimensionPixelSize(com.google.android.apps.messaging.R.dimen.og_tooltip_padding);
        this.s = resources.getDimensionPixelSize(com.google.android.apps.messaging.R.dimen.og_tooltip_margin);
        this.t = resources.getDimensionPixelSize(com.google.android.apps.messaging.R.dimen.og_tooltip_anchor_margin);
        this.u = resources.getDimensionPixelSize(com.google.android.apps.messaging.R.dimen.og_tooltip_arrow_height);
        this.v = resources.getDimensionPixelSize(com.google.android.apps.messaging.R.dimen.og_tooltip_arrow_width);
        this.w = Math.round(ebnr.a(getContext(), com.google.android.apps.messaging.R.attr.ogDialogCornerRadius));
        this.x = resources.getDimensionPixelSize(com.google.android.apps.messaging.R.dimen.og_tooltip_min_animation_width);
        int dimensionPixelSize = resources.getDimensionPixelSize(com.google.android.apps.messaging.R.dimen.og_tooltip_shadow_radius);
        this.y = dimensionPixelSize;
        int dimensionPixelSize2 = resources.getDimensionPixelSize(com.google.android.apps.messaging.R.dimen.og_tooltip_shadow_offset);
        this.z = dimensionPixelSize2;
        this.A = resources.getDimensionPixelSize(com.google.android.apps.messaging.R.dimen.og_tooltip_arrow_tip_radius);
        this.B = resources.getDimensionPixelSize(com.google.android.apps.messaging.R.dimen.og_tooltip_max_width);
        this.C = resources.getDimensionPixelSize(com.google.android.apps.messaging.R.dimen.og_tooltip_min_space_between_arrow_and_edge);
        this.G = dimensionPixelSize - dimensionPixelSize2;
        this.H = dimensionPixelSize + dimensionPixelSize2;
        paint.setStyle(Paint.Style.FILL);
        float f = dimensionPixelSize;
        float f2 = dimensionPixelSize2;
        paint.setShadowLayer(f, f2, f2, context.getColor(com.google.android.apps.messaging.R.color.og_tooltip_shadow));
        c(context.getColor(com.google.android.apps.messaging.R.color.google_blue600));
        if (Build.VERSION.SDK_INT < 28) {
            setLayerType(1, paint);
        }
        final ecbw ecbwVar = new ecbw(this, this);
        this.c = ecbwVar;
        if (ebow.a(context)) {
            ecbwVar.setFocusable(true);
        }
        this.d = view;
        if (view.getParent() instanceof ViewGroup) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        addView(view);
        ecbo ecboVar = new ecbo(getContext(), ecbaVar, new Runnable() { // from class: ecbq
            @Override // java.lang.Runnable
            public final void run() {
                ecbw.this.dismiss();
            }
        });
        this.i = ecboVar;
        ecboVar.setId(com.google.android.apps.messaging.R.id.og_tooltip_scrim_view);
        View rootView = ((SelectedAccountDisc) ecbaVar).c.getRootView();
        if (!(rootView instanceof ViewGroup)) {
            throw new IllegalStateException("Should not happen. Root view is not a ViewGroup");
        }
        this.b = (ViewGroup) rootView;
    }

    private final RectF e(float f) {
        float f2;
        float f3;
        float f4;
        float f5;
        int i = this.g - this.e;
        int i2 = this.h;
        int i3 = i2 - this.f;
        float f6 = this.x;
        float f7 = this.E - f6;
        int i4 = this.J;
        float f8 = (f * f7) + f6;
        float f9 = i3;
        float f10 = i;
        if (i(i4)) {
            float measuredWidth = (getMeasuredWidth() - this.E) * (f10 / getMeasuredWidth());
            int i5 = this.x;
            float f11 = (int) ((f10 - measuredWidth) - (i5 / 2));
            float f12 = f11 / f7;
            float f13 = 0.5f - f12;
            int i6 = this.y;
            int i7 = this.z;
            float f14 = this.E;
            float f15 = measuredWidth + (f11 - (f12 * (f8 - i5))) + (((f13 + f13) * i6) - i7);
            f2 = f10 > f14 / 2.0f ? Math.max((f10 + (this.v / 2.0f)) + this.C, f15 + f14) - this.E : Math.min((f10 - (this.v / 2.0f)) - this.C, f15);
            if (this.J == 2) {
                f5 = f9 + this.u;
            } else {
                f3 = f9 - this.u;
                f4 = this.F;
                f5 = f3 - f4;
            }
        } else {
            f2 = i4 == 3 ? (f10 - this.u) - f8 : f10 + this.u;
            float f16 = (this.v * 0.5f) + this.C;
            if (h(i2)) {
                f5 = f9 - f16;
            } else {
                f3 = f9 + f16;
                f4 = this.F;
                f5 = f3 - f4;
            }
        }
        this.k.set(f2, f5, f8 + f2, this.F + f5);
        return this.k;
    }

    private final void f(Point point) {
        ((WindowManager) getContext().getSystemService("window")).getDefaultDisplay().getSize(point);
    }

    private final void g(Path path, float f) {
        path.reset();
        int i = this.g - this.e;
        int i2 = this.h - this.f;
        float f2 = this.v;
        float f3 = f2 / 2.0f;
        float hypot = (float) Math.hypot(this.u, f3);
        float degrees = (float) Math.toDegrees(Math.atan(this.u / f3));
        int i3 = this.J;
        float f4 = this.A * hypot;
        float f5 = i2;
        float f6 = i;
        float f7 = (f4 + f4) / f2;
        if (i3 == 1) {
            float f8 = -degrees;
            float f9 = f6 + f3;
            path.moveTo(f6 - f3, f5 - this.u);
            RectF rectF = this.m;
            float f10 = this.A;
            float f11 = f5 - f7;
            rectF.set(f6 - f10, f11 - f10, f6 + f10, f11 + f10);
            path.arcTo(this.m, degrees - 270.0f, f8 + f8);
            path.lineTo(f9, f5 - this.u);
        } else if (i3 == 2) {
            float f12 = f6 + f3;
            path.moveTo(f6 - f3, this.u + f5);
            RectF rectF2 = this.m;
            float f13 = this.A;
            float f14 = f7 + f5;
            rectF2.set(f6 - f13, f14 - f13, f6 + f13, f14 + f13);
            path.arcTo(this.m, (-90.0f) - degrees, degrees + degrees);
            path.lineTo(f12, f5 + this.u);
        } else {
            float f15 = -degrees;
            float f16 = f5 + f3;
            float f17 = f5 - f3;
            if (i3 == 3) {
                path.moveTo(f6 - this.u, f17);
                RectF rectF3 = this.m;
                float f18 = f6 - f7;
                float f19 = this.A;
                rectF3.set(f18 - f19, f5 - f19, f18 + f19, f5 + f19);
                path.arcTo(this.m, f15, degrees + degrees);
                path.lineTo(f6 - this.u, f16);
            } else {
                path.moveTo(this.u + f6, f17);
                RectF rectF4 = this.m;
                float f20 = f7 + f6;
                float f21 = this.A;
                rectF4.set(f20 - f21, f5 - f21, f20 + f21, f5 + f21);
                path.arcTo(this.m, degrees + 180.0f, f15 + f15);
                path.lineTo(f6 + this.u, f16);
            }
        }
        path.close();
        RectF e = e(f);
        float f22 = this.w;
        path.addRoundRect(e, f22, f22, Path.Direction.CW);
    }

    private final boolean h(float f) {
        return f < ((float) this.p.y) * 0.5f;
    }

    private static boolean i(int i) {
        return i == 1 || i == 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Animator a() {
        Animator loadAnimator = AnimatorInflater.loadAnimator(getContext(), com.google.android.apps.messaging.R.animator.og_tooltip_anchor_animator);
        AccountParticleDisc accountParticleDisc = ((SelectedAccountDisc) this.a).c;
        loadAnimator.setTarget(accountParticleDisc instanceof ecay ? (ecay) accountParticleDisc : new ScaleAnimatable(accountParticleDisc));
        return loadAnimator;
    }

    public final void b(Rect rect) {
        this.n.set(rect);
    }

    public final void c(int i) {
        this.o.setColor(i);
    }

    public final void d() {
        int i;
        int i2;
        f(this.p);
        int i3 = this.p.x;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int i4 = this.J;
        int i5 = 0;
        if (i4 == 1) {
            i = ((-measuredHeight) - this.t) + this.H;
        } else if (i4 == 2) {
            i = (this.n.height() + this.t) - this.G;
        } else if (i4 == 3) {
            i5 = this.H + ((-measuredWidth) - this.t);
            i = (this.n.height() - measuredHeight) / 2;
        } else if (i4 == 4) {
            i5 = (this.n.width() + this.t) - this.G;
            i = (this.n.height() - measuredHeight) / 2;
        } else {
            i = 0;
        }
        if (i(this.J)) {
            this.f = this.n.top + i;
            Rect rect = this.n;
            i2 = rect.left + ((rect.width() - measuredWidth) / 2);
        } else {
            i2 = this.n.left + i5;
            Rect rect2 = this.n;
            int i6 = this.v;
            int i7 = this.C;
            float exactCenterY = rect2.exactCenterY();
            float f = (i6 * 0.5f) + i7;
            if (h(exactCenterY)) {
                this.f = Math.round((exactCenterY - f) - this.G);
            } else {
                this.f = Math.round(((exactCenterY + f) + this.H) - measuredHeight);
            }
        }
        if (!i(this.J)) {
            this.e = i2;
            return;
        }
        int i8 = this.s;
        this.e = Math.min((i3 - i8) - measuredWidth, Math.max(i8, i2));
        Rect rect3 = this.n;
        int i9 = (rect3.left + rect3.right) / 2;
        if (i9 > i3 / 2) {
            this.e = Math.max(i9 + (((this.v / 2) + this.C) + this.H), this.e + measuredWidth) - measuredWidth;
            return;
        }
        this.e = Math.min(i9 - (((this.v / 2) + this.C) + this.G), this.e);
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        if (this.o.getAlpha() != 0) {
            canvas.drawPath(this.l, this.o);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        d();
        this.c.update(this.e, this.f, getMeasuredWidth(), getMeasuredHeight(), true);
        RectF e = e(1.0f);
        this.d.layout((int) e.left, (int) e.top, (int) e.right, (int) e.bottom);
        g(this.l, this.D);
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        if (this.J == 5) {
            int i7 = this.I;
            int[] iArr = kvo.a;
            getLayoutDirection();
            int i8 = i7 - 1;
            if (i7 == 0) {
                throw null;
            }
            if (i8 == 0) {
                i6 = 1;
            } else {
                if (i8 != 1) {
                    throw new IllegalArgumentException();
                }
                i6 = 2;
            }
            this.J = i6;
        }
        int[] iArr2 = this.q;
        f(this.p);
        Point point = this.p;
        int i9 = point.x;
        int i10 = point.y;
        int i11 = this.J;
        int i12 = i11 - 1;
        if (i11 == 0) {
            throw null;
        }
        if (i12 != 0) {
            if (i12 == 1) {
                int i13 = this.s;
                i3 = i9 - (i13 + i13);
                i10 = (i10 - this.n.top) - this.n.height();
                i5 = this.s;
            } else if (i12 == 2) {
                i3 = this.n.left - this.s;
                int i14 = this.s;
                i5 = i14 + i14;
            } else {
                if (i12 != 3) {
                    throw new IllegalStateException();
                }
                int width = (i9 - this.n.left) - this.n.width();
                int i15 = this.s;
                i4 = i10 - (i15 + i15);
                i3 = width - i15;
            }
            i4 = i10 - i5;
        } else {
            int i16 = this.s;
            i3 = i9 - (i16 + i16);
            i4 = this.n.top - i16;
        }
        iArr2[0] = i3;
        iArr2[1] = i4;
        int[] iArr3 = this.q;
        int i17 = iArr3[0];
        int i18 = iArr3[1];
        int i19 = this.r;
        int i20 = i19 + i19;
        int i21 = i17 - i20;
        int i22 = this.y;
        int i23 = i18 - i20;
        int i24 = this.J;
        int i25 = i22 + i22;
        int i26 = i23 - i25;
        int i27 = i21 - i25;
        if (i(i24)) {
            i26 -= this.u;
        } else if (i24 == 3 || i24 == 4) {
            i27 -= this.u;
        }
        this.d.measure(View.MeasureSpec.makeMeasureSpec(Math.min(i27, this.B), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i26, 0));
        if (this.d.getMeasuredHeight() > i26) {
            this.d.measure(View.MeasureSpec.makeMeasureSpec(i27, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(i26, Integer.MIN_VALUE));
        }
        View view = this.d;
        int i28 = this.r;
        this.E = view.getMeasuredWidth() + i28 + i28;
        View view2 = this.d;
        int i29 = this.r;
        float measuredHeight = view2.getMeasuredHeight() + i29 + i29;
        this.F = measuredHeight;
        int i30 = (int) this.E;
        int i31 = this.y;
        int i32 = this.J;
        int i33 = i31 + i31;
        int i34 = ((int) measuredHeight) + i33;
        int i35 = i30 + i33;
        if (i(i32)) {
            i34 += this.u;
        } else if (i32 == 3 || i32 == 4) {
            i35 += this.u;
        }
        setMeasuredDimension((int) Math.ceil(i35 * 1.05f), (int) Math.ceil(i34 * 1.05f));
        Rect rect = this.n;
        int centerX = rect.centerX();
        int centerY = rect.centerY();
        int i36 = this.J;
        int i37 = i36 - 1;
        if (i36 == 0) {
            throw null;
        }
        if (i37 == 0) {
            this.g = centerX;
            this.h = this.n.top - this.t;
            return;
        }
        if (i37 == 1) {
            this.g = centerX;
            this.h = this.n.bottom + this.t;
            return;
        }
        if (i37 == 2) {
            this.g = this.n.left - this.t;
            this.h = centerY;
            return;
        }
        if (i37 != 3) {
            if (i37 == 4) {
                throw new IllegalStateException();
            }
        } else {
            this.g = this.n.right + this.t;
            this.h = centerY;
        }
    }

    public void setBubbleWidthScale(float f) {
        this.D = f;
        g(this.l, f);
        invalidate();
    }

    public void setContentAlpha(float f) {
        this.d.setAlpha(f);
        invalidate();
    }

    public void setTooltipAlpha(float f) {
        this.o.setAlpha((int) (f * 255.0f));
        invalidate();
    }
}
