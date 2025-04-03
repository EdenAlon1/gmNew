package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dwmr implements View.OnLayoutChangeListener {
    final /* synthetic */ Runnable a;
    final /* synthetic */ dwna b;

    public dwmr(dwna dwnaVar, Runnable runnable) {
        this.a = runnable;
        this.b = dwnaVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.a.run();
        this.b.m();
        dwna dwnaVar = this.b;
        ObjectAnimator duration = ObjectAnimator.ofFloat(dwnaVar.g.a(), "alpha", 0.0f, 1.0f).setDuration(350L);
        duration.setInterpolator(dwnaVar.b(dwed.a, 0.0f));
        float exactCenterX = dwnaVar.a.exactCenterX() - dwnaVar.e.h;
        float exactCenterY = dwnaVar.a.exactCenterY();
        dwne dwneVar = dwnaVar.e;
        float f = exactCenterY - dwneVar.i;
        dwnc dwncVar = dwnaVar.f;
        Animator b = dwneVar.b(exactCenterX, f, 0.0f);
        Animator b2 = dwncVar.b(0.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(duration, b, b2);
        animatorSet.addListener(new dwmu(dwnaVar));
        dwnaVar.n(animatorSet);
        this.b.removeOnLayoutChangeListener(this);
    }
}
