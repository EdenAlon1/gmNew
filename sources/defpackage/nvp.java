package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import androidx.media3.ui.DefaultTimeBar;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nvp extends AnimatorListenerAdapter {
    final /* synthetic */ nvx a;

    public nvp(nvx nvxVar) {
        this.a = nvxVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        View view = this.a.b;
        if (view != null) {
            view.setVisibility(0);
        }
        ViewGroup viewGroup = this.a.c;
        if (viewGroup != null) {
            viewGroup.setVisibility(0);
        }
        nvx nvxVar = this.a;
        ViewGroup viewGroup2 = nvxVar.e;
        if (viewGroup2 != null) {
            viewGroup2.setVisibility(true != nvxVar.t ? 4 : 0);
        }
        nvx nvxVar2 = this.a;
        View view2 = nvxVar2.j;
        if (!(view2 instanceof DefaultTimeBar) || nvxVar2.t) {
            return;
        }
        DefaultTimeBar defaultTimeBar = (DefaultTimeBar) view2;
        if (defaultTimeBar.b.isStarted()) {
            defaultTimeBar.b.cancel();
        }
        defaultTimeBar.d = false;
        defaultTimeBar.b.setFloatValues(defaultTimeBar.c, 1.0f);
        defaultTimeBar.b.setDuration(250L);
        defaultTimeBar.b.start();
    }
}
