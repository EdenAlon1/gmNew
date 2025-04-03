package defpackage;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cxrd implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ Drawable a;

    public cxrd(Drawable drawable) {
        this.a = drawable;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.setAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
