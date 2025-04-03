package defpackage;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import com.google.android.material.snackbar.BaseTransientBottomBar;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehqt implements Runnable {
    final /* synthetic */ BaseTransientBottomBar a;

    public ehqt(BaseTransientBottomBar baseTransientBottomBar) {
        this.a = baseTransientBottomBar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ehqz ehqzVar = this.a.j;
        if (ehqzVar == null) {
            return;
        }
        if (ehqzVar.getParent() != null) {
            this.a.j.setVisibility(0);
        }
        BaseTransientBottomBar baseTransientBottomBar = this.a;
        if (baseTransientBottomBar.j.c == 1) {
            ValueAnimator c = baseTransientBottomBar.c(0.0f, 1.0f);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
            ofFloat.setInterpolator(baseTransientBottomBar.g);
            ofFloat.addUpdateListener(new ehqh(baseTransientBottomBar));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(c, ofFloat);
            animatorSet.setDuration(baseTransientBottomBar.c);
            animatorSet.addListener(new ehqu(baseTransientBottomBar));
            animatorSet.start();
            return;
        }
        int b = baseTransientBottomBar.b();
        baseTransientBottomBar.j.setTranslationY(b);
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(b, 0);
        valueAnimator.setInterpolator(baseTransientBottomBar.f);
        valueAnimator.setDuration(baseTransientBottomBar.e);
        valueAnimator.addListener(new ehqi(baseTransientBottomBar));
        valueAnimator.addUpdateListener(new ehqj(baseTransientBottomBar));
        valueAnimator.start();
    }
}
