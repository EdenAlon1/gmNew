package defpackage;

import android.transition.Transition;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eleq implements Transition.TransitionListener {
    final /* synthetic */ Transition.TransitionListener a;
    final /* synthetic */ String b;
    final /* synthetic */ eler c;

    public eleq(eler elerVar, Transition.TransitionListener transitionListener, String str) {
        this.a = transitionListener;
        this.b = str;
        this.c = elerVar;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition transition) {
        if (ekyf.v()) {
            return;
        }
        eler elerVar = this.c;
        elerVar.a.b(this.b).close();
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        if (ekyf.v()) {
            this.a.onTransitionEnd(transition);
            return;
        }
        eler elerVar = this.c;
        ekzm b = elerVar.a.b(this.b);
        try {
            this.a.onTransitionEnd(transition);
            b.close();
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionPause(Transition transition) {
        if (ekyf.v()) {
            return;
        }
        eler elerVar = this.c;
        elerVar.a.b(this.b).close();
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionResume(Transition transition) {
        if (ekyf.v()) {
            return;
        }
        eler elerVar = this.c;
        elerVar.a.b(this.b).close();
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
        if (ekyf.v()) {
            this.a.onTransitionStart(transition);
            return;
        }
        eler elerVar = this.c;
        ekzm b = elerVar.a.b(this.b);
        try {
            this.a.onTransitionStart(transition);
            b.close();
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
