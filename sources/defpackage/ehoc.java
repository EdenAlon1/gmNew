package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.ActionMenuView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.google.android.material.internal.TouchObserverFrameLayout;
import com.google.android.material.search.SearchBar;
import com.google.android.material.search.SearchView;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehoc {
    public final SearchView a;
    public final ClippableRoundedCornerLayout b;
    public final Toolbar c;
    public final EditText d;
    public final ehjw e;
    public AnimatorSet f;
    public SearchBar g;
    private final View h;
    private final FrameLayout i;
    private final FrameLayout j;
    private final Toolbar k;
    private final TextView l;
    private final ImageButton m;
    private final View n;
    private final TouchObserverFrameLayout o;

    public ehoc(SearchView searchView) {
        this.a = searchView;
        this.h = searchView.a;
        ClippableRoundedCornerLayout clippableRoundedCornerLayout = searchView.b;
        this.b = clippableRoundedCornerLayout;
        this.i = searchView.e;
        this.j = searchView.f;
        this.k = searchView.g;
        this.c = searchView.h;
        this.l = searchView.i;
        this.d = searchView.j;
        this.m = searchView.k;
        this.n = searchView.l;
        this.o = searchView.m;
        this.e = new ehjw(clippableRoundedCornerLayout);
    }

    private final int g(View view) {
        int marginEnd = ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).getMarginEnd();
        return ehjg.k(this.g) ? this.g.getLeft() - marginEnd : (this.g.getRight() - this.a.getWidth()) + marginEnd;
    }

    private final int h(View view) {
        int marginStart = ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).getMarginStart();
        int paddingStart = this.g.getPaddingStart();
        return ehjg.k(this.g) ? ((this.g.getWidth() - this.g.getRight()) + marginStart) - paddingStart : (this.g.getLeft() - marginStart) + paddingStart;
    }

    private final int i() {
        FrameLayout frameLayout = this.j;
        return ((this.g.getTop() + this.g.getBottom()) / 2) - ((frameLayout.getTop() + frameLayout.getBottom()) / 2);
    }

    private final Animator j(boolean z, boolean z2, View view) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(z2 ? h(view) : g(view), 0.0f);
        ofFloat.addUpdateListener(ehih.b(view));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(i(), 0.0f);
        ofFloat2.addUpdateListener(ehih.c(view));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofFloat, ofFloat2);
        animatorSet.setDuration(true != z ? 250L : 300L);
        animatorSet.setInterpolator(ehin.a(z, egyv.b));
        return animatorSet;
    }

    private final void k(AnimatorSet animatorSet) {
        ImageButton b = ehjb.b(this.k);
        if (b == null) {
            return;
        }
        Drawable a = kqj.a(b.getDrawable());
        if (!this.a.o) {
            if (a instanceof kw) {
                ((kw) a).setProgress(1.0f);
            }
            if (a instanceof ehhv) {
                ((ehhv) a).a(1.0f);
                return;
            }
            return;
        }
        if (a instanceof kw) {
            final kw kwVar = (kw) a;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ehns
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    kw.this.setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                }
            });
            animatorSet.playTogether(ofFloat);
        }
        if (a instanceof ehhv) {
            final ehhv ehhvVar = (ehhv) a;
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ehnu
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    ehhv.this.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                }
            });
            animatorSet.playTogether(ofFloat2);
        }
    }

    public final AnimatorSet a(boolean z) {
        AnimatorSet animatorSet = new AnimatorSet();
        k(animatorSet);
        animatorSet.setDuration(true != z ? 250L : 300L);
        animatorSet.setInterpolator(ehin.a(z, egyv.b));
        return animatorSet;
    }

    public final AnimatorSet b(boolean z) {
        AnimatorSet animatorSet = new AnimatorSet();
        ImageButton b = ehjb.b(this.k);
        if (b != null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(h(b), 0.0f);
            ofFloat.addUpdateListener(ehih.b(b));
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(i(), 0.0f);
            ofFloat2.addUpdateListener(ehih.c(b));
            animatorSet.playTogether(ofFloat, ofFloat2);
        }
        ActionMenuView a = ehjb.a(this.k);
        if (a != null) {
            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(g(a), 0.0f);
            ofFloat3.addUpdateListener(ehih.b(a));
            ValueAnimator ofFloat4 = ValueAnimator.ofFloat(i(), 0.0f);
            ofFloat4.addUpdateListener(ehih.c(a));
            animatorSet.playTogether(ofFloat3, ofFloat4);
        }
        animatorSet.setDuration(true != z ? 250L : 300L);
        animatorSet.setInterpolator(ehin.a(z, egyv.b));
        return animatorSet;
    }

    public final AnimatorSet c(boolean z) {
        AnimatorSet animatorSet = new AnimatorSet();
        if (this.f == null) {
            animatorSet.playTogether(a(z), b(z));
        }
        Animator[] animatorArr = new Animator[9];
        TimeInterpolator timeInterpolator = z ? egyv.a : egyv.b;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(true != z ? 250L : 300L);
        ofFloat.setStartDelay(true != z ? 0L : 100L);
        ofFloat.setInterpolator(ehin.a(z, timeInterpolator));
        ofFloat.addUpdateListener(ehih.a(this.h));
        animatorArr[0] = ofFloat;
        long j = true != z ? 250L : 300L;
        ehjw ehjwVar = this.e;
        Rect rect = ehjwVar.g;
        Rect rect2 = ehjwVar.h;
        if (rect == null) {
            rect = ehjg.e(this.a);
        }
        if (rect2 == null) {
            rect2 = ehjg.d(this.b, this.g);
        }
        final Rect rect3 = new Rect(rect2);
        final float H = this.g.H();
        ClippableRoundedCornerLayout clippableRoundedCornerLayout = this.b;
        ehjw ehjwVar2 = this.e;
        float[] fArr = clippableRoundedCornerLayout.b;
        float[] i = ehjwVar2.i();
        final float[] fArr2 = {Math.max(fArr[0], i[0]), Math.max(fArr[1], i[1]), Math.max(fArr[2], i[2]), Math.max(fArr[3], i[3]), Math.max(fArr[4], i[4]), Math.max(fArr[5], i[5]), Math.max(fArr[6], i[6]), Math.max(fArr[7], i[7])};
        ValueAnimator ofObject = ValueAnimator.ofObject(new ehim(rect3), rect2, rect);
        ofObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ehnr
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float[] fArr3 = fArr2;
                float animatedFraction = valueAnimator.getAnimatedFraction();
                float f = fArr3[0];
                TimeInterpolator timeInterpolator2 = egyv.a;
                float f2 = H;
                float[] fArr4 = {((f - f2) * animatedFraction) + f2, ((fArr3[1] - f2) * animatedFraction) + f2, ((fArr3[2] - f2) * animatedFraction) + f2, ((fArr3[3] - f2) * animatedFraction) + f2, ((fArr3[4] - f2) * animatedFraction) + f2, ((fArr3[5] - f2) * animatedFraction) + f2, f2 + ((fArr3[6] - f2) * animatedFraction), f2 + (animatedFraction * (fArr3[7] - f2))};
                Rect rect4 = rect3;
                ehoc.this.b.a(rect4.left, rect4.top, rect4.right, rect4.bottom, fArr4);
            }
        });
        ofObject.setDuration(j);
        ofObject.setInterpolator(ehin.a(z, egyv.b));
        animatorArr[1] = ofObject;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat2.setDuration(true != z ? 42L : 50L);
        ofFloat2.setStartDelay(true != z ? 0L : 250L);
        ofFloat2.setInterpolator(ehin.a(z, egyv.a));
        ofFloat2.addUpdateListener(ehih.a(this.m));
        animatorArr[2] = ofFloat2;
        AnimatorSet animatorSet2 = new AnimatorSet();
        Animator[] animatorArr2 = new Animator[3];
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat3.setDuration(true != z ? 83L : 150L);
        ofFloat3.setStartDelay(true != z ? 0L : 75L);
        ofFloat3.setInterpolator(ehin.a(z, egyv.a));
        ofFloat3.addUpdateListener(ehih.a(this.n, this.o));
        animatorArr2[0] = ofFloat3;
        ValueAnimator ofFloat4 = ValueAnimator.ofFloat((this.o.getHeight() * 0.050000012f) / 2.0f, 0.0f);
        ofFloat4.setDuration(j);
        ofFloat4.setInterpolator(ehin.a(z, egyv.b));
        ofFloat4.addUpdateListener(ehih.c(this.n));
        animatorArr2[1] = ofFloat4;
        ValueAnimator ofFloat5 = ValueAnimator.ofFloat(0.95f, 1.0f);
        ofFloat5.setDuration(j);
        ofFloat5.setInterpolator(ehin.a(z, egyv.b));
        ofFloat5.addUpdateListener(new ehih(new ehig() { // from class: ehid
            @Override // defpackage.ehig
            public final void a(ValueAnimator valueAnimator, View view) {
                int i2 = ehih.a;
                Float f = (Float) valueAnimator.getAnimatedValue();
                view.setScaleX(f.floatValue());
                view.setScaleY(f.floatValue());
            }
        }, this.o));
        animatorArr2[2] = ofFloat5;
        animatorSet2.playTogether(animatorArr2);
        animatorArr[3] = animatorSet2;
        animatorArr[4] = j(z, false, this.i);
        animatorArr[5] = j(z, false, this.c);
        ValueAnimator ofFloat6 = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat6.setDuration(j);
        ofFloat6.setInterpolator(ehin.a(z, egyv.b));
        if (this.a.p) {
            ofFloat6.addUpdateListener(new ehhw(ehjb.a(this.c), ehjb.a(this.k)));
        }
        animatorArr[6] = ofFloat6;
        animatorArr[7] = j(z, true, this.d);
        animatorArr[8] = j(z, true, this.l);
        animatorSet.playTogether(animatorArr);
        animatorSet.addListener(new ehob(this, z));
        return animatorSet;
    }

    public final AnimatorSet d(boolean z) {
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.b.getHeight(), 0.0f);
        ofFloat.addUpdateListener(ehih.c(this.b));
        animatorSet.playTogether(ofFloat);
        k(animatorSet);
        animatorSet.setInterpolator(ehin.a(z, egyv.b));
        animatorSet.setDuration(true != z ? 300L : 350L);
        return animatorSet;
    }

    public final AnimatorSet e() {
        if (this.g != null) {
            SearchView searchView = this.a;
            if (searchView.m()) {
                searchView.d();
            }
            AnimatorSet c = c(false);
            c.addListener(new ehny(this));
            c.start();
            return c;
        }
        SearchView searchView2 = this.a;
        if (searchView2.m()) {
            searchView2.d();
        }
        AnimatorSet d = d(false);
        d.addListener(new ehoa(this));
        d.start();
        return d;
    }

    public final void f(float f) {
        ActionMenuView a;
        this.m.setAlpha(f);
        this.n.setAlpha(f);
        this.o.setAlpha(f);
        if (!this.a.p || (a = ehjb.a(this.k)) == null) {
            return;
        }
        a.setAlpha(f);
    }
}
