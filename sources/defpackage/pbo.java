package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes.dex */
final class pbo extends AnimatorListenerAdapter implements pak {
    final /* synthetic */ pbq a;
    private final ViewGroup b;
    private final View c;
    private final View d;
    private boolean e = true;

    public pbo(pbq pbqVar, ViewGroup viewGroup, View view, View view2) {
        this.a = pbqVar;
        this.b = viewGroup;
        this.c = view;
        this.d = view2;
    }

    private final void h() {
        this.d.setTag(R.id.save_overlay_view, null);
        this.b.getOverlay().remove(this.c);
        this.e = false;
    }

    @Override // defpackage.pak
    public final void a(par parVar) {
        if (this.e) {
            h();
        }
    }

    @Override // defpackage.pak
    public final void b(par parVar) {
        parVar.I(this);
    }

    @Override // defpackage.pak
    public final /* synthetic */ void f(par parVar) {
        paj.a(this, parVar);
    }

    @Override // defpackage.pak
    public final /* synthetic */ void g(par parVar) {
        paj.b(this, parVar);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        h();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        this.b.getOverlay().remove(this.c);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        if (this.c.getParent() == null) {
            kvo.k(this.b, this.c);
        } else {
            this.a.n();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z) {
        if (z) {
            this.d.setTag(R.id.save_overlay_view, this.c);
            kvo.k(this.b, this.c);
            this.e = true;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        if (z) {
            return;
        }
        h();
    }

    @Override // defpackage.pak
    public final void c() {
    }

    @Override // defpackage.pak
    public final void d() {
    }

    @Override // defpackage.pak
    public final void e(par parVar) {
    }
}
