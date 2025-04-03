package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ozr extends AnimatorListenerAdapter implements pak {
    private final View a;
    private boolean b = false;

    public ozr(View view) {
        this.a = view;
    }

    @Override // defpackage.pak
    public final void c() {
        this.a.setTag(R.id.transition_pause_alpha, Float.valueOf(this.a.getVisibility() == 0 ? pbh.a(this.a) : 0.0f));
    }

    @Override // defpackage.pak
    public final void d() {
        this.a.setTag(R.id.transition_pause_alpha, null);
    }

    @Override // defpackage.pak
    public final /* synthetic */ void f(par parVar) {
        paj.a(this, parVar);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        pbh.c(this.a, 1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        onAnimationEnd(animator, false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        if (this.a.hasOverlappingRendering() && this.a.getLayerType() == 0) {
            this.b = true;
            this.a.setLayerType(2, null);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        if (this.b) {
            this.a.setLayerType(0, null);
        }
        if (z) {
            return;
        }
        pbh.c(this.a, 1.0f);
    }

    @Override // defpackage.pak
    public final void a(par parVar) {
    }

    @Override // defpackage.pak
    public final void b(par parVar) {
    }

    @Override // defpackage.pak
    public final void e(par parVar) {
    }

    @Override // defpackage.pak
    public final void g(par parVar) {
    }
}
