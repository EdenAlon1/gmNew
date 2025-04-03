package defpackage;

import android.transition.Transition;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dcnc implements Transition.TransitionListener {
    public boolean a;
    final /* synthetic */ dcnd b;

    public dcnc(dcnd dcndVar) {
        this.b = dcndVar;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition transition) {
        this.a = false;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        this.a = false;
        dcnd dcndVar = this.b;
        dcndVar.h(dcndVar.N);
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionPause(Transition transition) {
        this.a = false;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionResume(Transition transition) {
        this.a = true;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
        this.a = true;
    }
}
