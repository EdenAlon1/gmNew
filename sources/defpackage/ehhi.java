package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehhi extends ehhg {
    private StateListAnimator E;

    public ehhi(FloatingActionButton floatingActionButton, ehgv ehgvVar) {
        super(floatingActionButton, ehgvVar);
    }

    private final Animator p(float f, float f2) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(this.B, "elevation", f).setDuration(0L)).with(ObjectAnimator.ofFloat(this.B, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, f2).setDuration(100L));
        animatorSet.setInterpolator(a);
        return animatorSet;
    }

    @Override // defpackage.ehhg
    public final float a() {
        return this.B.getElevation();
    }

    @Override // defpackage.ehhg
    public final void f(Rect rect) {
        if (this.D.b()) {
            super.f(rect);
        } else if (o()) {
            rect.set(0, 0, 0, 0);
        } else {
            int b = (this.u - this.B.b()) / 2;
            rect.set(b, b, b, b);
        }
    }

    @Override // defpackage.ehhg
    public final void g(float f, float f2, float f3) {
        if (this.B.getStateListAnimator() == this.E) {
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(f, p(f, f3));
            stateListAnimator.addState(g, p(f, f2));
            stateListAnimator.addState(h, p(f, f2));
            stateListAnimator.addState(i, p(f, f2));
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(this.B, "elevation", f).setDuration(0L));
            arrayList.add(ObjectAnimator.ofFloat(this.B, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, 0.0f).setDuration(100L));
            animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
            animatorSet.setInterpolator(a);
            stateListAnimator.addState(j, animatorSet);
            stateListAnimator.addState(k, p(0.0f, 0.0f));
            this.E = stateListAnimator;
            this.B.setStateListAnimator(this.E);
        }
        if (m()) {
            k();
        }
    }

    @Override // defpackage.ehhg
    public final boolean m() {
        return this.D.b() || !o();
    }
}
