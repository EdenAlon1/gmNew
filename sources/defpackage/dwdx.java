package defpackage;

import android.animation.Animator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwdx extends dwdv {
    protected final Animator a;
    public int c;
    private final dwea d = new dwdw(this);
    public final int b = -1;

    public dwdx(Animator animator) {
        this.a = animator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (a(animator)) {
            return;
        }
        dwec.c().a(this.d);
    }
}
