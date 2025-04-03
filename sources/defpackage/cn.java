package defpackage;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cn implements Animation.AnimationListener {
    public static final /* synthetic */ int e = 0;
    final /* synthetic */ hi a;
    final /* synthetic */ ViewGroup b;
    final /* synthetic */ View c;
    final /* synthetic */ co d;

    public cn(hi hiVar, ViewGroup viewGroup, View view, co coVar) {
        this.a = hiVar;
        this.b = viewGroup;
        this.c = view;
        this.d = coVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        animation.getClass();
        final ViewGroup viewGroup = this.b;
        final View view = this.c;
        final co coVar = this.d;
        viewGroup.post(new Runnable() { // from class: cm
            @Override // java.lang.Runnable
            public final void run() {
                int i = cn.e;
                viewGroup.endViewTransition(view);
                co coVar2 = coVar;
                coVar2.a.a.f(coVar2);
            }
        });
        if (fr.af(2)) {
            Log.v("FragmentManager", "Animation from operation " + this.a + " has ended.");
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        animation.getClass();
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        animation.getClass();
        if (fr.af(2)) {
            Log.v("FragmentManager", "Animation from operation " + this.a + " has reached onAnimationStart.");
        }
    }
}
