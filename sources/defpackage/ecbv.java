package defpackage;

import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import com.google.android.libraries.onegoogle.tooltip.TooltipView;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ecbv implements Animation.AnimationListener {
    final /* synthetic */ ScaleAnimation a;
    final /* synthetic */ TooltipView b;

    public ecbv(TooltipView tooltipView, ScaleAnimation scaleAnimation) {
        this.a = scaleAnimation;
        this.b = tooltipView;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.b.setAnimation(this.a);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
