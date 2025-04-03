package defpackage;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;

/* compiled from: PG */
/* loaded from: classes.dex */
final class co extends hd {
    public final cp a;

    public co(cp cpVar) {
        cpVar.getClass();
        this.a = cpVar;
    }

    @Override // defpackage.hd
    public final void a(ViewGroup viewGroup) {
        hi hiVar = this.a.a;
        View view = hiVar.a.Q;
        view.clearAnimation();
        viewGroup.endViewTransition(view);
        this.a.a.f(this);
        if (fr.af(2)) {
            Log.v("FragmentManager", a.i(hiVar, "Animation from operation ", " has been cancelled."));
        }
    }

    @Override // defpackage.hd
    public final void b(ViewGroup viewGroup) {
        Animation animation;
        if (this.a.b()) {
            this.a.a.f(this);
            return;
        }
        Context context = viewGroup.getContext();
        cp cpVar = this.a;
        hi hiVar = cpVar.a;
        View view = hiVar.a.Q;
        context.getClass();
        eh a = cpVar.a(context);
        if (a == null || (animation = a.a) == null) {
            throw new IllegalStateException("Required value was null.");
        }
        if (hiVar.h != 1) {
            view.startAnimation(animation);
            this.a.a.f(this);
            return;
        }
        viewGroup.startViewTransition(view);
        ei eiVar = new ei(animation, viewGroup, view);
        eiVar.setAnimationListener(new cn(hiVar, viewGroup, view, this));
        view.startAnimation(eiVar);
        if (fr.af(2)) {
            Log.v("FragmentManager", a.i(hiVar, "Animation from operation ", " has started."));
        }
    }
}
