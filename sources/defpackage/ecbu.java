package defpackage;

import android.animation.Animator;
import android.view.animation.Animation;
import com.google.android.libraries.onegoogle.tooltip.TooltipView;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ecbu implements Animation.AnimationListener {
    final /* synthetic */ TooltipView a;

    public ecbu(TooltipView tooltipView) {
        this.a = tooltipView;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        Animator a = this.a.a();
        a.addListener(new ecbt(this));
        a.start();
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
