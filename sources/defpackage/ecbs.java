package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.libraries.onegoogle.tooltip.TooltipView;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ecbs extends AnimatorListenerAdapter {
    final /* synthetic */ TooltipView a;

    public ecbs(TooltipView tooltipView) {
        this.a = tooltipView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        Animator a = this.a.a();
        a.addListener(new ecbr(this));
        a.start();
    }
}
