package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.PowerManager;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dwnb extends AnimatorListenerAdapter {
    private final Context a;

    public dwnb(Context context) {
        this.a = context.getApplicationContext();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        boolean areAnimatorsEnabled;
        areAnimatorsEnabled = ValueAnimator.areAnimatorsEnabled();
        if (areAnimatorsEnabled && !((PowerManager) this.a.getSystemService("power")).isPowerSaveMode()) {
            return;
        }
        animator.removeListener(this);
        animator.cancel();
    }
}
