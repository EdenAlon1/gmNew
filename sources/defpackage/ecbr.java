package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import com.google.android.libraries.onegoogle.accountmenu.SelectedAccountDisc;
import com.google.android.libraries.onegoogle.tooltip.TooltipView;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ecbr extends AnimatorListenerAdapter {
    final /* synthetic */ ecbs a;

    public ecbr(ecbs ecbsVar) {
        this.a = ecbsVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        Activity activity = (Activity) ((SelectedAccountDisc) this.a.a.a).i.get();
        if (activity == null || !activity.isFinishing()) {
            this.a.a.c.a();
            TooltipView tooltipView = this.a.a;
            tooltipView.b.removeView(tooltipView.i);
        }
    }
}
