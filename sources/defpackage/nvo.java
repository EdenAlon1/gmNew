package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import androidx.media3.ui.DefaultTimeBar;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nvo extends AnimatorListenerAdapter {
    final /* synthetic */ nvx a;

    public nvo(nvx nvxVar) {
        this.a = nvxVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        View view = this.a.b;
        if (view != null) {
            view.setVisibility(4);
        }
        ViewGroup viewGroup = this.a.c;
        if (viewGroup != null) {
            viewGroup.setVisibility(4);
        }
        ViewGroup viewGroup2 = this.a.e;
        if (viewGroup2 != null) {
            viewGroup2.setVisibility(4);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        nvx nvxVar = this.a;
        View view = nvxVar.j;
        if (!(view instanceof DefaultTimeBar) || nvxVar.t) {
            return;
        }
        DefaultTimeBar defaultTimeBar = (DefaultTimeBar) view;
        if (defaultTimeBar.b.isStarted()) {
            defaultTimeBar.b.cancel();
        }
        defaultTimeBar.b.setFloatValues(defaultTimeBar.c, 0.0f);
        defaultTimeBar.b.setDuration(250L);
        defaultTimeBar.b.start();
    }
}
