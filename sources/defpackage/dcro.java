package defpackage;

import android.view.animation.Animation;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dcro implements Animation.AnimationListener {
    final /* synthetic */ dcrr a;

    public dcro(dcrr dcrrVar) {
        this.a = dcrrVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        if (this.a.q) {
            return;
        }
        dcrr dcrrVar = this.a;
        dcrrVar.a.postDelayed(dcrrVar.h, 200L);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
