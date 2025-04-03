package defpackage;

import android.animation.AnimatorSet;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cr extends hd {
    public final cp a;
    private AnimatorSet b;

    public cr(cp cpVar) {
        cpVar.getClass();
        this.a = cpVar;
    }

    @Override // defpackage.hd
    public final void a(ViewGroup viewGroup) {
        AnimatorSet animatorSet = this.b;
        if (animatorSet == null) {
            this.a.a.f(this);
            return;
        }
        hi hiVar = this.a.a;
        if (hiVar.d) {
            animatorSet.reverse();
        } else {
            animatorSet.end();
        }
        if (fr.af(2)) {
            StringBuilder sb = new StringBuilder("Animator from operation ");
            sb.append(hiVar);
            sb.append(" has been canceled");
            sb.append(true != hiVar.d ? "." : " with seeking.");
            sb.append(' ');
            Log.v("FragmentManager", sb.toString());
        }
    }

    @Override // defpackage.hd
    public final void b(ViewGroup viewGroup) {
        hi hiVar = this.a.a;
        AnimatorSet animatorSet = this.b;
        if (animatorSet == null) {
            hiVar.f(this);
            return;
        }
        animatorSet.start();
        if (fr.af(2)) {
            Log.v("FragmentManager", a.i(hiVar, "Animator from operation ", " has started."));
        }
    }

    @Override // defpackage.hd
    public final void c(ViewGroup viewGroup) {
        cr crVar;
        if (this.a.b()) {
            return;
        }
        Context context = viewGroup.getContext();
        cp cpVar = this.a;
        context.getClass();
        eh a = cpVar.a(context);
        this.b = a != null ? a.b : null;
        hi hiVar = this.a.a;
        boolean z = hiVar.h == 3;
        View view = hiVar.a.Q;
        viewGroup.startViewTransition(view);
        AnimatorSet animatorSet = this.b;
        if (animatorSet != null) {
            crVar = this;
            animatorSet.addListener(new cq(viewGroup, view, z, hiVar, crVar));
        } else {
            crVar = this;
        }
        AnimatorSet animatorSet2 = crVar.b;
        if (animatorSet2 != null) {
            animatorSet2.setTarget(view);
        }
    }

    @Override // defpackage.hd
    public final boolean d() {
        return true;
    }

    @Override // defpackage.hd
    public final void e(aak aakVar) {
        long totalDuration;
        hi hiVar = this.a.a;
        AnimatorSet animatorSet = this.b;
        if (animatorSet == null) {
            hiVar.f(this);
            return;
        }
        if (Build.VERSION.SDK_INT < 34 || !hiVar.a.t) {
            return;
        }
        if (fr.af(2)) {
            Objects.toString(hiVar);
            Log.v("FragmentManager", "Adding BackProgressCallbacks for Animators to operation ".concat(hiVar.toString()));
        }
        totalDuration = animatorSet.getTotalDuration();
        long j = (long) (aakVar.b * totalDuration);
        if (j == 0) {
            j = 1;
        }
        if (j == totalDuration) {
            j = (-1) + totalDuration;
        }
        if (fr.af(2)) {
            Log.v("FragmentManager", "Setting currentPlayTime to " + j + " for Animator " + animatorSet + " on operation " + hiVar);
        }
        animatorSet.setCurrentPlayTime(j);
    }
}
