package defpackage;

import android.view.animation.Animation;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class exbh implements Animation.AnimationListener {
    final /* synthetic */ exbu a;

    public exbh(exbu exbuVar) {
        this.a = exbuVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.a.f.post(new exbg(this));
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        this.a.i.setEnabled(false);
        this.a.g.setVisibility(0);
        this.a.h.setVisibility(0);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }
}
