package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import com.google.android.apps.messaging.R;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class exbu {
    final int B;
    final int C;
    boolean F;
    final Size G;
    Size H;
    Size I;
    boolean J;
    final Runnable K;
    final View.OnClickListener L;
    boolean M;
    boolean N;
    int O;
    final Context a;
    final View b;
    public final PopupWindow c;
    final int d;
    final int e;
    final ViewGroup f;
    final ViewGroup g;
    final exbs h;
    final ImageButton i;
    final Drawable j;
    final Drawable k;
    final AnimatedVectorDrawable l;
    final AnimatedVectorDrawable m;
    final exbt n;
    final Interpolator o;
    final Interpolator p;
    final Interpolator q;
    final Interpolator r;
    final AnimatorSet s;
    final AnimatorSet t;
    final AnimatorSet u;
    final AnimationSet v;
    final AnimationSet w;
    final Animation.AnimationListener x;
    final Rect y = new Rect();
    final Point z = new Point();
    final int[] A = new int[2];
    final Runnable D = new exbi(this);
    boolean E = true;

    public exbu(Context context, View view, Runnable runnable) {
        view.getClass();
        this.b = view;
        this.a = context;
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.floating_popup_container, (ViewGroup) null);
        viewGroup.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        viewGroup.setTag("floating_toolbar");
        viewGroup.setClipToOutline(true);
        this.f = viewGroup;
        this.K = runnable;
        exbj exbjVar = new exbj(this);
        this.L = exbjVar;
        LinearLayout linearLayout = new LinearLayout(viewGroup.getContext());
        linearLayout.setOnClickListener(exbjVar);
        linearLayout.setSoundEffectsEnabled(false);
        PopupWindow popupWindow = new PopupWindow(linearLayout);
        popupWindow.setClippingEnabled(false);
        popupWindow.setOutsideTouchable(true);
        popupWindow.setWindowLayoutType(1002);
        popupWindow.setAnimationStyle(0);
        popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        viewGroup.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        linearLayout.addView(viewGroup);
        this.c = popupWindow;
        this.d = view.getResources().getDimensionPixelSize(R.dimen.floating_toolbar_horizontal_margin);
        this.e = view.getResources().getDimensionPixelSize(R.dimen.floating_toolbar_vertical_margin);
        this.B = context.getResources().getDimensionPixelSize(R.dimen.floating_toolbar_height);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.floating_toolbar_icon_text_spacing);
        this.C = dimensionPixelSize;
        this.o = new exbr();
        this.p = AnimationUtils.loadInterpolator(context, android.R.interpolator.fast_out_slow_in);
        this.q = AnimationUtils.loadInterpolator(context, android.R.interpolator.linear_out_slow_in);
        this.r = AnimationUtils.loadInterpolator(context, android.R.interpolator.fast_out_linear_in);
        Drawable drawable = context.getResources().getDrawable(R.drawable.ft_avd_tooverflow, context.getTheme());
        this.j = drawable;
        drawable.setAutoMirrored(true);
        Drawable drawable2 = context.getResources().getDrawable(R.drawable.ft_avd_toarrow, context.getTheme());
        this.k = drawable2;
        drawable2.setAutoMirrored(true);
        AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) context.getResources().getDrawable(R.drawable.ft_avd_toarrow_animation, context.getTheme());
        this.l = animatedVectorDrawable;
        animatedVectorDrawable.setAutoMirrored(true);
        AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) context.getResources().getDrawable(R.drawable.ft_avd_tooverflow_animation, context.getTheme());
        this.m = animatedVectorDrawable2;
        animatedVectorDrawable2.setAutoMirrored(true);
        ImageButton imageButton = (ImageButton) LayoutInflater.from(context).inflate(R.layout.floating_popup_overflow_button, (ViewGroup) null);
        imageButton.setImageDrawable(drawable2);
        imageButton.setOnClickListener(new exbe(this, imageButton));
        this.i = imageButton;
        this.G = b(imageButton);
        exbd exbdVar = new exbd(this, context);
        exbdVar.setTag("main_panel");
        this.g = exbdVar;
        this.n = new exbt(context, dimensionPixelSize);
        final exbs exbsVar = new exbs(this);
        exbsVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        exbsVar.setDivider(null);
        exbsVar.setDividerHeight(0);
        exbsVar.setAdapter((ListAdapter) new exbf(this, context));
        exbsVar.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: exbb
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view2, int i, long j) {
                exby exbyVar = (exby) exbsVar.getAdapter().getItem(i);
                exbyVar.f();
                exbyVar.f().a();
                exbu exbuVar = exbu.this;
                if (exbuVar.J) {
                    exbuVar.K.run();
                }
            }
        });
        exbsVar.setTag("main_overflow");
        this.h = exbsVar;
        exbh exbhVar = new exbh(this);
        this.x = exbhVar;
        AnimationSet animationSet = new AnimationSet(true);
        this.v = animationSet;
        animationSet.setAnimationListener(exbhVar);
        AnimationSet animationSet2 = new AnimationSet(true);
        this.w = animationSet2;
        animationSet2.setAnimationListener(exbhVar);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup, (Property<ViewGroup, Float>) View.ALPHA, 0.0f, 1.0f).setDuration(150L));
        this.s = animatorSet;
        this.t = exbv.a(viewGroup, 150, new exbk(this));
        this.u = exbv.a(viewGroup, 0, new exbl(this));
    }

    public static Size b(View view) {
        emxf.l(view.getParent() == null);
        view.measure(0, 0);
        return new Size(view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    static void j(View view, int i) {
        u(view, view.getLayoutParams().width, i);
    }

    public static void l(View view, Size size) {
        u(view, size.getWidth(), size.getHeight());
    }

    static void m(View view, int i) {
        u(view, i, view.getLayoutParams().height);
    }

    private static void u(View view, int i, int i2) {
        view.setMinimumWidth(i);
        view.setMinimumHeight(i2);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(0, 0);
        }
        layoutParams.width = i;
        layoutParams.height = i2;
        view.setLayoutParams(layoutParams);
    }

    final int a(int i) {
        int f = ermn.f(4, Math.max(2, i), this.h.getCount());
        return (f * this.B) + this.G.getHeight() + (f < this.h.getCount() ? (int) (this.B * 0.5f) : 0);
    }

    final void c() {
        this.f.clearAnimation();
        this.g.animate().cancel();
        this.h.animate().cancel();
        this.l.stop();
        this.m.stop();
    }

    public final void d() {
        if (this.E) {
            return;
        }
        this.F = false;
        this.E = true;
        this.u.cancel();
        this.t.start();
    }

    public final void e() {
        if (s()) {
            this.F = true;
            this.u.start();
        }
    }

    final void f() {
        if (this.M) {
            this.g.setY(this.f.getHeight() - this.I.getHeight());
            this.i.setY(this.f.getHeight() - r0.getHeight());
            this.h.setY(this.f.getHeight() - this.H.getHeight());
        }
    }

    final void g() {
        this.f.removeAllViews();
        if (p()) {
            this.f.addView(this.h);
        }
        this.f.addView(this.g);
        if (p()) {
            this.f.addView(this.i);
        }
        k();
        if (q()) {
            this.f.setAlpha(0.0f);
            this.f.post(this.D);
        }
    }

    final void h(Rect rect) {
        int i;
        i();
        int centerX = rect.centerX() - (this.c.getWidth() / 2);
        int width = this.y.right - this.c.getWidth();
        Rect rect2 = this.y;
        int min = Math.min(centerX, width);
        int i2 = rect.top - rect2.top;
        int i3 = this.y.bottom - rect.bottom;
        int i4 = this.B;
        int i5 = this.e;
        int i6 = i5 + i5;
        int i7 = i4 + i6;
        if (p()) {
            int a = a(2) + i6;
            int i8 = (this.y.bottom - rect.top) + i7;
            int i9 = (rect.bottom - this.y.top) + i7;
            if (i2 >= a) {
                n(i2 - i6);
                i = rect.top - this.c.getHeight();
                this.M = true;
            } else if (i2 >= i7 && i8 >= a) {
                n(i8 - i6);
                i = rect.top - i7;
                this.M = false;
            } else if (i3 >= a) {
                n(i3 - i6);
                i = rect.bottom;
                this.M = false;
            } else if (i3 < i7 || this.y.height() < a) {
                n(this.y.height() - i6);
                i = this.y.top;
                this.M = false;
            } else {
                n(i9 - i6);
                i = (rect.bottom + i7) - this.c.getHeight();
                this.M = true;
            }
        } else {
            i = i2 >= i7 ? rect.top - i7 : i3 >= i7 ? rect.bottom : i3 >= i4 ? rect.bottom - this.e : Math.max(this.y.top, rect.top - i7);
        }
        this.b.getRootView().getLocationOnScreen(this.A);
        int[] iArr = this.A;
        int i10 = iArr[0];
        int i11 = iArr[1];
        this.b.getRootView().getLocationInWindow(iArr);
        int[] iArr2 = this.A;
        this.z.set(Math.max(0, min - (i10 - iArr2[0])), Math.max(0, i - (i11 - iArr2[1])));
    }

    final void i() {
        this.b.getWindowVisibleDisplayFrame(this.y);
    }

    final void k() {
        this.i.setEnabled(true);
        this.h.awakenScrollBars();
        if (this.N) {
            l(this.f, this.H);
            this.g.setAlpha(0.0f);
            this.g.setVisibility(4);
            this.h.setAlpha(1.0f);
            this.h.setVisibility(0);
            this.i.setImageDrawable(this.j);
            this.i.setContentDescription(this.a.getString(R.string.floating_toolbar_close_overflow_description));
            if (q()) {
                this.f.setX(this.d);
                this.g.setX(0.0f);
                this.i.setX(r0.getWidth() - this.G.getWidth());
                this.h.setX(0.0f);
            } else {
                this.f.setX((this.c.getWidth() - r0.getWidth()) - this.d);
                this.g.setX(-this.f.getX());
                this.i.setX(0.0f);
                this.h.setX(0.0f);
            }
            if (this.M) {
                this.f.setY(this.e);
                this.g.setY(r0.getHeight() - this.f.getHeight());
                this.i.setY(r0.getHeight() - this.G.getHeight());
                this.h.setY(0.0f);
                return;
            }
            this.f.setY(this.e);
            this.g.setY(0.0f);
            this.i.setY(0.0f);
            this.h.setY(this.G.getHeight());
            return;
        }
        l(this.f, this.I);
        this.g.setAlpha(1.0f);
        this.g.setVisibility(0);
        this.h.setAlpha(0.0f);
        this.h.setVisibility(4);
        this.i.setImageDrawable(this.k);
        this.i.setContentDescription(this.a.getString(R.string.floating_toolbar_open_overflow_description));
        if (!p()) {
            this.f.setX(this.d);
            this.f.setY(this.e);
            this.g.setX(0.0f);
            this.g.setY(0.0f);
            return;
        }
        if (q()) {
            this.f.setX(this.d);
            this.g.setX(0.0f);
            this.i.setX(0.0f);
            this.h.setX(0.0f);
        } else {
            this.f.setX((this.c.getWidth() - r0.getWidth()) - this.d);
            this.g.setX(0.0f);
            this.i.setX(r0.getWidth() - this.G.getWidth());
            this.h.setX(r0.getWidth() - this.H.getWidth());
        }
        if (this.M) {
            this.f.setY((this.e + this.H.getHeight()) - r0.getHeight());
            this.g.setY(0.0f);
            this.i.setY(0.0f);
            this.h.setY(r0.getHeight() - this.H.getHeight());
            return;
        }
        this.f.setY(this.e);
        this.g.setY(0.0f);
        this.i.setY(0.0f);
        this.h.setY(this.G.getHeight());
    }

    final void n(int i) {
        if (p()) {
            int a = a((i - this.G.getHeight()) / this.B);
            if (this.H.getHeight() != a) {
                this.H = new Size(this.H.getWidth(), a);
            }
            l(this.h, this.H);
            if (this.N) {
                l(this.f, this.H);
                if (this.M) {
                    int height = this.H.getHeight() - a;
                    ViewGroup viewGroup = this.f;
                    float f = height;
                    viewGroup.setY(viewGroup.getY() + f);
                    ImageButton imageButton = this.i;
                    imageButton.setY(imageButton.getY() - f);
                }
            } else {
                l(this.f, this.I);
            }
            o();
        }
    }

    final void o() {
        int i;
        Size size = this.I;
        int i2 = 0;
        if (size != null) {
            i2 = Math.max(0, size.getWidth());
            i = Math.max(0, this.I.getHeight());
        } else {
            i = 0;
        }
        Size size2 = this.H;
        if (size2 != null) {
            i2 = Math.max(i2, size2.getWidth());
            i = Math.max(i, this.H.getHeight());
        }
        PopupWindow popupWindow = this.c;
        int i3 = this.d;
        popupWindow.setWidth(i2 + i3 + i3);
        PopupWindow popupWindow2 = this.c;
        int i4 = this.e;
        popupWindow2.setHeight(i + i4 + i4);
        Size size3 = this.I;
        if (size3 == null || this.H == null) {
            return;
        }
        int width = size3.getWidth() - this.H.getWidth();
        int height = this.H.getHeight() - this.I.getHeight();
        this.O = (int) (Math.sqrt((width * width) + (height * height)) / this.f.getContext().getResources().getDisplayMetrics().density);
    }

    final boolean p() {
        return this.H != null;
    }

    final boolean q() {
        return (this.a.getApplicationInfo().flags & 4194304) == 4194304 && this.a.getResources().getConfiguration().getLayoutDirection() == 1;
    }

    final boolean r() {
        return (this.v.hasStarted() && !this.v.hasEnded()) || (this.w.hasStarted() && !this.w.hasEnded());
    }

    public final boolean s() {
        return (this.E || this.F || !this.c.isShowing()) ? false : true;
    }

    final int t() {
        int i = this.O;
        return i < 150 ? Math.max(BasePaymentResult.ERROR_REQUEST_FAILED, 0) : i > 300 ? 300 : 250;
    }
}
