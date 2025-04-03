package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class eaxt extends AnimatorListenerAdapter {
    final /* synthetic */ emxc a;
    final /* synthetic */ Drawable b;
    final /* synthetic */ eaxu c;

    public eaxt(eaxu eaxuVar, emxc emxcVar, Drawable drawable) {
        this.a = emxcVar;
        this.b = drawable;
        this.c = eaxuVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        ebin ebinVar;
        eaxu eaxuVar = this.c;
        eaxuVar.e = this.a;
        if (eaxuVar.e.g() && (ebinVar = ((eawc) this.c.e.c()).d) != null) {
            ebinVar.c = true;
            AnimatorSet animatorSet = ebinVar.b;
            if (animatorSet != null) {
                animatorSet.start();
            }
        }
        this.c.a.h(this.b);
    }
}
