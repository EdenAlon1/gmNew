package defpackage;

import android.animation.ValueAnimator;
import com.google.android.material.snackbar.BaseTransientBottomBar;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehqg implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ BaseTransientBottomBar a;

    public ehqg(BaseTransientBottomBar baseTransientBottomBar) {
        this.a = baseTransientBottomBar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.j.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
