package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewPropertyAnimator;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.SnackbarContentLayout;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ehqk extends AnimatorListenerAdapter {
    final /* synthetic */ int a;
    final /* synthetic */ BaseTransientBottomBar b;

    public ehqk(BaseTransientBottomBar baseTransientBottomBar, int i) {
        this.a = i;
        this.b = baseTransientBottomBar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.b.p();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        BaseTransientBottomBar baseTransientBottomBar = this.b;
        SnackbarContentLayout snackbarContentLayout = baseTransientBottomBar.t;
        snackbarContentLayout.a.setAlpha(1.0f);
        ViewPropertyAnimator alpha = snackbarContentLayout.a.animate().alpha(0.0f);
        long j = baseTransientBottomBar.d;
        alpha.setDuration(j).setInterpolator(snackbarContentLayout.c).setStartDelay(0L).start();
        if (snackbarContentLayout.b.getVisibility() == 0) {
            snackbarContentLayout.b.setAlpha(1.0f);
            snackbarContentLayout.b.animate().alpha(0.0f).setDuration(j).setInterpolator(snackbarContentLayout.c).setStartDelay(0L).start();
        }
    }
}
