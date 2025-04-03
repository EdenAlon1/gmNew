package defpackage;

import android.transition.Transition;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cxzz extends ddwq {
    final /* synthetic */ cxyp a;
    final /* synthetic */ cyag b;

    public cxzz(cyag cyagVar, cxyp cxypVar) {
        this.a = cxypVar;
        this.b = cyagVar;
    }

    @Override // defpackage.ddwq, android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        this.b.i(this.a);
    }

    @Override // defpackage.ddwq, android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
        this.b.j(this.a);
    }
}
