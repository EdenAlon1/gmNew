package defpackage;

import android.animation.ValueAnimator;
import android.support.v7.widget.AppCompatImageView;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import com.google.android.apps.messaging.R;
import com.google.android.material.tabs.TabLayout;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dryd {
    public final dsma a;
    public final drxb b;
    public final drxw c;
    public final ffix d;
    private float i;
    private final ffbz g = ffca.a(new ffix() { // from class: drxy
        @Override // defpackage.ffix
        public final Object invoke() {
            TabLayout tabLayout = dryd.this.b.i;
            int height = tabLayout.getHeight();
            ViewGroup.LayoutParams layoutParams = tabLayout.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            return Integer.valueOf(height + (marginLayoutParams != null ? marginLayoutParams.topMargin : 0));
        }
    });
    private final ffbz h = ffca.a(new ffix() { // from class: drxz
        @Override // defpackage.ffix
        public final Object invoke() {
            return Integer.valueOf(dryd.this.b.a.getContext().getResources().getInteger(R.integer.short_animation_ms));
        }
    });
    public final dsyi e = new dryc(this);
    public boolean f = true;

    public dryd(dsma dsmaVar, drxb drxbVar, drxw drxwVar, ffix ffixVar) {
        this.a = dsmaVar;
        this.b = drxbVar;
        this.c = drxwVar;
        this.d = ffixVar;
    }

    static /* synthetic */ float d(dryd drydVar) {
        return drydVar.g(drydVar.b.c.getTranslationY());
    }

    private final float g(float f) {
        return ffmk.e((-f) / this.b.i.getTop(), 0.0f, 1.0f);
    }

    private final boolean h() {
        float f = this.i;
        return f == 0.0f || f == 1.0f;
    }

    private final void i(float f, float f2, Interpolator interpolator) {
        if (f2 == f) {
            this.d.invoke();
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, f);
        ofFloat.setInterpolator(interpolator);
        ofFloat.setDuration((long) (Math.abs(f2 - f) * ((Number) this.h.a()).intValue()));
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: drya
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                valueAnimator.getClass();
                Object animatedValue = valueAnimator.getAnimatedValue();
                animatedValue.getClass();
                float floatValue = ((Float) animatedValue).floatValue();
                dryd.this.c(floatValue, (-floatValue) * r1.b.i.getTop(), true);
            }
        });
        ofFloat.addListener(new dryb(this));
        ofFloat.start();
    }

    public final boolean a(int i, boolean z) {
        if (!this.c.b()) {
            return false;
        }
        float e = ffmk.e(this.b.c.getTranslationY() - i, -this.b.i.getTop(), 0.0f);
        return c(g(e), e, z);
    }

    public final boolean b() {
        return !this.c.b() || h();
    }

    public final boolean c(float f, float f2, boolean z) {
        if (this.i == f && h()) {
            if (!z) {
                return false;
            }
            this.d.invoke();
            return false;
        }
        this.b.f.setAlpha(ffmk.e(1.0f - (f + f), 0.0f, 1.0f));
        this.b.c.setTranslationY(f2);
        AppCompatImageView appCompatImageView = this.b.d;
        if (appCompatImageView.getVisibility() != 0) {
            appCompatImageView = null;
        }
        if (appCompatImageView != null) {
            appCompatImageView.setTranslationY((-f2) - ((((appCompatImageView.getHeight() - ((Number) this.g.a()).intValue()) / 2) + this.b.c.getPaddingTop()) * f));
            TabLayout tabLayout = this.b.i;
            ViewGroup.LayoutParams layoutParams = tabLayout.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (dslh.f(this.b.i)) {
                marginLayoutParams.rightMargin = (int) ((this.b.b.getWidth() - appCompatImageView.getLeft()) * f);
            } else {
                marginLayoutParams.leftMargin = (int) (appCompatImageView.getRight() * f);
            }
            tabLayout.setLayoutParams(marginLayoutParams);
        }
        this.i = f;
        if (!z) {
            return true;
        }
        this.d.invoke();
        return true;
    }

    public final void e() {
        if (this.b.i.getTop() == 0) {
            c(0.0f, 0.0f, true);
            this.f = true;
        } else {
            i(0.0f, d(this), new AccelerateInterpolator());
        }
    }

    public final void f() {
        if (this.c.b()) {
            float d = d(this);
            i(d <= 0.5f ? 0.0f : 1.0f, d, new DecelerateInterpolator());
        }
    }
}
