package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import java.util.HashMap;
import java.util.Map;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwna extends ViewGroup {
    public static final /* synthetic */ int J = 0;
    private static final int[] K = {R.attr.materialButtonOutlinedStyle};
    public boolean A;
    public boolean B;
    public boolean C;
    public dwmw D;
    public Paint E;
    public int F;
    public final AccessibilityManager G;
    public final dwmj H;
    public Rect I;
    private final int[] L;
    private final Rect M;
    private final Rect N;
    private final ktq O;
    private final ktq P;
    private boolean Q;
    private Map R;
    private final View.OnAttachStateChangeListener S;
    private final ViewTreeObserver.OnGlobalLayoutListener T;
    public final Rect a;
    public final Rect b;
    public final Rect c;
    public final Rect d;
    public final dwne e;
    public final dwnc f;
    public final dwmb g;
    public View h;
    public int i;
    public int j;
    public View k;
    public Drawable l;
    public float m;
    public boolean n;
    public boolean o;
    public ImageView p;
    public Animator q;
    public final dwnd r;
    public dwmz s;
    public boolean t;
    public float u;
    public float v;
    public boolean w;
    public Interpolator x;
    public Interpolator y;
    public boolean z;

    public dwna(Context context, dwmj dwmjVar) {
        super(context);
        int i;
        this.L = new int[2];
        this.a = new Rect();
        this.M = new Rect();
        this.N = new Rect();
        this.b = new Rect();
        this.c = new Rect();
        this.d = new Rect();
        this.m = 1.0f;
        this.t = false;
        this.u = 0.0f;
        this.v = 0.0f;
        this.w = false;
        this.A = true;
        this.B = true;
        this.C = false;
        this.S = new dwmn(this);
        this.T = new dwmo(this);
        setId(R.id.featurehighlight_view);
        setWillNotDraw(false);
        dwnc dwncVar = new dwnc(context);
        this.f = dwncVar;
        dwncVar.setCallback(this);
        dwne dwneVar = new dwne(context);
        this.e = dwneVar;
        dwneVar.setCallback(this);
        this.r = new dwnd(this);
        this.G = (AccessibilityManager) getContext().getSystemService("accessibility");
        ktq ktqVar = new ktq(context, new dwmp(this));
        this.O = ktqVar;
        ktqVar.a(false);
        ktq ktqVar2 = new ktq(getContext(), new dwmq(this));
        this.P = ktqVar2;
        ktqVar2.a(false);
        this.H = dwmjVar;
        if (dwmjVar == dwmj.Legacy) {
            i = R.layout.text_content;
        } else {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(K);
            boolean hasValue = obtainStyledAttributes.hasValue(0);
            obtainStyledAttributes.recycle();
            i = R.layout.gm_text_content;
            if (!hasValue) {
                context = new aeo(context, R.style.ThemeOverlay_GoogleMaterial_FeatureHighlight_Content);
            }
        }
        dwmb dwmbVar = (dwmb) LayoutInflater.from(context).inflate(i, (ViewGroup) this, false);
        dwmb dwmbVar2 = this.g;
        if (dwmbVar2 != null) {
            removeView(dwmbVar2.a());
        }
        dwmbVar.getClass();
        this.g = dwmbVar;
        addView(dwmbVar.a(), 0);
        h(new dwmy(this));
        setVisibility(8);
    }

    private final void s(Rect rect, View view) {
        t(this.L, view);
        int[] iArr = this.L;
        int i = iArr[0];
        rect.set(i, iArr[1], view.getMeasuredWidth() + i, this.L[1] + view.getMeasuredHeight());
    }

    private final void t(int[] iArr, View view) {
        getLocationInWindow(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        view.getLocationInWindow(iArr);
        iArr[0] = iArr[0] - i;
        iArr[1] = iArr[1] - i2;
    }

    private final void u(boolean z) {
        ViewParent parent = getParent();
        if (parent instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) parent;
            int childCount = viewGroup.getChildCount();
            if (z) {
                this.R = new HashMap();
                for (int i = 0; i < childCount; i++) {
                    View childAt = viewGroup.getChildAt(i);
                    if (childAt != this) {
                        this.R.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        int[] iArr = kvo.a;
                        childAt.setImportantForAccessibility(4);
                    }
                }
                return;
            }
            Map map = this.R;
            if (map != null) {
                for (View view : map.keySet()) {
                    int intValue = ((Integer) this.R.get(view)).intValue();
                    int[] iArr2 = kvo.a;
                    view.setImportantForAccessibility(intValue);
                }
                this.R = null;
            }
        }
    }

    private final boolean v() {
        return this.m != 1.0f;
    }

    public final Animator a() {
        Animator animator;
        Context context = getContext();
        dwnc dwncVar = this.f;
        int ordinal = dwncVar.g.ordinal();
        if (ordinal == 0) {
            AnimatorSet animatorSet = new AnimatorSet();
            ObjectAnimator duration = ObjectAnimator.ofFloat(dwncVar, "scale", 1.0f, 1.1f).setDuration(500L);
            ObjectAnimator duration2 = ObjectAnimator.ofFloat(dwncVar, "scale", 1.1f, 1.0f).setDuration(500L);
            ObjectAnimator duration3 = ObjectAnimator.ofPropertyValuesHolder(dwncVar, PropertyValuesHolder.ofFloat("pulseScale", 1.1f, 2.0f), PropertyValuesHolder.ofFloat("pulseAlpha", 1.0f, 0.0f)).setDuration(500L);
            animatorSet.play(duration).with(ObjectAnimator.ofFloat(dwncVar, "pulseAlpha", 0.0f).setDuration(500L));
            animatorSet.play(duration2).with(duration3).after(duration);
            animator = animatorSet;
        } else {
            if (ordinal != 1) {
                throw new IllegalStateException("No implementation for animation type.");
            }
            animator = ObjectAnimator.ofPropertyValuesHolder(dwncVar, PropertyValuesHolder.ofFloat("scale", 0.0f, 2.0f), PropertyValuesHolder.ofInt("alpha", PrivateKeyType.INVALID, 0)).setDuration(1000L);
        }
        animator.setInterpolator(dwed.c);
        animator.setStartDelay(500L);
        animator.addListener(new dwdx(animator));
        animator.addListener(new dwnb(context));
        return animator;
    }

    public final Interpolator b(final Interpolator interpolator, final float f) {
        dwne dwneVar = this.e;
        final float a = dwneVar.a(this.N);
        final float f2 = dwneVar.g;
        return new Interpolator() { // from class: dwmk
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f3) {
                int i = dwna.J;
                float interpolation = interpolator.getInterpolation(f3);
                float f4 = ((1.0f - interpolation) * f) + interpolation;
                float f5 = f2;
                float f6 = a;
                return dwni.b(((f4 * f5) - f6) / (f5 - f6));
            }
        };
    }

    public final Interpolator c(Interpolator interpolator) {
        dwne dwneVar = this.e;
        return new dwml(interpolator, dwneVar.g, dwneVar.a(this.N));
    }

    @Override // android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams;
    }

    public final void d(int i) {
        if (this.t) {
            return;
        }
        this.s.a(i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        dwmw dwmwVar = this.D;
        if (dwmwVar != null && dwmwVar.a.isEnabled() && dwmwVar.a.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action == 7 || action == 9) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                int i = (int) x;
                int i2 = (int) y;
                dwmwVar.p((dwmwVar.f.g.A() && dwmwVar.f.b.contains(i, i2)) ? 1 : (dwmwVar.f.g.y() && dwmwVar.f.c.contains(i, i2)) ? 2 : (dwmwVar.f.g.z() && dwmwVar.f.d.contains(i, i2)) ? 3 : dwmwVar.f.a.contains(i, i2) ? 4 : (dwmwVar.f.o(x, y) && dwmwVar.f.e.e(x, y)) ? -1 : 5);
            } else if (action == 10 && dwmwVar.e != Integer.MIN_VALUE) {
                dwmwVar.p(Integer.MIN_VALUE);
            }
            return true;
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    public final void e() {
        if (!this.t) {
            this.s.b();
        }
        View view = this.h;
        if (view != null) {
            view.performClick();
        }
    }

    public final void f(Runnable runnable) {
        if (this.t) {
            return;
        }
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.g.a(), "alpha", 0.0f).setDuration(200L);
        duration.setInterpolator(c(dwed.b));
        dwne dwneVar = this.e;
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(dwneVar, PropertyValuesHolder.ofFloat("scale", dwneVar.getScale(), 1.125f), PropertyValuesHolder.ofInt("alpha", dwneVar.getAlpha(), 0));
        ofPropertyValuesHolder.setInterpolator(dwed.b);
        Animator duration2 = ofPropertyValuesHolder.setDuration(200L).setDuration(200L);
        Animator duration3 = this.f.a().setDuration(200L);
        AnimatorSet animatorSet = new AnimatorSet();
        AnimatorSet.Builder with = animatorSet.play(duration).with(duration2).with(duration3);
        if (q()) {
            with.with(ObjectAnimator.ofFloat(this.p, "elevation", 0.0f).setDuration(200L));
        }
        animatorSet.addListener(new dwmm(this, runnable));
        n(animatorSet);
    }

    public final void g(Runnable runnable) {
        if (this.t) {
            return;
        }
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.g.a(), "alpha", 0.0f).setDuration(200L);
        duration.setInterpolator(c(dwed.b));
        float exactCenterX = this.a.exactCenterX() - this.e.h;
        Rect rect = this.a;
        dwne dwneVar = this.e;
        float exactCenterY = rect.exactCenterY() - dwneVar.i;
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(dwneVar, PropertyValuesHolder.ofFloat("scale", dwneVar.getScale(), 0.0f), PropertyValuesHolder.ofFloat("translationX", dwneVar.getTranslationX(), exactCenterX), PropertyValuesHolder.ofFloat("translationY", dwneVar.getTranslationY(), exactCenterY), PropertyValuesHolder.ofInt("alpha", dwneVar.getAlpha(), 0));
        ofPropertyValuesHolder.setInterpolator(dwed.b);
        Animator duration2 = ofPropertyValuesHolder.setDuration(200L).setDuration(200L);
        Animator duration3 = this.f.a().setDuration(200L);
        AnimatorSet animatorSet = new AnimatorSet();
        AnimatorSet.Builder with = animatorSet.play(duration).with(duration2).with(duration3);
        if (q()) {
            with.with(ObjectAnimator.ofFloat(this.p, "elevation", 0.0f).setDuration(200L));
        }
        animatorSet.addListener(new dwmm(this, runnable));
        n(animatorSet);
    }

    @Override // android.view.ViewGroup
    protected final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-2, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public final void h(dwmz dwmzVar) {
        this.g.l(dwmzVar);
        this.s = dwmzVar;
    }

    public final void i() {
        ImageView imageView = this.p;
        if (imageView != null) {
            imageView.setImageTintList(ColorStateList.valueOf(this.F));
        }
    }

    public final void j(int i, int i2) {
        this.f.c(i);
        this.f.d(i2);
    }

    public final void k(View view) {
        int[] iArr = kvo.a;
        efba.a(isAttachedToWindow(), "Must be attached to window before showing");
        this.h = view;
        dwmw dwmwVar = new dwmw(this, view);
        this.D = dwmwVar;
        kvo.p(this, dwmwVar);
        if (p()) {
            TextView textView = (TextView) view;
            this.j = textView.getCurrentTextColor();
            textView.setTextColor(this.i);
        }
        if (q()) {
            l();
        }
        if (getVisibility() == 8) {
            setVisibility(4);
        }
        view.addOnAttachStateChangeListener(this.S);
        view.getViewTreeObserver().addOnGlobalLayoutListener(this.T);
    }

    public final void l() {
        View view = this.h;
        if (view == null) {
            return;
        }
        this.o = view.isDrawingCacheEnabled();
        this.h.setDrawingCacheEnabled(true);
        ImageView imageView = new ImageView(getContext());
        this.p = imageView;
        imageView.setElevation(this.h.getElevation());
        this.p.setOutlineProvider(new dwmt(this));
        if (this.E != null) {
            i();
        }
        addView(this.p);
    }

    public final void m() {
        efba.a(getParent() != null, "View must be attached to view hierarchy");
        setVisibility(0);
        this.t = false;
    }

    public final void n(Animator animator) {
        Animator animator2 = this.q;
        if (animator2 != null) {
            animator2.cancel();
        }
        if (animator != null) {
            this.q = animator;
            animator.start();
        }
    }

    public final boolean o(float f, float f2) {
        return this.M.contains(Math.round(f), Math.round(f2));
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.C = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        View view = this.h;
        if (view != null) {
            view.removeOnAttachStateChangeListener(this.S);
            this.h.getViewTreeObserver().removeOnGlobalLayoutListener(this.T);
        }
        Animator animator = this.q;
        if (animator != null) {
            animator.removeAllListeners();
            this.q.cancel();
            this.q = null;
        }
        this.C = false;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        canvas.save();
        if (this.k != null) {
            canvas.clipRect(this.M);
        }
        this.e.draw(canvas);
        if (!this.z) {
            this.f.draw(canvas);
        }
        if (this.l != null) {
            Rect rect = this.a;
            canvas.translate(rect.exactCenterX() - (this.l.getBounds().width() / 2.0f), rect.exactCenterY() - (this.l.getBounds().height() / 2.0f));
            this.l.draw(canvas);
        } else {
            View view = this.h;
            if (view == null) {
                throw new IllegalStateException("Neither target view nor drawable was set");
            }
            if (q()) {
                view.invalidate();
                this.p.setImageBitmap(this.h.getDrawingCache());
            } else {
                efba.a(true, "Target view must be set before draw");
                canvas.translate(this.a.left, this.a.top);
                if (v()) {
                    canvas.save();
                    float f = this.m;
                    canvas.scale(f, f);
                }
                Paint paint = this.E;
                if (paint != null) {
                    int saveLayer = canvas.saveLayer(null, paint, 31);
                    this.h.draw(canvas);
                    canvas.restoreToCount(saveLayer);
                } else {
                    this.h.draw(canvas);
                }
                if (v()) {
                    canvas.restore();
                }
            }
        }
        canvas.restore();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int height;
        int i5;
        efba.a(this.h != null, "Target view must be set before layout");
        this.C = true;
        t(this.L, this.h);
        int[] iArr = this.L;
        int i6 = iArr[0];
        this.a.set(i6, iArr[1], this.h.getWidth() + i6, this.L[1] + this.h.getHeight());
        Drawable drawable = this.l;
        if (drawable != null) {
            int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.libraries_material_featurehighlight_min_tap_target_size) / 2;
            int max = Math.max(drawable.getBounds().height() / 2, dimensionPixelSize);
            int width = drawable.getBounds().width() / 2;
            Rect rect = this.a;
            int max2 = Math.max(width, dimensionPixelSize);
            int centerX = rect.centerX();
            int centerY = rect.centerY();
            rect.set(centerX - max2, centerY - max, centerX + max2, centerY + max);
        }
        Rect rect2 = this.a;
        float f = this.m;
        float width2 = rect2.width();
        float f2 = f - 1.0f;
        float height2 = rect2.height();
        float f3 = (width2 * f2) / 2.0f;
        rect2.left = (int) (rect2.left - f3);
        rect2.right = (int) (rect2.right + f3);
        float f4 = (height2 * f2) / 2.0f;
        rect2.top = (int) (rect2.top - f4);
        rect2.bottom = (int) (rect2.bottom + f4);
        if (this.l == null && q()) {
            efba.a(this.p != null, "Target view mock must be created before layout");
            ImageView imageView = this.p;
            Rect rect3 = this.a;
            imageView.layout(rect3.left, rect3.top, rect3.right, rect3.bottom);
        }
        View view = this.k;
        if (view != null) {
            s(this.M, view);
        } else {
            this.M.set(i, i2, i3, i4);
        }
        this.e.setBounds(this.M);
        if (!this.z) {
            this.f.setBounds(this.M);
        }
        dwnd dwndVar = this.r;
        Rect rect4 = this.a;
        Rect rect5 = this.M;
        View a = dwndVar.d.g.a();
        if (rect4.isEmpty() || rect5.isEmpty()) {
            a.layout(0, 0, 0, 0);
        } else {
            int centerY2 = rect4.centerY();
            int centerX2 = rect4.centerX();
            if (!dwndVar.e) {
                dwnc dwncVar = dwndVar.d.f;
                dwncVar.e = rect4.exactCenterX();
                dwncVar.f = rect4.exactCenterY();
                dwncVar.d = Math.max(dwncVar.a, (Math.max(rect4.width(), rect4.height()) / 2.0f) + dwncVar.b);
                dwncVar.invalidateSelf();
                dwnc dwncVar2 = dwndVar.d.f;
                Rect rect6 = dwndVar.b;
                float f5 = dwncVar2.d + dwncVar2.c;
                rect6.set(Math.round(dwncVar2.e - f5), Math.round(dwncVar2.f - f5), Math.round(dwncVar2.e + f5), Math.round(dwncVar2.f + f5));
            }
            int i7 = dwndVar.f;
            if (i7 != 48 && (i7 == 80 || centerY2 < rect5.centerY())) {
                dwndVar.b(a, rect5.width(), rect5.bottom - dwndVar.b.bottom);
                int a2 = dwndVar.a(a, rect5.left, rect5.right, a.getMeasuredWidth(), centerX2);
                int i8 = dwndVar.e ? rect4.bottom + dwndVar.c : dwndVar.b.bottom;
                a.layout(a2, i8, a.getMeasuredWidth() + a2, a.getMeasuredHeight() + i8);
            } else {
                dwndVar.b(a, rect5.width(), (dwndVar.e ? rect4.top : dwndVar.b.top) - rect5.top);
                int a3 = dwndVar.a(a, rect5.left, rect5.right, a.getMeasuredWidth(), centerX2);
                int i9 = dwndVar.e ? rect4.top - dwndVar.c : dwndVar.b.top;
                a.layout(a3, i9 - a.getMeasuredHeight(), a.getMeasuredWidth() + a3, i9);
            }
        }
        dwndVar.a.set(a.getLeft(), a.getTop(), a.getRight(), a.getBottom());
        dwne dwneVar = dwndVar.d.e;
        Rect rect7 = dwndVar.a;
        boolean z2 = dwndVar.e;
        dwneVar.b.set(rect4);
        dwneVar.c.set(rect7);
        float exactCenterX = rect4.exactCenterX();
        float exactCenterY = rect4.exactCenterY();
        if (z2) {
            int centerY3 = rect4.centerY();
            int centerY4 = rect5.centerY();
            int i10 = dwneVar.d;
            int i11 = i10 + i10;
            dwneVar.h = exactCenterX / 2.0f;
            if (centerY3 < centerY4) {
                height = rect7.bottom;
                i5 = dwne.f(height, exactCenterX, i11);
                dwneVar.i = -i5;
            } else {
                height = rect5.height() - rect7.top;
                int f6 = dwne.f(height, exactCenterX, i11);
                dwneVar.i = rect5.height() + f6;
                i5 = f6;
            }
            dwneVar.g = height + i5 + i11;
        } else {
            Rect bounds = dwneVar.getBounds();
            if (Math.min(exactCenterY - bounds.top, bounds.bottom - exactCenterY) < dwneVar.a) {
                dwneVar.h = exactCenterX;
                dwneVar.i = exactCenterY;
            } else {
                dwneVar.h = exactCenterX <= bounds.exactCenterX() ? rect7.exactCenterX() + dwneVar.e : rect7.exactCenterX() - dwneVar.e;
                exactCenterY = exactCenterY <= bounds.exactCenterY() ? rect7.exactCenterY() + dwneVar.f : rect7.exactCenterY() - dwneVar.f;
                dwneVar.i = exactCenterY;
            }
            dwneVar.g = dwneVar.d + Math.max(dwne.g(dwneVar.h, exactCenterY, rect4), dwne.g(dwneVar.h, dwneVar.i, rect7));
        }
        dwneVar.invalidateSelf();
        s(this.N, this.g.a());
        s(this.b, this.g.d());
        s(this.c, this.g.b());
        s(this.d, this.g.c());
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        setMeasuredDimension(resolveSize(View.MeasureSpec.getSize(i), i), resolveSize(View.MeasureSpec.getSize(i2), i2));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.Q = this.a.contains((int) motionEvent.getX(), (int) motionEvent.getY());
            actionMasked = 0;
        }
        if (!this.Q || this.h == null) {
            this.O.b(motionEvent);
            if (actionMasked == 1 && this.w) {
                this.w = false;
                this.y = null;
                this.x = null;
                if (this.u > getResources().getDimension(R.dimen.libraries_material_featurehighlight_swipe_to_dismiss_threshold)) {
                    d(2);
                } else {
                    Animator animator = this.q;
                    if (animator != null) {
                        animator.cancel();
                    }
                    ObjectAnimator duration = ObjectAnimator.ofFloat(this.g.a(), "alpha", 1.0f).setDuration(150L);
                    duration.setInterpolator(b(dwed.a, 1.0f - this.v));
                    float exactCenterX = this.a.exactCenterX() - this.e.h;
                    Rect rect = this.a;
                    dwne dwneVar = this.e;
                    Animator duration2 = dwneVar.b(exactCenterX, rect.exactCenterY() - dwneVar.i, 1.0f - this.v).setDuration(150L);
                    Animator duration3 = this.f.b(1.0f - this.v).setDuration(150L);
                    AnimatorSet animatorSet = new AnimatorSet();
                    AnimatorSet.Builder with = animatorSet.play(duration).with(duration2).with(duration3);
                    if (q()) {
                        with.with(ObjectAnimator.ofFloat(this.p, "elevation", this.h.getElevation()).setDuration(150L));
                    }
                    animatorSet.addListener(new dwmv(this));
                    n(animatorSet);
                }
                if (!this.t) {
                    this.s.c();
                }
            }
        } else {
            ktq ktqVar = this.P;
            if (ktqVar != null) {
                ktqVar.b(motionEvent);
                if (actionMasked == 1) {
                    motionEvent = MotionEvent.obtain(motionEvent);
                    motionEvent.setAction(3);
                }
            }
            this.h.onTouchEvent(motionEvent);
        }
        return true;
    }

    public final boolean p() {
        return this.i != 0 && (this.h instanceof TextView);
    }

    public final boolean q() {
        return this.n;
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        if (i == getVisibility()) {
            super.setVisibility(i);
            return;
        }
        super.setVisibility(i);
        if (i != 8 && i != 4) {
            if (i == 0) {
                sendAccessibilityEvent(32);
                u(true);
                return;
            }
            return;
        }
        u(false);
        int[] iArr = kvo.a;
        Object parentForAccessibility = getParentForAccessibility();
        if (parentForAccessibility instanceof View) {
            ((View) parentForAccessibility).sendAccessibilityEvent(32);
        }
    }

    @Override // android.view.View
    protected final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.e || drawable == this.f || drawable == this.l;
    }

    @Override // android.view.ViewGroup
    protected final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ViewGroup.MarginLayoutParams(layoutParams);
    }
}
