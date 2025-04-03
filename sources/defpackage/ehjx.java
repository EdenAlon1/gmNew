package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehjx extends AnimatorListenerAdapter {
    final /* synthetic */ boolean a;
    final /* synthetic */ int b;
    final /* synthetic */ ehjy c;

    public ehjx(ehjy ehjyVar, boolean z, int i) {
        this.a = z;
        this.b = i;
        this.c = ehjyVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.c.a.setTranslationX(0.0f);
        this.c.g(0.0f, this.a, this.b);
    }
}
